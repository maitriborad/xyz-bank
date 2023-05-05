package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {
    By amountLink=By.xpath("//input[@placeholder='amount']");
    By successMessage=By.xpath("//span[@class='error ng-binding']");
    By depositAndWithdrawButton=By.xpath("//button[@type='submit']");

    public void enterAmount(String amount){
        sendTextToElement(amountLink,amount);
    }
    public String getMessage(){
        return getTextFromElement(successMessage);
    }
    public void clickOnSubmitButton(){
        clickOnElement(depositAndWithdrawButton);
    }
}
