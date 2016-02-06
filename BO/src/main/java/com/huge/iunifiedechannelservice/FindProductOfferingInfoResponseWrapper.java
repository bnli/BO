package com.huge.iunifiedechannelservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for findProductOfferingInfoResponseWrapper complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="findProductOfferingInfoResponseWrapper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productOfferingInfos" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="productOfferingInfo" type="{http://www.huge.com/IUnifiedEChannelService/}productOfferingInfo" maxOccurs="unbounded"/>
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
@XmlType(name = "findProductOfferingInfoResponseWrapper", propOrder = { "productOfferingInfos" })
public class FindProductOfferingInfoResponseWrapper {

	protected FindProductOfferingInfoResponseWrapper.ProductOfferingInfos productOfferingInfos;

	/**
	 * Gets the value of the productOfferingInfos property.
	 * 
	 * @return possible object is
	 *         {@link FindProductOfferingInfoResponseWrapper.ProductOfferingInfos }
	 * 
	 */
	public FindProductOfferingInfoResponseWrapper.ProductOfferingInfos getProductOfferingInfos() {
		return productOfferingInfos;
	}

	/**
	 * Sets the value of the productOfferingInfos property.
	 * 
	 * @param value
	 *            allowed object is
	 *            {@link FindProductOfferingInfoResponseWrapper.ProductOfferingInfos }
	 * 
	 */
	public void setProductOfferingInfos(
			FindProductOfferingInfoResponseWrapper.ProductOfferingInfos value) {
		this.productOfferingInfos = value;
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
	 *         &lt;element name="productOfferingInfo" type="{http://www.huge.com/IUnifiedEChannelService/}productOfferingInfo" maxOccurs="unbounded"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "productOfferingInfo" })
	public static class ProductOfferingInfos {

		@XmlElement(required = true)
		protected List<ProductOfferingInfo> productOfferingInfo;

		/**
		 * Gets the value of the productOfferingInfo property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the productOfferingInfo property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getProductOfferingInfo().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link ProductOfferingInfo }
		 * 
		 * 
		 */
		public List<ProductOfferingInfo> getProductOfferingInfo() {
			if (productOfferingInfo == null) {
				productOfferingInfo = new ArrayList<ProductOfferingInfo>();
			}
			return this.productOfferingInfo;
		}

	}

}
