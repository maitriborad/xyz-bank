package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {
    By firstName=By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]");
    By lastName=By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]");
    By postCode=By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/input[1]");
    By addCustomerButton=By.xpath("//button[@type='submit']");
    public void enterFirstName(String name){
        sendTextToElement(firstName,name);
    }
    public void enterLastName(String name){
        sendTextToElement(lastName,name);
    }
    public void enterPostcode(String postcode){
        sendTextToElement(postCode,postcode);
    }
    public void clickOnAddCustomerButton(){
        clickOnElement(addCustomerButton);
    }
    public void acceptAnAlert(){
        acceptAlert();
    }
}
