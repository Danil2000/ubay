package world.ucode.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;
import world.ucode.CRUD.UserDAO;
import world.ucode.Model.UserDto;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

@Controller
public class SignIn {
    private UserDAO userDAO = new UserDAO();
    @RequestMapping(value = "/signIn", method = RequestMethod.GET)
    public String signin() {
        return "/signIn";
    }
    @RequestMapping(value = "/signIn", method = RequestMethod.POST)
    public String chekLogin(UserDto user) throws SQLException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        userDAO.getConnection();
        if(userDAO.checkUser(user.getLogin(), user.getPassword())) {
            return "/mainPage";
        }
        else {
            return "/signUp";
        }
    }

}
