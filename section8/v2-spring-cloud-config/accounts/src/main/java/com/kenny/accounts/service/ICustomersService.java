package com.kenny.accounts.service;

import com.kenny.accounts.dto.CustomerDetailsDto;

public interface ICustomersService {
    /**
     * Fetch customer details
     *
     * @param mobileNumber
     * @return CustomerDetailsDto
     */
    CustomerDetailsDto fetchCustomerDetails(String mobileNumber);
}
