package com.example.skilo_final_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ProfileScreen extends BaseClass {
    ChromeDriver chromeDriver;

    public ProfileScreen(ChromeDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }


    String newPostXpath = "/html/body/app-root/div[2]/app-profile/div/div[2]/app-profile-posts-section/div/div[1]/div[3]/div/a";
    String profileUserNameXpath = "/html/body/app-root/div[2]/app-profile/div/div[1]/app-profile-section/div/div/div[2]/div/div[1]/h2";
    String profileButtonId = "nav-link-profile";
    String editProfileButton = "fa-user-edit";
    String profileFields = "col-4";
    String formHeader = "form-header";

    WebElement getNewPostClassNameElement() {
        return chromeDriver.findElement(By.xpath(newPostXpath));
    }

    WebElement getProfileUserNameFieldElement() {
        return chromeDriver.findElement(By.xpath(profileUserNameXpath));
    }

    WebElement getProfileButtonElement() {
        return chromeDriver.findElement(By.id(profileButtonId));
    }

    WebElement getEditProfileButtonElement() {
        return chromeDriver.findElement(By.className(editProfileButton));
    }

    List<WebElement> getProfileFieldElements() {
        return chromeDriver.findElements(By.className(profileFields));
    }
    WebElement getFormHeaderElement() {
        return chromeDriver.findElement(By.className(formHeader));
    }

    public void ClickOnNewPostBtn() {
        getNewPostClassNameElement().click();
    }

    public String CheckUserName() {
        return getProfileUserNameFieldElement().getText();
    }

    public void ClickOnProfileButton() {
        getProfileButtonElement().click();
    }

    public void ClickOnEditProfileButton() {
        getEditProfileButtonElement().click();
    }

    public void CheckFieldsNames(int position, String fieldName){
        //System.out.println("The position " + position + " is "+ getProfileFieldElements().get(position-1).getText() + ", entered name is "+fieldName);
        assert getProfileFieldElements().get(position-1).getText().equals(fieldName);
    }
    public void CheckFormName(String headerName){
        assert getFormHeaderElement().getText().equals(headerName);
    }
}
