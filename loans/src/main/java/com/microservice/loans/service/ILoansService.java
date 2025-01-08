package com.microservice.loans.service;

import com.microservice.loans.dto.LoansDto;
import com.microservice.loans.exception.ResourceNotFoundException;

public interface ILoansService {

    /**
     * Creates a loan for the customer associated with the given mobile number.
     *
     * @param mobileNumber - Mobile Number of the Customer
     */
    void createLoan(String mobileNumber);

    /**
     * Fetches loan details for the customer associated with the given mobile number.
     * <p>
     * This method retrieves the loan information linked to the provided mobile number.
     * If no loan is found, a {@link ResourceNotFoundException} is thrown.
     *
     * @param mobileNumber - Mobile number of the customer whose loan details are to be fetched.
     * @return A {@link LoansDto} containing the loan details for the specified mobile number.
     */
    LoansDto fetchLoan(String mobileNumber);

    /**
     * Updates loan details for the provided LoansDto object.
     *
     * @param loansDto - LoansDto Object
     * @return boolean indicating if the update of loan details was successful or not
     */
    boolean updateLoan(LoansDto loansDto);

    /**
     * Deletes loan details for the customer associated with the given mobile number.
     *
     * @param mobileNumber - Input mobile number
     * @return boolean indicating if the deletion of loan details was successful or not
     */
    boolean deleteLoan(String mobileNumber);
}
