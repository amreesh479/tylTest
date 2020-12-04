package com.tyltest.solution.infra;

import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Setup {

    public static WebDriver driver;
    public static Properties prop;

    @Before
    public void setWebDriver() throws Exception {
        try {
            prop = new Properties();
            FileInputStream in = new FileInputStream(System.getProperty("user.dir") + "/src/test/java/com/tyltest/solution/config/config.properties");
            prop.load(in);

            String browserName = prop.getProperty("browser");

            if(browserName.equalsIgnoreCase("FF")) {
                System.setProperty(prop.getProperty("geckoDriver"),prop.getProperty("geckoDriverLocation"));
                driver = new FirefoxDriver();
            }
            if(browserName.equalsIgnoreCase("chrome")) {
                System.setProperty(prop.getProperty("chromeDriver"),prop.getProperty("chromeDriverLocation"));
                driver = new ChromeDriver();
            }

            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
