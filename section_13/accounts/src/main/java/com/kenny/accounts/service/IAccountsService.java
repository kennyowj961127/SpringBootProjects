package com.kenny.accounts.service;

import com.kenny.accounts.dto.CustomerDto;

public interface IAccountsService {
    /**
     * This method is used to create account
     * @param customerDto
     */
    void createAccount(CustomerDto customerDto);

    /**
     * This method is used to fetch account details
     * @param mobileNumber
     * @return
     */
    CustomerDto fetchAccountDetails(String mobileNumber);

    /**
     * This method is used to update account
     * @param customerDto
     * @return
     */
    boolean updateAccount(CustomerDto customerDto);

    /**
     * This method is used to delete account
     * @param customerDto
     * @return
     */
    boolean deleteAccount(String mobileNumber);

    boolean updateCommunicationStatus(Long accountNumber);
}
