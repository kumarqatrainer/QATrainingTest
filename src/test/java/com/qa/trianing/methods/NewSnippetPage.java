package com.qa.trianing.methods;

import com.qa.trianing.utils.DriverHelpers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewSnippetPage extends DriverHelpers {

    @FindBy(name = "snippet")
    private WebElement snippetTxtBox;

    @FindBy(css = "input[type='submit']")
    private WebElement submitButton;

    @FindBy(id = "0")
    private WebElement newSnippetTxt;




    public String isNewSnippetCreated(){
       return newSnippetTxt.getText();
    }
}
