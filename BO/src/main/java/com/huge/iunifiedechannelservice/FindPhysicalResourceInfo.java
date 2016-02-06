package com.huge.iunifiedechannelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for findPhysicalResourceInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="findPhysicalResourceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonTradeInfo" type="{http://www.huge.com/IUnifiedEChannelService/}CommonTradeInfo" minOccurs="0"/>
 *         &lt;element name="terminalIdentification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findPhysicalResourceInfo", propOrder = { "commonTradeInfo",
		"terminalIdentification" })
public class FindPhysicalResourceInfo {

	protected CommonTradeInfo commonTradeInfo;
	protected String terminalIdentification;

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

}
