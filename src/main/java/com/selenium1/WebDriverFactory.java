package com.selenium1;

import com.selenium1.utils.PropertyReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebDriverFactory {

    private static WebDriver driver;

    public static WebDriver getWebDriver()
    {
        String webBrowser = PropertyReader.getInstance().getProperty("browser");

        if(driver==null)
        {
            if (webBrowser.equals("chrome")) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            } else if (webBrowser.equals("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            } else if (webBrowser.equals("edge")) {
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
            } else {
                throw new IllegalStateException("Unexpected value: " + webBrowser);
            }
        }
        return driver;
    }

    public static void quitDriver()
    {
        if(driver!=null)
        {
            driver.quit();
            driver=null;
        }
    }
}
