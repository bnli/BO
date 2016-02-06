package com.huge.iunifiedechannelservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for marketPlanInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="marketPlanInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="classificationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subMarketPlanInfos" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="subMarketPlanInfo" type="{http://www.huge.com/IUnifiedEChannelService/}subMarketPlanInfo" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "marketPlanInfo", propOrder = { "code", "name", "description",
		"classificationName", "subMarketPlanInfos" })
public class MarketPlanInfo {

	protected String code;
	protected String name;
	protected String description;
	protected String classificationName;
	protected MarketPlanInfo.SubMarketPlanInfos subMarketPlanInfos;

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
	 * Gets the value of the classificationName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getClassificationName() {
		return classificationName;
	}

	/**
	 * Sets the value of the classificationName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setClassificationName(String value) {
		this.classificationName = value;
	}

	/**
	 * Gets the value of the subMarketPlanInfos property.
	 * 
	 * @return possible object is {@link MarketPlanInfo.SubMarketPlanInfos }
	 * 
	 */
	public MarketPlanInfo.SubMarketPlanInfos getSubMarketPlanInfos() {
		return subMarketPlanInfos;
	}

	/**
	 * Sets the value of the subMarketPlanInfos property.
	 * 
	 * @param value
	 *            allowed object is {@link MarketPlanInfo.SubMarketPlanInfos }
	 * 
	 */
	public void setSubMarketPlanInfos(MarketPlanInfo.SubMarketPlanInfos value) {
		this.subMarketPlanInfos = value;
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
	 *         &lt;element name="subMarketPlanInfo" type="{http://www.huge.com/IUnifiedEChannelService/}subMarketPlanInfo" maxOccurs="unbounded" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "subMarketPlanInfo" })
	public static class SubMarketPlanInfos {

		protected List<SubMarketPlanInfo> subMarketPlanInfo;

		/**
		 * Gets the value of the subMarketPlanInfo property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the subMarketPlanInfo property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getSubMarketPlanInfo().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link SubMarketPlanInfo }
		 * 
		 * 
		 */
		public List<SubMarketPlanInfo> getSubMarketPlanInfo() {
			if (subMarketPlanInfo == null) {
				subMarketPlanInfo = new ArrayList<SubMarketPlanInfo>();
			}
			return this.subMarketPlanInfo;
		}

	}

}
