package com.example.skilo_final_project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;

import static org.apache.commons.io.FileUtils.cleanDirectory;

public class BaseClass {
    public static final String SCREENSHOTS_DIR = "src\\main\\resources\\screenshots\\";
    protected ChromeDriver chromeDriver;
    protected LoginScreen loginScreen;
    protected HomePageScreen homePageScreen;
    protected ProfileScreen profileScreen;

    @BeforeSuite
    public void setupTestSuite() throws IOException {
        cleanDirectory(new File(SCREENSHOTS_DIR));
    }
    @BeforeMethod
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver", "C:/Users/andre/Automation/chromedriver-win64/chromedriver.exe");
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        chromeDriver.get("http://training.skillo-bg.com:4300/posts/all");


        loginScreen = new LoginScreen(chromeDriver);
        homePageScreen = new HomePageScreen(chromeDriver);
        profileScreen = new ProfileScreen(chromeDriver);
    }

    @AfterMethod
    public void takeScreenShots(ITestResult testResult) throws IOException {
        takeScreenShot(testResult);
    }

    private void takeScreenShot(ITestResult testResult) {
        if (ITestResult.FAILURE == testResult.getStatus()){
            try {
                TakesScreenshot takesScreenshot = (TakesScreenshot) chromeDriver;
                File screenshot = takesScreenshot.getScreenshotAs(OutputType.FILE);
                String testName = testResult.getName();
                FileUtils.copyFile(screenshot, new File(SCREENSHOTS_DIR.concat(testName).concat(".jpg")));
            }
            catch (Exception e) {
                System.out.println("The screenshot could not be taken");
            }
        }
    }
}
