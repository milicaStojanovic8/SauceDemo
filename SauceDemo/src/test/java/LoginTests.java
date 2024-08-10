import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.example.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTests extends BaseTests {


    @Test
    public void successfulLoginTest() {

    LoginPage loginPage = new LoginPage(driver);

    loginPage.enterUsername("standard_user");
    loginPage.enterPassword("secret_sauce");
    loginPage.clickOnLoginButton();
    }

    @Test
    public void lockedUserTest(){
    LoginPage loginPage = new LoginPage(driver);

    loginPage.enterUsername("locked_out_user");
    loginPage.enterPassword("secret_sauce");
    loginPage.clickOnLoginButton();
    String expectedErrorMessage = "Epic sadface: Sorry, this user has been locked out.";
    loginPage.waitForErrorMessageToContain(expectedErrorMessage);
    }

    @Test
    public void loginWithoutPassword () {
    LoginPage loginPage = new LoginPage(driver);

    loginPage.enterUsername("standard_user");
    loginPage.clickOnLoginButton();
    String expectedErrorMessage = "Epic sadface: Password is required";
    loginPage.waitForErrorMessageToContain(expectedErrorMessage);
    }

}
