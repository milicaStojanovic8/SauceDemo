import org.example.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SuccessfulShoppingTest extends BaseTests {

    @Test
    public void successShoppingTest() {

        LoginPage loginPage = new LoginPage(driver);
        ShoppingPage shoppingPage = new ShoppingPage(driver);
        CheckoutLoginPage checkoutLoginPage = new CheckoutLoginPage(driver);
        MyCartPage myCartPage = new MyCartPage(driver);
        CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage(driver);

        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        shoppingPage.clickOnAddToCart();
        shoppingPage.clickOnShoppingBasketButton();
        myCartPage.clickOnCheckOutButtonButton();
        checkoutLoginPage.enterFirstName("Milica");
        checkoutLoginPage.enterLastName("Stojanovic");
        checkoutLoginPage.enterZipCode("123");
        shoppingPage.clickOnContinueButton();
        checkoutLoginPage.clickOnFinishButton();
        checkoutCompletePage.waitForCheckoutMessageToContain(checkoutCompletePage.getSuccessfulCompleteMessage());

    }
}
