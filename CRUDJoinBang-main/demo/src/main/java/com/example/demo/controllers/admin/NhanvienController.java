package com.example.demo.controllers.admin;

import com.example.demo.controllers.entities.CuaHang;
import com.example.demo.controllers.entities.NhanVien;
import com.example.demo.repositoris.CuaHangrepository;
import com.example.demo.repositoris.NhanVienrepository;

import com.example.demo.view_model.QLNhanvien;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("admin/nhan-vien")
public class NhanvienController {
    @Autowired
    private QLNhanvien vm;
    @Autowired
    private NhanVienrepository nvrepo;


    @Autowired
    private CuaHangrepository chrepo;

    @GetMapping("index")
    public String index(Model model) {
        List<NhanVien> ds = nvrepo.findAll();
        model.addAttribute("ds", nvrepo.findAll() );
        return "admin/nhan_vien/indexnv";

    }
    @GetMapping("create")
    public String create(Model model) {
        model.addAttribute("nv",vm);
        model.addAttribute("action", "/admin/nhan-vien/store");
        model.addAttribute("dsch", chrepo.findAll() );

        return "admin/nhan_vien/createnv";
    }

    @PostMapping("store")
    public String store(Model model, @Valid @ModelAttribute("nv") QLNhanvien vm , BindingResult result) {

        if (result.hasErrors()) {
            // Báo lỗi
            System.out.println( result.getAllErrors().get(0).toString() );
            model.addAttribute("nv",vm);
            model.addAttribute("action", "/admin/nhan-vien/store");
            model.addAttribute("dsch", chrepo.findAll() );
            return "admin/nhan_vien/createnv";
        }
        NhanVien nv = new NhanVien();
        nv.loadFromVM(vm);
        CuaHang entity = this.chrepo.findById(vm.getCuaHangVM()).get();
        nv.setCuaHang(entity);
        this.nvrepo.save(nv);

        return "redirect:/admin/nhan-vien/index";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") NhanVien nv){

        this.nvrepo.delete(nv);
        return "redirect:/admin/nhan-vien/index";


    }
    @GetMapping("edit/{id}")
    public String edit(
            @PathVariable("id") NhanVien nhanVien,
            Model model
    ) {
        vm.loadFromEntity(nhanVien);
        model.addAttribute("nv", vm);
        model.addAttribute("action", "/admin/nhan-vien/update/" + nhanVien.getId());
        return "admin/nhan_vien/createnv";
    }
    @PostMapping("update/{id}")
    public String update(
            @PathVariable("id") NhanVien nhanVien,
            @Valid QLNhanvien vm,
            BindingResult result,
            Model model
    ) {
        nhanVien.loadFromVM(vm);
        this.nvrepo.save(nhanVien);
        return "redirect:/admin/nhan-vien/index";
    }

}
