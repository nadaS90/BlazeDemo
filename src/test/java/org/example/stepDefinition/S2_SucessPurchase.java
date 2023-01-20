package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P1_HomePage;
import org.example.pages.P4_CategoriesPage;
import org.example.pages.P5_ItemsDetailsPage;
import org.junit.Assert;
import org.openqa.selenium.Alert;

public class S2_SucessPurchase
{
    P1_HomePage _homePage;
    P4_CategoriesPage _categoryPage;
    P5_ItemsDetailsPage _itemPage;
    public S2_SucessPurchase()
    {
        this._homePage = new P1_HomePage(Hooks.driver);
        this._categoryPage = new P4_CategoriesPage(Hooks.driver);
        this._itemPage = new P5_ItemsDetailsPage(Hooks.driver);
    }

    @When("User Check phones category")
    public void userCheckPhonesCategory()
    {
        _categoryPage.UserClickPhonesCategoryLink();
    }

    @Then("User find listed phones")
    public void userFindListedPhones() throws InterruptedException
    {
        Thread.sleep(3000);
        int itemsNo = _categoryPage.ListedItemCount();
        System.out.println("There are Items in the category");
        Assert.assertEquals("Items Found", true, itemsNo > 0);
    }

    @When("User Check laptops category")
    public void userCheckLaptopsCategory()
    {
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
    public void userCheckMonitorsCategory()
    {
        _categoryPage.UserClickMonitorsCategoryLink();
    }

    @Then("User find listed monitors")
    public void userFindListedMonitors() throws InterruptedException
    {
        Thread.sleep(3000);
        int itemsNo = _categoryPage.ListedItemCount();
        System.out.println("There are Items in the category");
        Assert.assertEquals("Items Found", true, itemsNo > 0);
    }

    @Given("User add items to the cart")
    public void userAddItemsToTheCart() throws InterruptedException
    {
        _categoryPage.UserNavigateToItemOne();
        Thread.sleep(5000);
        _itemPage.UserClickAddToCartBtn();
        Thread.sleep(5000);
        Alert al = Hooks.driver.switchTo().alert();
        al.accept();

        Hooks.driver.navigate().back();
        Thread.sleep(5000);

        _categoryPage.UserNavigateToItemTwo();
        Thread.sleep(5000);
        _itemPage.UserClickAddToCartBtn();
        Thread.sleep(5000);
        Alert alarm = Hooks.driver.switchTo().alert();
        alarm.accept();
    }

    @Then("User delete item from cart")
    public void userDeleteItemFromCart()
    {
        _homePage.UserClickCartBtn();

    }


    @When("User place an order")
    public void userPlaceAnOrder() {
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