package com.microservice.accounts.service;


import com.microservice.accounts.dto.CustomerDetailsDto;
import com.microservice.accounts.exception.ResourceNotFoundException;

public interface ICustomerService {

    /**
     * Fetches customer details based on the specified mobile number.
     * <p>
     * This method retrieves the customer's personal, account, card, and loan information
     * linked to the given mobile number. If no customer is found, a {@link ResourceNotFoundException}
     * is thrown.
     *
     * @param mobileNumber The mobile number of the customer whose details are to be fetched.
     * @return A {@link CustomerDetailsDto} containing the customer's details.
     */
    CustomerDetailsDto fetchCustomerDetails(String mobileNumber, String correlationId);
}
