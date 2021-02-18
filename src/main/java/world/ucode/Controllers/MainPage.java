package world.ucode.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainPage {
    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String getPage() {
        return "/mainPage";
    }
}
