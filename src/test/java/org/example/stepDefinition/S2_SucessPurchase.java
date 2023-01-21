package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.data.Constants;
import org.example.pages.*;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.example.stepDefinition.Hooks.driver;

public class S2_SucessPurchase {
    P1_HomePage _homePage;
    P4_CategoriesPage _categoryPage;
    P5_ItemsDetailsPage _itemPage;
    P6_CartPage _cartPage;
    P7_CheckOutPage _checkOutPage;

    public S2_SucessPurchase() {
        this._homePage = new P1_HomePage(driver);
        this._categoryPage = new P4_CategoriesPage(driver);
        this._itemPage = new P5_ItemsDetailsPage(driver);
        this._cartPage = new P6_CartPage(driver);

    }

    @When("User Check phones category")
    public void userCheckPhonesCategory() {
        _categoryPage.UserClickPhonesCategoryLink();
    }

    @Then("User find listed phones")
    public void userFindListedPhones() throws InterruptedException {
        Thread.sleep(3000);
        int itemsNo = _categoryPage.ListedItemCount();
        System.out.println("There are Items in the category");
        Assert.assertEquals("Items Found", true, itemsNo > 0);
    }

    @When("User Check laptops category")
    public void userCheckLaptopsCategory() {
        _categoryPage.UserClickLaptopsCategoryLink();
    }

    @Then("User find listed laptops")
    public void userFindListedLaptops() throws InterruptedException {
        Thread.sleep(3000);
        int itemsNo = _categoryPage.ListedItemCount();
        System.out.println("There are Items in the category");
        Assert.assertEquals("Items Found", true, itemsNo > 0);
    }

    @When("User Check monitors category")
    public void userCheckMonitorsCategory() {
        _categoryPage.UserClickMonitorsCategoryLink();
    }

    @Then("User find listed monitors")
    public void userFindListedMonitors() throws InterruptedException {
        Thread.sleep(1000);
        int itemsNo = _categoryPage.ListedItemCount();
        System.out.println("There are Items in the category");
        Assert.assertEquals("Items Found", true, itemsNo > 0);
    }

    @When("User add items to the cart")
    public void userAddItemsToTheCart() throws InterruptedException {
        _categoryPage.UserNavigateToItemOne();


        _itemPage.SetAddToCartBtn();
        for (int i = 0; i < 2; i++) {
            _itemPage.UserClickAddToCartBtn();
        }

        for (int i = 0; i < 2; i++) {
            _itemPage.UserClickAddToCartBtn();
        }

        _homePage.SetCartBtn();
        _homePage.UserClickCartBtn();
    }

    @Then("User delete item from cart")
    public void userDeleteItemFromCart() throws InterruptedException {
        _cartPage.SetDeleteBtn();
        _cartPage.UserClickDeleteBtn();
        Thread.sleep(5000);

    }

    @When("User place an order")
    public void userPlaceAnOrder() throws InterruptedException
    {
        _cartPage.SetPlaceOrderBtn();
        _cartPage.UserClickPlaceOrderBtn();
        Thread.sleep(5000);
    }

    @And("User fill mandatory fields")
    public void userFillMandatoryFields() throws InterruptedException {
        this._checkOutPage = new P7_CheckOutPage(driver);
        _checkOutPage.UserFillMandatoryFields(Constants.Name, Constants.Country, Constants.City,Constants.Card, Constants.Month, Constants.Year);
        Thread.sleep(5000);

    }

    @And("User click on purchase button")
    public void userClickOnPurchaseButton()
    {
        _checkOutPage.UserClickpurchaseBtn();
    }

    @Then("Checkout done and successful msg will be displayed")
    public void checkoutDoneAndSuccessfulMsgWillBeDisplayed()
    {
        String actualResult = Hooks.driver.findElement(By.xpath("//h2[.='Thank you for your purchase!']")).getText();
        String expectedResult = "Thank you";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }


}



