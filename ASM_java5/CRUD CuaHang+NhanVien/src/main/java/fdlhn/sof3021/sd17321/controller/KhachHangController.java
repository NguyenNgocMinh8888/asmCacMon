package fdlhn.sof3021.sd17321.controller;

import fdlhn.sof3021.sd17321.viewModel.KhachHang;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("khachHang")
public class KhachHangController {
    private ArrayList<KhachHang> khachHang;

    public KhachHangController(){
        this.khachHang = new ArrayList<>();
        this.khachHang.add(new KhachHang("PH27930","Minh","Ngoc","Nguyen","2003-07-28","0987654321","Me Tri","Ha Noi","VietNam","12345"));
    }

    @GetMapping("index")
    public String getIndex(Model model){
        model.addAttribute("kh", this.khachHang);
        return "khachHang/index";
    }

    @GetMapping("create")
    public String getFormCreate(Model model){
        KhachHang kh = new KhachHang();
        model.addAttribute("kh", kh);
        return "khachHang/create";
    }

    @PostMapping("store")
    public String store(@Valid @ModelAttribute("kh") KhachHang kh, BindingResult result){
        if(result.hasErrors()){
            return "khachHang/create";
        }
        this.khachHang.add(kh);
        return "redirect:/khachHang/index";
    }

    @GetMapping("delete/{ma}")
    public String delete(@PathVariable String ma){
        for(int i = 0; i <khachHang.size(); i++){
            if(ma.equals(khachHang.get(i).getMa())){
                khachHang.remove(i);
            }
        }
        return "redirect:/khachHang/index";
    }

    @GetMapping("edit/{ma}")
    public String getFormEdit(Model model, @PathVariable String ma){
        KhachHang kh = new KhachHang();
        for(int i = 0; i <khachHang.size(); i++){
            if(khachHang.get(i).getMa().equalsIgnoreCase(ma)){
                kh = khachHang.get(i);
            }
        }
        model.addAttribute("kh", kh);
        return "khachHang/edit";
    }

    @PostMapping("edit/update/{ma}")
    public String update(@Valid @ModelAttribute("kh") KhachHang kh, BindingResult result){
        if(result.hasErrors()){
            return "khachHang/update";
        }
        for(int i = 0; i <khachHang.size(); i++){
            if(khachHang.get(i).getMa().equals(kh.getMa())){
                khachHang.set(i, kh);
            }
        }
        return "redirect:/khachHang/index";
    }
}
