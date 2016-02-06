package com.huge.iunifiedechannelservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for findVodInfoResponseWrapper complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="findVodInfoResponseWrapper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vodInfos" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="vodInfo" type="{http://www.huge.com/IUnifiedEChannelService/}VodInfo" maxOccurs="unbounded"/>
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
@XmlType(name = "findVodInfoResponseWrapper", propOrder = { "vodInfos" })
public class FindVodInfoResponseWrapper {

	protected FindVodInfoResponseWrapper.VodInfos vodInfos;

	/**
	 * Gets the value of the vodInfos property.
	 * 
	 * @return possible object is {@link FindVodInfoResponseWrapper.VodInfos }
	 * 
	 */
	public FindVodInfoResponseWrapper.VodInfos getVodInfos() {
		return vodInfos;
	}

	/**
	 * Sets the value of the vodInfos property.
	 * 
	 * @param value
	 *            allowed object is {@link FindVodInfoResponseWrapper.VodInfos }
	 * 
	 */
	public void setVodInfos(FindVodInfoResponseWrapper.VodInfos value) {
		this.vodInfos = value;
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
	 *         &lt;element name="vodInfo" type="{http://www.huge.com/IUnifiedEChannelService/}VodInfo" maxOccurs="unbounded"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "vodInfo" })
	public static class VodInfos {

		@XmlElement(required = true)
		protected List<VodInfo> vodInfo;

		/**
		 * Gets the value of the vodInfo property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the vodInfo property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getVodInfo().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link VodInfo }
		 * 
		 * 
		 */
		public List<VodInfo> getVodInfo() {
			if (vodInfo == null) {
				vodInfo = new ArrayList<VodInfo>();
			}
			return this.vodInfo;
		}

	}

}
