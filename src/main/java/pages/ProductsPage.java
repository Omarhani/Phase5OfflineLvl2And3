package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class ProductsPage extends MethodHandles {
    public ProductsPage(WebDriver driver) {
        super(driver);
    }
    private final By addToCartButton =
            By.xpath("//button[@id='add-to-cart-button-4' and @class='button-1 add-to-cart-button']");

    public void clickOnAddToCardButton(){
        clickWithActions(addToCartButton,10);
    }
}
