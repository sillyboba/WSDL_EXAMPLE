
package com.example.bank;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for accountType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="accountType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SAVINGS"/&gt;
 *     &lt;enumeration value="CHECKING"/&gt;
 *     &lt;enumeration value="BUSINESS"/&gt;
 *     &lt;enumeration value="CREDIT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "accountType")
@XmlEnum
public enum AccountType {

    SAVINGS,
    CHECKING,
    BUSINESS,
    CREDIT;

    public String value() {
        return name();
    }

    public static AccountType fromValue(String v) {
        return valueOf(v);
    }

}
