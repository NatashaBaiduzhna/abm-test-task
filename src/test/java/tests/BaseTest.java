package tests;

import org.testng.annotations.BeforeMethod;
import pages.AdminPage;
import pages.CompanySettingsPage;
import pages.CreateNewCompanyPage;
import pages.LoginPage;

public class BaseTest {

    LoginPage loginPage;
    AdminPage adminPage;
    CreateNewCompanyPage createNewCompanyPage;
    CompanySettingsPage companySettingsPage;

    @BeforeMethod
    public void setUp() {
        loginPage = new LoginPage();
        adminPage = new AdminPage();
        createNewCompanyPage = new CreateNewCompanyPage();
        companySettingsPage = new CompanySettingsPage();
        loginPage.openLoginPage();
    }
}
