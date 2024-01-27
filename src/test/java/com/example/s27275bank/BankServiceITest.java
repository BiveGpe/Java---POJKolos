package com.example.s27275bank;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class BankServiceITest {
    @Autowired
    private BankService bankService;

    @Test
    public void createClientSuccess() {
        Client client = this.bankService.createClient(123.0);

        System.out.println(client.getId());
        assertThat(client.getBalance()).isEqualTo(123.0);
    }
}