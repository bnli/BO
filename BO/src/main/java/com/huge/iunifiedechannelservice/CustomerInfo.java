package com.huge.iunifiedechannelservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for customerInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="customerInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operationRoleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="installAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="openAccountTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="levelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="genderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partyIdentificationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partyIdentificationNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fixedTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactMan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactManFixedTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactManMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="welfareAgreement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="areaInfos" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="areaInfo" type="{http://www.huge.com/IUnifiedEChannelService/}areaInfo" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerInfo", propOrder = { "operationRoleCode", "code",
		"name", "installAddress", "openAccountTime", "typeName", "levelName",
		"genderName", "partyIdentificationType", "partyIdentificationNo",
		"fixedTel", "mobile", "contactMan", "contactManFixedTel",
		"contactManMobile", "serviceChannel", "welfareAgreement",
		"accountName", "bankName", "accountNo", "customerGroup", "areaInfos",
		"remark" })
public class CustomerInfo {

	protected String operationRoleCode;
	protected String code;
	protected String name;
	protected String installAddress;
	protected String openAccountTime;
	protected String typeName;
	protected String levelName;
	protected String genderName;
	protected String partyIdentificationType;
	protected String partyIdentificationNo;
	protected String fixedTel;
	protected String mobile;
	protected String contactMan;
	protected String contactManFixedTel;
	protected String contactManMobile;
	protected String serviceChannel;
	protected String welfareAgreement;
	protected String accountName;
	protected String bankName;
	protected String accountNo;
	protected String customerGroup;
	protected CustomerInfo.AreaInfos areaInfos;
	protected String remark;

	/**
	 * Gets the value of the operationRoleCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOperationRoleCode() {
		return operationRoleCode;
	}

	/**
	 * Sets the value of the operationRoleCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOperationRoleCode(String value) {
		this.operationRoleCode = value;
	}

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
	 * Gets the value of the installAddress property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInstallAddress() {
		return installAddress;
	}

	/**
	 * Sets the value of the installAddress property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setInstallAddress(String value) {
		this.installAddress = value;
	}

	/**
	 * Gets the value of the openAccountTime property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOpenAccountTime() {
		return openAccountTime;
	}

	/**
	 * Sets the value of the openAccountTime property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOpenAccountTime(String value) {
		this.openAccountTime = value;
	}

	/**
	 * Gets the value of the typeName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * Sets the value of the typeName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTypeName(String value) {
		this.typeName = value;
	}

	/**
	 * Gets the value of the levelName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLevelName() {
		return levelName;
	}

	/**
	 * Sets the value of the levelName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLevelName(String value) {
		this.levelName = value;
	}

	/**
	 * Gets the value of the genderName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getGenderName() {
		return genderName;
	}

	/**
	 * Sets the value of the genderName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setGenderName(String value) {
		this.genderName = value;
	}

	/**
	 * Gets the value of the partyIdentificationType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPartyIdentificationType() {
		return partyIdentificationType;
	}

	/**
	 * Sets the value of the partyIdentificationType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPartyIdentificationType(String value) {
		this.partyIdentificationType = value;
	}

	/**
	 * Gets the value of the partyIdentificationNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPartyIdentificationNo() {
		return partyIdentificationNo;
	}

	/**
	 * Sets the value of the partyIdentificationNo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPartyIdentificationNo(String value) {
		this.partyIdentificationNo = value;
	}

	/**
	 * Gets the value of the fixedTel property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFixedTel() {
		return fixedTel;
	}

	/**
	 * Sets the value of the fixedTel property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFixedTel(String value) {
		this.fixedTel = value;
	}

	/**
	 * Gets the value of the mobile property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * Sets the value of the mobile property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMobile(String value) {
		this.mobile = value;
	}

	/**
	 * Gets the value of the contactMan property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getContactMan() {
		return contactMan;
	}

	/**
	 * Sets the value of the contactMan property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setContactMan(String value) {
		this.contactMan = value;
	}

	/**
	 * Gets the value of the contactManFixedTel property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getContactManFixedTel() {
		return contactManFixedTel;
	}

	/**
	 * Sets the value of the contactManFixedTel property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setContactManFixedTel(String value) {
		this.contactManFixedTel = value;
	}

	/**
	 * Gets the value of the contactManMobile property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getContactManMobile() {
		return contactManMobile;
	}

	/**
	 * Sets the value of the contactManMobile property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setContactManMobile(String value) {
		this.contactManMobile = value;
	}

	/**
	 * Gets the value of the serviceChannel property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getServiceChannel() {
		return serviceChannel;
	}

	/**
	 * Sets the value of the serviceChannel property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setServiceChannel(String value) {
		this.serviceChannel = value;
	}

	/**
	 * Gets the value of the welfareAgreement property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getWelfareAgreement() {
		return welfareAgreement;
	}

	/**
	 * Sets the value of the welfareAgreement property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setWelfareAgreement(String value) {
		this.welfareAgreement = value;
	}

	/**
	 * Gets the value of the accountName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAccountName() {
		return accountName;
	}

	/**
	 * Sets the value of the accountName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAccountName(String value) {
		this.accountName = value;
	}

	/**
	 * Gets the value of the bankName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * Sets the value of the bankName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBankName(String value) {
		this.bankName = value;
	}

	/**
	 * Gets the value of the accountNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAccountNo() {
		return accountNo;
	}

	/**
	 * Sets the value of the accountNo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAccountNo(String value) {
		this.accountNo = value;
	}

	/**
	 * Gets the value of the customerGroup property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCustomerGroup() {
		return customerGroup;
	}

	/**
	 * Sets the value of the customerGroup property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCustomerGroup(String value) {
		this.customerGroup = value;
	}

	/**
	 * Gets the value of the areaInfos property.
	 * 
	 * @return possible object is {@link CustomerInfo.AreaInfos }
	 * 
	 */
	public CustomerInfo.AreaInfos getAreaInfos() {
		return areaInfos;
	}

	/**
	 * Sets the value of the areaInfos property.
	 * 
	 * @param value
	 *            allowed object is {@link CustomerInfo.AreaInfos }
	 * 
	 */
	public void setAreaInfos(CustomerInfo.AreaInfos value) {
		this.areaInfos = value;
	}

	/**
	 * Gets the value of the remark property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * Sets the value of the remark property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRemark(String value) {
		this.remark = value;
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
	 *         &lt;element name="areaInfo" type="{http://www.huge.com/IUnifiedEChannelService/}areaInfo" maxOccurs="unbounded" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "areaInfo" })
	public static class AreaInfos {

		protected List<AreaInfo> areaInfo;

		/**
		 * Gets the value of the areaInfo property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the areaInfo property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getAreaInfo().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link AreaInfo }
		 * 
		 * 
		 */
		public List<AreaInfo> getAreaInfo() {
			if (areaInfo == null) {
				areaInfo = new ArrayList<AreaInfo>();
			}
			return this.areaInfo;
		}

	}

}
