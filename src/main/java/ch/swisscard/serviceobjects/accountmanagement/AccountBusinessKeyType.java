
package ch.swisscard.serviceobjects.accountmanagement;

import java.io.Serializable;

public class AccountBusinessKeyType
        implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String accountID;
    protected String accountSuffix;
    protected AccountReceivableSystemType accountReceivableSystem;

    /**
     * Gets the value of the accountID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAccountID() {
        return accountID;
    }

    /**
     * Sets the value of the accountID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAccountID(String value) {
        this.accountID = value;
    }

    /**
     * Gets the value of the accountSuffix property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAccountSuffix() {
        return accountSuffix;
    }

    /**
     * Sets the value of the accountSuffix property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAccountSuffix(String value) {
        this.accountSuffix = value;
    }

    /**
     * Gets the value of the accountReceivableSystem property.
     *
     * @return
     *     possible object is
     *     {@link AccountReceivableSystemType }
     *
     */
    public AccountReceivableSystemType getAccountReceivableSystem() {
        return accountReceivableSystem;
    }

    /**
     * Sets the value of the accountReceivableSystem property.
     *
     * @param value
     *     allowed object is
     *     {@link AccountReceivableSystemType }
     *
     */
    public void setAccountReceivableSystem(AccountReceivableSystemType value) {
        this.accountReceivableSystem = value;
    }

}
