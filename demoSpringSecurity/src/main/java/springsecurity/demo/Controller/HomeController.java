package springsecurity.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/home")
//    @RequestMapping(value = "home",method = RequestMethod.GET)

    public String home(){
        return "hello world!";
    }
}
