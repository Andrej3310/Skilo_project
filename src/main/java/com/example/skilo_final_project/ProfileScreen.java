package com.example.skilo_final_project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class ProfileScreen extends BaseClass {
    ChromeDriver chromeDriver;

    public ProfileScreen(ChromeDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }


    String newPostXpath = "/html/body/app-root/div[2]/app-profile/div/div[2]/app-profile-posts-section/div/div[1]/div[3]/div/a";
    String profileUserNameXpath = "/html/body/app-root/div[2]/app-profile/div/div[1]/app-profile-section/div/div/div[2]/div/div[1]/h2";
    String profileButtonId = "nav-link-profile";
    String editProfileButtonClassName = "fa-user-edit";
    String profileFields = "col-4";
    String formHeader = "form-header";
    String allButtonClassName = "btn-all";
    String followingId = "following";
    String listFollowingClassName = "small-user-container";
    String allPostButtonClassName = "btn-all";
    String firstPostXpath = "/html/body/app-root/div[2]/app-profile/div/div[2]/app-profile-posts-section/div/div[2]/div/app-post-list/div/div/app-post[1]";
    String commentFieldXpath = "/html/body/ngb-modal-window/div/div/app-post-modal/div/div[2]/app-comment-form/form/fieldset/div/input";
    String unfollowButtonXpath = "/html/body/ngb-modal-window/div/div/app-followers-modal/div/div[2]/div/div[1]/div/app-small-user-profile/div/div[2]/button";
    String listCommentsClassName = "comment-container";


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
        return chromeDriver.findElement(By.className(editProfileButtonClassName));
    }

    List<WebElement> getProfileFieldElements() {
        return chromeDriver.findElements(By.className(profileFields));
    }
    List<WebElement> getFollowingElements() {
        return chromeDriver.findElements(By.className(listFollowingClassName));
    }

    WebElement getAllButtonElement() {
        return chromeDriver.findElement(By.className(allButtonClassName));
    }
    WebElement getFormHeaderElement() {
        return chromeDriver.findElement(By.className(formHeader));
    }

    WebElement getFollowingIdElement() {
        return chromeDriver.findElement(By.id(followingId));
    }
    WebElement getAllPostButtonElement() {
        return chromeDriver.findElement(By.className(allPostButtonClassName));
    }
    WebElement getFirstPostElement() {
        return chromeDriver.findElement(By.xpath(firstPostXpath));
    }
    WebElement getCommentFieldElement() {
        return chromeDriver.findElement(By.xpath(commentFieldXpath));
    }
    WebElement getUnfollowButtonElement() {
        return chromeDriver.findElement(By.xpath(unfollowButtonXpath));
    }
    List<WebElement> getCommentsElements(){
        return chromeDriver.findElements(By.className(listCommentsClassName));
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
        Assert.assertEquals(getProfileFieldElements().get(position-1).getText(), fieldName);
    }
    public void CheckFormName(String headerName){
        assert getFormHeaderElement().getText().equals(headerName);
    }

    public void CheckFollowingCounters(){
        String pom = getFollowingIdElement().getText().split(" ")[0];
        int br = Integer.parseInt(pom);
        Assert.assertEquals(getFollowingElements().size(), br);
    }
    public void ClickOnAllButton(){
        getAllButtonElement().click();
    }
    public void ClickOnFollowing(){
        getFollowingIdElement().click();
    }
    public void ClickOnAllPostButton(){
        getAllPostButtonElement().click();
    }
    public void ClickOnFirstPost(){
        getFirstPostElement().click();
    }
    public void EnterComment(String comment){
        getCommentFieldElement().sendKeys(comment);
        getCommentFieldElement().sendKeys(Keys.ENTER);
    }
    public void CheckUnfollowButton() throws InterruptedException {
        getFollowingIdElement().click();
        getUnfollowButtonElement().click();
        Thread.sleep(1000);
        String pom2 = getFollowingIdElement().getText().split(" ")[0];
        int br4 = Integer.parseInt(pom2);
        Assert.assertEquals(getFollowingElements().size(), br4);
    }
}
