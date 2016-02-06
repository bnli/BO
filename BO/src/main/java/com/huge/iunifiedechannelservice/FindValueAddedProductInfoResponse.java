package com.huge.iunifiedechannelservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for findValueAddedProductInfoResponse complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="findValueAddedProductInfoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="valueAddedProductInfos" type="{http://www.huge.com/IUnifiedEChannelService/}valueAddedProductInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findValueAddedProductInfoResponse", propOrder = { "valueAddedProductInfos" })
public class FindValueAddedProductInfoResponse {

	protected List<ValueAddedProductInfo> valueAddedProductInfos;

	/**
	 * Gets the value of the valueAddedProductInfos property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the valueAddedProductInfos property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getValueAddedProductInfos().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ValueAddedProductInfo }
	 * 
	 * 
	 */
	public List<ValueAddedProductInfo> getValueAddedProductInfos() {
		if (valueAddedProductInfos == null) {
			valueAddedProductInfos = new ArrayList<ValueAddedProductInfo>();
		}
		return this.valueAddedProductInfos;
	}

}
