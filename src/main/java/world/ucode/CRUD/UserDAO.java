package world.ucode.CRUD;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDAO {
    private static String url = "jdbc:mysql://localhost:3306/ubay";
    private static String userName = "root";
    private static String bdPassword = "";
    private Connection conn;
    public void UserDAO() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
        try {
            conn = DriverManager.getConnection(this.url, this.userName, this.bdPassword);
            System.out.println("Ok");
        } catch (SQLException throwables) {
            System.out.println("Problem" + throwables);
        }
    }
    public void create(String login, String password, Integer balance, String userRole) throws SQLException {
        String query = "INSERT into ubay.user(login, password, balance, role) values(\'" + login + "\',\'" + password + "\'," + balance + ", \'" +userRole + "\');";
        Statement statement = conn.createStatement();
        statement.executeUpdate(query);
    }

}
