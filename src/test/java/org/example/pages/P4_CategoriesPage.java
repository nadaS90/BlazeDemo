package org.example.pages;

import org.example.stepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;


public class P4_CategoriesPage extends BasePage
{
    public P4_CategoriesPage(WebDriver driver)
    {
        super(driver);
    }

    public static final String phonesCategoryLinkID ="Phones";
    public static final String laptopsCategoryLinkID ="Laptops";
    public static final String monitorsCategoryLinkID ="Monitors";


    public WebElement phonesCategoryLink = Hooks.driver.findElement(By.linkText(phonesCategoryLinkID));
    public WebElement laptopsCategoryLink = Hooks.driver.findElement(By.linkText(laptopsCategoryLinkID));
    public WebElement monitorsCategoryLink = Hooks.driver.findElement(By.linkText(monitorsCategoryLinkID));


    public void UserClickPhonesCategoryLink()
    {
        ClickBtn(phonesCategoryLink);
    }
    public void UserClickLaptopsCategoryLink()
    {
        ClickBtn(laptopsCategoryLink);
    }
    public void UserClickMonitorsCategoryLink()
    {
        ClickBtn(monitorsCategoryLink);
    }

    public int ListedItemCount()
    {

        int itemsNo = Hooks.driver.findElements(By.xpath("//*[@id=\"tbodyid\"]")).size();
        return itemsNo;
    }


}
