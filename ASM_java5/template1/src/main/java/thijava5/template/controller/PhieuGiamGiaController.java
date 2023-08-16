package thijava5.template.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import thijava5.template.entity.KhachHang;
import thijava5.template.request.PhieuGiamGiaVM;
import thijava5.template.repositories.KhachHangRepository;
import thijava5.template.repositories.PhieuGiamGiaRepository;
import thijava5.template.entity.PhieuGiamGia;

import java.util.List;

@Controller
@RequestMapping("phieu-giam-gia")
public class PhieuGiamGiaController {
    @Autowired
    private PhieuGiamGiaRepository phieuGiamGiaRepository;

    @Autowired
    private KhachHangRepository khachHangRepository;


    private PhieuGiamGiaVM vm = new PhieuGiamGiaVM();

    @GetMapping("create")
    public String create(Model model) {
        model.addAttribute("pgg",vm);
        model.addAttribute("action", "phieu-giam-gia/store");
        model.addAttribute("dskh", khachHangRepository.findAll() );
        return "/create";
    }

    @GetMapping("edit/{maPhieu}")
    public String edit(
            @PathVariable("maPhieu") PhieuGiamGia phieuGiamGia,
            Model model
    ) {
        vm.loadFromEntityPGG(phieuGiamGia);
        model.addAttribute("pgg", vm);
        model.addAttribute("action", "/phieu-giam-gia/update/" + phieuGiamGia.getMaPhieu());
        model.addAttribute("dskh", khachHangRepository.findAll() );
        return "/create";
    }

    @PostMapping("update/{maPhieu}")
    public String update(
            @PathVariable("maPhieu") PhieuGiamGia phieuGiamGia,
            @Valid PhieuGiamGiaVM vm,
            BindingResult result,
            Model model
    ) {
        phieuGiamGia.loadFromVMPGG(vm);
        this.phieuGiamGiaRepository.save(phieuGiamGia);
        return "/index";
    }

    @PostMapping("store")
    public String store(Model model, @Valid @ModelAttribute("pgg") PhieuGiamGiaVM vm , BindingResult result) {
        PhieuGiamGia pgg = new PhieuGiamGia();
        pgg.loadFromVMPGG(vm);
        this.phieuGiamGiaRepository.save(pgg);
        return "redirect:/phieu-giam-gia/index";
    }

    @GetMapping("index")
    public String index(Model model) {
            List<PhieuGiamGia> data = phieuGiamGiaRepository.findAll();
        model.addAttribute("data", phieuGiamGiaRepository.findAll() );
        return "/index";

    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") PhieuGiamGia phieuGiamGia)
    {
        this.phieuGiamGiaRepository.delete(phieuGiamGia);
        return "/index";
    }
}
