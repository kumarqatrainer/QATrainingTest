package com.qa.trianing.step_definations;

import com.qa.trianing.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class help {


    @When("^I clicked on help menu$")
    public void iClickedOnHelpMenu() throws Throwable {
        Thread.sleep(3000);
        Driver.driver.findElement(By.xpath(".//*[@id='pageWrapper']/div[2]/div[1]/div[1]/div[3]/ul/li[3]/h3/a"))
                     .click();
    }


    @And("^Should be display page \"([^\"]*)\"$")
    public void shouldBeDisplayPage(String arg0) throws Throwable {

    }

    @When("^I click \"([^\"]*)\"$")
    public void iClick(String helpTopic) throws Throwable {
        List<WebElement> helpTopics =
            Driver.driver.findElements(By.xpath("//*[@class='search-question navigation-link']"));

        if (helpTopic.equals("Help Homepage")) {
            helpTopics.get(0).click();
        } else if (helpTopic.equals("Bag allowance")) {
            //2nd page
            helpTopics.get(1).click();
        }

        //3rd page
//        helpTopics.get(2).click();
    }

    @Then("^I should see \"([^\"]*)\"$")
    public void iShouldSee(String expectedHelpPage) throws Throwable {
        String actualhelppage = Driver.driver.findElement((By.id("id"))).getText();
        assertEquals(expectedHelpPage, actualhelppage);
    }

    @Then("^I should see helppagetopics \"([^\"]*)\"$")
    public void iShouldSeeHelppagetopics(String ExphelpPageTopics) throws Throwable {
        //get all the pages in to variable from the website. store variable. actualResults

        // Will compare expResults with Actual results

        String[] ExpHelpTopic = ExphelpPageTopics.split(",");
        System.out.println(ExpHelpTopic[0]);

        System.out.println(ExpHelpTopic.length);

        List<WebElement> helpTopics =
            Driver.driver.findElements(By.xpath("//*[@class='search-question navigation-link']"));
        System.out.println(helpTopics.size());

        for (int i = 0; i > ExpHelpTopic.length; i++) {
            assertEquals(ExpHelpTopic[i], helpTopics.get(i).getText());
        }
    }

    @And("^I enter \"([^\"]*)\"$")
    public void iEnter(String searchTopic) throws Throwable {
Thread.sleep(3000);
        Driver.driver.findElement(By.xpath("//*[@class='search-box-container']/input")).sendKeys(searchTopic);
    }

    @Then("^I should see \"([^\"]*)\" in a new page$")
    public void iShouldSeeInANewPage(String searchTopic) throws Throwable {


    }
}
