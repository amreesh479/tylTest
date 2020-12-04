package com.tyltest.solution.cartpage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CartPageSteps {

    private CartPage cartPage;

    public CartPageSteps() { this.cartPage = new CartPage();}

    @Then("^cart is displayed$")
    public void cartIsDisplayed() {
        this.cartPage.checkCartIsDisplayed();
    }

    @When("^user select checkout$")
    public void userSelectCheckout() {
        this.cartPage.goToCheckout();
    }
}
