package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {
    By customerSearch=By.xpath("//select[@id='userSelect']");
    By loginButton=By.xpath("//button[@type='submit']");
    By logoutButton=By.xpath("//button[@class='btn logout']");
    By yourNameText=By.xpath("//label[normalize-space()='Your Name :']");
    public void searchCustomer(String name){
        selectByVisibleTextFromDropDown(customerSearch,name);
    }
    public void clickOnLogin(){
        clickOnElement(loginButton);
    }
    public boolean verifyThatLogoutIsDisplayed(){
        boolean button=driver.findElement(By.xpath("//button[@class='btn logout']")).isDisplayed();
        if (button) {
            return true;
        } else {
            return false;
        }
    }
    public void clickOnLogoutButton(){
        clickOnElement(logoutButton);
    }
    public String getYourNameText(){
        return getTextFromElement(yourNameText);
    }
}
