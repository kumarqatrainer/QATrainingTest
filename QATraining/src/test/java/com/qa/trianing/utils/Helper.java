package com.qa.trianing.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper {

    public WebElement waitForElementToVisible(WebElement element) {
        return new WebDriverWait(new DriverHelpers().getDriver(), 30)
                .until(ExpectedConditions.visibilityOf(element));
    }

    public WebElement waitForTextPresentOnElement(WebElement element, String txt) {
        new WebDriverWait(new DriverHelpers().getDriver(), 30)
                .until(ExpectedConditions.textToBePresentInElement(element, txt));
        return element;
    }
}
