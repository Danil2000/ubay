package world.ucode.Model;

import org.jetbrains.annotations.NotNull;

public class UserDAO {
    private String login;
    private String password;

    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
