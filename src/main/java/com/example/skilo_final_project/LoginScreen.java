package com.example.skilo_final_project;

import com.github.dockerjava.api.command.WaitContainerCmd;
import net.bytebuddy.pool.TypePool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginScreen{
    ChromeDriver chromeDriver;

    public LoginScreen(ChromeDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }
    String registerButtonXpath = "/html/body/app-root/div[2]/app-login/div/div/form/p[2]/a";
    String userNameFieldId = "defaultLoginFormUsername";
    String passwordFieldId = "defaultLoginFormPassword";
    String signInFieldId = "sign-in-button";
    String logOutButtonClassName = "fa-lg";



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


    public void CheckLogin() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("/posts"));
        String actualUrl = chromeDriver.getCurrentUrl();
        String expectedUrl = "http://training.skillo-bg.com:4300/posts/all";
        Assert.assertEquals(actualUrl, expectedUrl, "User is not logged in");
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
