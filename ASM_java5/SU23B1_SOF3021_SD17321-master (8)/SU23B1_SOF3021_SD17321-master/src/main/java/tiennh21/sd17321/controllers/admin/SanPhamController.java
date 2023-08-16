package tiennh21.sd17321.controllers.admin;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import tiennh21.sd17321.entities.SanPham;
import tiennh21.sd17321.repositories.SanPhamRepository;
import tiennh21.sd17321.request.SanPhamVM;

import java.util.List;

@Controller
@RequestMapping("admin/san-pham")
public class SanPhamController {
    @Autowired
    private SanPhamRepository sanPhamRepository;

    @Autowired
    private SanPhamVM vm;

    @GetMapping("create")
    public String create(Model model)
    {
        model.addAttribute("sp", vm);
        model.addAttribute("action", "/admin/san-pham/store");

        return "admin/san_pham/create";
    }

    @GetMapping("edit/{id}")
    public String edit(
            @PathVariable("id") SanPham sanPham,
            Model model
    ) {
        vm.loadFromEntitySP(sanPham);
        model.addAttribute("sp", vm);
        model.addAttribute("action", "/admin/san-pham/update/" + sanPham.getId());
        return "admin/san_pham/create";
    }

    @PostMapping("update/{id}")
    public String update(
            @PathVariable("id") SanPham sanPham,
            @Valid SanPhamVM vm,
            BindingResult result,
            Model model
    ) {
        sanPham.loadFromVMSP(vm);
        this.sanPhamRepository.save(sanPham);
        return "redirect:/admin/san-pham/index";
    }

    @PostMapping("store")
    public String store(
            @Valid @ModelAttribute("sp") SanPhamVM vm,
            BindingResult result
    ) {
        if (result.hasErrors()) {
            return "admin/san_pham/create";
        }

        SanPham sanPham = new SanPham();
        sanPham.loadFromVMSP(vm);
        this.sanPhamRepository.save(sanPham);

        return "redirect:/admin/san-pham/index";
    }

    @GetMapping("index")
    public String index(Model model)
    {
        List<SanPham> ds = this.sanPhamRepository.findAll();
        model.addAttribute("data", ds);
        return "admin/san_pham/index";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") SanPham sanPham)
    {
        this.sanPhamRepository.delete(sanPham);
        return "redirect:/admin/san-pham/index";
    }
}
