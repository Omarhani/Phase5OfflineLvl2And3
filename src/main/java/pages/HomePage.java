package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class HomePage extends MethodHandles {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    private final By loginLink = By.cssSelector(".ico-login");

    private final By computers =
            By.xpath("//ul[@class='top-menu notmobile']//*[contains(text(),'Computers')]");
    private final By noteBook =
            By.xpath("(//ul[@class='sublist first-level']//*[contains(text(),'Notebooks')])[1]");

    public LoginPage clickOnLoginLink(){
        click(loginLink,10);
        return new LoginPage(driver);
    }

    private void hoverOverComputers(){
        hoverOverElement(computers,10);
    }
    private void clickOnNoteBook(){
        clickWithActions(noteBook,10);
    }

    public NoteBookPage selectNotBookItem(){
        hoverOverComputers();
        clickOnNoteBook();
        return new NoteBookPage(driver);
    }
}
