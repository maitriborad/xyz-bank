package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {
    By addCustomerTab=By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[1]");
    By openAccountTab=By.xpath("//button[normalize-space()='Open Account']");
    By customerLogin=By.xpath("//button[normalize-space()='Customer Login']");
    By homeButton=By.xpath("//button[@class='btn home']");
    public void clickOnAddCustomerLoginTab(){
        clickOnElement(addCustomerTab);
    }
    public void clickOnOpenAccount(){
        clickOnElement(openAccountTab);
    }
    public void clickOnCustomerLogin(){
        clickOnElement(customerLogin);
    }
    public void clickOnHomeButton(){
        clickOnElement(homeButton);
    }
}
