package poms.saucedemo;

import org.openqa.selenium.By;

public class loginPage extends pages{

    private By usernameField = By.name("user-name");
    private By passwordField = By.name("password");
    private By loginButton = By.className("btn_action");
    private By errorMessage = By.tagName("h3");

    public void setUser(String username){
        set(usernameField, username);
    }

    public void setPassword(String password){
        set(passwordField, password);
    }

    public productPage clickLogin(){
        click(loginButton);
        return new productPage();
    }

    public productPage loginApp(String username, String password){
        setUser(username);
        setPassword(password);
        return clickLogin();
    }

    public String getErrorMsg(){
        return find(errorMessage).getText();
    }
}
