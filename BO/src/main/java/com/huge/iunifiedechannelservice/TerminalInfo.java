package com.huge.iunifiedechannelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for terminalInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="terminalInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="terminalIdentification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terminalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "terminalInfo", propOrder = { "terminalIdentification",
		"terminalName", "dueDate" })
public class TerminalInfo {

	protected String terminalIdentification;
	protected String terminalName;
	protected String dueDate;

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
	 * Gets the value of the terminalName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTerminalName() {
		return terminalName;
	}

	/**
	 * Sets the value of the terminalName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTerminalName(String value) {
		this.terminalName = value;
	}

	/**
	 * Gets the value of the dueDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDueDate() {
		return dueDate;
	}

	/**
	 * Sets the value of the dueDate property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDueDate(String value) {
		this.dueDate = value;
	}

}
