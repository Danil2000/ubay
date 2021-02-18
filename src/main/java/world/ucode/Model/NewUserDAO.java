package world.ucode.Model;

import javax.management.relation.Role;

public class NewUserDAO {
    private String Login;
    private String Password;
    private Integer balance;
    private String UserRole;

    public Integer getBalance() {
        return balance;
    }

    public String getPassword() {
        return Password;
    }

    public String getUserRole() {
        return UserRole;
    }

    public String getLogin() {
        return Login;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    public void setUserRole(String role) {
        this.UserRole = role;
    }

    public void setLogin(String login) {
        Login = login;
    }
}
