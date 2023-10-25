package tests;

import constants.User;
import org.testng.annotations.Test;

public class CompanyTest extends BaseTest {

    public static final String EXCHANGE_HOST = "builder.abmcloud.us";
    public static final String EXCHANGE_PORT = "21";
    public static final String EXCHANGE_LOGIN = "test";
    public static final String EXCHANGE_PASSWORD = "test";
    public static final String EXCHANGE_THRESHOLD = "0";

    @Test
    public void checkCompanyExchangeSettings() {
        loginPage.login(User.ABM_TEST_USER);
        adminPage.clickAddNewCompanyButton();
        createNewCompanyPage.setCompanyName("Test company name");
        createNewCompanyPage.setCompanySystemName("Test system name");
        createNewCompanyPage.clickNewCompanyButton();
        companySettingsPage.clickAvailableTabsButton();
        companySettingsPage.clickExchangeTabButton();
        companySettingsPage.setNecessaryExchangeFields(EXCHANGE_HOST, EXCHANGE_PORT, EXCHANGE_LOGIN, EXCHANGE_PASSWORD);
        companySettingsPage.setExchangeThreshold(EXCHANGE_THRESHOLD);
        companySettingsPage.clickCreateExchangeButton();
        companySettingsPage.assertSuccessfulExchangeCreation();
        companySettingsPage.assertNecessaryExchangeFieldsUpdated(EXCHANGE_HOST, EXCHANGE_PORT, EXCHANGE_LOGIN, EXCHANGE_PASSWORD);
        companySettingsPage.assertExchangeThresholdUpdated(EXCHANGE_THRESHOLD);
        companySettingsPage.clickAvailableTabsButton();
        companySettingsPage.clickGeneralTabButton();
        companySettingsPage.clickDeleteCompanyButton();
        companySettingsPage.clickConfirmDeleteCompanyButton();
        adminPage.assertCompanyDestroyed();
        adminPage.assertCompaniesAreAbsent();
    }
}