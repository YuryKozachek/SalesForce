package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class AccountFields {

    @Builder.Default
    String name = "Test";
    @Builder.Default
    String number = "";
    @Builder.Default
    String site = "";
    @Builder.Default
    String type = "Prospect";
    @Builder.Default
    String industry = "Banking";
    @Builder.Default
    String revenue = "";
    @Builder.Default
    String rating = "Cold";
    @Builder.Default
    String phone = "";
    @Builder.Default
    String fax = "";
    @Builder.Default
    String website = "";
    @Builder.Default
    String symbol = "";
    @Builder.Default
    String ownership = "Public";
    @Builder.Default
    String employees = "";
    @Builder.Default
    String code = "";
    @Builder.Default
    String billingStreet = "";
    @Builder.Default
    String shippingStreet = "";
}