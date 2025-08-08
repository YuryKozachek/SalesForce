package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WriteTextArea {

    WebDriver driver;
    protected String label;

    public WriteTextArea(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void writeTextArea(String text) {
        driver.findElement(By.xpath(String.format("//label[text()='%s']/..//textarea", label))).sendKeys(text);
    }
}