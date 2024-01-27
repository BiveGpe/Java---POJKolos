package com.example.s27275bank;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;

public class BankServiceTest {
    @Mock
    private ClientStorage clientStorage;

    @InjectMocks
    private BankService bankService;

    @Test
    public void testGetClientSuccess() throws Exception {
        when(clientStorage.isClientExist(2))
                .thenReturn(true);

        when(clientStorage.getClient(2))
                .thenReturn(new Client(250.0));

        Client client = bankService.getClientData(2);

        assertThat(client.getId()).isEqualTo(2);
        assertThat(client.getBalance()).isEqualTo(250.0);
    }
}
