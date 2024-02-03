package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class LoginPage extends MethodHandles {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    private final By emailField = By.id("Email");

    private final By passwordField = By.id("Password");

    private final By loginButton = By.cssSelector(".button-1.login-button");

    public void insertEmail(String email){
        sendKeys(emailField,10,email);
    }
    public void insertPassword(String password){
        sendKeys(passwordField,10,password);
    }
    public void clickOnLoginButton(){
        click(loginButton,5);
    }
}
