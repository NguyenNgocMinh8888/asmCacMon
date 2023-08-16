package tiennh21.sd17321.controllers.admin;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import tiennh21.sd17321.entities.ChucVu;
import tiennh21.sd17321.entities.CuaHang;
import tiennh21.sd17321.entities.NhanVien;
import tiennh21.sd17321.repositories.ChucVuRepository;
import tiennh21.sd17321.repositories.CuaHangRepository;
import tiennh21.sd17321.repositories.NhanVienRepository;
import tiennh21.sd17321.request.NhanVienVM;

import java.util.List;

@Controller
@RequestMapping("admin/nhan-vien")
public class NhanVienController {
    @Autowired
    private NhanVienRepository nhanVienRepository;

    @Autowired
    private ChucVuRepository chucVuRepository;

    @Autowired
    private CuaHangRepository cuaHangRepository;
//    @Autowired
    private NhanVienVM vm = new NhanVienVM();;

    @GetMapping("create")
    public String create(Model model) {
        model.addAttribute("nv",vm);
        model.addAttribute("action", "/admin/nhan-vien/store");
        model.addAttribute("dsch", cuaHangRepository.findAll() );
        model.addAttribute("dscv", chucVuRepository.findAll() );

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
        model.addAttribute("dsch", cuaHangRepository.findAll() );
        model.addAttribute("dscv", chucVuRepository.findAll() );
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
    public String store(Model model, @Valid @ModelAttribute("nv") NhanVienVM vm , BindingResult result) {

        if (result.hasErrors()) {
            // Báo lỗi
            System.out.println( result.getAllErrors().get(0).toString() );
            model.addAttribute("nv",vm);
            model.addAttribute("action", "/admin/nhan-vien/store");
            model.addAttribute("dsch", cuaHangRepository.findAll() );
            model.addAttribute("dscv", chucVuRepository.findAll() );
            return "admin/nhan_vien/create";
        }
        NhanVien nv = new NhanVien();
        nv.loadFromVMNV(vm);
        CuaHang cuaHang = this.cuaHangRepository.findById(vm.getCuaHangVM()).ge();
        nv.setCuaHang(cuaHang);
        ChucVu chucVu = this.chucVuRepository.findById(vm.getChucVuVM()).get();
        nv.setChucVu(chucVu);
        this.nhanVienRepository.save(nv);

        return "redirect:/admin/nhan-vien/index";
    }

    @GetMapping("index")
    public String index(Model model) {
        List<NhanVien> data = nhanVienRepository.findAll();
        model.addAttribute("data", nhanVienRepository.findAll() );
        return "admin/nhan_vien/index";

    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") NhanVien nhanVien)
    {
        this.nhanVienRepository.delete(nhanVien);
        return "redirect:/admin/nhan-vien/index";
    }

}
