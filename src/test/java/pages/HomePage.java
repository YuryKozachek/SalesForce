package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Log4j2
public class HomePage extends BasePage {

    private final By TITLE_HOME = By.xpath("//h1//span[text()='Home']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage getWaitTitleHome() {
        log.info("Wait title home");
        wait.until(ExpectedConditions.visibilityOfElementLocated(TITLE_HOME));
        return this;
    }
}