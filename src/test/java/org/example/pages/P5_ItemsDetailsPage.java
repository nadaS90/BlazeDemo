package org.example.pages;

import org.example.stepDefinition.Hooks;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P5_ItemsDetailsPage extends BasePage
{
    public P5_ItemsDetailsPage(WebDriver driver)
    {
        super(driver);
    }

    public static final String addToCartBtnXPath ="//a[.='Add to cart']";

    public WebElement addToCartBtn;

    public void SetAddToCartBtn() {
        addToCartBtn = Hooks.driver.findElement(By.xpath(addToCartBtnXPath));
    }

    public void UserClickAddToCartBtn() throws InterruptedException {
       ClickBtn(addToCartBtn);
        Thread.sleep(2000);
        Alert al = Hooks.driver.switchTo().alert();
        al.accept();

    }
}
