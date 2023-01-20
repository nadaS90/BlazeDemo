package org.example.pages;

import org.example.stepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_LoginPage extends BasePage
{
    public P3_LoginPage(WebDriver driver)
    {
        super(driver);
    }

    public static final String userNameTxtBoxID ="loginusername";
    public static final String passwordTxtBoxID ="loginpassword";
    public static final String loginBtnID ="//*[contains(text(),'Log in') and @type='button']";

    public WebElement userNameTextBox = Hooks.driver.findElement(By.id(userNameTxtBoxID));
    public WebElement passwordTxtBox = Hooks.driver.findElement(By.id(passwordTxtBoxID));
    public WebElement loginBtn = Hooks.driver.findElement(By.xpath(loginBtnID));


    public void UserEnterUserName(String userName)
    {
        SendTxt(userNameTextBox, userName);
    }
    public void UserEnterPassword(String password)
    {
        SendTxt(passwordTxtBox, password);
    }
    public void UserClickSignInBtn()
    {
        ClickBtn(loginBtn);
    }

}
