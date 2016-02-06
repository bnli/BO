package com.huge.iunifiedechannelservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for valueAddedProductInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="valueAddedProductInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="terminalIdentification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productOfferingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastPreferentialPolicyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastPreferentialPolicyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="productOfferingType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="preferentialPolicyInfos" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="preferentialPolicyInfo" type="{http://www.huge.com/IUnifiedEChannelService/}PreferentialPolicyInfo" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "valueAddedProductInfo", propOrder = {
		"terminalIdentification", "productCode", "productName",
		"productStatus", "productOfferingCode", "lastPreferentialPolicyCode",
		"lastPreferentialPolicyName", "dueDate", "price", "duration",
		"productOfferingType", "preferentialPolicyInfos" })
public class ValueAddedProductInfo {

	protected String terminalIdentification;
	protected String productCode;
	protected String productName;
	protected String productStatus;
	protected String productOfferingCode;
	protected String lastPreferentialPolicyCode;
	protected String lastPreferentialPolicyName;
	protected String dueDate;
	protected int price;
	protected int duration;
	protected int productOfferingType;
	protected ValueAddedProductInfo.PreferentialPolicyInfos preferentialPolicyInfos;

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
	 * Gets the value of the productCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProductCode() {
		return productCode;
	}

	/**
	 * Sets the value of the productCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setProductCode(String value) {
		this.productCode = value;
	}

	/**
	 * Gets the value of the productName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * Sets the value of the productName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setProductName(String value) {
		this.productName = value;
	}

	/**
	 * Gets the value of the productStatus property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProductStatus() {
		return productStatus;
	}

	/**
	 * Sets the value of the productStatus property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setProductStatus(String value) {
		this.productStatus = value;
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

	/**
	 * Gets the value of the lastPreferentialPolicyCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLastPreferentialPolicyCode() {
		return lastPreferentialPolicyCode;
	}

	/**
	 * Sets the value of the lastPreferentialPolicyCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLastPreferentialPolicyCode(String value) {
		this.lastPreferentialPolicyCode = value;
	}

	/**
	 * Gets the value of the lastPreferentialPolicyName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLastPreferentialPolicyName() {
		return lastPreferentialPolicyName;
	}

	/**
	 * Sets the value of the lastPreferentialPolicyName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLastPreferentialPolicyName(String value) {
		this.lastPreferentialPolicyName = value;
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

	/**
	 * Gets the value of the price property.
	 * 
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * Sets the value of the price property.
	 * 
	 */
	public void setPrice(int value) {
		this.price = value;
	}

	/**
	 * Gets the value of the duration property.
	 * 
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * Sets the value of the duration property.
	 * 
	 */
	public void setDuration(int value) {
		this.duration = value;
	}

	/**
	 * Gets the value of the productOfferingType property.
	 * 
	 */
	public int getProductOfferingType() {
		return productOfferingType;
	}

	/**
	 * Sets the value of the productOfferingType property.
	 * 
	 */
	public void setProductOfferingType(int value) {
		this.productOfferingType = value;
	}

	/**
	 * Gets the value of the preferentialPolicyInfos property.
	 * 
	 * @return possible object is
	 *         {@link ValueAddedProductInfo.PreferentialPolicyInfos }
	 * 
	 */
	public ValueAddedProductInfo.PreferentialPolicyInfos getPreferentialPolicyInfos() {
		return preferentialPolicyInfos;
	}

	/**
	 * Sets the value of the preferentialPolicyInfos property.
	 * 
	 * @param value
	 *            allowed object is
	 *            {@link ValueAddedProductInfo.PreferentialPolicyInfos }
	 * 
	 */
	public void setPreferentialPolicyInfos(
			ValueAddedProductInfo.PreferentialPolicyInfos value) {
		this.preferentialPolicyInfos = value;
	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="preferentialPolicyInfo" type="{http://www.huge.com/IUnifiedEChannelService/}PreferentialPolicyInfo" maxOccurs="unbounded" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "preferentialPolicyInfo" })
	public static class PreferentialPolicyInfos {

		protected List<PreferentialPolicyInfo> preferentialPolicyInfo;

		/**
		 * Gets the value of the preferentialPolicyInfo property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the preferentialPolicyInfo property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getPreferentialPolicyInfo().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link PreferentialPolicyInfo }
		 * 
		 * 
		 */
		public List<PreferentialPolicyInfo> getPreferentialPolicyInfo() {
			if (preferentialPolicyInfo == null) {
				preferentialPolicyInfo = new ArrayList<PreferentialPolicyInfo>();
			}
			return this.preferentialPolicyInfo;
		}

	}

}
