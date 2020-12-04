package com.tyltest.solution.productPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ProductPageSteps {

    private ProductPage productPage;

    public ProductPageSteps() { this.productPage = new ProductPage();}

    @Then("^login is successful$")
    public void loginIsSuccessful() {
        this.productPage.checkProductPageIsDisplayed();
    }

    @When("^user filter product list$")
    public void userFilterProductList() {
        this.productPage.filterProductList();
    }

    @Then("^cart has (.*) products$")
    public void cartHasNumberProducts(String expectedCartItem) {
        String actualCartItem = this.productPage.checkCartItemCount();
        Assert.assertTrue(expectedCartItem.equalsIgnoreCase(actualCartItem));
    }

    @When("^user select cart$")
    public void userSelectCart() {
        this.productPage.goToCart();
    }

    @And("^select cheapest product$")
    public void selectCheapestProduct() {
        this.productPage.selectCheapestItem();
    }

    @And("^select second costliest product$")
    public void selectSecondCostliestProduct() {
        this.productPage.selectSecondCostliestItem();
    }
}
