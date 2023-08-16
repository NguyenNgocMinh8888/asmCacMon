package tiennh21.sd17321.controllers.admin;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import tiennh21.sd17321.entities.KhachHang;
import tiennh21.sd17321.repositories.KhachHangRepository;
import tiennh21.sd17321.request.KhachHangVM;

import java.util.List;

@Controller
@RequestMapping("admin/khach-hang")
public class KhachHangController {
    @Autowired
    private KhachHangRepository khachHangRepository;
    //    @Autowired
    private KhachHangVM vm = new KhachHangVM();

    @GetMapping("create")
    public String create(Model model) {
        model.addAttribute("kh",vm);
        model.addAttribute("action", "/admin/khach-hang/store");
        return "admin/khach_hang/create";
    }

    @GetMapping("edit/{id}")
    public String edit(
            @PathVariable("id") KhachHang khachHang,
            Model model
    ) {
        vm.loadFromEntityKH(khachHang);
        model.addAttribute("kh", vm);
        model.addAttribute("action", "/admin/khach-hang/update/" + khachHang.getId());
        return "admin/khach_hang/create";
    }

    @PostMapping("update/{id}")
    public String update(
            @PathVariable("id") KhachHang khachHang,
            @Valid KhachHangVM vm,
            BindingResult result,
            Model model
    ) {
        khachHang.loadFromVMKH(vm);
        this.khachHangRepository.save(khachHang);
        return "redirect:/admin/khach-hang/index";
    }

    @PostMapping("store")
    public String store(
            @Valid @ModelAttribute("kh") KhachHangVM vm,
            BindingResult result
    ) {
        if (result.hasErrors()) {
            return "admin/khach-hang/create";
        }

        KhachHang khachHang = new KhachHang();
        khachHang.loadFromVMKH(vm);
        this.khachHangRepository.save(khachHang);

        return "redirect:/admin/mau-sac/index";
    }

    @GetMapping("index")
    public String index(Model model) {
        List<KhachHang> data = khachHangRepository.findAll();
        model.addAttribute("data", khachHangRepository.findAll() );
        return "admin/khach_hang/index";

    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") KhachHang khachHang)
    {
        this.khachHangRepository.delete(khachHang);
        return "redirect:/admin/khach-hang/index";
    }
}
