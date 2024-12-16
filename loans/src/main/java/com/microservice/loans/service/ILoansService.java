package com.microservice.loans.service;

import com.microservice.loans.dto.LoansDto;

public interface ILoansService {

    /**
     * Creates a loan for the customer associated with the given mobile number.
     *
     * @param mobileNumber - Mobile Number of the Customer
     */
    void createLoan(String mobileNumber);

    /**
     * Fetches loan details for the customer associated with the given mobile number.
     *
     * @param mobileNumber - Input mobile number
     * @return Loan details based on the given mobile number
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
