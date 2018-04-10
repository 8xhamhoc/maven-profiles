
package ch.swisscard.serviceobjects.transactionmanagement;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MerchantOfTransactionType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="MerchantOfTransactionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcquiringID" type="{http://swisscard.ch/ServiceObjects/Global}TString20"/>
 *         &lt;element name="MerchantID" type="{http://swisscard.ch/ServiceObjects/Global}TString20"/>
 *         &lt;element name="MerchantCategoryCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MerchantCity" type="{http://swisscard.ch/ServiceObjects/Global}TString50" minOccurs="0"/>
 *         &lt;element name="MerchantName" type="{http://swisscard.ch/ServiceObjects/Global}TString100" minOccurs="0"/>
 *         &lt;element name="MerchantZIP" type="{http://swisscard.ch/ServiceObjects/Global}TString20" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://swisscard.ch/ServiceObjects/Global}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="MerchantCategoryCodeTypeCode" type="{http://swisscard.ch/ServiceObjects/Global}TString20"/>
 *         &lt;element name="anythingMerchantOfTransactionType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MerchantOfTransactionType", propOrder = {
        "acquiringID",
        "merchantID",
        "merchantCategoryCode",
        "merchantCity",
        "merchantName",
        "merchantZIP",
        "country",
        "merchantCategoryCodeTypeCode",
        "anythingMerchantOfTransactionType"
})
public class MerchantOfTransactionType
        implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AcquiringID", required = true)
    protected String acquiringID;
    @XmlElement(name = "MerchantID", required = true)
    protected String merchantID;
    @XmlElement(name = "MerchantCategoryCode")
    protected int merchantCategoryCode;
    @XmlElement(name = "MerchantCity")
    protected String merchantCity;
    @XmlElement(name = "MerchantName")
    protected String merchantName;
    @XmlElement(name = "MerchantZIP")
    protected String merchantZIP;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "MerchantCategoryCodeTypeCode", required = true)
    protected String merchantCategoryCodeTypeCode;
    protected Object anythingMerchantOfTransactionType;

    /**
     * Gets the value of the acquiringID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAcquiringID() {
        return acquiringID;
    }

    /**
     * Sets the value of the acquiringID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAcquiringID(String value) {
        this.acquiringID = value;
    }

    /**
     * Gets the value of the merchantID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMerchantID() {
        return merchantID;
    }

    /**
     * Sets the value of the merchantID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMerchantID(String value) {
        this.merchantID = value;
    }

    /**
     * Gets the value of the merchantCategoryCode property.
     *
     */
    public int getMerchantCategoryCode() {
        return merchantCategoryCode;
    }

    /**
     * Sets the value of the merchantCategoryCode property.
     *
     */
    public void setMerchantCategoryCode(int value) {
        this.merchantCategoryCode = value;
    }

    /**
     * Gets the value of the merchantCity property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMerchantCity() {
        return merchantCity;
    }

    /**
     * Sets the value of the merchantCity property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMerchantCity(String value) {
        this.merchantCity = value;
    }

    /**
     * Gets the value of the merchantName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMerchantName() {
        return merchantName;
    }

    /**
     * Sets the value of the merchantName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMerchantName(String value) {
        this.merchantName = value;
    }

    /**
     * Gets the value of the merchantZIP property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMerchantZIP() {
        return merchantZIP;
    }

    /**
     * Sets the value of the merchantZIP property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMerchantZIP(String value) {
        this.merchantZIP = value;
    }

    /**
     * Gets the value of the country property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the merchantCategoryCodeTypeCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMerchantCategoryCodeTypeCode() {
        return merchantCategoryCodeTypeCode;
    }

    /**
     * Sets the value of the merchantCategoryCodeTypeCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMerchantCategoryCodeTypeCode(String value) {
        this.merchantCategoryCodeTypeCode = value;
    }

    /**
     * Gets the value of the anythingMerchantOfTransactionType property.
     *
     * @return
     *     possible object is
     *     {@link Object }
     *
     */
    public Object getAnythingMerchantOfTransactionType() {
        return anythingMerchantOfTransactionType;
    }

    /**
     * Sets the value of the anythingMerchantOfTransactionType property.
     *
     * @param value
     *     allowed object is
     *     {@link Object }
     *
     */
    public void setAnythingMerchantOfTransactionType(Object value) {
        this.anythingMerchantOfTransactionType = value;
    }

}
