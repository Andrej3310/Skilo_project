import com.example.skilo_final_project.BaseClass;
import org.testng.annotations.Test;

public class CheckProfileModifyList extends BaseClass {
    @Test
    public void testFieldNames() throws InterruptedException {
        homePageScreen.ClickLoginButton();
        loginScreen.EnterUserName("Azahariev");
        loginScreen.EnterPassword("Andrej1");
        loginScreen.ClickSignInButton();
        Thread.sleep(2000);
        profileScreen.ClickOnProfileButton();
        profileScreen.ClickOnEditProfileButton();
        profileScreen.CheckFieldsNames(3,"Password");
    }
}
