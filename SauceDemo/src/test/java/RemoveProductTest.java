import org.example.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RemoveProductTest extends BaseTests{


 @Test
public void successfullyRemoveProductTest(){
     LoginPage loginPage = new LoginPage(driver);
     ShoppingPage shoppingPage = new ShoppingPage(driver);
     MyCartPage myCartPage = new MyCartPage(driver);

     loginPage.enterUsername("standard_user");
     loginPage.enterPassword("secret_sauce");
     loginPage.clickOnLoginButton();
     shoppingPage.clickOnAddToCart();
     shoppingPage.clickOnShoppingBasketButton();
     myCartPage.clickOnRemoveProduct();
     Assertions.assertFalse(driver.getPageSource().contains("Sauce Labs Bike Light"));
 }
}
