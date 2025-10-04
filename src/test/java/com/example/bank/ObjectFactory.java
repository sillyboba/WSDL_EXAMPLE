
package com.example.bank;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.bank package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InsufficientFundsException_QNAME = new QName("http://bank.example.com/", "insufficientFundsException");
    private final static QName _AccountNotFoundException_QNAME = new QName("http://bank.example.com/", "accountNotFoundException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.bank
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsufficientFundsException }
     * 
     */
    public InsufficientFundsException createInsufficientFundsException() {
        return new InsufficientFundsException();
    }

    /**
     * Create an instance of {@link AccountNotFoundException }
     * 
     */
    public AccountNotFoundException createAccountNotFoundException() {
        return new AccountNotFoundException();
    }

    /**
     * Create an instance of {@link GetAccountRequest }
     * 
     */
    public GetAccountRequest createGetAccountRequest() {
        return new GetAccountRequest();
    }

    /**
     * Create an instance of {@link GetAccountResponse }
     * 
     */
    public GetAccountResponse createGetAccountResponse() {
        return new GetAccountResponse();
    }

    /**
     * Create an instance of {@link BankAccount }
     * 
     */
    public BankAccount createBankAccount() {
        return new BankAccount();
    }

    /**
     * Create an instance of {@link TransferRequest }
     * 
     */
    public TransferRequest createTransferRequest() {
        return new TransferRequest();
    }

    /**
     * Create an instance of {@link TransferResponse }
     * 
     */
    public TransferResponse createTransferResponse() {
        return new TransferResponse();
    }

    /**
     * Create an instance of {@link OperationResult }
     * 
     */
    public OperationResult createOperationResult() {
        return new OperationResult();
    }

    /**
     * Create an instance of {@link GetTransactionHistoryRequest }
     * 
     */
    public GetTransactionHistoryRequest createGetTransactionHistoryRequest() {
        return new GetTransactionHistoryRequest();
    }

    /**
     * Create an instance of {@link GetTransactionHistoryResponse }
     * 
     */
    public GetTransactionHistoryResponse createGetTransactionHistoryResponse() {
        return new GetTransactionHistoryResponse();
    }

    /**
     * Create an instance of {@link Transaction }
     * 
     */
    public Transaction createTransaction() {
        return new Transaction();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsufficientFundsException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsufficientFundsException }{@code >}
     */
    @XmlElementDecl(namespace = "http://bank.example.com/", name = "insufficientFundsException")
    public JAXBElement<InsufficientFundsException> createInsufficientFundsException(InsufficientFundsException value) {
        return new JAXBElement<InsufficientFundsException>(_InsufficientFundsException_QNAME, InsufficientFundsException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountNotFoundException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccountNotFoundException }{@code >}
     */
    @XmlElementDecl(namespace = "http://bank.example.com/", name = "accountNotFoundException")
    public JAXBElement<AccountNotFoundException> createAccountNotFoundException(AccountNotFoundException value) {
        return new JAXBElement<AccountNotFoundException>(_AccountNotFoundException_QNAME, AccountNotFoundException.class, null, value);
    }

}
