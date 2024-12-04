import com.example.skilo_final_project.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCases extends BaseClass {

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
}
