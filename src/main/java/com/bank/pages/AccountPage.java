package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {
    By deposit=By.xpath("//button[normalize-space()='Deposit']");
    By amountLink=By.xpath("//input[@placeholder='amount']");
    By depositAndWithdrawButton=By.xpath("//button[@type='submit']");
    By successMessage=By.xpath("//span[@class='error ng-binding']");
    By withdraw=By.xpath("//button[normalize-space()='Withdrawl']");
    public void clickOnDeposit(){
       clickOnElement(deposit);
    }
    public void enterAmount(String amount){
        sendTextToElement(amountLink,amount);
    }
    public void clickOnSubmitButton(){
        clickOnElement(depositAndWithdrawButton);
    }
    public String getMessage(){
        return getTextFromElement(successMessage);
    }
    public void clickOnWithdraw(){
        clickOnElement(withdraw);
    }
}
