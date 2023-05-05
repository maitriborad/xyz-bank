package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomersPage extends Utility {
    By logoutButton=By.xpath("//button[@class='btn logout']");
    By deposit=By.xpath("//button[normalize-space()='Deposit']");
    By withdraw=By.xpath("//button[normalize-space()='Withdrawl']");
    public void clickOnDeposit(){
        clickOnElement(deposit);
    }
    public void clickOnWithdraw(){
        clickOnElement(withdraw);
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

}
