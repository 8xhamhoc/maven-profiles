
package ch.swisscard.serviceobjects.transactionmanagement;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

public class TransactionTypeType
        implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String trxMatrixID;
    protected CreditDebitIndicatorType creditDebitIndicator;
    protected LoyaltyPointType loyaltyPoint;
    protected String scDescription;
    protected boolean vatRelevant;
    protected TransactionClassType transactionClass;
    protected Object anythingTransactionTypeType;

    /**
     * Gets the value of the trxMatrixID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTrxMatrixID() {
        return trxMatrixID;
    }

    /**
     * Sets the value of the trxMatrixID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTrxMatrixID(String value) {
        this.trxMatrixID = value;
    }

    /**
     * Gets the value of the creditDebitIndicator property.
     *
     * @return
     *     possible object is
     *     {@link CreditDebitIndicatorType }
     *
     */
    public CreditDebitIndicatorType getCreditDebitIndicator() {
        return creditDebitIndicator;
    }

    /**
     * Sets the value of the creditDebitIndicator property.
     *
     * @param value
     *     allowed object is
     *     {@link CreditDebitIndicatorType }
     *
     */
    public void setCreditDebitIndicator(CreditDebitIndicatorType value) {
        this.creditDebitIndicator = value;
    }

    /**
     * Gets the value of the loyaltyPoint property.
     *
     * @return
     *     possible object is
     *     {@link LoyaltyPointType }
     *
     */
    public LoyaltyPointType getLoyaltyPoint() {
        return loyaltyPoint;
    }

    /**
     * Sets the value of the loyaltyPoint property.
     *
     * @param value
     *     allowed object is
     *     {@link LoyaltyPointType }
     *
     */
    public void setLoyaltyPoint(LoyaltyPointType value) {
        this.loyaltyPoint = value;
    }

    /**
     * Gets the value of the scDescription property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSCDescription() {
        return scDescription;
    }

    /**
     * Sets the value of the scDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSCDescription(String value) {
        this.scDescription = value;
    }

    /**
     * Gets the value of the vatRelevant property.
     *
     */
    public boolean isVATRelevant() {
        return vatRelevant;
    }

    /**
     * Sets the value of the vatRelevant property.
     *
     */
    public void setVATRelevant(boolean value) {
        this.vatRelevant = value;
    }

    /**
     * Gets the value of the transactionClass property.
     *
     * @return
     *     possible object is
     *     {@link TransactionClassType }
     *
     */
    public TransactionClassType getTransactionClass() {
        return transactionClass;
    }

    /**
     * Sets the value of the transactionClass property.
     *
     * @param value
     *     allowed object is
     *     {@link TransactionClassType }
     *
     */
    public void setTransactionClass(TransactionClassType value) {
        this.transactionClass = value;
    }

    /**
     * Gets the value of the anythingTransactionTypeType property.
     *
     * @return
     *     possible object is
     *     {@link Object }
     *
     */
    public Object getAnythingTransactionTypeType() {
        return anythingTransactionTypeType;
    }

    /**
     * Sets the value of the anythingTransactionTypeType property.
     *
     * @param value
     *     allowed object is
     *     {@link Object }
     *
     */
    public void setAnythingTransactionTypeType(Object value) {
        this.anythingTransactionTypeType = value;
    }

}
