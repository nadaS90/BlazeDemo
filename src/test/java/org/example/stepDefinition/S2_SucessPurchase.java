package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P4_CategoriesPage;
import org.junit.Assert;

public class S2_SucessPurchase
{
    P4_CategoriesPage _categoryPage;
    public S2_SucessPurchase()
    {
        this._categoryPage = new P4_CategoriesPage(Hooks.driver);
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
    public void userAddItemsToTheCart() {
    }

    @Then("User delete item from cart")
    public void userDeleteItemFromCart() {
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
