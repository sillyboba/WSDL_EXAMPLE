package com.example;

import com.example.bank.TransferRequest;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.StringReader;
import java.io.StringWriter;

public class Marshaler {

    public static String marshalTransferRequest(TransferRequest request) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(TransferRequest.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        StringWriter writer = new StringWriter();
        marshaller.marshal(request, writer);
        return writer.toString();
    }

    public static TransferRequest unmarshalTransferRequest(String xml) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(TransferRequest.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return (TransferRequest) unmarshaller.unmarshal(new StringReader(xml));
    }
}
