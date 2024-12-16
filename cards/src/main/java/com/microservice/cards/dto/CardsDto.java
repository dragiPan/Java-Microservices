package com.microservice.cards.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

@Schema(name = "Cards",
        description = "Schema to hold Card information"
)
public class CardsDto {

    @Pattern(regexp = "\\d{10}", message = "Mobile number must be exactly 10 digits")
    @Schema(description = "Mobile Number of Customer", example = "4354437687")
    private String mobileNumber;

    @Pattern(regexp = "\\d{12}", message = "Card number must be exactly 12 digits")
    @Schema(description = "Card Number of the customer", example = "100646930341")
    private String cardNumber;

    @Schema(description = "Type of the card", example = "Credit Card")
    private String cardType;

    @Positive(message = "Total card limit should be greater than zero")
    @Schema(description = "Total amount limit available against a card", example = "100000")
    private int totalLimit;

    @PositiveOrZero(message = "Total amount used should be equal to or greater than zero")
    @Schema(description = "Total amount used by a Customer", example = "1000")
    private int amountUsed;

    @PositiveOrZero(message = "Total available amount should be equal to or greater than zero")
    @Schema(description = "Total available amount against a card", example = "90000")
    private int availableAmount;

    // Default Constructor
    public CardsDto() {
    }

    // Parameterized Constructor
    public CardsDto(String mobileNumber, String cardNumber, String cardType, int totalLimit, int amountUsed, int availableAmount) {
        this.mobileNumber = mobileNumber;
        this.cardNumber = cardNumber;
        this.cardType = cardType;
        this.totalLimit = totalLimit;
        this.amountUsed = amountUsed;
        this.availableAmount = availableAmount;
    }

    // Getters and Setters
    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public int getTotalLimit() {
        return totalLimit;
    }

    public void setTotalLimit(int totalLimit) {
        this.totalLimit = totalLimit;
    }

    public int getAmountUsed() {
        return amountUsed;
    }

    public void setAmountUsed(int amountUsed) {
        this.amountUsed = amountUsed;
    }

    public int getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(int availableAmount) {
        this.availableAmount = availableAmount;
    }

    // toString Method
    @Override
    public String toString() {
        return "CardsDto{" +
                "mobileNumber='" + mobileNumber + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", cardType='" + cardType + '\'' +
                ", totalLimit=" + totalLimit +
                ", amountUsed=" + amountUsed +
                ", availableAmount=" + availableAmount +
                '}';
    }
}
