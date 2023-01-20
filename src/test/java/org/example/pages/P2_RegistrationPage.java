package org.example.pages;

import org.example.stepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P2_RegistrationPage extends BasePage
{
    public P2_RegistrationPage(WebDriver driver)
    {
        super(driver);
    }

    //Locators:
    public static final String userNameID ="sign-username";
    public static final String passwordID ="sign-password";
    public static final String signUpBtnName ="//*[contains(text(),'Sign up') and @type='button']";

    public WebElement userNameTextBox = Hooks.driver.findElement(By.id(userNameID));
    public WebElement passwordTextBox = Hooks.driver.findElement(By.id(passwordID));
    public WebElement signUpBtn = Hooks.driver.findElement(By.xpath(signUpBtnName));



     public void UserAddUserName(String userName)
    {
        SendTxt(userNameTextBox, userName);
    }

     public void UserAddPassword(String password)
     {
         SendTxt(passwordTextBox, password);
     }

     public void UserClickSignUpBtn()
     {
         ClickBtn(signUpBtn);
     }


}
