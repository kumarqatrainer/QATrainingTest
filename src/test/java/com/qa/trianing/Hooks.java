package com.qa.trianing;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.FileNotFoundException;

public class Hooks {

    private Scenario scenario;


    private Driver driver = new Driver();



    @Before
    public void openBrowser(Scenario diScenario) throws FileNotFoundException {
        this.scenario = diScenario;
        System.out.println(diScenario.getName());
        driver.Browser();
    }

    @After
    public void closeBrowser(Scenario diScenario) {
        System.out.println(diScenario.getStatus());
        Driver.driver.quit();
    }
}
