package com.example.skilo_final_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
    /*public void CheckNames(List<String> fields){
        //return getProfileFieldElement().getText();
        List<String> nova = new ArrayList<>();
        List<List<String>> splitList = new ArrayList<>();

        /*for (int i=0; i<fields.size(); i++){
            nova.add(getProfileFieldElements().get(i).getText());
            //System.out.println(getProfileFieldElements().get(i).getText());
        }
        for (String item : fields) {
            List<String> splititems = Arrays.asList(item.split(" "));
            splitList.add(splititems);
            System.out.println(splitList);
        }


        for (int i=0; i<fields.size(); i++){
            System.out.println(fields.get(i));
            //System.out.println(getProfileFieldElements().get(i).getText());
        }

        System.out.println(getProfileFieldElements().size());
        System.out.println(fields.size());
        System.out.println(nova.size());
        /*try{
            Assert.assertEquals(fields, getProfileFieldElements());
            System.out.println("The fields name are correct");
        }catch(Throwable e){
            System.err.println("The fields name are incorrect"+e.getMessage());
        }
    }*/
    /*public void NameCheck(String field){
        List<String> fields = new ArrayList<>();
        Collections.addAll(fields, field.split(","));
        try{
            Assert.assertEquals(fields, getProfileFieldElements());
            System.out.println("The fields name are correct");
        }catch(Throwable e){
            System.out.println("The fields name are incorrect");
        }
        for (int i=0; i<fields.size(); i++){
            System.out.println(fields.get(i));
            System.out.println(getProfileFieldElements().get(i).getText());
        }
    }*/

    public void CheckFormName(String headerName){
        assert getFormHeaderElement().getText().equals(headerName);
    }
}
