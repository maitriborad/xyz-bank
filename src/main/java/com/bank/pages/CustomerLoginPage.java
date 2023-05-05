package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {
    By customerSearch=By.xpath("//select[@id='userSelect']");
    By loginButton=By.xpath("//button[@type='submit']");
    By yourNameText=By.xpath("//label[normalize-space()='Your Name :']");
    public void searchCustomer(String name){
        selectByVisibleTextFromDropDown(customerSearch,name);
    }
    public void clickOnLogin(){
        clickOnElement(loginButton);
    }
    public String getYourNameText(){
        return getTextFromElement(yourNameText);
    }
}
