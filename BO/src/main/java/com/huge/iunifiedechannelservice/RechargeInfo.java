package com.huge.iunifiedechannelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for RechargeInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="RechargeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paymentMode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tradeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tradeSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deposit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankAccountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentWay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RechargeInfo", propOrder = { "paymentMode", "tradeDate",
		"tradeSerialNumber", "deposit", "bankCode", "bankAccountNo", "cardNo",
		"cardPassword", "accountNo", "paymentWay", "remark" })
public class RechargeInfo {

	protected int paymentMode;
	protected String tradeDate;
	protected String tradeSerialNumber;
	protected int deposit;
	protected String bankCode;
	protected String bankAccountNo;
	protected String cardNo;
	protected String cardPassword;
	protected String accountNo;
	protected String paymentWay;
	protected String remark;

	/**
	 * Gets the value of the paymentMode property.
	 * 
	 */
	public int getPaymentMode() {
		return paymentMode;
	}

	/**
	 * Sets the value of the paymentMode property.
	 * 
	 */
	public void setPaymentMode(int value) {
		this.paymentMode = value;
	}

	/**
	 * Gets the value of the tradeDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTradeDate() {
		return tradeDate;
	}

	/**
	 * Sets the value of the tradeDate property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTradeDate(String value) {
		this.tradeDate = value;
	}

	/**
	 * Gets the value of the tradeSerialNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTradeSerialNumber() {
		return tradeSerialNumber;
	}

	/**
	 * Sets the value of the tradeSerialNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTradeSerialNumber(String value) {
		this.tradeSerialNumber = value;
	}

	/**
	 * Gets the value of the deposit property.
	 * 
	 */
	public int getDeposit() {
		return deposit;
	}

	/**
	 * Sets the value of the deposit property.
	 * 
	 */
	public void setDeposit(int value) {
		this.deposit = value;
	}

	/**
	 * Gets the value of the bankCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBankCode() {
		return bankCode;
	}

	/**
	 * Sets the value of the bankCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBankCode(String value) {
		this.bankCode = value;
	}

	/**
	 * Gets the value of the bankAccountNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBankAccountNo() {
		return bankAccountNo;
	}

	/**
	 * Sets the value of the bankAccountNo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBankAccountNo(String value) {
		this.bankAccountNo = value;
	}

	/**
	 * Gets the value of the cardNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCardNo() {
		return cardNo;
	}

	/**
	 * Sets the value of the cardNo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCardNo(String value) {
		this.cardNo = value;
	}

	/**
	 * Gets the value of the cardPassword property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCardPassword() {
		return cardPassword;
	}

	/**
	 * Sets the value of the cardPassword property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCardPassword(String value) {
		this.cardPassword = value;
	}

	/**
	 * Gets the value of the accountNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAccountNo() {
		return accountNo;
	}

	/**
	 * Sets the value of the accountNo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAccountNo(String value) {
		this.accountNo = value;
	}

	/**
	 * Gets the value of the paymentWay property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPaymentWay() {
		return paymentWay;
	}

	/**
	 * Sets the value of the paymentWay property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPaymentWay(String value) {
		this.paymentWay = value;
	}

	/**
	 * Gets the value of the remark property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * Sets the value of the remark property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRemark(String value) {
		this.remark = value;
	}

}
