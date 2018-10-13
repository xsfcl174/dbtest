package com.fancl.db.mybatis.bean;

import java.io.Serializable;
import java.util.Date;

public class SysOrganization implements Serializable {
    private String orgId;

    private String orgName;

    private String orgCode;

    private String orgCity;

    private String orgLevel;

    private String orgLayer;

    private String orgParentId;

    private Short orgIsLeaf;

    private String orgManager;

    private String orgManagerPhone;

    private String orgAddress;

    private String orgBillAddress;

    private String orgPostCode;

    private String orgTelephone;

    private String orgUnite;

    private Short orgActive;

    private String orgNote;

    private String orgCreateId;

    private Date orgCreateDate;

    private String orgUpdateId;

    private Date orgUpdateDate;

    private String orgUnused1;

    private String orgUnused2;

    private Integer orgUnused3;

    private Integer orgUnused4;

    private static final long serialVersionUID = 1L;

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    public String getOrgCity() {
        return orgCity;
    }

    public void setOrgCity(String orgCity) {
        this.orgCity = orgCity == null ? null : orgCity.trim();
    }

    public String getOrgLevel() {
        return orgLevel;
    }

    public void setOrgLevel(String orgLevel) {
        this.orgLevel = orgLevel == null ? null : orgLevel.trim();
    }

    public String getOrgLayer() {
        return orgLayer;
    }

    public void setOrgLayer(String orgLayer) {
        this.orgLayer = orgLayer == null ? null : orgLayer.trim();
    }

    public String getOrgParentId() {
        return orgParentId;
    }

    public void setOrgParentId(String orgParentId) {
        this.orgParentId = orgParentId == null ? null : orgParentId.trim();
    }

    public Short getOrgIsLeaf() {
        return orgIsLeaf;
    }

    public void setOrgIsLeaf(Short orgIsLeaf) {
        this.orgIsLeaf = orgIsLeaf;
    }

    public String getOrgManager() {
        return orgManager;
    }

    public void setOrgManager(String orgManager) {
        this.orgManager = orgManager == null ? null : orgManager.trim();
    }

    public String getOrgManagerPhone() {
        return orgManagerPhone;
    }

    public void setOrgManagerPhone(String orgManagerPhone) {
        this.orgManagerPhone = orgManagerPhone == null ? null : orgManagerPhone.trim();
    }

    public String getOrgAddress() {
        return orgAddress;
    }

    public void setOrgAddress(String orgAddress) {
        this.orgAddress = orgAddress == null ? null : orgAddress.trim();
    }

    public String getOrgBillAddress() {
        return orgBillAddress;
    }

    public void setOrgBillAddress(String orgBillAddress) {
        this.orgBillAddress = orgBillAddress == null ? null : orgBillAddress.trim();
    }

    public String getOrgPostCode() {
        return orgPostCode;
    }

    public void setOrgPostCode(String orgPostCode) {
        this.orgPostCode = orgPostCode == null ? null : orgPostCode.trim();
    }

    public String getOrgTelephone() {
        return orgTelephone;
    }

    public void setOrgTelephone(String orgTelephone) {
        this.orgTelephone = orgTelephone == null ? null : orgTelephone.trim();
    }

    public String getOrgUnite() {
        return orgUnite;
    }

    public void setOrgUnite(String orgUnite) {
        this.orgUnite = orgUnite == null ? null : orgUnite.trim();
    }

    public Short getOrgActive() {
        return orgActive;
    }

    public void setOrgActive(Short orgActive) {
        this.orgActive = orgActive;
    }

    public String getOrgNote() {
        return orgNote;
    }

    public void setOrgNote(String orgNote) {
        this.orgNote = orgNote == null ? null : orgNote.trim();
    }

    public String getOrgCreateId() {
        return orgCreateId;
    }

    public void setOrgCreateId(String orgCreateId) {
        this.orgCreateId = orgCreateId == null ? null : orgCreateId.trim();
    }

    public Date getOrgCreateDate() {
        return orgCreateDate;
    }

    public void setOrgCreateDate(Date orgCreateDate) {
        this.orgCreateDate = orgCreateDate;
    }

    public String getOrgUpdateId() {
        return orgUpdateId;
    }

    public void setOrgUpdateId(String orgUpdateId) {
        this.orgUpdateId = orgUpdateId == null ? null : orgUpdateId.trim();
    }

    public Date getOrgUpdateDate() {
        return orgUpdateDate;
    }

    public void setOrgUpdateDate(Date orgUpdateDate) {
        this.orgUpdateDate = orgUpdateDate;
    }

    public String getOrgUnused1() {
        return orgUnused1;
    }

    public void setOrgUnused1(String orgUnused1) {
        this.orgUnused1 = orgUnused1 == null ? null : orgUnused1.trim();
    }

    public String getOrgUnused2() {
        return orgUnused2;
    }

    public void setOrgUnused2(String orgUnused2) {
        this.orgUnused2 = orgUnused2 == null ? null : orgUnused2.trim();
    }

    public Integer getOrgUnused3() {
        return orgUnused3;
    }

    public void setOrgUnused3(Integer orgUnused3) {
        this.orgUnused3 = orgUnused3;
    }

    public Integer getOrgUnused4() {
        return orgUnused4;
    }

    public void setOrgUnused4(Integer orgUnused4) {
        this.orgUnused4 = orgUnused4;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orgId=").append(orgId);
        sb.append(", orgName=").append(orgName);
        sb.append(", orgCode=").append(orgCode);
        sb.append(", orgCity=").append(orgCity);
        sb.append(", orgLevel=").append(orgLevel);
        sb.append(", orgLayer=").append(orgLayer);
        sb.append(", orgParentId=").append(orgParentId);
        sb.append(", orgIsLeaf=").append(orgIsLeaf);
        sb.append(", orgManager=").append(orgManager);
        sb.append(", orgManagerPhone=").append(orgManagerPhone);
        sb.append(", orgAddress=").append(orgAddress);
        sb.append(", orgBillAddress=").append(orgBillAddress);
        sb.append(", orgPostCode=").append(orgPostCode);
        sb.append(", orgTelephone=").append(orgTelephone);
        sb.append(", orgUnite=").append(orgUnite);
        sb.append(", orgActive=").append(orgActive);
        sb.append(", orgNote=").append(orgNote);
        sb.append(", orgCreateId=").append(orgCreateId);
        sb.append(", orgCreateDate=").append(orgCreateDate);
        sb.append(", orgUpdateId=").append(orgUpdateId);
        sb.append(", orgUpdateDate=").append(orgUpdateDate);
        sb.append(", orgUnused1=").append(orgUnused1);
        sb.append(", orgUnused2=").append(orgUnused2);
        sb.append(", orgUnused3=").append(orgUnused3);
        sb.append(", orgUnused4=").append(orgUnused4);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}