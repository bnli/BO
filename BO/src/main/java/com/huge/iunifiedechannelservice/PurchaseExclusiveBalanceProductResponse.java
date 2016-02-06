package com.huge.iunifiedechannelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for purchaseExclusiveBalanceProductResponse complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseExclusiveBalanceProductResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="callResultInfo" type="{http://www.huge.com/IUnifiedEChannelService/}CallResultInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseExclusiveBalanceProductResponse", propOrder = { "callResultInfo" })
public class PurchaseExclusiveBalanceProductResponse {

	protected CallResultInfo callResultInfo;

	/**
	 * Gets the value of the callResultInfo property.
	 * 
	 * @return possible object is {@link CallResultInfo }
	 * 
	 */
	public CallResultInfo getCallResultInfo() {
		return callResultInfo;
	}

	/**
	 * Sets the value of the callResultInfo property.
	 * 
	 * @param value
	 *            allowed object is {@link CallResultInfo }
	 * 
	 */
	public void setCallResultInfo(CallResultInfo value) {
		this.callResultInfo = value;
	}

}
