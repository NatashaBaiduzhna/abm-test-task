package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import constants.User;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public static final String LOGIN_PAGE_URL = "http://feature.12688.builder.abmcloud.us/login";
    public static final String INVALID_CREDS_TEXT = "Email or password is incorrect";

    private SelenideElement userEmailInput = $("[name='user[email]']");
    private SelenideElement passwordInput = $("[name='user[password]']");
    private SelenideElement loginButton = $("[name='commit']");
    private SelenideElement invalidCredsWarning = $(".text-danger");

    public void openLoginPage() {
        Selenide.closeWebDriver();
        Selenide.open(LOGIN_PAGE_URL);
    }

    public void login(User user) {
        userEmailInput.setValue(user.getEmail());
        passwordInput.setValue(user.getPassword());
        loginButton.click();
    }

    public void assertUnsuccessfulLogin() {
        invalidCredsWarning.shouldHave(Condition.text(INVALID_CREDS_TEXT));
    }
}