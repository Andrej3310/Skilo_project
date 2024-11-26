package com.example.skilo_final_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScreen extends BaseClass{
    ChromeDriver chromeDriver;
    public LoginScreen(ChromeDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }
    String registerButtonXpath = "/html/body/app-root/div[2]/app-login/div/div/form/p[2]/a";
    String userNameFieldId = "defaultLoginFormUsername";
    String passwordFieldId = "defaultLoginFormPassword";
    String signInFieldId = "sign-in-button";


    WebElement getRegisterButtonElement(){
        return chromeDriver.findElement(By.linkText("Register"));
    }
    WebElement getUserNameFieldElement(){
        return chromeDriver.findElement(By.id(userNameFieldId));
    }
    WebElement getPasswordFieldElement(){
        return chromeDriver.findElement(By.id(passwordFieldId));
    }
    WebElement getSignInButtonElement(){
        return chromeDriver.findElement(By.id(signInFieldId));
    }



    public void ClickRegisterButton(){
        getRegisterButtonElement().click();
    }
    public void EnterUserName(String username){
        getUserNameFieldElement().sendKeys(username);
    }
    public void EnterPassword(String password){
        getPasswordFieldElement().sendKeys(password);
    }
    public void ClickSignInButton(){
        getSignInButtonElement().click();
    }
    public void ClickOnTheUserNameField(){
        getUserNameFieldElement().click();
    }
}
