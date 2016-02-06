package com.huge.iunifiedechannelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for isCanPurchase complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="isCanPurchase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonTradeInfo" type="{http://www.huge.com/IUnifiedEChannelService/}CommonTradeInfo" minOccurs="0"/>
 *         &lt;element name="terminalIdentification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productOfferingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isCanPurchase", propOrder = { "commonTradeInfo",
		"terminalIdentification", "productOfferingCode" })
public class IsCanPurchase {

	protected CommonTradeInfo commonTradeInfo;
	protected String terminalIdentification;
	protected String productOfferingCode;

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

}
