package com.tyltest.solution.loginpage;

import com.tyltest.solution.basepage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(id = "user-name")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login-button")
    private WebElement login;

    LoginPage() {
        PageFactory.initElements(driver, this);
    }

    void login() {
        username.click();
        username.sendKeys("standard_user");
        password.click();
        password.sendKeys("secret_sauce");
        login.click();
    }

}
