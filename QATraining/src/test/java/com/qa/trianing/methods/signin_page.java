package com.qa.trianing.methods;

import com.qa.trianing.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class signin_page {

    @FindBy(id = "signin-username")
    private WebElement username;

    @FindBy(xpath = ".//*[@id='drawer-dialog']/div/div[2]/div/div/div[2]/div/div/div[1]/div/div[2]/button")
    public WebElement cookiesbtn;



    public void signin(String email, String password) {
//        driver.findElement(By.id("signin-username")).sendKeys(email);

        username.sendKeys(email);



//        Driver.driver.findElement(By.id("signin-password")).sendKeys(password);
    }

    public void signinbuttonIsPresent(){


    }


    public void enterURL(String easyjeturl) {
        Driver.driver.get(easyjeturl);
//        cookiesbtn.click();



    }
}
