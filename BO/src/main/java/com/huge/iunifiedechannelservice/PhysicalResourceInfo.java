package com.huge.iunifiedechannelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for physicalResourceInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="physicalResourceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="physicalResourceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="physicalResourceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="physicalResourceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="physicalResourceProviderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="physicalResourceProviderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "physicalResourceInfo", propOrder = { "physicalResourceCode",
		"physicalResourceName", "physicalResourceType",
		"physicalResourceProviderCode", "physicalResourceProviderName" })
public class PhysicalResourceInfo {

	protected String physicalResourceCode;
	protected String physicalResourceName;
	protected String physicalResourceType;
	protected String physicalResourceProviderCode;
	protected String physicalResourceProviderName;

	/**
	 * Gets the value of the physicalResourceCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPhysicalResourceCode() {
		return physicalResourceCode;
	}

	/**
	 * Sets the value of the physicalResourceCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPhysicalResourceCode(String value) {
		this.physicalResourceCode = value;
	}

	/**
	 * Gets the value of the physicalResourceName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPhysicalResourceName() {
		return physicalResourceName;
	}

	/**
	 * Sets the value of the physicalResourceName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPhysicalResourceName(String value) {
		this.physicalResourceName = value;
	}

	/**
	 * Gets the value of the physicalResourceType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPhysicalResourceType() {
		return physicalResourceType;
	}

	/**
	 * Sets the value of the physicalResourceType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPhysicalResourceType(String value) {
		this.physicalResourceType = value;
	}

	/**
	 * Gets the value of the physicalResourceProviderCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPhysicalResourceProviderCode() {
		return physicalResourceProviderCode;
	}

	/**
	 * Sets the value of the physicalResourceProviderCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPhysicalResourceProviderCode(String value) {
		this.physicalResourceProviderCode = value;
	}

	/**
	 * Gets the value of the physicalResourceProviderName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPhysicalResourceProviderName() {
		return physicalResourceProviderName;
	}

	/**
	 * Sets the value of the physicalResourceProviderName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPhysicalResourceProviderName(String value) {
		this.physicalResourceProviderName = value;
	}

}
