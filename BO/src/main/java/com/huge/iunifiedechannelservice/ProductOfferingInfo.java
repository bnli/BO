package com.huge.iunifiedechannelservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for productOfferingInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="productOfferingInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="productOfferingType" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "productOfferingInfo", propOrder = { "code", "name",
		"description", "preferentialPolicyInfos", "productOfferingType",
		"dueDate" })
public class ProductOfferingInfo {

	protected String code;
	protected String name;
	protected String description;
	protected ProductOfferingInfo.PreferentialPolicyInfos preferentialPolicyInfos;
	protected int productOfferingType;
	protected String dueDate;

	/**
	 * Gets the value of the code property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Sets the value of the code property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCode(String value) {
		this.code = value;
	}

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Gets the value of the description property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the value of the description property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescription(String value) {
		this.description = value;
	}

	/**
	 * Gets the value of the preferentialPolicyInfos property.
	 * 
	 * @return possible object is
	 *         {@link ProductOfferingInfo.PreferentialPolicyInfos }
	 * 
	 */
	public ProductOfferingInfo.PreferentialPolicyInfos getPreferentialPolicyInfos() {
		return preferentialPolicyInfos;
	}

	/**
	 * Sets the value of the preferentialPolicyInfos property.
	 * 
	 * @param value
	 *            allowed object is
	 *            {@link ProductOfferingInfo.PreferentialPolicyInfos }
	 * 
	 */
	public void setPreferentialPolicyInfos(
			ProductOfferingInfo.PreferentialPolicyInfos value) {
		this.preferentialPolicyInfos = value;
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
