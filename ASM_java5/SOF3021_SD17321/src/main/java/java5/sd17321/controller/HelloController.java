package java5.sd17321.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
    public class HelloController{
        //@RequestMapping(values="hello", method = RequestMethod.GET)
        //@PostMapping
        @GetMapping("hello")
        public String sayHello(Model model)
        {
            String name = "Minh vo dich vu tru";
            model.addAttribute("name",name);
            return "hello";
        }

    }
