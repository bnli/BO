package com.huge.iunifiedechannelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for billInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="billInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billingCycleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fulfilledAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="unfulfilledAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fulfillTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "billInfo", propOrder = { "billingCycleName", "productName",
		"productState", "priceType", "itemAmount", "fulfilledAmount",
		"unfulfilledAmount", "fulfillTime", "description" })
public class BillInfo {

	protected String billingCycleName;
	protected String productName;
	protected String productState;
	protected String priceType;
	protected int itemAmount;
	protected int fulfilledAmount;
	protected int unfulfilledAmount;
	protected String fulfillTime;
	protected String description;

	/**
	 * Gets the value of the billingCycleName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBillingCycleName() {
		return billingCycleName;
	}

	/**
	 * Sets the value of the billingCycleName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBillingCycleName(String value) {
		this.billingCycleName = value;
	}

	/**
	 * Gets the value of the productName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * Sets the value of the productName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setProductName(String value) {
		this.productName = value;
	}

	/**
	 * Gets the value of the productState property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProductState() {
		return productState;
	}

	/**
	 * Sets the value of the productState property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setProductState(String value) {
		this.productState = value;
	}

	/**
	 * Gets the value of the priceType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPriceType() {
		return priceType;
	}

	/**
	 * Sets the value of the priceType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPriceType(String value) {
		this.priceType = value;
	}

	/**
	 * Gets the value of the itemAmount property.
	 * 
	 */
	public int getItemAmount() {
		return itemAmount;
	}

	/**
	 * Sets the value of the itemAmount property.
	 * 
	 */
	public void setItemAmount(int value) {
		this.itemAmount = value;
	}

	/**
	 * Gets the value of the fulfilledAmount property.
	 * 
	 */
	public int getFulfilledAmount() {
		return fulfilledAmount;
	}

	/**
	 * Sets the value of the fulfilledAmount property.
	 * 
	 */
	public void setFulfilledAmount(int value) {
		this.fulfilledAmount = value;
	}

	/**
	 * Gets the value of the unfulfilledAmount property.
	 * 
	 */
	public int getUnfulfilledAmount() {
		return unfulfilledAmount;
	}

	/**
	 * Sets the value of the unfulfilledAmount property.
	 * 
	 */
	public void setUnfulfilledAmount(int value) {
		this.unfulfilledAmount = value;
	}

	/**
	 * Gets the value of the fulfillTime property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFulfillTime() {
		return fulfillTime;
	}

	/**
	 * Sets the value of the fulfillTime property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFulfillTime(String value) {
		this.fulfillTime = value;
	}

	/**
	 * Gets the value of the description property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the value of the description property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescription(String value) {
		this.description = value;
	}

}
