package com.huge.iunifiedechannelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for areaInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="areaInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="areaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="areaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="areaTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="areaTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "areaInfo", propOrder = { "areaCode", "areaName",
		"areaTypeCode", "areaTypeName" })
public class AreaInfo {

	protected String areaCode;
	protected String areaName;
	protected String areaTypeCode;
	protected String areaTypeName;

	/**
	 * Gets the value of the areaCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAreaCode() {
		return areaCode;
	}

	/**
	 * Sets the value of the areaCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAreaCode(String value) {
		this.areaCode = value;
	}

	/**
	 * Gets the value of the areaName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAreaName() {
		return areaName;
	}

	/**
	 * Sets the value of the areaName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAreaName(String value) {
		this.areaName = value;
	}

	/**
	 * Gets the value of the areaTypeCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAreaTypeCode() {
		return areaTypeCode;
	}

	/**
	 * Sets the value of the areaTypeCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAreaTypeCode(String value) {
		this.areaTypeCode = value;
	}

	/**
	 * Gets the value of the areaTypeName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAreaTypeName() {
		return areaTypeName;
	}

	/**
	 * Sets the value of the areaTypeName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAreaTypeName(String value) {
		this.areaTypeName = value;
	}

}
