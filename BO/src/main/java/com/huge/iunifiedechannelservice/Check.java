package com.huge.iunifiedechannelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for check complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="check">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonTradeInfo" type="{http://www.huge.com/IUnifiedEChannelService/}CommonTradeInfo" minOccurs="0"/>
 *         &lt;element name="externalTradeCheckingInfo" type="{http://www.huge.com/IUnifiedEChannelService/}ExternalTradeCheckingInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "check", propOrder = { "commonTradeInfo",
		"externalTradeCheckingInfo" })
public class Check {

	protected CommonTradeInfo commonTradeInfo;
	protected ExternalTradeCheckingInfo externalTradeCheckingInfo;

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
	 * Gets the value of the externalTradeCheckingInfo property.
	 * 
	 * @return possible object is {@link ExternalTradeCheckingInfo }
	 * 
	 */
	public ExternalTradeCheckingInfo getExternalTradeCheckingInfo() {
		return externalTradeCheckingInfo;
	}

	/**
	 * Sets the value of the externalTradeCheckingInfo property.
	 * 
	 * @param value
	 *            allowed object is {@link ExternalTradeCheckingInfo }
	 * 
	 */
	public void setExternalTradeCheckingInfo(ExternalTradeCheckingInfo value) {
		this.externalTradeCheckingInfo = value;
	}

}
