package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutLoginPage extends BasePage {

    public CheckoutLoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver,this);
    }

    private static final String firstNameCSSLocator = "#first-name";
    private static final String lastNameCSSLocator = "#last-name";
    private static final String ZipCodeCSSLocator = "#postal-code";
    private static final String finishCSSLocator = "#finish";


    @FindBy(css = firstNameCSSLocator)
    private WebElement firstNameInput;

    @FindBy(css = lastNameCSSLocator)
    private WebElement lastNameInput;

    @FindBy(css = ZipCodeCSSLocator)
    private WebElement zipCodeInput;

    @FindBy(css = finishCSSLocator)
    private WebElement finishButton;

    public void enterFirstName(String firstName){
        enterText(firstNameInput, firstName);
    }
    public void enterLastName(String lastName){
        enterText(lastNameInput, lastName);
    }
    public void enterZipCode(String zipCode){
        enterText(zipCodeInput, zipCode);
    }
    public void clickOnFinishButton(){
        click(finishButton);
    }
}
