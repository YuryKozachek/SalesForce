package dto;

import com.github.javafaker.Faker;

public class AccountFaker {

    public static AccountFields getAccountFaker(String type, String industry, String rating, String ownership) {
        Faker faker = new Faker();
        return new AccountFields(faker.company().name(), faker.number().digit(), faker.internet().domainName(),
                type, industry, faker.number().digit(), rating, faker.phoneNumber().phoneNumber(),
                faker.phoneNumber().phoneNumber(), faker.internet().domainName(), faker.name().name(), ownership,
                faker.number().digit(), faker.number().digit(), faker.address().streetAddress(),
                faker.address().streetAddress());
    }
}