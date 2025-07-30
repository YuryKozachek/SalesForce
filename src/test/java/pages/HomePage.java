package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    private final By TITLE_HOME = By.xpath("//h1//span[text()='Home']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void getWaitTitleHome() {
        getWait();
        wait.until(ExpectedConditions.visibilityOfElementLocated(TITLE_HOME));
    }
}