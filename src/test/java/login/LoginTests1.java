package login;

import base.BaseTests;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class LoginTests1 extends BaseTests {

    @DataProvider
    public Object[][] dataProviderForEmail() throws FileNotFoundException {
        return dataModel().Login1;
    }

    @Test(dataProvider = "dataProviderForEmail")
    public void testSuccessfulLogin(String username,String password) {
        var loginPage = homePage.clickOnLoginLink();
        loginPage.insertEmail(username);
        loginPage.insertPassword(password);
        loginPage.clickOnLoginButton();
    }
}
