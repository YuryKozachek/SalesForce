package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClickValue {

    WebDriver driver;
    protected String label;

    public ClickValue(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void clickValue() {
        driver.findElement(By.xpath(String.format("//span[@part='label' and text()='%s']", label))).click();
    }
}