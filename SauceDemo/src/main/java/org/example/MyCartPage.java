package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyCartPage extends BasePage {

    public MyCartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver,this);
    }

    private static final String checkOutButtonCSSLocator = "#checkout";
    public static final String removeProductCSSLocator = "[data-test='remove-sauce-labs-bike-light']";
//    public static final String removeProductCSSLocator = "remove-sauce-labs-bike-light";

    @FindBy(css = checkOutButtonCSSLocator)
    private WebElement checkOutButton;

    @FindBy(css = removeProductCSSLocator)
    private WebElement removeProductButton;

    public void clickOnCheckOutButtonButton(){
       click(checkOutButton);
    }

    public void clickOnRemoveProduct() {
        click(removeProductButton);
    }
}
