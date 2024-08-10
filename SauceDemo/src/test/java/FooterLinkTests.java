import org.example.LoginPage;
import org.example.ShoppingPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class FooterLinkTests extends BaseTests {


   @Test
    public void twitterIconTest () {
    LoginPage loginPage = new LoginPage(driver);
    ShoppingPage shoppingPage = new ShoppingPage(driver);

    loginPage.enterUsername("standard_user");
    loginPage.enterPassword("secret_sauce");
    loginPage.clickOnLoginButton();
    shoppingPage.clickOnTwitterIcon();

    String productWindow = driver.getWindowHandle();

    Set<String> allWindows = driver.getWindowHandles();
    for (String windowHandle : allWindows) {
     if (!windowHandle.equals(productWindow)) {
      driver.switchTo().window(windowHandle);
      break;
     }
    }
    String currentUrl = driver.getCurrentUrl();

    Assertions.assertTrue(currentUrl.contains("https://x.com/saucelabs"),"URL should contain 'https://x.com/saucelabs'");
    driver.switchTo().window(productWindow);
    }


    @Test
    public void facebookIconTest () {
    LoginPage loginPage = new LoginPage(driver);
    ShoppingPage shoppingPage = new ShoppingPage(driver);

    loginPage.enterUsername("standard_user");
    loginPage.enterPassword("secret_sauce");
    loginPage.clickOnLoginButton();
    shoppingPage.clickOnFacebookIcon();
    String productWindow = driver.getWindowHandle();

    Set<String> allWindows = driver.getWindowHandles();
     for (String windowHandle : allWindows) {
      if (!windowHandle.equals(productWindow)) {
       driver.switchTo().window(windowHandle);
       break;
      }
     }
     String currentUrl = driver.getCurrentUrl();

     Assertions.assertTrue(currentUrl.contains("https://www.facebook.com/saucelabs"), "URL should contain 'https://www.facebook.com/saucelabs'");
     driver.switchTo().window(productWindow);
    }

    @Test
    public void linkedinIconTest () {
    LoginPage loginPage = new LoginPage(driver);
    ShoppingPage shoppingPage = new ShoppingPage(driver);
    loginPage.enterUsername("standard_user");
    loginPage.enterPassword("secret_sauce");
    loginPage.clickOnLoginButton();
    shoppingPage.clickOnLinkedinIcon();
    String productWindow = driver.getWindowHandle();

    Set <String> allWindows = driver.getWindowHandles();
     for (String windowHandle : allWindows) {
      if (!windowHandle.equals(productWindow)) {
       driver.switchTo().window(windowHandle);
       break;
      }
     }
     String currentUrl = driver.getCurrentUrl();

     Assertions.assertTrue(currentUrl.contains("https://www.linkedin.com/company/sauce-labs/"), "URL should contain 'https://www.linkedin.com/company/sauce-labs/'");
     driver.switchTo().window(productWindow);
    }
}
