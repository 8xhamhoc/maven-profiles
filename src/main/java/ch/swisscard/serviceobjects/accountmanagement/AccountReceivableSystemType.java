
package ch.swisscard.serviceobjects.accountmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountReceivableSystemType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountReceivableSystemType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ts2"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "AccountReceivableSystemType")
@XmlEnum
public enum AccountReceivableSystemType {

    @XmlEnumValue("ts2")
    TS_2("ts2");
    private final String value;

    AccountReceivableSystemType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountReceivableSystemType fromValue(String v) {
        for (AccountReceivableSystemType c: AccountReceivableSystemType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
