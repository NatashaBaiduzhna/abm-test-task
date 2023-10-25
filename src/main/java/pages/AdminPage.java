package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class AdminPage {

    public static final String SUCCESSFUL_LOGIN_TEXT = "Signed in successfully.";
    public static final String COMPANY_DESTROYED_TEXT = "Company destroyed";
    public static final String NODATA_TO_DISPLAY_TEXT = "No data to display";

    private SelenideElement alertDialog = $("#alert_dialog");
    private SelenideElement addCompanyButton = $("[title='Add']");
    private SelenideElement noDataToDisplayTitle = $(".none-table-title");

    public void assertSuccessfulLogin() {
        alertDialog.shouldHave(Condition.text(SUCCESSFUL_LOGIN_TEXT));
    }

    public void clickAddNewCompanyButton() {
        addCompanyButton.click();
    }

    public void assertCompanyDestroyed() {
        alertDialog.shouldHave(Condition.text(COMPANY_DESTROYED_TEXT));
    }

    public void assertCompaniesAreAbsent() {
        noDataToDisplayTitle.shouldHave(Condition.text(NODATA_TO_DISPLAY_TEXT));
    }
}
