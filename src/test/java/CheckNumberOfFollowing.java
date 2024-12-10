import org.testng.annotations.Test;

public class CheckNumberOfFollowing extends TestObject {
    @Test
    public void testFollowingCounter() throws InterruptedException {
        homePageScreen.ClickLoginButton();
        loginScreen.EnterUserName("Azahariev");
        loginScreen.EnterPassword("Andrej1");
        loginScreen.ClickSignInButton();
        profileScreen.ClickOnProfileButton();
        profileScreen.ClickOnFollowing();
        profileScreen.CheckFollowingCounters();
    }
}
