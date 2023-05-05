package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {
    CustomersPage customersPage=new CustomersPage();
    HomePage homePage=new HomePage();
    AddCustomerPage addCustomerPage=new AddCustomerPage();
    OpenAccountPage openAccountPage=new OpenAccountPage();
    CustomerLoginPage customerLoginPage=new CustomerLoginPage();
    AccountPage accountPage=new AccountPage();
    BankManagerLoginPage bankManagerLoginPage=new BankManagerLoginPage();
    @Test
    public void bankManagerShouldAddCustomerSuccessfully(){
        homePage.clickOnBankManagerLogin();
        bankManagerLoginPage.clickOnAddCustomerLoginTab();
        addCustomerPage.enterFirstName("Prime");
        addCustomerPage.enterLastName("Testing");
        addCustomerPage.enterPostcode("E13DS");
        addCustomerPage.clickOnAddCustomerButton();
        addCustomerPage.acceptAnAlert();
    }
    @Test
    public void bankManagerShouldOpenAccountSuccessfully(){
        bankManagerLoginPage.clickOnHomeButton();
        homePage.clickOnBankManagerLogin();
        bankManagerLoginPage.clickOnOpenAccount();
        openAccountPage.searchCustomer("Prime Testing");
        openAccountPage.selectCurrency("Pound");
        openAccountPage.clickOnProcessButton();
        openAccountPage.acceptAnAlert();
    }
    @Test
    public void customerShouldLoginAndLogoutSuccessfully(){
        bankManagerLoginPage.clickOnHomeButton();
        bankManagerLoginPage.clickOnCustomerLogin();
        customerLoginPage.searchCustomer("Prime Testing");
        customerLoginPage.clickOnLogin();
        customersPage.verifyThatLogoutIsDisplayed();
        customersPage.clickOnLogoutButton();
        Assert.assertEquals(customerLoginPage.getYourNameText(),"Your Name :","Log out is not successful");
    }
    @Test
    public void customerShouldDepositMoneySuccessfully(){
        bankManagerLoginPage.clickOnHomeButton();
        bankManagerLoginPage.clickOnCustomerLogin();
        customerLoginPage.searchCustomer("Harry Potter");
        customerLoginPage.clickOnLogin();
        customersPage.clickOnDeposit();
        accountPage.enterAmount("100");
        accountPage.clickOnSubmitButton();
        Assert.assertEquals(accountPage.getMessage(),"Deposit Successful","Amount not deposited");
    }
    @Test
    public void customerShouldWithdrawMoneySuccessfully(){
        bankManagerLoginPage.clickOnHomeButton();
        bankManagerLoginPage.clickOnCustomerLogin();
        customerLoginPage.searchCustomer("Hermoine Granger");
        customerLoginPage.clickOnLogin();
        customersPage.clickOnWithdraw();
        accountPage.enterAmount("50");
        accountPage.clickOnSubmitButton();
        Assert.assertEquals(accountPage.getMessage(),"Transaction successful","Amount not deposited");
    }
}
