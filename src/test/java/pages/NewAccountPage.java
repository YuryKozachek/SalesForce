package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertTrue;

public class NewAccountPage extends BasePage {

    private final By CONFIRM_ACCOUNT_CREATE = By.xpath("//div[@data-key='success']");

    public NewAccountPage(WebDriver driver) {
        super(driver);
    }

    public void checkConfirmAccountCreate() {
        assertTrue(driver.findElement(CONFIRM_ACCOUNT_CREATE).isDisplayed());
    }
}