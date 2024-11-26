import com.example.skilo_final_project.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCases extends BaseClass {

    @Test
    public void testLoginButton() throws InterruptedException {
        Thread.sleep(1000);
        homePageScreen.ClickLoginButton();
        Thread.sleep(1000);
        loginScreen.EnterUserName("Azahariev");
        loginScreen.EnterPassword("Andrej111q");
        loginScreen.ClickSignInButton();
    }

    @Test
    public void tapOnTheNewPostButton() throws InterruptedException {
        homePageScreen.ClickLoginButton();
        Thread.sleep(1000);
        loginScreen.EnterUserName("Azahariev");
        loginScreen.EnterPassword("Andrej1");
        loginScreen.ClickSignInButton();
        //homePageScreen.ClickOnProfileButton();
        Thread.sleep(2000);
        //profileScreen.ClickOnNewPostBtn();
        Assert.assertEquals("adfsa", "asfada");
    }

    @Test
    public void testThree() throws InterruptedException {
        homePageScreen.ClickLoginButton();
        Thread.sleep(1000);
        loginScreen.EnterUserName("Azahariev");
        loginScreen.EnterPassword("Andrej1");
        loginScreen.ClickSignInButton();
        profileScreen.ClickOnProfileButton();
        assert profileScreen.CheckUserName().equals("Azahariev");
    }

    @Test
    public void test4() throws InterruptedException {
        homePageScreen.ClickLoginButton();
        Thread.sleep(1000);
        loginScreen.EnterUserName("Azahariev");
        loginScreen.EnterPassword("Andrej1");
        loginScreen.ClickSignInButton();
        profileScreen.ClickOnProfileButton();
        profileScreen.ClickOnEditProfileButton();
        List<String> searchKeywords = null;
        // profileScreen.NameCheck("Usermame,Email,Password,Confirm password,Public Info");
        //.a(searchKeywords,"Username", "Email", "Password", "Confirm password", "Public Info"));
        //assert profileScreen.CheckUserName().equals("Azahariev");
    }

    @Test
    public void test5() throws InterruptedException {
        homePageScreen.ClickLoginButton();
        Thread.sleep(1000);
        loginScreen.EnterUserName("Azahariev");
        loginScreen.EnterPassword("Andrej1");
        loginScreen.ClickSignInButton();
        profileScreen.ClickOnProfileButton();
        profileScreen.ClickOnEditProfileButton();
        profileScreen.CheckFormName("Modify Your P1rofile");

        profileScreen.CheckFormName("Modify Your P1rofile");
    }
}
