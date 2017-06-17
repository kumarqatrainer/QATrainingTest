package com.qa.trianing.methods;

import com.qa.trianing.utils.DriverHelpers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverHelpers {

    @FindBy(linkText = "Sign up")
    private WebElement signUpLnk;

    @FindBy(linkText = "New Snippet")
    private WebElement newSnippetLnk;

    @FindBy(linkText = "Home")
    private WebElement homeLink;

    @FindBy(linkText = "Upload")
    private WebElement uploadLink;


}
