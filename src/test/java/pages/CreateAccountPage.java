package pages;

import dto.AccountFields;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import wrappers.ClickValue;
import wrappers.SelectValue;
import wrappers.WriteText;
import wrappers.WriteTextArea;

public class CreateAccountPage extends BasePage {

    private final By TITLE_NEW_ACCOUNT = By.xpath("//h2[text()='New Account']");
    private final By BUTTON_SAVE = By.xpath("//button[@name='SaveEdit']");

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    public CreateAccountPage open() {
        driver.get("https://tms9-dev-ed.develop.lightning.force.com/lightning/o/Account/new");
        return this;
    }

    public CreateAccountPage getWaitTitleNewAccount() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(TITLE_NEW_ACCOUNT));
        return this;
    }

    public CreateAccountPage createAccount(AccountFields accountFields) {
        new WriteText(driver, "Account Name").writeText(accountFields.getName());
        new WriteText(driver, "Account Number").writeText(accountFields.getNumber());
        new WriteText(driver, "Account Site").writeText(accountFields.getSite());
        new SelectValue(driver, "Type").selectValue(accountFields.getType());
        new SelectValue(driver, "Industry").selectValue(accountFields.getIndustry());
        new WriteText(driver, "Annual Revenue").writeText(accountFields.getRevenue());
        new SelectValue(driver, "Rating").selectValue(accountFields.getRating());
        new WriteText(driver, "Phone").writeText(accountFields.getPhone());
        new WriteText(driver, "Fax").writeText(accountFields.getFax());
        new WriteText(driver, "Website").writeText(accountFields.getWebsite());
        new WriteText(driver, "Ticker Symbol").writeText(accountFields.getSymbol());
        new SelectValue(driver, "Ownership").selectValue(accountFields.getOwnership());
        new WriteText(driver, "Employees").writeText(accountFields.getEmployees());
        new WriteText(driver, "SIC Code").writeText(accountFields.getCode());
        new ClickValue(driver, "VIP Client").clickValue();
        new ClickValue(driver, "TeachMeSkills").clickValue();
        new WriteTextArea(driver, "Billing Street").writeTextArea(accountFields.getBillingStreet());
        new WriteTextArea(driver, "Shipping Street").writeTextArea(accountFields.getShippingStreet());
        return this;
    }

    public NewAccountPage clickButtonSave() {
        driver.findElement(BUTTON_SAVE).click();
        return new NewAccountPage(driver);
    }
}