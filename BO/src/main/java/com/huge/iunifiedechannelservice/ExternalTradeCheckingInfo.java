package com.huge.iunifiedechannelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ExternalTradeCheckingInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalTradeCheckingInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="money" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="paymentParty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addedInfo" type="{http://www.huge.com/IUnifiedEChannelService/}mapType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalTradeCheckingInfo", propOrder = { "start", "end",
		"count", "money", "paymentParty", "fileName", "addedInfo" })
public class ExternalTradeCheckingInfo {

	protected String start;
	protected String end;
	protected int count;
	protected long money;
	protected String paymentParty;
	protected String fileName;
	protected MapType addedInfo;

	/**
	 * Gets the value of the start property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStart() {
		return start;
	}

	/**
	 * Sets the value of the start property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStart(String value) {
		this.start = value;
	}

	/**
	 * Gets the value of the end property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEnd() {
		return end;
	}

	/**
	 * Sets the value of the end property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEnd(String value) {
		this.end = value;
	}

	/**
	 * Gets the value of the count property.
	 * 
	 */
	public int getCount() {
		return count;
	}

	/**
	 * Sets the value of the count property.
	 * 
	 */
	public void setCount(int value) {
		this.count = value;
	}

	/**
	 * Gets the value of the money property.
	 * 
	 */
	public long getMoney() {
		return money;
	}

	/**
	 * Sets the value of the money property.
	 * 
	 */
	public void setMoney(long value) {
		this.money = value;
	}

	/**
	 * Gets the value of the paymentParty property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPaymentParty() {
		return paymentParty;
	}

	/**
	 * Sets the value of the paymentParty property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPaymentParty(String value) {
		this.paymentParty = value;
	}

	/**
	 * Gets the value of the fileName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * Sets the value of the fileName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFileName(String value) {
		this.fileName = value;
	}

	/**
	 * Gets the value of the addedInfo property.
	 * 
	 * @return possible object is {@link MapType }
	 * 
	 */
	public MapType getAddedInfo() {
		return addedInfo;
	}

	/**
	 * Sets the value of the addedInfo property.
	 * 
	 * @param value
	 *            allowed object is {@link MapType }
	 * 
	 */
	public void setAddedInfo(MapType value) {
		this.addedInfo = value;
	}

}
