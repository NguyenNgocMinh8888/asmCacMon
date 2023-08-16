package tiennh21.sd17321.controllers.admin;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import tiennh21.sd17321.entities.*;
import tiennh21.sd17321.repositories.*;
import tiennh21.sd17321.request.ChiTietSanPhamVM;

import java.util.List;

@Controller
@RequestMapping("admin/chi-tiet-san-pham")
public class ChiTietSanPhamController {
    @Autowired
    private ChiTietSanPhamRepository chiTietSanPhamRepository;

    @Autowired
    private SanPhamRepository sanPhamRepository;

    @Autowired
    private NSXRepository nsxRepository;

    @Autowired
    private MauSacRepository mauSacRepository;

    @Autowired
    private DongSPRepository dongSPRepository;

    @Autowired
    private ChiTietSanPhamVM vm;

    @GetMapping("create")
    public String create(Model model)
    {
        model.addAttribute("ctsp", vm);
        model.addAttribute("action", "/admin/chi-tiet-san-pham/store");
        model.addAttribute("dssp", sanPhamRepository.findAll() );
        model.addAttribute("dsnsx", nsxRepository.findAll() );
        model.addAttribute("dsms", mauSacRepository.findAll() );
        model.addAttribute("dsdsp", dongSPRepository.findAll() );

        return "admin/chi_tiet_san_pham/create";
    }

    @GetMapping("edit/{id}")
    public String edit(
            @PathVariable("id") ChiTietSanPham chiTietSanPham,
            Model model
    ) {
        vm.loadFromEntityCTSP(chiTietSanPham);
        model.addAttribute("ctsp", vm);
        model.addAttribute("action", "/admin/chi-tiet-san-pham/update/" + chiTietSanPham.getId());
        model.addAttribute("dssp", sanPhamRepository.findAll() );
        model.addAttribute("dsnsx", nsxRepository.findAll() );
        model.addAttribute("dsms", mauSacRepository.findAll() );
        model.addAttribute("dsdsp", dongSPRepository.findAll() );
        return "admin/chi_tiet_san_pham/create";
    }

    @PostMapping("update/{id}")
    public String update(
            @PathVariable("id") ChiTietSanPham chiTietSanPham,
            @Valid ChiTietSanPhamVM vm,
            BindingResult result,
            Model model
    ) {
        chiTietSanPham.loadFromVMCTSP(vm);
        this.chiTietSanPhamRepository.save(chiTietSanPham);
        return "redirect:/admin/chi_tiet_san_pham/index";
    }

    @PostMapping("store")
    public String store(Model model, @Valid @ModelAttribute("ctsp")ChiTietSanPhamVM vm , BindingResult result) {

        if (result.hasErrors()) {
            // Báo lỗi
            System.out.println( result.getAllErrors().get(0).toString() );
            model.addAttribute("ctsp",vm);
            model.addAttribute("action", "/admin/san-pham/store");
            model.addAttribute("dssp", sanPhamRepository.findAll() );
            model.addAttribute("dsnsx", nsxRepository.findAll() );
            model.addAttribute("dsms", mauSacRepository.findAll() );
            model.addAttribute("dsdsp", dongSPRepository.findAll() );
            return "admin/chi_tiet_san_pham/create";
        }
        ChiTietSanPham chiTietSanPham = new ChiTietSanPham();
        chiTietSanPham.loadFromVMCTSP(vm);
        SanPham sanPham = this.sanPhamRepository.findById(vm.getSanPhamVM()).get();
        chiTietSanPham.setSanPham(sanPham);
        NSX nsx = this.nsxRepository.findById(vm.getNsxVM()).get();
        chiTietSanPham.setNsx(nsx);
        MauSac mauSac = this.mauSacRepository.findById(vm.getMauSacVM()).get();
        chiTietSanPham.setMauSac(mauSac);
        DongSP dongSP = this.dongSPRepository.findById(vm.getDongSPVM()).get();
        chiTietSanPham.setDongSP(dongSP);

        this.chiTietSanPhamRepository.save(chiTietSanPham);

        return "redirect:/admin/chi-tiet-san-pham/index";
    }

    @GetMapping("index")
    public String index(Model model)
    {
        List<ChiTietSanPham> ds = this.chiTietSanPhamRepository.findAll();
        model.addAttribute("data", ds);
        return "admin/chi_tiet_san_pham/index";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") ChiTietSanPham chiTietSanPham)
    {
        this.chiTietSanPhamRepository.delete(chiTietSanPham);
        return "redirect:/admin/chi-tiet-san-pham/index";
    }

}
