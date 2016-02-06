package com.sdyx.echannel.vboss.model;

import java.util.Date;

public class TbVbossOrder {
    private Long id;

    private Date createAt;

    private Date modifyAt;

    private String disorderDate;

    private String orderCode;

    private String orderDate;

    private String payOrderDate;

    private Double price;

    private Integer status;

    private Integer type;

    private String caNumber;

    private String customerid;

    private String operator;

    private String checkOrderDate;

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

    public String getDisorderDate() {
        return disorderDate;
    }

    public void setDisorderDate(String disorderDate) {
        this.disorderDate = disorderDate == null ? null : disorderDate.trim();
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate == null ? null : orderDate.trim();
    }

    public String getPayOrderDate() {
        return payOrderDate;
    }

    public void setPayOrderDate(String payOrderDate) {
        this.payOrderDate = payOrderDate == null ? null : payOrderDate.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCaNumber() {
        return caNumber;
    }

    public void setCaNumber(String caNumber) {
        this.caNumber = caNumber == null ? null : caNumber.trim();
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid == null ? null : customerid.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getCheckOrderDate() {
        return checkOrderDate;
    }

    public void setCheckOrderDate(String checkOrderDate) {
        this.checkOrderDate = checkOrderDate == null ? null : checkOrderDate.trim();
    }
}