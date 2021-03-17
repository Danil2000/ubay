package world.ucode.CRUD;

import com.mysql.cj.xdevapi.JsonArray;
import org.springframework.http.codec.json.Jackson2JsonEncoder;

import org.json.JSONObject;
import world.ucode.Model.LotDAO;

import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LotCRUD {
    private static String url = "jdbc:mysql://localhost:3306/ubay";
    private static String userName = "root";
    private static String bdPassword = "";

    private Connection conn = null;
    private Statement statement;
    public void getConnection() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class.forName("com.mysql.jdbc.Driver").getDeclaredConstructor().newInstance();
        try {
            this.conn = DriverManager.getConnection(this.url, this.userName, this.bdPassword);
            statement = this.conn.createStatement();
            System.out.println("Ok");
        } catch (SQLException throwables) {
            System.out.println("Problem" + throwables);
        }
    }

    public void create(String title, Double startPrice, Double bidStep, String category, Integer active, String image) throws SQLException {
        String query = "INSERT into ubay.lots(title, category, startPrice, bidStep, image) values(\'" + title + "\', \'" + category + "\', \'" + startPrice + "\', \'" + bidStep + "\', \'" +  image +"\');";
        statement.executeUpdate(query);
    }
    public List<LotDAO> getData() throws SQLException {
        String query = "select * from ubay.lots";
        List<LotDAO> list = new ArrayList<>();
        ResultSet res = statement.executeQuery(query);
        while (res.next()) {
            LotDAO lot = new LotDAO();
            lot.setTitle(res.getString(2));
            lot.setStartPrice(res.getDouble(4));
            lot.setBidStep(res.getDouble(5));
            lot.setCategory(res.getString(3));
            lot.setActive(1);
            lot.lotId = "/ubay/lot/" + res.getInt(1);
            lot.setImage(res.getString(6));
            list.add(lot);
        }
        return list;
    }
    public List<LotDAO> search(String title) throws SQLException {
        String query = "select * from ubay.lots where title = \'" + title + "\'";
        List<LotDAO> list = new ArrayList<>();
        ResultSet res = statement.executeQuery(query);
        while (res.next()) {
            LotDAO lot = new LotDAO();
            lot.setTitle(res.getString(2));
            lot.setStartPrice(res.getDouble(4));
            lot.setBidStep(res.getDouble(5));
            lot.setCategory(res.getString(3));
            lot.setActive(1);
            lot.lotId = "/ubay/lot/" + res.getInt(1);
            lot.setImage(res.getString(6));
            list.add(lot);
        }
        return list;
    }
    public List<LotDAO> filter(String category) throws SQLException {
        String query = "select * from ubay.lots where category = \'" + category + "\'";
        List<LotDAO> list = new ArrayList<>();
        ResultSet res = statement.executeQuery(query);
        while (res.next()) {
            LotDAO lot = new LotDAO();
            lot.setTitle(res.getString(2));
            lot.setStartPrice(res.getDouble(4));
            lot.setBidStep(res.getDouble(5));
            lot.setCategory(res.getString(3));
            lot.lotId = "/ubay/lot/" + res.getInt(1);
            lot.setActive(1);
            lot.setImage(res.getString(6));
            list.add(lot);
        }
        return list;
    }
}