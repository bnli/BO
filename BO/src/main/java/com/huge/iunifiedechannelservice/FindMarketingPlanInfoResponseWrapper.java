package com.huge.iunifiedechannelservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for findMarketingPlanInfoResponseWrapper complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="findMarketingPlanInfoResponseWrapper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="marketingPlanInfos" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="marketPlanInfos" type="{http://www.huge.com/IUnifiedEChannelService/}marketPlanInfo" maxOccurs="unbounded"/>
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
@XmlType(name = "findMarketingPlanInfoResponseWrapper", propOrder = { "marketingPlanInfos" })
public class FindMarketingPlanInfoResponseWrapper {

	protected FindMarketingPlanInfoResponseWrapper.MarketingPlanInfos marketingPlanInfos;

	/**
	 * Gets the value of the marketingPlanInfos property.
	 * 
	 * @return possible object is
	 *         {@link FindMarketingPlanInfoResponseWrapper.MarketingPlanInfos }
	 * 
	 */
	public FindMarketingPlanInfoResponseWrapper.MarketingPlanInfos getMarketingPlanInfos() {
		return marketingPlanInfos;
	}

	/**
	 * Sets the value of the marketingPlanInfos property.
	 * 
	 * @param value
	 *            allowed object is
	 *            {@link FindMarketingPlanInfoResponseWrapper.MarketingPlanInfos }
	 * 
	 */
	public void setMarketingPlanInfos(
			FindMarketingPlanInfoResponseWrapper.MarketingPlanInfos value) {
		this.marketingPlanInfos = value;
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
	 *         &lt;element name="marketPlanInfos" type="{http://www.huge.com/IUnifiedEChannelService/}marketPlanInfo" maxOccurs="unbounded"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "marketPlanInfos" })
	public static class MarketingPlanInfos {

		@XmlElement(required = true)
		protected List<MarketPlanInfo> marketPlanInfos;

		/**
		 * Gets the value of the marketPlanInfos property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the marketPlanInfos property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getMarketPlanInfos().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link MarketPlanInfo }
		 * 
		 * 
		 */
		public List<MarketPlanInfo> getMarketPlanInfos() {
			if (marketPlanInfos == null) {
				marketPlanInfos = new ArrayList<MarketPlanInfo>();
			}
			return this.marketPlanInfos;
		}

	}

}
