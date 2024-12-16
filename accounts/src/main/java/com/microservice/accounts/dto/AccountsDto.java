package com.microservice.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto {

    @Pattern(regexp = "\\d{10}", message = "Mobile number must be exactly 10 digits")
    @Schema(
            description = "Account Number", example = "4531234589"
    )
    private Long accountNumber;

    @NotEmpty(message = "Account type can not be null or empty")
    @Schema(
            description = "Account types", example = "Savings"
    )
    private String accountType;

    @NotEmpty(message = "Branch address can not be null or empty")
    @Schema(
            description = "Branch address", example = "123 NewYork"
    )
    private String branchAddress;

    public AccountsDto() {
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getBranchAddress() {
        return branchAddress;
    }

    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
    }

    @Override
    public String toString() {
        return "AccountsDto{" +
                "accountNumber=" + accountNumber +
                ", accountType='" + accountType + '\'' +
                ", branchAddress='" + branchAddress + '\'' +
                '}';
    }
}
