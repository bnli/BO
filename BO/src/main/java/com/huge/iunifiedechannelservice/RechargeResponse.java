package com.huge.iunifiedechannelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for rechargeResponse complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="rechargeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="callResult" type="{http://www.huge.com/IUnifiedEChannelService/}CallResultInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rechargeResponse", propOrder = { "callResult" })
public class RechargeResponse {

	protected CallResultInfo callResult;

	/**
	 * Gets the value of the callResult property.
	 * 
	 * @return possible object is {@link CallResultInfo }
	 * 
	 */
	public CallResultInfo getCallResult() {
		return callResult;
	}

	/**
	 * Sets the value of the callResult property.
	 * 
	 * @param value
	 *            allowed object is {@link CallResultInfo }
	 * 
	 */
	public void setCallResult(CallResultInfo value) {
		this.callResult = value;
	}

}
