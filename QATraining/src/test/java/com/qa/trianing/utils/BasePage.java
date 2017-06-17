package com.qa.trianing.utils;

import cucumber.api.java.After;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BasePage {


    public static WebDriver driver;

    public static Properties prop;
    public static String browser;

    public void Browser() throws IOException {

        String env = System.getProperty("env");
        File file = null;

        if (env.equals("qa")) {
            file = new File("src/test/java/com/qa/trianing/propertyfiles/live.properties");
        } else if (env.equals("live")) {
            file = new File("src/test/java/com/qa/trianing/propertyfiles/qa.properties");
        }

        FileInputStream fileInput = null;
        try {
            fileInput = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        prop = new Properties();

//load properties file
            prop.load(fileInput);


          browser = System.getProperty("browser");

        if (browser.equals("chrome")) {

            ChromeDriverManager.getInstance().setup();
            driver = new ChromeDriver();
        } else if (browser.equals("safari")) {
            driver = new SafariDriver();
        } else {
            FirefoxDriverManager.getInstance().setup();
            driver = new FirefoxDriver();
        }
        String url = prop.getProperty("URL");



        if (browser.equals("chrome")) {
            //cookies
        }

    }

    public WebDriver getDriver() {
        return driver;
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }
}
