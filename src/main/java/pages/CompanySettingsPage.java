package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CompanySettingsPage {

    public static final String EXCHANGE_UPDATED_TEXT = "Exchange settings successfully updated";

    private SelenideElement availableTabsButton = $x("//button[text()='Available tabs']");
    private SelenideElement exchangeTabButton = $x("//a[text()='Exchange']");
    private SelenideElement exchangeHostInput = $("[name='exchange_storage[host]']");
    private SelenideElement exchangePortInput = $("[name='exchange_storage[port]']");
    private SelenideElement exchangeLoginInput = $("[name='exchange_storage[login]']");
    private SelenideElement exchangePasswordInput = $("[name='exchange_storage[password]']");
    private SelenideElement exchangeThresholdInput = $("[name='exchange_storage[threshold]']");
    private SelenideElement createExchangeButton = $("#exchange_settings_save_btn");
    private SelenideElement exchangeUpdatedAlert = $("#alert_dialog");
    private SelenideElement generalTabButton = $x("//a[text()='General']");
    private SelenideElement deleteCompanyButton = $("#company_settings_delete_btn");
    private SelenideElement confirmDeleteCompanyButton = $("#submit-mass-delete");

    public void clickAvailableTabsButton() {
        availableTabsButton.click();
    }

    public void clickExchangeTabButton() {
        exchangeTabButton.click();
    }

    public void setNecessaryExchangeFields(String host, String port, String login, String password) {
        exchangeHostInput.setValue(host);
        exchangePortInput.setValue(port);
        exchangeLoginInput.setValue(login);
        exchangePasswordInput.setValue(password);
    }

    public void setExchangeThreshold(String threshold) {
        exchangeThresholdInput.setValue(threshold);
    }

    public void clickCreateExchangeButton() {
        createExchangeButton.click();
    }

    public void assertSuccessfulExchangeCreation() {
        exchangeUpdatedAlert.shouldHave(Condition.text(EXCHANGE_UPDATED_TEXT));
    }

    public void assertNecessaryExchangeFieldsUpdated(String host, String port, String login, String password) {
        exchangeHostInput.shouldHave(Condition.value(host));
        exchangePortInput.shouldHave(Condition.value(port));
        exchangeLoginInput.shouldHave(Condition.value(login));
        exchangePasswordInput.shouldHave(Condition.value(password));
    }

    public void assertExchangeThresholdUpdated(String threshold) {
        exchangeThresholdInput.shouldHave(Condition.value(threshold));
    }

    public void clickGeneralTabButton() {
        generalTabButton.click();
    }

    public void clickDeleteCompanyButton() {
        deleteCompanyButton.click();
    }

    public void clickConfirmDeleteCompanyButton() {
        confirmDeleteCompanyButton.click();
    }
}