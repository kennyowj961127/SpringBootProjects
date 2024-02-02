package com.kenny.loans.service;

import com.kenny.loans.dto.LoansDto;

public interface ILoansService {
    /**
     * Create a new loan
     * @param mobileNumber
     */
    void createLoan(String mobileNumber);
    /**
     * Fetch a loan
     * @param mobileNumber
     * @return
     */
    LoansDto fetchLoan(String mobileNumber);
    /**
     * Update a loan
     * @param loansDto
     * @return
     */
    boolean updateLoan(LoansDto loansDto);
    /**
     * Delete a loan
     * @param mobileNumber
     * @return
     */
    boolean deleteLoan(String mobileNumber);
}
