package com.kenny.message.functions;

import com.kenny.message.dto.AccountsMsgDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;
import java.util.logging.Logger;

@Configuration
public class MessageFunctions {
    private static final Logger log = Logger.getLogger(MessageFunctions.class.getName());

    @Bean
    public Function<AccountsMsgDto, AccountsMsgDto> email(){
        return accountsMsgDto -> {
            log.info("Sending email to " + accountsMsgDto.toString());
            return accountsMsgDto;
        };
        }

    @Bean
    public Function<AccountsMsgDto, Long> sms(){
        return accountsMsgDto -> {
            log.info("Sending sms to " + accountsMsgDto.toString());
            return accountsMsgDto.accountNumber();
        };
    }
}
