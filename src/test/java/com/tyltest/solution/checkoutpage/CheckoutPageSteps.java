package com.tyltest.solution.checkoutpage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckoutPageSteps {

    private CheckoutPage checkoutPage;

    public CheckoutPageSteps() {this.checkoutPage = new CheckoutPage();}

    @Then("^checkout is displayed$")
    public void checkoutIsDisplayed() {
        this.checkoutPage.checkCheckOutPageIsDisplayed();
    }

    @When("^user provides (.*) (.*) and (.*)$")
    public void userProvidesFirstNameLastNameAndZip(String fName, String lName, String zipCode) {
        this.checkoutPage.enterFirstName(fName);
        this.checkoutPage.enterLastName(lName);
        this.checkoutPage.enterZip(zipCode);
    }

    @And("^select continue$")
    public void selectContinue() {
        this.checkoutPage.clickContinue();
    }
}
