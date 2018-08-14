package com.hywa.pricepublish.dao.entity;

import java.util.Date;

public class PrInformEvent {
    /** 主键*/
    private String id;

    /** 举报事件*/
    private String name;

    /** 被举报人*/
    private String personBeAccused;

    /** 经营地址*/
    private String businessAddress;

    /** 注册地址*/
    private String registeredAddress;

    /** */
    private String description;

    /** 举报人id*/
    private String informerId;

    /** 办理人id*/
    private String operatorId;

    /** 创建时间*/
    private Date createTime;

    /** 创建人*/
    private String createUser;

    /** 修改时间*/
    private Date updateTime;

    /** 修改人*/
    private String updateUser;

    /** 举报编码*/
    private String code;

    /** 查询码*/
    private String searchCode;

    /** 处理进度 0未处理 1 处理中 2 处理完成*/
    private Short state;

    /** 办理结果 0无效办理 1证据不足 2 处理完成*/
    private Short evaluate;

    /** 监管局信息*/
    private String supervisiondepartment;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPersonBeAccused() {
        return personBeAccused;
    }

    public void setPersonBeAccused(String personBeAccused) {
        this.personBeAccused = personBeAccused == null ? null : personBeAccused.trim();
    }

    public String getBusinessAddress() {
        return businessAddress;
    }

    public void setBusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress == null ? null : businessAddress.trim();
    }

    public String getRegisteredAddress() {
        return registeredAddress;
    }

    public void setRegisteredAddress(String registeredAddress) {
        this.registeredAddress = registeredAddress == null ? null : registeredAddress.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getInformerId() {
        return informerId;
    }

    public void setInformerId(String informerId) {
        this.informerId = informerId == null ? null : informerId.trim();
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId == null ? null : operatorId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getSearchCode() {
        return searchCode;
    }

    public void setSearchCode(String searchCode) {
        this.searchCode = searchCode == null ? null : searchCode.trim();
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public Short getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(Short evaluate) {
        this.evaluate = evaluate;
    }

    public String getSupervisiondepartment() {
        return supervisiondepartment;
    }

    public void setSupervisiondepartment(String supervisiondepartment) {
        this.supervisiondepartment = supervisiondepartment == null ? null : supervisiondepartment.trim();
    }
}