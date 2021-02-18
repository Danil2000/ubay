package world.ucode.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import world.ucode.CRUD.UserCRUD;
import world.ucode.Model.UserDAO;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

@Controller
public class SignIn {
    private UserCRUD userCRUD = new UserCRUD();
    @RequestMapping(value = "/signIn", method = RequestMethod.GET)
    public String signin() {
        return "/signIn";
    }
    @RequestMapping(value = "/signIn", method = RequestMethod.POST)
    public String chekLogin(UserDAO user) throws SQLException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        userCRUD.getConnection();
        if(userCRUD.checkUser(user.getLogin(), user.getPassword())) {
            return "/mainPage";
        }
        else {
            return "/signUp";
        }
    }

}
