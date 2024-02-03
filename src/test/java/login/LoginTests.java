package login;

import base.BaseTests;
import org.testng.annotations.Test;
import reader.ReadDataFromJson;

import java.io.FileNotFoundException;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin() throws FileNotFoundException {
        readDataFromJson = new ReadDataFromJson();
        var loginPage = homePage.clickOnLoginLink();
        loginPage.insertEmail(readDataFromJson.readJson().Login.ValidCredentials.Username);
        loginPage.insertPassword(readDataFromJson.readJson().Login.ValidCredentials.Password);
        loginPage.clickOnLoginButton();
    }
}
