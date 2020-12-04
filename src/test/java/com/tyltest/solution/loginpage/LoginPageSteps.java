package com.tyltest.solution.loginpage;

import cucumber.api.java.en.When;

public class LoginPageSteps {

    private LoginPage loginPage;

    public LoginPageSteps() {
        this.loginPage = new LoginPage();
    }

    @When("^user tries to login$")
    public void userTriesToLogin() {
        this.loginPage.login();

    }
}
