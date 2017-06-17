package com.qa.trianing;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Driver {
    public String url;
    public static WebDriver driver;


    public void Browser() throws FileNotFoundException {
        String browser = System.getProperty("browser");

        String env = System.getProperty("env");

        File file;

        String userDir = System.getProperty("user.dir");



        if (env.equals("live")) {

            file = new File(
                userDir+"/src/test/java/com/qa/trianing/propertyfiles/live.properties");

        } else {

            file = new File(
                "/Users/Ravikumar/Documents/MyDocuments/Training/Framework/QATraining/src/test/java/com/qa/trianing/propertyfiles/qa.properties");
        }

        FileInputStream fileInput = null;

        fileInput = new FileInputStream(file);

        Properties kumar;

        kumar = new Properties();
        try {

            kumar.load(fileInput);
            url = kumar.getProperty("URL");

        } catch (IOException e) {
            e.printStackTrace();
        }


//        Opening the Browser
        if (browser == "firefox") {
            FirefoxDriverManager.getInstance().setup();
            System.out.println("no supported browser1");
            driver = new FirefoxDriver();
        } else if (browser.equals("chrome")) {
            ChromeDriverManager.getInstance().setup();
            System.out.println("no supported browser2");

            driver = new ChromeDriver();
        } else {
            System.out.println("no supported browser3any thing" + browser);
        }

        driver.get(url); // here i am using url value. if i want to use vasundhara i can use.
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        driver.findElement(By.xpath(".//*[@id='close-drawer-link']/img")).click();
    }
}
