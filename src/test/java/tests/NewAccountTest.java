package tests;

import org.testng.annotations.Test;

public class NewAccountTest extends BaseTest {

    @Test
    public void checkCreateNewAccount() {
        loginPage.open();
        loginPage.login("tborodich@tms.sandbox", "Password003!");
        homePage.getWaitTitleHome();
        createAccountPage.open();
        createAccountPage.getWaitTitleNewAccount();
        createAccountPage.writeText("Account Name", "Hello-Company");
        createAccountPage.writeText("Account Number", "12345");
        createAccountPage.writeText("Account Site", "Hello-Company@mail.ru");
        createAccountPage.selectValue("Type", "Prospect");
        createAccountPage.selectValue("Industry", "Banking");
        createAccountPage.writeText("Annual Revenue", "123456");
        createAccountPage.selectValue("Rating", "Cold");
        createAccountPage.writeText("Phone", "+75632131131");
        createAccountPage.writeText("Fax", "+343434345443");
        createAccountPage.writeText("Website", "Company@mail.ru");
        createAccountPage.writeText("Ticker Symbol", "Hello");
        createAccountPage.selectValue("Ownership", "Public");
        createAccountPage.writeText("Employees", "452");
        createAccountPage.writeText("SIC Code", "452-3434");
        createAccountPage.clickValue("VIP Client");
        createAccountPage.clickValue("TeachMeSkills");
        createAccountPage.writeTextArea("Billing Street", "Street 45");
        createAccountPage.writeTextArea("Shipping Street", "Street 35");
        createAccountPage.clickButtonSave();
        newAccountPage.checkConfirmAccountCreate();
    }
}
