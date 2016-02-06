package com.huge.iunifiedechannelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonTradeInfo" type="{http://www.huge.com/IUnifiedEChannelService/}CommonTradeInfo"/>
 *         &lt;element name="customerIdentification" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="identifyType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="servicePassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "commonTradeInfo", "customerIdentification",
		"identifyType", "servicePassword" })
@XmlRootElement(name = "login")
public class Login {

	@XmlElement(required = true)
	protected CommonTradeInfo commonTradeInfo;
	@XmlElement(required = true)
	protected String customerIdentification;
	@XmlElement(required = true)
	protected String identifyType;
	@XmlElement(required = true)
	protected String servicePassword;

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
	 * Gets the value of the identifyType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIdentifyType() {
		return identifyType;
	}

	/**
	 * Sets the value of the identifyType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIdentifyType(String value) {
		this.identifyType = value;
	}

	/**
	 * Gets the value of the servicePassword property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getServicePassword() {
		return servicePassword;
	}

	/**
	 * Sets the value of the servicePassword property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setServicePassword(String value) {
		this.servicePassword = value;
	}

}
