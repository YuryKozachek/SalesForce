package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CreateAccountPage extends BasePage {

    private final By TITLE_NEW_ACCOUNT = By.xpath("//h2[text()='New Account']");
    private final By BUTTON_SAVE = By.xpath("//button[@name='SaveEdit']");

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("https://tms9-dev-ed.develop.lightning.force.com/lightning/o/Account/new");
    }

    public void getWaitTitleNewAccount() {
        getWait();
        wait.until(ExpectedConditions.visibilityOfElementLocated(TITLE_NEW_ACCOUNT));
    }

    public void writeText(String label, String text) {
        driver.findElement(By.xpath(String.format("//label[text()='%s']/..//input", label))).sendKeys(text);
    }

    public void selectValue(String label, String option) {
        driver.findElement(By.xpath(String.format("//label[text()='%s']//ancestor::lightning-combobox//button", label))).click();
        driver.findElement(By.xpath(String.format("//label[text()='%s']//ancestor::lightning-combobox//lightning-base-combobox-item//span[text()='%s']", label, option))).click();
    }

    public void clickValue(String label) {
        driver.findElement(By.xpath(String.format("//span[@part='label' and text()='%s']", label))).click();
    }

    public void writeTextArea(String label, String text) {
        driver.findElement(By.xpath(String.format("//label[text()='%s']/..//textarea", label))).sendKeys(text);
    }

    public void clickButtonSave() {
        driver.findElement(BUTTON_SAVE).click();
    }
}
