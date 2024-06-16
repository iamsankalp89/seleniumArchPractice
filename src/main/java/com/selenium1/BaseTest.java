package com.selenium1;

import com.selenium1.utils.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    public WebDriver driver;

    @BeforeClass
    public void setUp()
    {
        driver= WebDriverFactory.getWebDriver();
        driver.get(PropertyReader.getInstance().getProperty("url"));
    }

    @AfterClass
    public void tearDown() {
        WebDriverFactory.quitDriver();
    }
}
