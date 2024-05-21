package com.kenny.accounts.functions;

import com.kenny.accounts.service.IAccountsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;
import java.util.logging.Logger;

@Configuration
public class AccountsFunctions {

    private static final Logger log = Logger.getLogger(AccountsFunctions.class.getName());

    @Bean
    public Consumer<Long> updateCommunication(IAccountsService accountsService ){
        return accountNumber -> {
            log.info("Updating communication for account number: " + accountNumber.toString());
            accountsService.updateCommunicationStatus(accountNumber);
        };
    }
}
