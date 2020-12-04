package com.tyltest.solution.homepage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageSteps {

    private HomePage homePage;

    public HomePageSteps() {
        this.homePage = new HomePage();
    }

    @Given("^User navigates to HomePage$")
    public void userNavigatesToHomePage() {
        this.homePage.goToHomePage();
    }

    @Then("^company logo is displayed$")
    public void companyLogoIsDisplayed() {
        this.homePage.checkLogoDisplay();
    }
}
