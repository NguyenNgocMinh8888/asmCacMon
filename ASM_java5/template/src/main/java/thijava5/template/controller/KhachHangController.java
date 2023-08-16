package thijava5.template.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import thijava5.template.entity.HangKhachHang;
import thijava5.template.entity.KhachHang;
import thijava5.template.repositories.HangKhachHangRepository;
import thijava5.template.repositories.KhachHangRepository;
import thijava5.template.request.KhachHangVM;

import java.util.List;

@Controller
@RequestMapping("khach-hang")
public class KhachHangController {
    @Autowired
    private KhachHangRepository khachHangRepository;

    @Autowired
    private HangKhachHangRepository hangKhachHangRepository;

    private KhachHangVM vm = new KhachHangVM();

    @GetMapping("create")
        public String create(Model model) {
            model.addAttribute("kh",vm);
            model.addAttribute("action", "khach-hang/store");
            model.addAttribute("dsh", hangKhachHangRepository.findAll() );
            return "/create";
        }

     @PostMapping("store")
         public String store(Model model, @Valid @ModelAttribute("pgg") KhachHangVM vm , BindingResult result) {
             KhachHang kh = new KhachHang();
             kh.loadFromVM(vm);
             this.khachHangRepository.save(kh);
             return "redirect:/khach-hang/index";
         }

         @GetMapping("index")
         public String index(Model model) {
                 List<KhachHang> data = khachHangRepository.findAll();
             model.addAttribute("data", khachHangRepository.findAll() );
             return "/index";

         }
         @GetMapping("delete/{maKhachHang}")
             public String delete(@PathVariable("maKhachHang") KhachHang khachHang)
             {
                 this.khachHangRepository.delete(khachHang);
                 return "redirect:/khach-hang/index";
             }
}
