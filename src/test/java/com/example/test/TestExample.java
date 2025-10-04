package com.example.test;

import com.example.ClientFactory;
import com.example.Marshaler;
import com.example.bank.*;
import jakarta.xml.bind.JAXBException;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class TestExample {

    @Test
    public void exampleTest() throws JAXBException {
        TransferRequest request = new TransferRequest();
        request.setAmount(new BigDecimal(10));
        request.setCurrency(Currency.USD);
        request.setDescription("Example Description");
        request.setFromAccount("100-1");
        request.setToAccount("100-2");

//        port.transfer(request);

        System.out.println(Marshaler.marshalTransferRequest(request));
    }

    @Test
    public void fluentExampleTest() throws JAXBException {
        TransferRequest request = new TransferRequest()
                .withAmount(new BigDecimal(10))
                .withCurrency(Currency.USD)
                .withDescription("Example Description")
                .withFromAccount("100-1")
                .withToAccount("100-2");

        //port.transfer(request);

        System.out.println(Marshaler.marshalTransferRequest(request));
    }
}
