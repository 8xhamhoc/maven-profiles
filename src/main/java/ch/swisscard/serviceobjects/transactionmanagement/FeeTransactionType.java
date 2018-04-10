
package ch.swisscard.serviceobjects.transactionmanagement;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import java.io.Serializable;
import java.math.BigDecimal;

public class FeeTransactionType
        implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "FeeType", required = true)
    protected FeeTypeType feeType;
    @XmlElement(name = "AmountInLocalCurrency")
    protected BigDecimal amountInLocalCurrency;
    @XmlElement(name = "CurrencyConversionDate")

    @XmlSchemaType(name = "date")
    protected String currencyConversionDate;
    @XmlElement(name = "CurrencyConversionRate")
    protected BigDecimal currencyConversionRate;
    @XmlElement(name = "MarkupCapApplied")
    protected boolean markupCapApplied;
    @XmlElement(name = "PercentageMarkupFee")
    protected Float percentageMarkupFee;
    @XmlElement(name = "Rounding")
    protected BigDecimal rounding;
    @XmlElement(name = "LocalCurrency")
    protected String localCurrency;
    @XmlElement(name = "AccountCurrencyAmount")
    protected BigDecimal accountCurrencyAmount;
    protected Object anythingFeeTransactionType;

    /**
     * Gets the value of the feeType property.
     *
     * @return
     *     possible object is
     *     {@link FeeTypeType }
     *
     */
    public FeeTypeType getFeeType() {
        return feeType;
    }

    /**
     * Sets the value of the feeType property.
     *
     * @param value
     *     allowed object is
     *     {@link FeeTypeType }
     *
     */
    public void setFeeType(FeeTypeType value) {
        this.feeType = value;
    }

    /**
     * Gets the value of the amountInLocalCurrency property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getAmountInLocalCurrency() {
        return amountInLocalCurrency;
    }

    /**
     * Sets the value of the amountInLocalCurrency property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setAmountInLocalCurrency(BigDecimal value) {
        this.amountInLocalCurrency = value;
    }

    /**
     * Gets the value of the currencyConversionDate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCurrencyConversionDate() {
        return currencyConversionDate;
    }

    /**
     * Sets the value of the currencyConversionDate property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCurrencyConversionDate(String value) {
        this.currencyConversionDate = value;
    }

    /**
     * Gets the value of the currencyConversionRate property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCurrencyConversionRate() {
        return currencyConversionRate;
    }

    /**
     * Sets the value of the currencyConversionRate property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCurrencyConversionRate(BigDecimal value) {
        this.currencyConversionRate = value;
    }

    /**
     * Gets the value of the markupCapApplied property.
     *
     */
    public boolean isMarkupCapApplied() {
        return markupCapApplied;
    }

    /**
     * Sets the value of the markupCapApplied property.
     *
     */
    public void setMarkupCapApplied(boolean value) {
        this.markupCapApplied = value;
    }

    /**
     * Gets the value of the percentageMarkupFee property.
     *
     * @return
     *     possible object is
     *     {@link Float }
     *
     */
    public Float getPercentageMarkupFee() {
        return percentageMarkupFee;
    }

    /**
     * Sets the value of the percentageMarkupFee property.
     *
     * @param value
     *     allowed object is
     *     {@link Float }
     *
     */
    public void setPercentageMarkupFee(Float value) {
        this.percentageMarkupFee = value;
    }

    /**
     * Gets the value of the rounding property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getRounding() {
        return rounding;
    }

    /**
     * Sets the value of the rounding property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setRounding(BigDecimal value) {
        this.rounding = value;
    }

    /**
     * Gets the value of the localCurrency property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLocalCurrency() {
        return localCurrency;
    }

    /**
     * Sets the value of the localCurrency property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLocalCurrency(String value) {
        this.localCurrency = value;
    }

    /**
     * Gets the value of the accountCurrencyAmount property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getAccountCurrencyAmount() {
        return accountCurrencyAmount;
    }

    /**
     * Sets the value of the accountCurrencyAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setAccountCurrencyAmount(BigDecimal value) {
        this.accountCurrencyAmount = value;
    }

    /**
     * Gets the value of the anythingFeeTransactionType property.
     *
     * @return
     *     possible object is
     *     {@link Object }
     *
     */
    public Object getAnythingFeeTransactionType() {
        return anythingFeeTransactionType;
    }

    /**
     * Sets the value of the anythingFeeTransactionType property.
     *
     * @param value
     *     allowed object is
     *     {@link Object }
     *
     */
    public void setAnythingFeeTransactionType(Object value) {
        this.anythingFeeTransactionType = value;
    }

}
