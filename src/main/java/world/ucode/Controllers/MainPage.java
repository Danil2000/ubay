package world.ucode.Controllers;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import world.ucode.CRUD.LotCRUD;
import world.ucode.Model.LotDAO;

@Controller
public class MainPage {
    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public ModelAndView getdata() throws SQLException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        LotCRUD crud = new LotCRUD();
        LotDAO lott = new LotDAO();
        crud.getConnection();
        List<LotDAO> empList = crud.getData();
		ModelAndView mv = new ModelAndView();
        System.out.println(empList);
		mv.setViewName("mainPage");
		mv.addObject("empList", empList);
		return mv;
    }
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public ModelAndView search(String title) throws SQLException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        LotCRUD crud = new LotCRUD();
        LotDAO lott = new LotDAO();
        crud.getConnection();
        List<LotDAO> empList = crud.search(title);
        ModelAndView mv = new ModelAndView();
        System.out.println(empList);
        mv.setViewName("mainPage");
        mv.addObject("empList", empList);
        return mv;
    }
    @RequestMapping(value = "/filter", method = RequestMethod.POST)
    public ModelAndView filter(String category) throws SQLException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        LotCRUD crud = new LotCRUD();
        LotDAO lott = new LotDAO();
        System.out.println(category);
        crud.getConnection();
        List<LotDAO> empList = crud.filter(category);
        ModelAndView mv = new ModelAndView();
        System.out.println(empList);
        mv.setViewName("mainPage");
        mv.addObject("empList", empList);
        return mv;
    }

}
