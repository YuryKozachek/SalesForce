package tests;

import dto.AccountFields;
import org.testng.annotations.Test;

import static dto.AccountFaker.getAccountFaker;

public class NewAccountTest extends BaseTest {

    @Test
    public void checkCreateNewAccount() {

        accountFields = getAccountFaker("Prospect", "Banking", "Cold", "Public");

        loginPage
                .open()
                .login("tborodich@tms.sandbox", "Password003!");
        homePage
                .getWaitTitleHome();
        createAccountPage
                .open()
                .getWaitTitleNewAccount()
                .createAccount(accountFields)
                .clickButtonSave()
                .checkConfirmAccountCreate();
    }

    @Test
    public void checkCreateNewAccountBuilder() {

        accountFieldsBuilder = AccountFields.builder()
                .name(faker.company().name())
                .phone(faker.phoneNumber().phoneNumber())
                .employees(faker.number().digit())
                .build();

        loginPage
                .open()
                .login("tborodich@tms.sandbox", "Password003!");
        homePage
                .getWaitTitleHome();
        createAccountPage
                .open()
                .getWaitTitleNewAccount()
                .createAccount(accountFieldsBuilder)
                .clickButtonSave()
                .checkConfirmAccountCreate();
    }
}