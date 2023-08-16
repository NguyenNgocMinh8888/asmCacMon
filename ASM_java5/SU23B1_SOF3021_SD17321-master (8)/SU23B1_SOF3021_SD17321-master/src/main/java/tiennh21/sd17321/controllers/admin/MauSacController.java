package tiennh21.sd17321.controllers.admin;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import tiennh21.sd17321.entities.MauSac;
import tiennh21.sd17321.repositories.MauSacRepository;
import tiennh21.sd17321.request.MauSacVM;

import java.util.List;

@Controller
@RequestMapping("admin/mau-sac")
public class MauSacController {
    @Autowired
    private MauSacRepository mauSacRepository;

    @Autowired
    private MauSacVM vm;

    @GetMapping("create")
    public String create(Model model)
    {
        model.addAttribute("ms", vm);
        model.addAttribute("action", "/admin/mau-sac/store");

        return "admin/mau_sac/create";
    }

    @GetMapping("edit/{id}")
    public String edit(
            @PathVariable("id") MauSac mauSac,
            Model model
    ) {
        vm.loadFromEntityMS(mauSac);
        model.addAttribute("ms", vm);
        model.addAttribute("action", "/admin/mau-sac/update/" + mauSac.getId());
        return "admin/mau_sac/create";
    }

    @PostMapping("update/{id}")
    public String update(
            @PathVariable("id") MauSac mauSac,
            @Valid MauSacVM vm,
            BindingResult result,
            Model model
    ) {
        mauSac.loadFromVMMS(vm);
        this.mauSacRepository.save(mauSac);
        return "redirect:/admin/mau-sac/index";
    }

    @PostMapping("store")
    public String store(
            @Valid @ModelAttribute("ms") MauSacVM vm,
            BindingResult result
    ) {
        if (result.hasErrors()) {
            return "admin/mau_sac/create";
        }

        MauSac ms = new MauSac();
        ms.loadFromVMMS(vm);
        this.mauSacRepository.save(ms);

        return "redirect:/admin/mau-sac/index";
    }

    @GetMapping("index")
    public String index(Model model)
    {
        List<MauSac> ds = this.mauSacRepository.findAll();
        model.addAttribute("data", ds);
        return "admin/mau_sac/index";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") MauSac mauSac)
    {
        this.mauSacRepository.delete(mauSac);
        return "redirect:/admin/mau-sac/index";
    }
}
