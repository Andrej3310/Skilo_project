import org.testng.annotations.Test;


public class LoginTest extends TestObject {
    @Test
    public void testLoginButton() throws InterruptedException {
        homePageScreen.ClickLoginButton();
        loginScreen.EnterUserName("Azahariev");
        loginScreen.EnterPassword("Andrej1");
        loginScreen.ClickSignInButton();
        loginScreen.CheckLogin();
    }
}
