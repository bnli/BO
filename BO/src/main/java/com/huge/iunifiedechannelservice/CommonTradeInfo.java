package com.huge.iunifiedechannelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for CommonTradeInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="CommonTradeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceChannel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="verificationCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="operationRoleCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonTradeInfo", propOrder = { "serviceChannel",
		"verificationCode", "operationRoleCode" })
public class CommonTradeInfo {

	@XmlElement(required = true)
	protected String serviceChannel;
	@XmlElement(required = true)
	protected String verificationCode;
	@XmlElement(required = true)
	protected String operationRoleCode;

	/**
	 * Gets the value of the serviceChannel property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getServiceChannel() {
		return serviceChannel;
	}

	/**
	 * Sets the value of the serviceChannel property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setServiceChannel(String value) {
		this.serviceChannel = value;
	}

	/**
	 * Gets the value of the verificationCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVerificationCode() {
		return verificationCode;
	}

	/**
	 * Sets the value of the verificationCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVerificationCode(String value) {
		this.verificationCode = value;
	}

	/**
	 * Gets the value of the operationRoleCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOperationRoleCode() {
		return operationRoleCode;
	}

	/**
	 * Sets the value of the operationRoleCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOperationRoleCode(String value) {
		this.operationRoleCode = value;
	}

}
