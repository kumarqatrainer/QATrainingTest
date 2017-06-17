package com.qa.trianing.step_definations;

//     driver.get(url);
//    driver.findElement(By.id("EmailAddress")).sendKeys(email);
//   driver.findElement(By.id("OptInEasyJetMailingListCheckBox")).click();
//  driver.findElement(By.id("mainHeading")).getText()
//  driver.findElement(By.linkText("Sign Out")).isDisplayed();

//--------------


import com.qa.trianing.Driver;
import com.qa.trianing.methods.signin_page;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;

public class registration  {


    public signin_page signIn = PageFactory.initElements(Driver.driver, signin_page.class);

    @Given("^I enter url \"([^\"]*)\"$")
    public void iEnterUrl(String easyjeturl) throws Throwable {
//        Driver.driver.get(easyjeturl);
        signIn.enterURL(easyjeturl);

//        System.out.println(Driver.driver.findElement(By.xpath("//*[@alt='Cabin bag']")).getAttribute("src"));

    }

    @And("^I enter email address is \"([^\"]*)\"$")
    public void iEnterValidEmailAddressIs(String email) throws Throwable {
        Driver.driver.findElement(By.id("EmailAddress")).sendKeys(email);
    }

    @And("^I enter confirm email address is \"([^\"]*)\"$")
    public void iEnterValidConfirmEmailAddressIs(String arg0) throws Throwable {
        Driver.driver.findElement(By.id("EmailAddressCheck")).sendKeys(arg0);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterValidPassword(String password) throws Throwable {
        Driver.driver.findElement(By.id("Password")).sendKeys(password);
    }

    @And("^I enter confirm password \"([^\"]*)\"$")
    public void iEnterValidConfirmPassword(String confPassword) throws Throwable {
        Driver.driver.findElement(By.id("PasswordCheck")).sendKeys(confPassword);
    }

    @And("^I enter Title as \"([^\"]*)\"$")
    public void iEnterTitleAs1(String title) throws Throwable {
//        driver.findElement(By.id("TitleTypeCode")).sendKeys(title);

        int index = 0;

        if (title.equals("Mr")) {
            index = 1;
        } else if (title.equals("Mrs")) {
            index = 2;
        } else {
            index = 3;
        }

        switch (title) {
            case "Mr":
                break;
            case "Mrs":
                index = 2;
                break;
            default:
                index = 3;
        }

        new Select(Driver.driver.findElement(By.id("TitleTypeCode"))).selectByIndex(index);
    }


//    @Then("^I should see \"([^\"]*)\"$")
//    public void iShouldSee(String ExpectedErrormessage) throws Throwable {
//
//        if (ExpectedErrormessage.equals("username is wrong")) {
//            String actualErrormessage1 = driver.findElement(By.id("error1")).getText();
//            assertEquals(ExpectedErrormessage, actualErrormessage1);
//        } else if (ExpectedErrormessage.equals("confirmusername is wrong")) {
//
//            String actualErrormessage2 = driver.findElement(By.id("error2")).getText();
//            assertEquals(ExpectedErrormessage, actualErrormessage2);
//        } else if (ExpectedErrormessage.equals("password is wrong")) {
//            String actualErrormessage3 = driver.findElement(By.id("error3")).getText();
//            assertEquals(ExpectedErrormessage, actualErrormessage3);
//        } else {
//            String actualErrormessage4 = driver.findElement(By.id("error4")).getText();
//            assertEquals(ExpectedErrormessage, actualErrormessage4);
//        }
//    }


    public String method1(String ExpectedErrormessage_Name) {

        String ActualEmailAddress =
            Driver.driver.findElement(By.xpath("/html/body/div[1]/div/form/div/div[3]/div[2]/div/div[1]/label[2]")).getText();
        String ActualPasswordMsg =
            Driver.driver.findElement(By.xpath("/html/body/div[1]/div/form/div/div[3]/div[2]/div/div[3]/label[2]")).getText();

        String[] ExpectedErrorMsgsArray = ExpectedErrormessage_Name.split(",");

//        assertEquals(ExpectedErrorMsgsArray[0],ActualEmailAddress);
//        assertEquals(ExpectedErrorMsgsArray[1],ActualPasswordMsg);

        return ExpectedErrorMsgsArray[0];
    }


    @And("^I entered source \"([^\"]*)\"$")
    public void iEnteredSource(String arg0) throws Throwable {
        Driver.driver.findElement(By.name("origin")).clear();
        Driver.driver.findElement(By.name("origin")).sendKeys(arg0);
    }

    @And("^I entered Departing date \"([^\"]*)\"$")
    public void iEnteredDepartingDate(String DepartDate) throws Throwable {
        Driver.driver.findElement(By.xpath("//a[@class='calendar'][@title='Click to choose a departure date']/img")).click();
        Driver.driver.findElement(By.xpath("//div[@class='day'][@data-date='2017-06-15']/a")).click();
    }

    @Then("^I should see \"([^\"]*)\" for \"([^\"]*)\"$")
    public void iShouldSeeFor(String ExpectedErrormessage, String flag) throws Throwable {

        String[] expectedArray = ExpectedErrormessage.split(",");

//        String actualErrormessage0 = driver.findElement(By.id("error1")).getText();
//        assertEquals(expectedErormesageaftersplit[0],actualErrormessage0);




        if (flag.equals("error1")) {
            String actualErrormessage1 = Driver.driver.findElement(By.id("error1")).getText();
            assertEquals(ExpectedErrormessage, actualErrormessage1);
        } else if (flag.equals("erro2")) {

            String actualErrormessage2 = Driver.driver.findElement(By.id("error2")).getText();
            assertEquals(ExpectedErrormessage, actualErrormessage2);
        } else if (flag.equals("erro3")) {
            String actualErrormessage3 = Driver.driver.findElement(By.id("error3")).getText();
            assertEquals(ExpectedErrormessage, actualErrormessage3);
        } else {
            String actualErrormessage4 = Driver.driver.findElement(By.id("error4")).getText();
            assertEquals(ExpectedErrormessage, actualErrormessage4);
        }


    }



}
