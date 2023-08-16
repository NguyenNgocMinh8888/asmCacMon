package tiennh21.sd17321.controllers.admin;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import tiennh21.sd17321.entities.NhanVien;
import tiennh21.sd17321.repositories.NhanVienRepository;
import tiennh21.sd17321.request.NhanVienVM;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("admin/nhan-vien")
public class NhanVienController {
    @Autowired
    private NhanVienRepository nhanVienRepository;

//    @Autowired
//    @Qualifier("vm1")
    private NhanVienVM vm = new NhanVienVM();;

    @GetMapping("create")
    public String create(Model model)
    {
        model.addAttribute("nv", vm);
        model.addAttribute("action", "/admin/nhan-vien/store");

        return "admin/nhan_vien/create";
    }

    @GetMapping("edit/{id}")
    public String edit(
            @PathVariable("id") NhanVien nhanVien,
            Model model
    ) {
        vm.loadFromEntityNV(nhanVien);
        model.addAttribute("nv", vm);
        model.addAttribute("action", "/admin/nhan-vien/update/" + nhanVien.getId());
        return "admin/nhan_vien/create";
    }

    @PostMapping("update/{id}")
    public String update(
            @PathVariable("id") NhanVien nhanVien,
            @Valid NhanVienVM vm,
            BindingResult result,
            Model model
    ) {
        nhanVien.loadFromVMNV(vm);
        this.nhanVienRepository.save(nhanVien);
        return "redirect:/admin/nhan-vien/index";
    }

    @PostMapping("store")
    public String store(
            @Valid @ModelAttribute("nv") NhanVienVM vm,
            BindingResult result
    ) {
        if (result.hasErrors()) {
            return "admin/nhan_vien/create";
        }

        NhanVien nv = new NhanVien();
        nv.loadFromVMNV(vm);
        this.nhanVienRepository.save(nv);

        return "redirect:/admin/nhan-vien/index";
    }

    @GetMapping("index")
    public String index(Model model)
    {
        List<NhanVien> ds = this.nhanVienRepository.findAll();
        model.addAttribute("data", ds);
        return "admin/nhan_vien/index";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") NhanVien nhanVien)
    {
        this.nhanVienRepository.delete(nhanVien);
        return "redirect:/admin/nhan-vien/index";
    }
}
