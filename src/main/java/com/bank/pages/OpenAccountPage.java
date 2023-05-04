package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {
    By searchCustomer=By.xpath("//select[@id='userSelect']");
    By selectCurrency=By.xpath("//select[@id='currency']");
    By processButton=By.xpath("//button[@type='submit']");
    public void searchCustomer(String name){
        selectByVisibleTextFromDropDown(searchCustomer,name);
    }
    public void selectCurrency(String currency){
        selectByVisibleTextFromDropDown(selectCurrency,currency);
    }
    public void clickOnProcessButton(){
        clickOnElement(processButton);
    }
    public void acceptAnAlert(){
        acceptAlert();
    }
}
