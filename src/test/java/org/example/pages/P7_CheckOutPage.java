package org.example.pages;

import org.example.stepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P7_CheckOutPage extends BasePage
{
    public P7_CheckOutPage(WebDriver driver)
    {
        super(driver);
    }

    public static final String nameTxtBoxID ="name";
    public static final String countryTxtBoxID = "country";
    public static final String cityTxtBoxID = "city";
    public static final String cardTxtBoxID = "card";
    public static final String monthTxtBoxID = "month";
    public static final String yearTxtBoxID = "year";
    public static final String purchaseBtnID = "//button[.='Purchase']";



    public WebElement nameTextBox = Hooks.driver.findElement(By.id(nameTxtBoxID));
    public WebElement countryTextBox = Hooks.driver.findElement(By.id(countryTxtBoxID));
    public WebElement cityTextBox = Hooks.driver.findElement(By.id(cityTxtBoxID));
    public WebElement cardTextBox = Hooks.driver.findElement(By.id(cardTxtBoxID));
    public WebElement monthTextBox = Hooks.driver.findElement(By.id(monthTxtBoxID));
    public WebElement yearTextBox = Hooks.driver.findElement(By.id(yearTxtBoxID));
    public WebElement purchaseBtn = Hooks.driver.findElement(By.xpath(purchaseBtnID));

    public void UserFillMandatoryFields(String name , String country, String city, String card, String month, String  year)
    {
        SendTxt(nameTextBox, name);
        SendTxt(countryTextBox, country);
        SendTxt(cityTextBox, city);
        SendTxt(cardTextBox, card);
        SendTxt(monthTextBox, month);
        SendTxt(yearTextBox, year);
    }
    public void UserClickpurchaseBtn()
    {
        ClickBtn(purchaseBtn);
    }
}
