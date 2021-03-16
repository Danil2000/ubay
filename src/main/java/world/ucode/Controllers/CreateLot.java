package world.ucode.Controllers;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import world.ucode.CRUD.LotCRUD;
import world.ucode.Model.LotDAO;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

@Controller
public class CreateLot {
    @RequestMapping(value = "/createLot", method = RequestMethod.GET)
    public String getPage() {
        return "/CreateLot";
    }
    @RequestMapping(value = "/createLot", method = RequestMethod.POST)
    public String getData(LotDAO lot, @RequestParam("photo") MultipartFile photo) throws SQLException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException {
        LotCRUD lotcr = new LotCRUD();
        lotcr.getConnection();
        lot.setActive(1);
        String path = System.getProperty("user.dir") + "/src/main/webapp/img/" + photo.getOriginalFilename();
        File img = new File(path);
        System.out.println();
        photo.transferTo(img);
        lotcr.create(lot.getTitle(), lot.getStartPrice(), lot.getBidStep(), lot.getCategory(), lot.getActive(), "img/" + photo.getOriginalFilename());
        return "redirect:main";
    }
}
