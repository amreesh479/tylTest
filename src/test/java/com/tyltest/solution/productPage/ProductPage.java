package com.tyltest.solution.productPage;

import com.tyltest.solution.basepage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BasePage {

    @FindBy(css = "div.peek")
    private WebElement productLogo;

    @FindBy(css = "option[value=\"hilo\"]")
    private WebElement filterHighLow;

    @FindBy(xpath = "//div[6]/div[3]/button")
    private WebElement cheapestItem;

    @FindBy(xpath = "//div[2]/div[3]/button")
    private WebElement secondCostliestItem;

    @FindBy(xpath = "//div[@id='shopping_cart_container']/a/span")
    private WebElement goToCart;

    ProductPage() {
        PageFactory.initElements(driver, this);
    }

    void checkProductPageIsDisplayed() {
        wait.forElementToBeDisplayed(5, productLogo, "ProductLogo");
    }

    void filterProductList() {
        filterHighLow.click();
    }

    void selectCheapestItem() {
        wait.forElementToBeDisplayed(5, cheapestItem, "cheapestItem");
        cheapestItem.click();
    }

    void selectSecondCostliestItem() {
        wait.forElementToBeDisplayed(5, secondCostliestItem, "secondCostliestItem");
        secondCostliestItem.click();
    }

    String checkCartItemCount() {
        return goToCart.getText();
    }

    void goToCart() {
        goToCart.click();
    }
}
