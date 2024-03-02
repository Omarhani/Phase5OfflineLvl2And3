package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class NoteBookPage extends MethodHandles {


    public NoteBookPage(WebDriver driver) {
        super(driver);
    }

    private final By addToCartButton= By.xpath("//button[contains(text(),'Add to cart')]");

    public ProductsPage clickOnAddToCardButton(){
        clickWithActions(addToCartButton,10);
        return new ProductsPage(driver);
    }
}
