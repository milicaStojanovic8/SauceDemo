package org.example;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ShoppingPage extends BasePage {

    public ShoppingPage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver,this);
    }
    private static final String addToCartCSSLocator = "[data-test='add-to-cart-sauce-labs-bike-light']";
    private static final String shoppingBasketCSSLocator = "[data-test='shopping-cart-link']";
    private static final String continueCSSLocator = "#continue";

    private static final String twitterIconCSSLocator = "[data-test='social-twitter']";
    private static final String facebookIconCSSLocator = "[data-test='social-facebook']";
    private static final String linkedinIconCSSLocator = "[data-test='social-linkedin']";

    private static final String  twitterLinkURL = "https://twitter.com/saucelabs";
//    WebElement  twitterLink = driver.findElement(By.linkText())
    private static final String facebookLink = "https://www.facebook.com/saucelabs";
    private static final String linkedinLink = "https://www.linkedin.com/company/sauce-labs/";

    @FindBy(css = addToCartCSSLocator)
    private WebElement addToCartButton;

    @FindBy(css = shoppingBasketCSSLocator)
    private WebElement shoppingBasketButton;

    @FindBy(css = continueCSSLocator)
    private WebElement continueButton;


    @FindBy(css = twitterIconCSSLocator)
    private WebElement twitterIcon;

    @FindBy(css = facebookIconCSSLocator)
    private WebElement facebookIcon;

    @FindBy(css = linkedinIconCSSLocator)
    private WebElement linkedinIcon;

    @FindBy(css = twitterLinkURL)
    private WebElement twitterLink;

//    public boolean isDisplayedTwitter() {
//        if (twitterLink.isDisplayed()) {
//            return true;
//        } else {
//            return false;
//        }
//    }

    public void clickOnAddToCart(){
        click(addToCartButton);
    }
    public void clickOnShoppingBasketButton(){
        click(shoppingBasketButton);
    }

    public void clickOnContinueButton(){
        click(continueButton);
    }

    public void clickOnTwitterIcon() {
        click(twitterIcon);

    }
    public void clickOnFacebookIcon() {
        click(facebookIcon);
    }
    public void clickOnLinkedinIcon() {
        click(linkedinIcon);
    }
}



