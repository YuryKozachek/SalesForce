package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectValue {

    WebDriver driver;
    protected String label;

    public SelectValue(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void selectValue(String option) {
        driver.findElement(By.xpath(String.format("//label[text()='%s']//ancestor::lightning-combobox//button", label))).click();
        driver.findElement(By.xpath(String.format("//label[text()='%s']//ancestor::lightning-combobox//lightning-base-combobox-item//span[text()='%s']", label, option))).click();
    }
}