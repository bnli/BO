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
 *         &lt;element name="customerCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rechargeInfo" type="{http://www.huge.com/IUnifiedEChannelService/}RechargeInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "commonTradeInfo", "customerCode",
		"rechargeInfo" })
@XmlRootElement(name = "recharge")
public class Recharge {

	@XmlElement(required = true)
	protected CommonTradeInfo commonTradeInfo;
	@XmlElement(required = true)
	protected String customerCode;
	@XmlElement(required = true)
	protected RechargeInfo rechargeInfo;

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
	 * Gets the value of the customerCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCustomerCode() {
		return customerCode;
	}

	/**
	 * Sets the value of the customerCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCustomerCode(String value) {
		this.customerCode = value;
	}

	/**
	 * Gets the value of the rechargeInfo property.
	 * 
	 * @return possible object is {@link RechargeInfo }
	 * 
	 */
	public RechargeInfo getRechargeInfo() {
		return rechargeInfo;
	}

	/**
	 * Sets the value of the rechargeInfo property.
	 * 
	 * @param value
	 *            allowed object is {@link RechargeInfo }
	 * 
	 */
	public void setRechargeInfo(RechargeInfo value) {
		this.rechargeInfo = value;
	}

}
