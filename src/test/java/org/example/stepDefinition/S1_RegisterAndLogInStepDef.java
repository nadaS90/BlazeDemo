package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.data.Constants;
import org.example.pages.P1_HomePage;
import org.example.pages.P2_RegistrationPage;
import org.example.pages.P3_LoginPage;
import org.junit.Assert;
import org.openqa.selenium.Alert;

public class S1_RegisterAndLogInStepDef {

    String logOutHomeBtn;
    P1_HomePage _homePage;
    P2_RegistrationPage _registerPage;
    P3_LoginPage _loginPage;


    public S1_RegisterAndLogInStepDef()
    {
        this._homePage = new P1_HomePage(Hooks.driver);
        this._registerPage = new P2_RegistrationPage(Hooks.driver);
        this._loginPage = new P3_LoginPage(Hooks.driver);
    }

    @Given("user navigates to signUp popUp")
    public void userNavigatesToSignUpPopUp()
    {
        _homePage.UserClickSignUpBtn();
    }

    @And("user enters valid username")
    public void userEntersValidUsername()
    {
        _registerPage.UserAddUserName(Constants.email);
    }

    @And("user fills valid password")
    public void userFillsValidPassword()
    {
        _registerPage.UserAddPassword(Constants.Password);
    }

    @When("user clicks signUp Button")
    public void userClicksSignUpButton()
    {
        _registerPage.UserClickSignUpBtn();
    }

    @Then("user could register successfully and success msg appears")
    public void userCouldRegisterSuccessfullyAndSuccessMsgAppears() throws InterruptedException {
        Thread.sleep(5000);
        Alert al = Hooks.driver.switchTo().alert();
        al.accept();
    }

    @When("user go to login popUp")
    public void userGoToLoginPopUp()
    {
        _homePage.UserClickLogInBtn();
    }

    @And("user enter valid email and password")
    public void userEnterValidEmailAndPassword(){
        _loginPage.UserEnterUserName(Constants.email);
        _loginPage.UserEnterPassword(Constants.Password);
        _loginPage.UserClickSignInBtn();
    }
}
