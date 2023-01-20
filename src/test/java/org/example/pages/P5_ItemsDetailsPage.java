package org.example.pages;

import org.example.stepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P5_ItemsDetailsPage extends BasePage
{
    public P5_ItemsDetailsPage(WebDriver driver)
    {
        super(driver);
    }

    public static final String addToCartBtnID ="//a[.='Add to cart']";

    public WebElement addToCartBtn = Hooks.driver.findElement(By.xpath(addToCartBtnID));


    public void UserClickAddToCartBtn()
   {
        ClickBtn(addToCartBtn);
    }
}
