package com.kenny.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(name = "CustomerDto",
        description = "Schema to hold Customer, Cards, Loans and Account information")
public class CustomerDetailsDto {

    @Schema(description = "Customer name", example = "Kenny")
    @NotEmpty(message = "Name should not be empty")
    @Size(min = 5, max = 30, message = "Name should be between 5 to 30 characters")
    private String name;

    @Schema(description = "Customer email address", example = "kenny961127@hotmail.co.uk")
    @NotEmpty(message = "Email should not be empty")
    @Email(message = "Email address should be a valid value")
    private String email;

    @Schema(description = "Customer mobile number", example = "12345678")
    @NotEmpty(message = "Mobile number should not be empty")
    @Pattern(regexp = "(^$|[0-9]{8})", message = "Mobile number should be a 8 digit number")
    private String mobileNumber;

    @Schema(description = "Customer address")
    private AccountsDto accountsDto;

    @Schema(description = "Customer cards")
    private CardsDto cardsDto;

    @Schema(description = "Customer loans")
    private LoansDto loansDto;
}
