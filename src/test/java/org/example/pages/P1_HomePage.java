package org.example.pages;

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
    public static final String cartBtnHomeID ="//a[.='Cart']";
    public static final String homeBtnID ="//a[contains(.,'Home')]";

    public WebElement signUpBtnHome = Hooks.driver.findElement(By.id(signUpBtnHomeID));
    public WebElement loginBtnHome = Hooks.driver.findElement(By.id(logInBtnHomeID));
    public WebElement cartBtnHome ;
    public WebElement homeBtn ;


    public void UserClickSignUpBtn()
    {
        ClickBtn(signUpBtnHome);
    }
    public void UserClickLogInBtn()
    {
        ClickBtn(loginBtnHome);
    }
    public void SetCartBtn()
    {
        cartBtnHome = Hooks.driver.findElement(By.xpath(cartBtnHomeID));
    }
    public void UserClickCartBtn()
    {
        ClickBtn(cartBtnHome);
    }
    public void SetHomeBtn()
    {
        homeBtn  = Hooks.driver.findElement(By.xpath(homeBtnID));
    }
    public void UserClickHomeBtn() throws InterruptedException {
        ClickBtn(homeBtn);
        Thread.sleep(2000);
    }






}
