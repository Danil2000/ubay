package world.ucode.Controllers;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import world.ucode.CRUD.UserCRUD;
import world.ucode.Model.NewUserDAO;

import javax.servlet.http.HttpServlet;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

@Controller
public class SignUp extends HttpServlet {
    @RequestMapping(value = "/signUp", method = RequestMethod.GET)
    public String getPage() {
        return "/signUp";
    }
    @RequestMapping(value = "/signUp", method = RequestMethod.POST)
    public String signUp(@NotNull NewUserDAO user) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, SQLException {
        UserCRUD userCRUD = new UserCRUD();
        userCRUD.getConnection();
        if (userCRUD.create(user.getLogin(), user.getPassword(), user.getBalance(), user.getUserRole())) {
            return "/mainPage";
        }
        else {
            return "/signIn";
        }
    }

}