import com.example.skilo_final_project.BaseClass;
import com.example.skilo_final_project.LoginScreen;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest extends BaseClass {
    @Test
    public void testLoginButton() throws InterruptedException {
        homePageScreen.ClickLoginButton();
        loginScreen.EnterUserName("Azahariev");
        loginScreen.EnterPassword("Andrej1");
        loginScreen.ClickSignInButton();
        Thread.sleep(2000);
        loginScreen.CheckLogin(chromeDriver.getCurrentUrl());
    }
}
