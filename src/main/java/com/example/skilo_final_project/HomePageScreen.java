package com.example.skilo_final_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageScreen{
    ChromeDriver chromeDriver;
    public HomePageScreen(ChromeDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }
    String loginButtonId = "nav-link-login";
    String profileButtonId = "nav-link-profile";

    WebElement getLoginButtonElement(){
        return chromeDriver.findElement(By.id(loginButtonId));
    }
    WebElement getProfileButtonElement(){
        return chromeDriver.findElement(By.id(profileButtonId));
    }


    public void ClickOnProfileButton(){
        getProfileButtonElement().click();
    }
    public void ClickLoginButton(){
        getLoginButtonElement().click();
    }
}
