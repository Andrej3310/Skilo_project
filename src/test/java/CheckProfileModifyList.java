import org.testng.annotations.Test;

public class CheckProfileModifyList extends TestObject {
    @Test
    public void testFieldNames() throws InterruptedException {
        homePageScreen.ClickLoginButton();
        loginScreen.EnterUserName("Azahariev");
        loginScreen.EnterPassword("Andrej1");
        loginScreen.ClickSignInButton();
        profileScreen.ClickOnProfileButton();
        profileScreen.ClickOnEditProfileButton();
        profileScreen.CheckFieldsNames(1,"Username");
    }
}
