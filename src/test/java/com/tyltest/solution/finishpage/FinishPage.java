package com.tyltest.solution.finishpage;

import com.tyltest.solution.basepage.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinishPage extends BasePage {

    @FindBy(xpath = "//div[@id='contents_wrapper']/div[2]")
    private WebElement checkoutoverview;

    @FindBy(linkText = "FINISH")
    private WebElement finishBtn;

    @FindBy(css = "div.subheader")
    private  WebElement orderComplete;

    @FindBy(css = "img.pony_express")
    private WebElement orderCompleteImage;

    FinishPage() { PageFactory.initElements(driver,this); }

    void checkCheckoutOverviewPageIsDisplayed() {
        wait.forElementToBeDisplayed(5, checkoutoverview, "checkout overview");
        Assert.assertTrue(checkoutoverview.getText().equalsIgnoreCase("Checkout: Overview"));
    }

    void finishOrder() {
        finishBtn.click();
    }

    void checkFinishOrderPageIsDisplayed(){
        wait.forElementToBeDisplayed(5, orderComplete, "Order Complete");
        Assert.assertTrue(orderComplete.getText().equalsIgnoreCase("Finish"));
        wait.forElementToBeDisplayed(5, orderCompleteImage, "Order Complete Image");
    }

}
