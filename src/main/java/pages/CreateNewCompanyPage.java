package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CreateNewCompanyPage {

    private SelenideElement nameInput = $("[name='company[name]']");
    private SelenideElement systemNameInput = $("[name='company[system_name]']");
    private SelenideElement newCompanyButton = $("#create_company_btn");

    public void setCompanyName(String companyName) {
        nameInput.setValue(companyName);
    }

    public void setCompanySystemName(String systemCompanyName) {
        systemNameInput.setValue(systemCompanyName);
    }

    public void clickNewCompanyButton() {
        newCompanyButton.click();
    }
}