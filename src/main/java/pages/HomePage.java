package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class HomePage extends MethodHandles {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    private final By loginLink = By.cssSelector(".ico-login");

    public LoginPage clickOnLoginLink(){
        click(loginLink,10);
        return new LoginPage(driver);
    }
}
