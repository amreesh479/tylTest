package com.tyltest.solution.homepage;

import com.tyltest.solution.basepage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    private static final String HOME_PAGE_URL = " https://www.saucedemo.com/";

    @FindBy(css = "img.bot_column")
    private WebElement logo;


    HomePage() {
        PageFactory.initElements(driver, this);
    }

    void goToHomePage(){
        driver.get(HOME_PAGE_URL);
    }

    void checkLogoDisplay() {
        wait.forElementToBeDisplayed(5, this.logo, "Logo");
    }


}
