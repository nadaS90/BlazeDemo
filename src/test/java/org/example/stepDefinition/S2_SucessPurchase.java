package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P1_HomePage;
import org.example.pages.P4_CategoriesPage;
import org.example.pages.P5_ItemsDetailsPage;
import org.example.pages.P6_CartPage;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.example.stepDefinition.Hooks.driver;

public class S2_SucessPurchase {
    P1_HomePage _homePage;
    P4_CategoriesPage _categoryPage;
    P5_ItemsDetailsPage _itemPage;
    P6_CartPage _cartPage;

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
        Thread.sleep(3000);
        int itemsNo = _categoryPage.ListedItemCount();
        System.out.println("There are Items in the category");
        Assert.assertEquals("Items Found", true, itemsNo > 0);
    }

    @When("User add item One to the cart")
    public void userAddItemOneToTheCart() throws InterruptedException
    {
        _categoryPage.UserNavigateToItemOne();
        _itemPage.SetAddToCartBtn();
        _itemPage.UserClickAddToCartBtn();
        _homePage.SetCartBtn();
        _homePage.UserClickCartBtn();

    }



    @Then("User delete item from cart")
    public void userDeleteItemFromCart()
    {
        _cartPage.SetDeleteBtn();
        _cartPage.UserClickDeleteBtn();
//         String actualString = _cartPage.itemInCart.getText();
//         String expectedString = "Nexus 6";
//         Assert.assertTrue(actualString.contains(expectedString));
    }


    @When("User place an order")
    public void userPlaceAnOrder() throws InterruptedException {
        Hooks.driver.navigate().to("https://www.demoblaze.com/cart.html");
        Hooks.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        _cartPage.SetPlaceOrderBtn();
        _cartPage.UserClickPlaceOrderBtn();
        Thread.sleep(5000);
    }

    @And("User fill mandatory fields")
    public void userFillMandatoryFields() {
    }

    @And("User click on purchase button")
    public void userClickOnPurchaseButton() {
    }

    @Then("Checkout done and successful msg will be displayed")
    public void checkoutDoneAndSuccessfulMsgWillBeDisplayed() {
    }


}



