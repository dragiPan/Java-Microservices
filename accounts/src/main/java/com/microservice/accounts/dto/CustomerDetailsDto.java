package com.microservice.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;


@Schema(
        name = "CustomerDetails",
        description = "Schema to hold Customer, Account, Cards, and Loan information"
)
public class CustomerDetailsDto {

    @Schema(
            description = "Name of the customer",
            example = "Dragi"
    )
    @NotEmpty(message = "Name cannot be null or empty")
    @Size(min = 5, max = 30, message = "Name should be between 5 and 30 characters")
    private String name;

    @Schema(
            description = "Email address of the customer",
            example = "dragi@example.com"
    )
    @NotEmpty(message = "Email address cannot be null or empty")
    @Email(message = "Email address is not in a valid format")
    private String email;

    @Schema(
            description = "Mobile number of the customer",
            example = "9872109455"
    )
    @Pattern(regexp = "\\d{10}", message = "Mobile number must be exactly 10 digits")
    private String mobileNumber;

    @Schema(description = "Account details of the customer")
    private AccountsDto accountsDto;

    @Schema(description = "Card details of the customer")
    private CardsDto cardsDto;

    @Schema(description = "Loan details of the customer")
    private LoansDto loansDto;

    // Default Constructor
    public CustomerDetailsDto() {
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public AccountsDto getAccountsDto() {
        return accountsDto;
    }

    public void setAccountsDto(AccountsDto accountsDto) {
        this.accountsDto = accountsDto;
    }

    public CardsDto getCardsDto() {
        return cardsDto;
    }

    public void setCardsDto(CardsDto cardsDto) {
        this.cardsDto = cardsDto;
    }

    public LoansDto getLoansDto() {
        return loansDto;
    }

    public void setLoansDto(LoansDto loansDto) {
        this.loansDto = loansDto;
    }

    @Override
    public String toString() {
        return "CustomerDetailsDto{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", accountsDto=" + accountsDto +
                ", cardsDto=" + cardsDto +
                ", loansDto=" + loansDto +
                '}';
    }
}
