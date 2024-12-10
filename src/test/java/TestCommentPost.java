import org.testng.annotations.Test;

public class TestCommentPost extends TestObject {
    @Test
    public void testPostComment() throws InterruptedException {
        homePageScreen.ClickLoginButton();
        loginScreen.EnterUserName("Azahariev");
        loginScreen.EnterPassword("Andrej1");
        loginScreen.ClickSignInButton();
        profileScreen.ClickOnProfileButton();
        profileScreen.ClickOnAllPostButton();
        profileScreen.ClickOnFirstPost();
        profileScreen.EnterComment("First comment");
    }
}
