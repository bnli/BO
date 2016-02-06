package com.huge.iunifiedechannelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for customerBalanceInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="customerBalanceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="balanceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerBalanceInfo", propOrder = { "accountType",
		"balanceType", "amount" })
public class CustomerBalanceInfo {

	protected String accountType;
	protected String balanceType;
	protected int amount;

	/**
	 * Gets the value of the accountType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAccountType() {
		return accountType;
	}

	/**
	 * Sets the value of the accountType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAccountType(String value) {
		this.accountType = value;
	}

	/**
	 * Gets the value of the balanceType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBalanceType() {
		return balanceType;
	}

	/**
	 * Sets the value of the balanceType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBalanceType(String value) {
		this.balanceType = value;
	}

	/**
	 * Gets the value of the amount property.
	 * 
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * Sets the value of the amount property.
	 * 
	 */
	public void setAmount(int value) {
		this.amount = value;
	}

}
