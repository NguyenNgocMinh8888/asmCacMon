//package tiennh21.sd17321;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//
//public class Login {
//    @GetMapping("login")
//    public String getLoginForm()
//    {
//        return "login";
//    }
//
//    @PostMapping("login")
////    public String login(
////        @RequestParam("email") String email,
////        @RequestParam("password") Optional<String> pwd,
////        @RequestParam(name="remember", defaultValue = "false") boolean remember
////    ) {
//    public String login(Account acc) {
//        System.out.println(acc.getEmail());
//        System.out.println(acc.getPassword());
//
////        if (pwd.isPresent()) {
////            System.out.println(pwd.get());
////        } else {
////            System.out.println("Password Empty");
////        }
//
//        return "login";
//    }
//}
