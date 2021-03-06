package com.huge.iunifiedechannelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for checkResponse complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="checkResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="checkResult" type="{http://www.huge.com/IUnifiedEChannelService/}CallResultInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkResponse", propOrder = { "checkResult" })
public class CheckResponse {

	protected CallResultInfo checkResult;

	/**
	 * Gets the value of the checkResult property.
	 * 
	 * @return possible object is {@link CallResultInfo }
	 * 
	 */
	public CallResultInfo getCheckResult() {
		return checkResult;
	}

	/**
	 * Sets the value of the checkResult property.
	 * 
	 * @param value
	 *            allowed object is {@link CallResultInfo }
	 * 
	 */
	public void setCheckResult(CallResultInfo value) {
		this.checkResult = value;
	}

}
