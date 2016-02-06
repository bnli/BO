package com.huge.iunifiedechannelservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for subMarketPlanInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="subMarketPlanInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="terminalTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="isEnableMuti" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="marketPlanProductOfferingInfos" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="marketPlanProductOfferingInfo" type="{http://www.huge.com/IUnifiedEChannelService/}marketPlanProductOfferingInfo" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "subMarketPlanInfo", propOrder = { "name", "serialNumber",
		"type", "terminalTypeName", "actType", "isEnableMuti",
		"marketPlanProductOfferingInfos" })
public class SubMarketPlanInfo {

	protected String name;
	protected int serialNumber;
	protected int type;
	protected String terminalTypeName;
	protected int actType;
	protected int isEnableMuti;
	protected SubMarketPlanInfo.MarketPlanProductOfferingInfos marketPlanProductOfferingInfos;

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
	 * Gets the value of the serialNumber property.
	 * 
	 */
	public int getSerialNumber() {
		return serialNumber;
	}

	/**
	 * Sets the value of the serialNumber property.
	 * 
	 */
	public void setSerialNumber(int value) {
		this.serialNumber = value;
	}

	/**
	 * Gets the value of the type property.
	 * 
	 */
	public int getType() {
		return type;
	}

	/**
	 * Sets the value of the type property.
	 * 
	 */
	public void setType(int value) {
		this.type = value;
	}

	/**
	 * Gets the value of the terminalTypeName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTerminalTypeName() {
		return terminalTypeName;
	}

	/**
	 * Sets the value of the terminalTypeName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTerminalTypeName(String value) {
		this.terminalTypeName = value;
	}

	/**
	 * Gets the value of the actType property.
	 * 
	 */
	public int getActType() {
		return actType;
	}

	/**
	 * Sets the value of the actType property.
	 * 
	 */
	public void setActType(int value) {
		this.actType = value;
	}

	/**
	 * Gets the value of the isEnableMuti property.
	 * 
	 */
	public int getIsEnableMuti() {
		return isEnableMuti;
	}

	/**
	 * Sets the value of the isEnableMuti property.
	 * 
	 */
	public void setIsEnableMuti(int value) {
		this.isEnableMuti = value;
	}

	/**
	 * Gets the value of the marketPlanProductOfferingInfos property.
	 * 
	 * @return possible object is
	 *         {@link SubMarketPlanInfo.MarketPlanProductOfferingInfos }
	 * 
	 */
	public SubMarketPlanInfo.MarketPlanProductOfferingInfos getMarketPlanProductOfferingInfos() {
		return marketPlanProductOfferingInfos;
	}

	/**
	 * Sets the value of the marketPlanProductOfferingInfos property.
	 * 
	 * @param value
	 *            allowed object is
	 *            {@link SubMarketPlanInfo.MarketPlanProductOfferingInfos }
	 * 
	 */
	public void setMarketPlanProductOfferingInfos(
			SubMarketPlanInfo.MarketPlanProductOfferingInfos value) {
		this.marketPlanProductOfferingInfos = value;
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
	 *         &lt;element name="marketPlanProductOfferingInfo" type="{http://www.huge.com/IUnifiedEChannelService/}marketPlanProductOfferingInfo" maxOccurs="unbounded" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "marketPlanProductOfferingInfo" })
	public static class MarketPlanProductOfferingInfos {

		protected List<MarketPlanProductOfferingInfo> marketPlanProductOfferingInfo;

		/**
		 * Gets the value of the marketPlanProductOfferingInfo property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the marketPlanProductOfferingInfo
		 * property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getMarketPlanProductOfferingInfo().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link MarketPlanProductOfferingInfo }
		 * 
		 * 
		 */
		public List<MarketPlanProductOfferingInfo> getMarketPlanProductOfferingInfo() {
			if (marketPlanProductOfferingInfo == null) {
				marketPlanProductOfferingInfo = new ArrayList<MarketPlanProductOfferingInfo>();
			}
			return this.marketPlanProductOfferingInfo;
		}

	}

}
