package com.tyltest.solution.finishpage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FinishPageSteps {

    private FinishPage finishPage;

    public FinishPageSteps() { this.finishPage = new FinishPage();}

    @Then("^checkout overview is displayed$")
    public void checkoutOverviewIsDisplayed() {
        this.finishPage.checkCheckoutOverviewPageIsDisplayed();
    }

    @When("^user select finish$")
    public void userSelectFinish() {
        this.finishPage.finishOrder();
    }

    @Then("^Order finish page is displayed$")
    public void orderFinishPageIsDisplayed() {
        this.finishPage.checkFinishOrderPageIsDisplayed();
    }
}
