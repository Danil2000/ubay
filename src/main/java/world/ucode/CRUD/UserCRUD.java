package world.ucode.CRUD;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;

public class UserCRUD {
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
    public Boolean create(String login, String password, Integer balance, String userRole) throws SQLException {
        String query = "INSERT into ubay.user(login, password, balance, role) values(\'" + login + "\',\'" + password + "\'," + balance + ", \'" +userRole + "\');";
        if(checkUser(login, password) == true) {
            return false;
        }
        else {
            statement.executeUpdate(query);
            return true;
        }
    }

    public Boolean checkUser(String login, String userPassword) throws SQLException {
        String query = "select * from ubay.user";
        ResultSet res = statement.executeQuery(query);
        while (res.next()) {
            String name = res.getString(2);
            String password = res.getString(3);

            if (name.equals(login) && userPassword.equals(password)) {
                System.out.println("User exist");
                return true;
            }
            else {
                System.out.println("New user");
            }
        }
        return false;
    }

}
