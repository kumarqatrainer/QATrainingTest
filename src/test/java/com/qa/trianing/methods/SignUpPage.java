package com.qa.trianing.methods;

import com.qa.trianing.utils.DriverHelpers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends DriverHelpers {

    @FindBy(css = "input[name='uid']")
    private WebElement userNameTextBox;

    @FindBy(css = "input[name='uid']")
    private WebElement passwordTextBox;

    @FindBy(css = "input[value='Create account']")
    private WebElement accountCreateBtn;

    @FindBy(css = ".message")
    private WebElement message;


    public void signUp(String userName, String password) {
//        waitForElementToVisible(userNameTextBox).sendKeys(userName);
//        waitForElementToVisible(accountCreateBtn).click();
    }

}
