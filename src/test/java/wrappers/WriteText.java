package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WriteText {

    WebDriver driver;
    protected String label;

    public WriteText(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void writeText(String text) {
        driver.findElement(By.xpath(String.format("//label[text()='%s']/..//input", label))).sendKeys(text);
    }
}