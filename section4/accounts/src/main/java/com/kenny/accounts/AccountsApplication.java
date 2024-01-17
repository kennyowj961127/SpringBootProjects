package com.kenny.accounts;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*
    @ComponentScan({@ComponentScan("com.kenny.accounts.controller"),
                    @ComponentScan("com.kenny.accounts.service"),
                    @ComponentScan("com.kenny.accounts.repository"),
                    @ComponentScan("com.kenny.accounts.audit"))})
    @EntityScan("com.kenny.accounts.entity")
    @EnableJpaRepositories("com.kenny.accounts.repository")
 */
@EnableJpaAuditing(auditorAwareRef="auditorAwareImpl") // Enable JPA Auditing with AuditorAware bean name
@OpenAPIDefinition(
        info = @Info(
                title = "Accounts Microservice REST API Documentation",
                version = "v1",
                description = "Documentation Accounts API v1.0",
                contact = @Contact(
                        name = "Kenny Ong",
                        email = "kenny961127@hotmail.co.uk",
                        url = "https://github.com/kennyowj961127"),
                license = @License(
                        name = "Apache 2.0",
                        url = "http://www.apache.org/licenses/LICENSE-2.0.html")
        )
)
public class AccountsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountsApplication.class, args);
    }

}
