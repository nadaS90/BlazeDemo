package org.example.pages;

import org.example.stepDefinition.Hooks;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

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

    public void UserClickAddToCartBtn()
   {
       ClickBtn(addToCartBtn);
       Hooks.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//       Alert al = driver.switchTo().alert();
//       al.accept();
    }
}
