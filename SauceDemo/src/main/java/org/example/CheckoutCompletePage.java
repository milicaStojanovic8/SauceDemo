package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CheckoutCompletePage extends BasePage {

    public CheckoutCompletePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    private static final String checkoutShoppingMessageCSSLocator = "[data-test='title']";

    @FindBy(css = checkoutShoppingMessageCSSLocator)
    private WebElement checkoutShoppingMessage;

    public void waitForCheckoutMessageToContain(String CheckOutMessage) {
        wait.until(ExpectedConditions.textToBePresentInElement(checkoutShoppingMessage, CheckOutMessage));
    }

    public String getSuccessfulCompleteMessage() {
        return checkoutShoppingMessage.getText();
    }
}
