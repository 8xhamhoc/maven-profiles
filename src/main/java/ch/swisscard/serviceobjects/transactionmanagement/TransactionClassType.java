
package ch.swisscard.serviceobjects.transactionmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionClassType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionClassType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="pymt"/>
 *     &lt;enumeration value="feee"/>
 *     &lt;enumeration value="otcc"/>
 *     &lt;enumeration value="ints"/>
 *     &lt;enumeration value="atmc"/>
 *     &lt;enumeration value="pchs"/>
 *     &lt;enumeration value="othr"/>
 *     &lt;enumeration value="annf"/>
 *     &lt;enumeration value="gamc"/>
 *     &lt;enumeration value="othf"/>
 *     &lt;enumeration value="insf"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "TransactionClassType")
@XmlEnum
public enum TransactionClassType {


    /**
     * Payment
     *
     */
    @XmlEnumValue("pymt")
    PYMT("pymt"),

    /**
     * Fee
     *
     */
    @XmlEnumValue("feee")
    FEEE("feee"),

    /**
     * OTC Cash
     *
     */
    @XmlEnumValue("otcc")
    OTCC("otcc"),

    /**
     * Interest
     *
     */
    @XmlEnumValue("ints")
    INTS("ints"),

    /**
     * ATM Cash
     *
     */
    @XmlEnumValue("atmc")
    ATMC("atmc"),

    /**
     * Purchase
     *
     */
    @XmlEnumValue("pchs")
    PCHS("pchs"),

    /**
     * Other
     *
     */
    @XmlEnumValue("othr")
    OTHR("othr"),

    /**
     * Annual Fee
     *
     */
    @XmlEnumValue("annf")
    ANNF("annf"),

    /**
     * Gambling Cash
     *
     */
    @XmlEnumValue("gamc")
    GAMC("gamc"),

    /**
     * Other Fee
     *
     */
    @XmlEnumValue("othf")
    OTHF("othf"),

    /**
     * Insurance Fee
     *
     */
    @XmlEnumValue("insf")
    INSF("insf");
    private final String value;

    TransactionClassType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionClassType fromValue(String v) {
        for (TransactionClassType c: TransactionClassType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
