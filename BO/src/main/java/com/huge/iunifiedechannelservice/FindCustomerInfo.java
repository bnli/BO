package com.huge.iunifiedechannelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for findCustomerInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="findCustomerInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonTradeInfo" type="{http://www.huge.com/IUnifiedEChannelService/}CommonTradeInfo" minOccurs="0"/>
 *         &lt;element name="customerIdentification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerIdentificationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findCustomerInfo", propOrder = { "commonTradeInfo",
		"customerIdentification", "customerIdentificationType" })
public class FindCustomerInfo {

	protected CommonTradeInfo commonTradeInfo;
	protected String customerIdentification;
	protected int customerIdentificationType;

	/**
	 * Gets the value of the commonTradeInfo property.
	 * 
	 * @return possible object is {@link CommonTradeInfo }
	 * 
	 */
	public CommonTradeInfo getCommonTradeInfo() {
		return commonTradeInfo;
	}

	/**
	 * Sets the value of the commonTradeInfo property.
	 * 
	 * @param value
	 *            allowed object is {@link CommonTradeInfo }
	 * 
	 */
	public void setCommonTradeInfo(CommonTradeInfo value) {
		this.commonTradeInfo = value;
	}

	/**
	 * Gets the value of the customerIdentification property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCustomerIdentification() {
		return customerIdentification;
	}

	/**
	 * Sets the value of the customerIdentification property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCustomerIdentification(String value) {
		this.customerIdentification = value;
	}

	/**
	 * Gets the value of the customerIdentificationType property.
	 * 
	 */
	public int getCustomerIdentificationType() {
		return customerIdentificationType;
	}

	/**
	 * Sets the value of the customerIdentificationType property.
	 * 
	 */
	public void setCustomerIdentificationType(int value) {
		this.customerIdentificationType = value;
	}

}
