package com.tyltest.solution.cartpage;

import com.tyltest.solution.basepage.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BasePage {

    @FindBy(css = "div.subheader")
    private WebElement cartPage;

    @FindBy(linkText = "CHECKOUT")
    private WebElement checkout;

    CartPage() {
        PageFactory.initElements(driver, this);
    }

    void checkCartIsDisplayed() {
        wait.forElementToBeDisplayed(5, cartPage, "cartPage");
        Assert.assertTrue(cartPage.getText().contains("Your Cart"));
    }

    void goToCheckout() {
        checkout.click();
    }

}
