package com.kenny.accounts.service.impl;

import com.kenny.accounts.dto.AccountsDto;
import com.kenny.accounts.dto.CardsDto;
import com.kenny.accounts.dto.CustomerDetailsDto;
import com.kenny.accounts.dto.LoansDto;
import com.kenny.accounts.entity.Accounts;
import com.kenny.accounts.entity.Customer;
import com.kenny.accounts.exception.ResourceNotFoundException;
import com.kenny.accounts.mapper.AccountsMapper;
import com.kenny.accounts.mapper.CustomerMapper;
import com.kenny.accounts.repository.AccountsRepository;
import com.kenny.accounts.repository.CustomerRepository;
import com.kenny.accounts.service.ICustomersService;
import com.kenny.accounts.service.client.CardsFeignClient;
import com.kenny.accounts.service.client.LoansFeignClient;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomersServiceImpl implements ICustomersService {
    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;
    private CardsFeignClient cardsFeignClient;
    private LoansFeignClient loansFeignClient;

    @Override
    public CustomerDetailsDto fetchCustomerDetails(String mobileNumber) {
        Customer customer = customerRepository.findByMobileNumber(mobileNumber).orElseThrow(
                () -> new ResourceNotFoundException("Customer", "mobileNumber", mobileNumber)
        );

        Accounts accounts = accountsRepository.findByCustomerId(customer.getCustomerId()).orElseThrow(
                () -> new ResourceNotFoundException("Account", "customerId", customer.getCustomerId().toString())
        );

        CustomerDetailsDto customerDetailsDto = CustomerMapper.mapToCustomerDetailsDto(customer, new CustomerDetailsDto());
        customerDetailsDto.setAccountsDto(AccountsMapper.mapToAccountsDto(accounts, new AccountsDto()));

        ResponseEntity<LoansDto> loansDtoResponseEntity = loansFeignClient.fetchLoanDetails(mobileNumber);
        LoansDto loansDto = loansDtoResponseEntity.getBody();
        customerDetailsDto.setLoansDto(loansDto);

        ResponseEntity<CardsDto> cardsDtoResponseEntity = cardsFeignClient.fetchCardDetails(mobileNumber);
        CardsDto cardsDto = cardsDtoResponseEntity.getBody();
        customerDetailsDto.setCardsDto(cardsDto);

        return customerDetailsDto;
    }
}
