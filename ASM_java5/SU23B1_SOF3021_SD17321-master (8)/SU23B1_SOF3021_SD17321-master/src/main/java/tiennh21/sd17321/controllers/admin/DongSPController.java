package tiennh21.sd17321.controllers.admin;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import tiennh21.sd17321.entities.DongSP;
import tiennh21.sd17321.repositories.DongSPRepository;
import tiennh21.sd17321.request.DongSPVM;


import java.util.List;

@Controller
@RequestMapping("admin/dong-sp")
public class DongSPController {
    @Autowired
    private DongSPRepository dongSPRepository;

    @Autowired
    private DongSPVM vm;

    @GetMapping("create")
    public String create(Model model)
    {
        model.addAttribute("dsp", vm);
        model.addAttribute("action", "/admin/dong-sp/store");

        return "admin/dong_san_pham/create";
    }

    @GetMapping("edit/{id}")
    public String edit(
            @PathVariable("id") DongSP dongSP,
            Model model
    ) {
        vm.loadFromEntityDSP(dongSP);
        model.addAttribute("dsp", vm);
        model.addAttribute("action", "/admin/dong-sp/update/" + dongSP.getId());
        return "admin/dong_san_pham/create";
    }

    @PostMapping("update/{id}")
    public String update(
            @PathVariable("id") DongSP dongSP,
            @Valid DongSPVM vm,
            BindingResult result,
            Model model
    ) {
        dongSP.loadFromVMDSP(vm);
        this.dongSPRepository.save(dongSP);
        return "redirect:/admin/dong-sp/index";
    }

    @PostMapping("store")
    public String store(
            @Valid @ModelAttribute("dsp") DongSPVM vm,
            BindingResult result
    ) {
        if (result.hasErrors()) {
            return "admin/dong_san_pham/create";
        }

        DongSP dongSP = new DongSP();
        dongSP.loadFromVMDSP(vm);
        this.dongSPRepository.save(dongSP);

        return "redirect:/admin/dong-sp/index";
    }

    @GetMapping("index")
    public String index(Model model)
    {
        List<DongSP> ds = this.dongSPRepository.findAll();
        model.addAttribute("data", ds);
        return "admin/dong_san_pham/index";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") DongSP dongSP)
    {
        this.dongSPRepository.delete(dongSP);
        return "redirect:/admin/dong-sp/index";
    }
}
