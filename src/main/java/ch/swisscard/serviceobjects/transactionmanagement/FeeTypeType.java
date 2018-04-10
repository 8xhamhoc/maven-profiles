
package ch.swisscard.serviceobjects.transactionmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeTypeType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeeTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="xbcf"/>
 *     &lt;enumeration value="forx"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "FeeTypeType")
@XmlEnum
public enum FeeTypeType {


    /**
     * Cross-Border CHF Fee
     *
     */
    @XmlEnumValue("xbcf")
    XBCF("xbcf"),

    /**
     * Forex Fee
     *
     */
    @XmlEnumValue("forx")
    FORX("forx");
    private final String value;

    FeeTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeeTypeType fromValue(String v) {
        for (FeeTypeType c: FeeTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
