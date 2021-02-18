package world.ucode.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import world.ucode.Model.LotDAO;

@Controller
public class CreateLot {
    @RequestMapping(value = "/createLot", method = RequestMethod.GET)
    public String getPage() {
        return "/createLot";
    }
    @RequestMapping(value = "/createLot", method = RequestMethod.POST)
    public void getData(LotDAO lot) {

    }
}
