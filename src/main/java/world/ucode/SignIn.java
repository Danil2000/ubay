package world.ucode;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;
import world.ucode.Model.UserDto;

@Controller
public class SignIn {
    @RequestMapping(value = "/signIn", method = RequestMethod.GET)
    public String signin(WebRequest request, Model model, UserDto user) {
        System.out.println(user.getLogin());
        return "/signIn";
    }
}
