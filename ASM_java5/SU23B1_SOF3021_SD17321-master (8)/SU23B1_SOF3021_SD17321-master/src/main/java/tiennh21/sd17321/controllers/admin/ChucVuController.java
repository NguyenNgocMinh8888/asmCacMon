//package tiennh21.sd17321.controllers.admin;
//
//import jakarta.validation.Valid;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.*;
//
//import tiennh21.sd17321.entities.ChucVu;
//import tiennh21.sd17321.repositories.ChucVuRepository;
//import tiennh21.sd17321.request.ChucVuVM;
//
//import java.util.List;
//
//@Controller
//@RequestMapping("admin/chuc-vu")
//public class ChucVuController {
//    @Autowired
//    private ChucVuRepository chucVuRepository;
//
//    @Autowired
//    private ChucVuVM vm;
//
//    @GetMapping("create")
//    public String create(Model model)
//    {
//        model.addAttribute("cv", vm);
//        model.addAttribute("action", "/admin/chuc-vu/store");
//
//        return "admin/chuc_vu/create";
//    }
//
//    @GetMapping("edit/{id}")
//    public String edit(
//            @PathVariable("id") ChucVu chucVu,
//            Model model
//    ) {
//        vm.loadFromEntityCV(chucVu);
//        model.addAttribute("cv", vm);
//        model.addAttribute("action", "/admin/chuc-vu/update/" + chucVu.getId());
//        return "admin/chuc_vu/create";
//    }
//
//    @PostMapping("update/{id}")
//    public String update(
//            @PathVariable("id") ChucVu chucVu,
//            @Valid ChucVuVM vm,
//            BindingResult result,
//            Model model
//    ) {
//        chucVu.loadFromVMCV(vm);
//        this.chucVuRepository.save(chucVu);
//        return "redirect:/admin/chuc-vu/index";
//    }
//
//    @PostMapping("store")
//    public String store(
//            @Valid @ModelAttribute("cv") ChucVuVM vm,
//            BindingResult result
//    ) {
//        if (result.hasErrors()) {
//            return "admin/chuc_vu/create";
//        }
//
//        ChucVu cv = new ChucVu();
//        cv.loadFromVMCV(vm);
//        this.chucVuRepository.save(cv);
//
//        return "redirect:/admin/chuc-vu/index";
//    }
//
//    @GetMapping("index")
//    public String index(Model model)
//    {
//        List<ChucVu> ds = this.chucVuRepository.findAll();
//        model.addAttribute("data", ds);
//        return "admin/chuc_vu/index";
//    }
//
//    @GetMapping("delete/{id}")
//    public String delete(@PathVariable("id") ChucVu chucVu)
//    {
//        this.chucVuRepository.delete(chucVu);
//        return "redirect:/admin/chuc-vu/index";
//    }
//}
