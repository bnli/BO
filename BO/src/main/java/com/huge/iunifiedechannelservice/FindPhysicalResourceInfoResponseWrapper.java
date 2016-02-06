package com.huge.iunifiedechannelservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for findPhysicalResourceInfoResponseWrapper complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="findPhysicalResourceInfoResponseWrapper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="physicalResourceInfos" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="physicalResourceInfo" type="{http://www.huge.com/IUnifiedEChannelService/}physicalResourceInfo" maxOccurs="unbounded"/>
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
@XmlType(name = "findPhysicalResourceInfoResponseWrapper", propOrder = { "physicalResourceInfos" })
public class FindPhysicalResourceInfoResponseWrapper {

	protected FindPhysicalResourceInfoResponseWrapper.PhysicalResourceInfos physicalResourceInfos;

	/**
	 * Gets the value of the physicalResourceInfos property.
	 * 
	 * @return possible object is
	 *         {@link FindPhysicalResourceInfoResponseWrapper.PhysicalResourceInfos }
	 * 
	 */
	public FindPhysicalResourceInfoResponseWrapper.PhysicalResourceInfos getPhysicalResourceInfos() {
		return physicalResourceInfos;
	}

	/**
	 * Sets the value of the physicalResourceInfos property.
	 * 
	 * @param value
	 *            allowed object is
	 *            {@link FindPhysicalResourceInfoResponseWrapper.PhysicalResourceInfos }
	 * 
	 */
	public void setPhysicalResourceInfos(
			FindPhysicalResourceInfoResponseWrapper.PhysicalResourceInfos value) {
		this.physicalResourceInfos = value;
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
	 *         &lt;element name="physicalResourceInfo" type="{http://www.huge.com/IUnifiedEChannelService/}physicalResourceInfo" maxOccurs="unbounded"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "physicalResourceInfo" })
	public static class PhysicalResourceInfos {

		@XmlElement(required = true)
		protected List<PhysicalResourceInfo> physicalResourceInfo;

		/**
		 * Gets the value of the physicalResourceInfo property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the physicalResourceInfo property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getPhysicalResourceInfo().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link PhysicalResourceInfo }
		 * 
		 * 
		 */
		public List<PhysicalResourceInfo> getPhysicalResourceInfo() {
			if (physicalResourceInfo == null) {
				physicalResourceInfo = new ArrayList<PhysicalResourceInfo>();
			}
			return this.physicalResourceInfo;
		}

	}

}
