package com.huge.iunifiedechannelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for PurchaseInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="PurchaseInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="terminalIdentification" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productOfferingCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="preferentialPolicyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="month" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchaseInfo", propOrder = { "terminalIdentification",
		"productOfferingCode", "preferentialPolicyCode", "month" })
public class PurchaseInfo {

	@XmlElement(required = true)
	protected String terminalIdentification;
	@XmlElement(required = true)
	protected String productOfferingCode;
	@XmlElement(required = true)
	protected String preferentialPolicyCode;
	protected int month;

	/**
	 * Gets the value of the terminalIdentification property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTerminalIdentification() {
		return terminalIdentification;
	}

	/**
	 * Sets the value of the terminalIdentification property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTerminalIdentification(String value) {
		this.terminalIdentification = value;
	}

	/**
	 * Gets the value of the productOfferingCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProductOfferingCode() {
		return productOfferingCode;
	}

	/**
	 * Sets the value of the productOfferingCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setProductOfferingCode(String value) {
		this.productOfferingCode = value;
	}

	/**
	 * Gets the value of the preferentialPolicyCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPreferentialPolicyCode() {
		return preferentialPolicyCode;
	}

	/**
	 * Sets the value of the preferentialPolicyCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPreferentialPolicyCode(String value) {
		this.preferentialPolicyCode = value;
	}

	/**
	 * Gets the value of the month property.
	 * 
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * Sets the value of the month property.
	 * 
	 */
	public void setMonth(int value) {
		this.month = value;
	}

}
