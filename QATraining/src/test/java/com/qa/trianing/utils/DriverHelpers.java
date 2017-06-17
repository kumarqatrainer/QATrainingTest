package com.qa.trianing.utils;

import cucumber.api.Scenario;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class DriverHelpers  {
//public class DriverHelpers extends Helper {

    public static WebDriver driver;
    private String url = "http://www.easyjet.com";
    private String browser = (System.getProperty("browser") == null) ? "" : System.getProperty("browser");

    public DriverHelpers() {

        PageFactory.initElements(driver, this);
    }

    public DriverHelpers selectBrowser() {

        switch (browser) {
            case "ie":
                InternetExplorerDriverManager.getInstance().setup();
                driver = new InternetExplorerDriver();
                break;
            case "firefox":
                FirefoxDriverManager.getInstance().setup();
                driver = new FirefoxDriver();
                break;
            default:
                ChromeDriverManager.getInstance().setup();
                driver = new ChromeDriver();
                break;
        }
        return this;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public DriverHelpers maximizeWindow() {
        driver.manage().window().maximize();
        return this;
    }

    /**
     * https://github.com/mozilla/geckodriver/issues/564
     *
     * @return
     */
    public DriverHelpers setImplicitWait() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return this;
    }

    private void setUrl(String url) {
        this.url = url;
    }

    public void navigateTo() {
        driver.get(url);
    }

    public void embedScreenshot(Scenario scenario) {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir") + "/target/screenShots/ " + scenario.getName() + ".png"));
        } catch (IOException e) {
            throw new RuntimeException("problem occured during screenshot");
        }
    }
}
