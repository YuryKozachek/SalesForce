package tests;

import com.github.javafaker.Faker;
import dto.AccountFields;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import pages.CreateAccountPage;
import pages.HomePage;
import pages.LoginPage;
import pages.NewAccountPage;

import java.time.Duration;
import java.util.HashMap;

public class BaseTest {

    WebDriver driver;
    SoftAssert softAssert;
    ChromeOptions chromeOptions;
    LoginPage loginPage;
    HomePage homePage;
    CreateAccountPage createAccountPage;
    NewAccountPage newAccountPage;
    AccountFields accountFields;
    AccountFields accountFieldsBuilder;
    Faker faker;

    @BeforeMethod
    public void setSetting() {
        softAssert = new SoftAssert();
        chromeOptions = new ChromeOptions();
        HashMap<String, Object> chromePrefs = new HashMap<>();
        chromePrefs.put("credentials_enable_service", false);
        chromePrefs.put("profile.password_manager_enabled", false);
        chromeOptions.setExperimentalOption("prefs", chromePrefs);
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-popup-blocking");
        chromeOptions.addArguments("--disable-infobars");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        createAccountPage = new CreateAccountPage(driver);
        newAccountPage = new NewAccountPage(driver);
        faker = new Faker();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
        softAssert.assertAll();
    }
}