package org.example.pages;

import org.example.stepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P6_CartPage extends BasePage
{
    public P6_CartPage(WebDriver driver)
    {
        super(driver);
    }
    public static final String itemInCartID = "Nexus 6";
   // public static final String deleteBtnID ="//a[.='Delete']";
    public static final String deleteBtnID ="//*[@id=\"tbodyid\"]/tr[1]/td[4]/a";
    public static final String placeOrderBtnID = "//button[contains(text(), 'Place Order')]";
    public WebElement deleteBtn;

    //public WebElement itemInCart = Hooks.driver.findElement(By.linkText(itemInCartID));
    public WebElement placeOrderBtn;


    public void SetDeleteBtn() {
        deleteBtn = Hooks.driver.findElement(By.xpath(deleteBtnID));
    }

    public void SetPlaceOrderBtn() {
        placeOrderBtn = Hooks.driver.findElement(By.xpath(placeOrderBtnID));
    }

    public void UserClickDeleteBtn()
    {
        ClickBtn(deleteBtn);
    }

    public void UserClickPlaceOrderBtn()
    {
        ClickBtn(placeOrderBtn);
    }
}
