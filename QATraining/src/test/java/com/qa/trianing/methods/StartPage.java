package com.qa.trianing.methods;

import com.qa.trianing.utils.DriverHelpers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartPage extends DriverHelpers {
    @FindBy(linkText = "Agree & Start")
    private WebElement agreeLink;

    public void clickOnAgreeAndStartLink() {
        agreeLink.click();
    }
}
