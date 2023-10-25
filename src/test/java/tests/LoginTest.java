package tests;

import constants.User;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void checkSuccessfulLogin() {
        loginPage.login(User.VALID_USER);
        adminPage.assertSuccessfulLogin();
    }

    @Test
    public void checkUnsuccessfulLogin() {
        loginPage.login(User.INVALID_USER);
        loginPage.assertUnsuccessfulLogin();
    }
}