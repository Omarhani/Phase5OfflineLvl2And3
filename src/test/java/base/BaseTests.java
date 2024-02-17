package base;

import data.DataModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import pages.HomePage;
import reader.ReadDataFromJson;

import java.io.FileNotFoundException;

public class BaseTests {
    protected WebDriver driver;
    protected ReadDataFromJson readDataFromJson;
    protected HomePage homePage;

    ChromeOptions chromeOptions;
    FirefoxOptions firefoxOptions;

    @Parameters("browser")
    @BeforeClass
    public void setUp(String browser) {
        setUpBrowser(browser);
        driver.manage().window().maximize();
        homePage = new HomePage(driver);

    }

    @BeforeMethod
    public void goHome() throws FileNotFoundException {
        driver.get(dataModel().URL);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    protected DataModel dataModel() throws FileNotFoundException {
        readDataFromJson = new ReadDataFromJson();
        return readDataFromJson.readJson();
    }

    @Parameters("browser")
    public void setUpBrowser(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("headlessChrome")) {
            chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless");
            driver = new ChromeDriver(chromeOptions);
        } else if (browser.equalsIgnoreCase("FIREFOX")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("headlessfirefox")) {
            firefoxOptions = new FirefoxOptions();
            firefoxOptions.addArguments("--headless");
            driver = new FirefoxDriver(firefoxOptions);
        }
    }
}
