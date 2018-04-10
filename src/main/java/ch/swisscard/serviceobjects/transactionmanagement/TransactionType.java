
package ch.swisscard.serviceobjects.transactionmanagement;

import ch.swisscard.serviceobjects.accountmanagement.AccountBusinessKeyType;

import java.io.Serializable;
import java.math.BigDecimal;

public class TransactionType
        implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String transactionID;
    protected String description;

    protected String effectiveDate;
    protected String postingDate;
    protected BigDecimal postedAmount;
    protected String transactionCurrency;
    protected AccountBusinessKeyType postedOnAccount;
    protected AccountBusinessKeyType effectiveAccount;
    protected String postedOnCardID;
    protected String effectiveCardID;
    protected TransactionTypeType transactionType;
    protected MerchantOfTransactionType merchantOfTransaction;
    protected FeeTransactionType feeTransaction;
    protected Float annualInterestRate;
    protected boolean consolidatedTransaction;
    protected CreditDebitIndicatorType creditDebitIndicator;
    protected int postingSequence;
    protected String sourceID;
    protected BigDecimal vatAmount;
    protected Float vatRate;
    protected String statementID;
    protected String statementSectionID;
    protected String authorizationCode;
    protected Object anythingTransactionType;

    /**
     * Gets the value of the transactionID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the description property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEffectiveDate(String value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the postingDate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPostingDate() {
        return postingDate;
    }

    /**
     * Sets the value of the postingDate property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPostingDate(String value) {
        this.postingDate = value;
    }

    /**
     * Gets the value of the postedAmount property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getPostedAmount() {
        return postedAmount;
    }

    /**
     * Sets the value of the postedAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setPostedAmount(BigDecimal value) {
        this.postedAmount = value;
    }

    /**
     * Gets the value of the transactionCurrency property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTransactionCurrency() {
        return transactionCurrency;
    }

    /**
     * Sets the value of the transactionCurrency property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTransactionCurrency(String value) {
        this.transactionCurrency = value;
    }

    /**
     * Gets the value of the postedOnAccount property.
     *
     * @return
     *     possible object is
     *     {@link AccountBusinessKeyType }
     *
     */
    public AccountBusinessKeyType getPostedOnAccount() {
        return postedOnAccount;
    }

    /**
     * Sets the value of the postedOnAccount property.
     *
     * @param value
     *     allowed object is
     *     {@link AccountBusinessKeyType }
     *
     */
    public void setPostedOnAccount(AccountBusinessKeyType value) {
        this.postedOnAccount = value;
    }

    /**
     * Gets the value of the effectiveAccount property.
     *
     * @return
     *     possible object is
     *     {@link AccountBusinessKeyType }
     *
     */
    public AccountBusinessKeyType getEffectiveAccount() {
        return effectiveAccount;
    }

    /**
     * Sets the value of the effectiveAccount property.
     *
     * @param value
     *     allowed object is
     *     {@link AccountBusinessKeyType }
     *
     */
    public void setEffectiveAccount(AccountBusinessKeyType value) {
        this.effectiveAccount = value;
    }

    /**
     * Gets the value of the postedOnCardID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPostedOnCardID() {
        return postedOnCardID;
    }

    /**
     * Sets the value of the postedOnCardID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPostedOnCardID(String value) {
        this.postedOnCardID = value;
    }

    /**
     * Gets the value of the effectiveCardID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEffectiveCardID() {
        return effectiveCardID;
    }

    /**
     * Sets the value of the effectiveCardID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEffectiveCardID(String value) {
        this.effectiveCardID = value;
    }

    /**
     * Gets the value of the transactionType property.
     *
     * @return
     *     possible object is
     *     {@link TransactionTypeType }
     *
     */
    public TransactionTypeType getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     *
     * @param value
     *     allowed object is
     *     {@link TransactionTypeType }
     *
     */
    public void setTransactionType(TransactionTypeType value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the merchantOfTransaction property.
     *
     * @return
     *     possible object is
     *     {@link MerchantOfTransactionType }
     *
     */
    public MerchantOfTransactionType getMerchantOfTransaction() {
        return merchantOfTransaction;
    }

    /**
     * Sets the value of the merchantOfTransaction property.
     *
     * @param value
     *     allowed object is
     *     {@link MerchantOfTransactionType }
     *
     */
    public void setMerchantOfTransaction(MerchantOfTransactionType value) {
        this.merchantOfTransaction = value;
    }

    /**
     * Gets the value of the feeTransaction property.
     *
     * @return
     *     possible object is
     *     {@link FeeTransactionType }
     *
     */
    public FeeTransactionType getFeeTransaction() {
        return feeTransaction;
    }

    /**
     * Sets the value of the feeTransaction property.
     *
     * @param value
     *     allowed object is
     *     {@link FeeTransactionType }
     *
     */
    public void setFeeTransaction(FeeTransactionType value) {
        this.feeTransaction = value;
    }

    /**
     * Gets the value of the annualInterestRate property.
     *
     * @return
     *     possible object is
     *     {@link Float }
     *
     */
    public Float getAnnualInterestRate() {
        return annualInterestRate;
    }

    /**
     * Sets the value of the annualInterestRate property.
     *
     * @param value
     *     allowed object is
     *     {@link Float }
     *
     */
    public void setAnnualInterestRate(Float value) {
        this.annualInterestRate = value;
    }

    /**
     * Gets the value of the consolidatedTransaction property.
     *
     */
    public boolean isConsolidatedTransaction() {
        return consolidatedTransaction;
    }

    /**
     * Sets the value of the consolidatedTransaction property.
     *
     */
    public void setConsolidatedTransaction(boolean value) {
        this.consolidatedTransaction = value;
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
     * Gets the value of the postingSequence property.
     *
     */
    public int getPostingSequence() {
        return postingSequence;
    }

    /**
     * Sets the value of the postingSequence property.
     *
     */
    public void setPostingSequence(int value) {
        this.postingSequence = value;
    }

    /**
     * Gets the value of the sourceID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSourceID() {
        return sourceID;
    }

    /**
     * Sets the value of the sourceID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSourceID(String value) {
        this.sourceID = value;
    }

    /**
     * Gets the value of the vatAmount property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getVATAmount() {
        return vatAmount;
    }

    /**
     * Sets the value of the vatAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setVATAmount(BigDecimal value) {
        this.vatAmount = value;
    }

    /**
     * Gets the value of the vatRate property.
     *
     * @return
     *     possible object is
     *     {@link Float }
     *
     */
    public Float getVATRate() {
        return vatRate;
    }

    /**
     * Sets the value of the vatRate property.
     *
     * @param value
     *     allowed object is
     *     {@link Float }
     *
     */
    public void setVATRate(Float value) {
        this.vatRate = value;
    }

    /**
     * Gets the value of the statementID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStatementID() {
        return statementID;
    }

    /**
     * Sets the value of the statementID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStatementID(String value) {
        this.statementID = value;
    }

    /**
     * Gets the value of the statementSectionID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStatementSectionID() {
        return statementSectionID;
    }

    /**
     * Sets the value of the statementSectionID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStatementSectionID(String value) {
        this.statementSectionID = value;
    }

    /**
     * Gets the value of the authorizationCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAuthorizationCode() {
        return authorizationCode;
    }

    /**
     * Sets the value of the authorizationCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAuthorizationCode(String value) {
        this.authorizationCode = value;
    }

    /**
     * Gets the value of the anythingTransactionType property.
     *
     * @return
     *     possible object is
     *     {@link Object }
     *
     */
    public Object getAnythingTransactionType() {
        return anythingTransactionType;
    }

    /**
     * Sets the value of the anythingTransactionType property.
     *
     * @param value
     *     allowed object is
     *     {@link Object }
     *
     */
    public void setAnythingTransactionType(Object value) {
        this.anythingTransactionType = value;
    }

}
