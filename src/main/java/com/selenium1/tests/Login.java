package com.selenium1.tests;

import com.selenium1.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends BaseTest {

    @Test
    public void loginTest() {
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
