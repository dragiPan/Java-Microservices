package com.microservice.accounts.service;

import com.microservice.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     * Create a new account based on the given customer information.
     *
     * @param customerDto The customer information.
     */
    void createAccount(CustomerDto customerDto);

    /**
     * Fetches the account details for the customer with the specified mobile number.
     * <p>
     * This method retrieves the customer and account information associated with the given mobile number.
     * If no customer is found, a {@link ResourceNotFoundException} is thrown.
     *
     * @param mobileNumber The mobile number of the customer whose account details are to be fetched.
     * @return A {@link CustomerDto} containing the customer and account details.
     */
    CustomerDto fetchAccount(String mobileNumber);

    /**
     * Updates the account details associated with the customer specified in the given customer DTO.
     * <p>
     * This method updates the customer and account information associated with the given mobile number.
     * If no customer is found, a {@link ResourceNotFoundException} is thrown.
     * <p>
     * The method returns a boolean indicating whether the update was successful. The update is considered
     * successful if the customer and account information were found and updated successfully.
     *
     * @param customerDto The customer DTO containing the updated information.
     * @return A boolean indicating whether the update was successful.
     */
    boolean updateAccount(CustomerDto customerDto);

    /**
     * Deletes the account associated with the given mobile number.
     * <p>
     * This method deletes the account and customer information associated with the given mobile number.
     * If no customer is found, a {@link ResourceNotFoundException} is thrown.
     * <p>
     * The method returns a boolean indicating whether the deletion was successful. The deletion is considered
     * successful if the customer and account information were found and deleted successfully.
     *
     * @param mobileNumber The mobile number of the customer whose account is to be deleted.
     * @return A boolean indicating whether the deletion was successful.
     */
    boolean deleteAccount(String mobileNumber);

}
