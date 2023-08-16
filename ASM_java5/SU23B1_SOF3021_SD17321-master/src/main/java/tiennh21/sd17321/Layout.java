package tiennh21.sd17321;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Layout {
    @GetMapping("admin/layout")
    public String getLoginForm()
    {
        return "layout";
    }

}
