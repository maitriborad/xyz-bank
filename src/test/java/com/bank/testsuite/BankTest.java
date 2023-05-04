package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {
    HomePage homePage=new HomePage();
    AddCustomerPage addCustomerPage=new AddCustomerPage();
    OpenAccountPage openAccountPage=new OpenAccountPage();
    CustomerLoginPage customerLoginPage=new CustomerLoginPage();
    AccountPage accountPage=new AccountPage();
    @Test
    public void bankManagerShouldAddCustomerSuccessfully(){
        homePage.clickOnBankManagerLogin();
        homePage.clickOnAddCustomerLoginTab();
        addCustomerPage.enterFirstName("Prime");
        addCustomerPage.enterLastName("Testing");
        addCustomerPage.enterPostcode("E13DS");
        addCustomerPage.clickOnAddCustomerButton();
        addCustomerPage.acceptAnAlert();
    }
    @Test
    public void bankManagerShouldOpenAccountSuccessfully(){
        addCustomerPage.clickOnHomeButton();
        homePage.clickOnBankManagerLogin();
        homePage.clickOnOpenAccount();
        openAccountPage.searchCustomer("Prime Testing");
        openAccountPage.selectCurrency("Pound");
        openAccountPage.clickOnProcessButton();
        openAccountPage.acceptAnAlert();
    }
    @Test
    public void customerShouldLoginAndLogoutSuccessfully(){
        addCustomerPage.clickOnHomeButton();
        homePage.clickOnCustomerLogin();
        customerLoginPage.searchCustomer("Prime Testing");
        customerLoginPage.clickOnLogin();
        customerLoginPage.verifyThatLogoutIsDisplayed();
        customerLoginPage.clickOnLogoutButton();
        Assert.assertEquals(customerLoginPage.getYourNameText(),"Your Name :","Log out is not successful");
    }
    @Test
    public void customerShouldDepositMoneySuccessfully(){
        addCustomerPage.clickOnHomeButton();
        homePage.clickOnCustomerLogin();
        customerLoginPage.searchCustomer("Harry Potter");
        customerLoginPage.clickOnLogin();
        accountPage.clickOnDeposit();
        accountPage.enterAmount("100");
        accountPage.clickOnSubmitButton();
        Assert.assertEquals(accountPage.getMessage(),"Deposit Successful","Amount not deposited");
    }
    @Test
    public void customerShouldWithdrawMoneySuccessfully(){
        addCustomerPage.clickOnHomeButton();
        homePage.clickOnCustomerLogin();
        customerLoginPage.searchCustomer("Hermoine Granger");
        customerLoginPage.clickOnLogin();
        accountPage.clickOnWithdraw();
        accountPage.enterAmount("50");
        accountPage.clickOnSubmitButton();
        Assert.assertEquals(accountPage.getMessage(),"Transaction successful","Amount not deposited");
    }
}
