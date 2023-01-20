package org.example.pages;

import io.cucumber.messages.types.Hook;
import org.example.stepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_HomePage extends BasePage
{
    public P1_HomePage(WebDriver driver)
    {
        super(driver);
    }

    public static final String signUpBtnHomeID ="signin2";
    public static final String logInBtnHomeID ="login2";
    public static final String logOutBtnHomeID = "//a[.='Log out']";
    public static final String cartBtnHomeID ="\"//a[.='Cart']\"";

    public static final String welcomeTxtHomeID ="nameofuser";


    public WebElement signUpBtnHome = Hooks.driver.findElement(By.id(signUpBtnHomeID));
    public WebElement loginBtnHome = Hooks.driver.findElement(By.id(logInBtnHomeID));
    public WebElement cartBtnHome = Hooks.driver.findElement(By.id(cartBtnHomeID));
    public WebElement logOutBtnHome = Hooks.driver.findElement(By.xpath(logOutBtnHomeID));
    public WebElement welcomeTxtHome = Hooks.driver.findElement(By.id(welcomeTxtHomeID));

    public void UserClickSignUpBtn()
    {
        ClickBtn(signUpBtnHome);
    }
    public void UserClickLogInBtn()
    {
        ClickBtn(loginBtnHome);
    }
    public void UserClickLogOutBtn()
    {
        ClickBtn(logOutBtnHome);
    }
    public void UserClickCartBtn()
    {
        ClickBtn(cartBtnHome);
    }




}
