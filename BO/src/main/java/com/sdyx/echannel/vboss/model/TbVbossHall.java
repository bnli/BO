package com.sdyx.echannel.vboss.model;

import java.util.Date;

public class TbVbossHall {
    private Long id;

    private Date createAt;

    private Date modifyAt;

    private String name;

    private String address;

    private String telephone;

    private String operationRoleCode;

    private String organizationUnitCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getModifyAt() {
        return modifyAt;
    }

    public void setModifyAt(Date modifyAt) {
        this.modifyAt = modifyAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getOperationRoleCode() {
        return operationRoleCode;
    }

    public void setOperationRoleCode(String operationRoleCode) {
        this.operationRoleCode = operationRoleCode == null ? null : operationRoleCode.trim();
    }

    public String getOrganizationUnitCode() {
        return organizationUnitCode;
    }

    public void setOrganizationUnitCode(String organizationUnitCode) {
        this.organizationUnitCode = organizationUnitCode == null ? null : organizationUnitCode.trim();
    }
}