package com.kenny.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Schema(name = "Loans", description = "Schema to hold Loan information")
@Data
public class LoansDto {
    @NotEmpty(message = "Mobile number cannot be empty")
    @Pattern(regexp = "^[0-9]{8}$", message = "Mobile number must be 8 digits")
    @Schema(description = "Mobile number of the user", example = "12345678")
    private String mobileNumber;

    @NotEmpty(message = "Loan number cannot be empty")
    @Pattern(regexp = "^[0-9]{12}$", message = "Loan number must be 12 digits")
    @Schema(description = "Loan number of the customer", example = "123456789012")
    private String loanNumber;

    @NotEmpty(message = "Loan type cannot be empty")
    @Schema(description = "Loan type of the customer", example = "Home Loan")
    private String loanType;

    @Positive(message = "Total loan must be positive")
    @Schema(description = "Total loan of the customer", example = "1000000")
    private int totalLoan;

    @PositiveOrZero(message = "Amount paid must be positive or zero")
    @Schema(description = "Amount paid of the customer", example = "100000")
    private int amountPaid;

    @PositiveOrZero(message = "Outstanding amount must be positive or zero")
    @Schema(description = "Outstanding amount of the customer", example = "900000")
    private int outstandingAmount;
}
