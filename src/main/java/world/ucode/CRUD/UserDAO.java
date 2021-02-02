package world.ucode.CRUD;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;

public class UserDAO {
    private static String url = "jdbc:mysql://localhost:3306/ubay";
    private static String userName = "root";
    private static String bdPassword = "";
    private Connection conn = null;
    private Statement statement = null;
    public void getConnection() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class.forName("com.mysql.jdbc.Driver").getDeclaredConstructor().newInstance();
        try {
            this.conn = DriverManager.getConnection(this.url, this.userName, this.bdPassword);
            System.out.println("Ok");
        } catch (SQLException throwables) {
            System.out.println("Problem" + throwables);
        }
    }
    public void create(String login, String password, Integer balance, String userRole) throws SQLException {
        String query = "INSERT into ubay.user(login, password, balance, role) values(\'" + login + "\',\'" + password + "\'," + balance + ", \'" +userRole + "\');";
        statement = this.conn.createStatement();
        if(checkUser(login) == true) {
            return;
        }
        else {
            statement.executeUpdate(query);
        }
    }
    public Boolean checkUser(String login) throws SQLException {
        String query = "select * from ubay.user";
        ResultSet res = statement.executeQuery(query);
        while (res.next()) {
            String name = res.getString(2);
            System.out.println(name);
            System.out.println(login);

            if (name.equals(login)) {
                System.out.println("User exist");
                return true;
            }
            else{
                System.out.println("New user");
            }
        }
        return false;
    }

}
