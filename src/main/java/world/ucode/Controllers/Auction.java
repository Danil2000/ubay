package world.ucode.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Auction {
    @RequestMapping(value = "/lot/{id}", method = RequestMethod.GET)
    public String auction(@PathVariable("id") int id) {
        return "/auction";
    }
}