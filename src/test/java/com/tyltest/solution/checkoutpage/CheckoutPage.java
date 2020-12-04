package com.tyltest.solution.checkoutpage;

import com.tyltest.solution.basepage.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends BasePage {

    @FindBy(css = "div.subheader")
    private WebElement checkout;

    @FindBy(id = "first-name")
    private WebElement firstName;

    @FindBy(id = "last-name")
    private WebElement lastname;

    @FindBy(id = "postal-code")
    private WebElement zip;

    @FindBy(linkText = "CANCEL")
    private WebElement cancel;

    @FindBy(xpath = "//input[@value='CONTINUE']")
    private WebElement contnue;

    CheckoutPage() {
        PageFactory.initElements(driver, this);
    }

    void checkCheckOutPageIsDisplayed() {
        wait.forElementToBeDisplayed(5, checkout, "checkout");
        Assert.assertTrue(checkout.getText().contains("Checkout"));
    }

    void enterFirstName(String fName) {
        firstName.sendKeys(fName);
    }

    void enterLastName( String lName) {
        lastname.sendKeys(lName);
    }

    void enterZip(String zipCode) {
        zip.sendKeys(zipCode);
    }

    void clickCancel() {
        cancel.click();
    }

    void clickContinue() {
        contnue.click();
    }

}
