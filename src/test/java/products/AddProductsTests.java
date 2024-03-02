package products;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.NoteBookPage;
import pages.ProductsPage;

import static org.testng.Assert.assertTrue;

public class AddProductsTests extends BaseTests {

    @Test
    public void testAddProductToCart() {
        NoteBookPage noteBookPage = homePage.selectNotBookItem();
        ProductsPage productsPage = noteBookPage.clickOnAddToCardButton();
        productsPage.clickOnAddToCardButton();
        assertTrue(productsPage.barNotificationIsDisplayed());

    }
}
