import com.example.skilo_final_project.BaseClass;
import org.testng.annotations.Test;

public class CheckNumberOfFollowing extends BaseClass {
    @Test
    public void testFollowingCounter() throws InterruptedException {
        homePageScreen.ClickLoginButton();
        loginScreen.EnterUserName("Azahariev");
        loginScreen.EnterPassword("Andrej1");
        loginScreen.ClickSignInButton();
        Thread.sleep(2000);
        profileScreen.ClickOnProfileButton();
        profileScreen.ClickOnFollowing();
        Thread.sleep(2000);
        profileScreen.CheckFollowingCounters();
    }
}
