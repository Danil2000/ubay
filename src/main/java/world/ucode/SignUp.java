package world.ucode;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import world.ucode.CRUD.UserDAO;
import world.ucode.Model.NewUserDTO;

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
    public void signUp(@NotNull NewUserDTO user) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, SQLException {
        UserDAO userDAO = new UserDAO();
        userDAO.create(user.getLogin(), user.getPassword(), user.getBalance(), user.getUserRole());
    }

}
