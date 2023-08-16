package tiennh21.sd17321.controllers.admin;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import tiennh21.sd17321.entities.NSX;
import tiennh21.sd17321.repositories.NSXRepository;
import tiennh21.sd17321.request.NSXVM;

import java.util.List;

@Controller
@RequestMapping("admin/NhaSX")
public class NSXController {
    @Autowired
    private NSXRepository nsxRepository;

    @Autowired
    private NSXVM vm;

    @GetMapping("create")
    public String create(Model model)
    {
        model.addAttribute("nsx", vm);
        model.addAttribute("action", "/admin/NhaSX/store");

        return "admin/nha_san_xuat/create";
    }

    @GetMapping("edit/{id}")
    public String edit(
            @PathVariable("id") NSX nsx,
            Model model
    ) {
        vm.loadFromEntityNSX(nsx);
        model.addAttribute("nsx", vm);
        model.addAttribute("action", "/admin/NhaSX/update/" + nsx.getId());
        return "admin/nha_san_xuat/create";
    }

    @PostMapping("update/{id}")
    public String update(
            @PathVariable("id") NSX nsx,
            @Valid NSXVM vm,
            BindingResult result,
            Model model
    ) {
        nsx.loadFromVMNSX(vm);
        this.nsxRepository.save(nsx);
        return "redirect:/admin/NhaSX/index";
    }

    @PostMapping("store")
    public String store(
            @Valid @ModelAttribute("nsx") NSXVM vm,
            BindingResult result
    ) {
        if (result.hasErrors()) {
            return "admin/nha_san_xuat/create";
        }

        NSX nsx = new NSX();
        nsx.loadFromVMNSX(vm);
        this.nsxRepository.save(nsx);

        return "redirect:/admin/NhaSX/index";
    }

    @GetMapping("index")
    public String index(Model model)
    {
        List<NSX> ds = this.nsxRepository.findAll();
        model.addAttribute("data", ds);
        return "admin/nha_san_xuat/index";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") NSX nsx)
    {
        this.nsxRepository.delete(nsx);
        return "redirect:/admin/NhaSX/index";
    }
}
