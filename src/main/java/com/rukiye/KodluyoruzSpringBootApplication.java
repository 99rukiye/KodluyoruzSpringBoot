package com.rukiye;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class
})


public class KodluyoruzSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(KodluyoruzSpringBootApplication.class, args);
    }

}
