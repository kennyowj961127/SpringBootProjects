package com.kenny.cards.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Data
@Schema(name = "Cards", description = "Schema to hold cards information")
public class CardsDto {
    @NotEmpty(message = "Mobile number is mandatory")
    @Pattern(regexp = "^[0-9]{8}$", message = "Mobile number should be 8 digits")
    @Schema(description = "Mobile number of the card holder", example = "12345678")
    private String mobileNumber;

    @NotEmpty(message = "Card number is mandatory")
    @Pattern(regexp = "^[0-9]{12}$", message = "Card number should be 12 digits")
    @Schema(description = "Card number of the card holder", example = "123456789012")
    private String cardNumber;

    @NotEmpty(message = "Card type is mandatory")
    @Schema(description = "Card type of the card holder", example = "Credit Card")
    private String cardType;

    @Positive(message = "Total limit should be positive")
    @Schema(description = "Total limit of the card holder", example = "100000")
    private int totalLimit;

    @PositiveOrZero(message = "Amount used should be positive or zero")
    @Schema(description = "Amount used of the card holder", example = "0")
    private int amountUsed;

    @PositiveOrZero(message = "Available amount should be positive or zero")
    @Schema(description = "Available amount of the card holder", example = "100000")
    private int availableAmount;
}
