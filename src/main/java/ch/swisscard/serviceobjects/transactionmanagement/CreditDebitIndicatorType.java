
package ch.swisscard.serviceobjects.transactionmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditDebitIndicatorType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreditDebitIndicatorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="c"/>
 *     &lt;enumeration value="d"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "CreditDebitIndicatorType")
@XmlEnum
public enum CreditDebitIndicatorType {


    /**
     * Credit
     *
     */
    @XmlEnumValue("c")
    C("c"),

    /**
     * Debit
     *
     */
    @XmlEnumValue("d")
    D("d");
    private final String value;

    CreditDebitIndicatorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CreditDebitIndicatorType fromValue(String v) {
        for (CreditDebitIndicatorType c: CreditDebitIndicatorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
