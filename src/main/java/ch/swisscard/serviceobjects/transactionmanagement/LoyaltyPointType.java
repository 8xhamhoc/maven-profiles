
package ch.swisscard.serviceobjects.transactionmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoyaltyPointType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LoyaltyPointType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="a"/>
 *     &lt;enumeration value="d"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "LoyaltyPointType")
@XmlEnum
public enum LoyaltyPointType {

    @XmlEnumValue("a")
    A("a"),
    @XmlEnumValue("d")
    D("d");
    private final String value;

    LoyaltyPointType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoyaltyPointType fromValue(String v) {
        for (LoyaltyPointType c: LoyaltyPointType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
