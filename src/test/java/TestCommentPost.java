import com.example.skilo_final_project.BaseClass;
import org.testng.annotations.Test;

public class TestCommentPost extends BaseClass {
    @Test
    public void testPostComment() throws InterruptedException {
        homePageScreen.ClickLoginButton();
        loginScreen.EnterUserName("Azahariev");
        loginScreen.EnterPassword("Andrej1");
        loginScreen.ClickSignInButton();
        Thread.sleep(2000);
        profileScreen.ClickOnProfileButton();
        profileScreen.ClickOnAllPostButton();
        profileScreen.ClickOnFirstPost();
        profileScreen.EnterComment("First comment");
    }
}
