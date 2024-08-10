package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage{


    private static final String usernameButtonCSSLocator = "#user-name";
    private static final String passwordButtonCSSLocator = "#password";
    private static final String loginButtonCSSLocator = "#login-button";
    private static final String errorMessageCSSLocator = "[data-test='error']";


    @FindBy(css = usernameButtonCSSLocator)
    private WebElement userNameInput;

    @FindBy(css = passwordButtonCSSLocator)
    private WebElement passwordInput;

    @FindBy(css = loginButtonCSSLocator)
    private WebElement loginButton;

    @FindBy(css = errorMessageCSSLocator)
    private WebElement errorMessageLabel;


    public void enterUsername(String username){
        enterText(userNameInput,username);
    }

    public void enterPassword(String password){
        enterText(passwordInput,password);
    }


    public void clickOnLoginButton(){
        click(loginButton);
    }

    public void waitForErrorMessageToContain(String errorMessage ){
        wait.until(ExpectedConditions.textToBePresentInElement(errorMessageLabel, errorMessage));
    }

//    public String getErrorMessage () {
//        return errorMessageLabel.getText();
//    }

    public LoginPage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(this. driver, this );

    }
}
