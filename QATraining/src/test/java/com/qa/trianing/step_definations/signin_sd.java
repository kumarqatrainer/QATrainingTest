package com.qa.trianing.step_definations;

import com.qa.trianing.Driver;
import com.qa.trianing.methods.signin_page;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;


public class signin_sd  {
    public  signin_page signIn_jyo = PageFactory.initElements(Driver.driver, signin_page.class);



    @And("^I signed in with \"([^\"]*)\",\"([^\"]*)\"$")
    public void iSignedInWith(String email, String password) throws Throwable {

//        signin_page signin1 = new signin_page();
        signIn_jyo.signin("ravikumar.achi@hotmail.com", password);

        Driver.driver.findElement(By.id("url")).sendKeys("ravikuamr@hotmail.com");
    }


    @Given("^I enter easyjet url$")
    public void iEnterEasyjetUrl() throws Throwable {
//        Browser();
    }

    @Then("^I should see sing in button$")
    public void iShouldSeeSingInButton() throws Throwable {
    signIn_jyo.signinbuttonIsPresent();
    }
}
