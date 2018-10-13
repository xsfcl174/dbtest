package com.fancl.db.mybatis.bean;

import java.io.Serializable;

public class SysSubFunc implements Serializable {
    private Integer sfId;

    private Integer sfFnId;

    private String sfName;

    private String sfNameId;

    private String sfPosition;

    private String sfIcon;

    private Short sfUseKey;

    private String sfContent;

    private Short sfUseMarco;

    private String sfConfirmData;

    private String sfDialogTitle;

    private String sfInfo;

    private Integer sfOrder;

    private String sfPage;

    private static final long serialVersionUID = 1L;

    public Integer getSfId() {
        return sfId;
    }

    public void setSfId(Integer sfId) {
        this.sfId = sfId;
    }

    public Integer getSfFnId() {
        return sfFnId;
    }

    public void setSfFnId(Integer sfFnId) {
        this.sfFnId = sfFnId;
    }

    public String getSfName() {
        return sfName;
    }

    public void setSfName(String sfName) {
        this.sfName = sfName == null ? null : sfName.trim();
    }

    public String getSfNameId() {
        return sfNameId;
    }

    public void setSfNameId(String sfNameId) {
        this.sfNameId = sfNameId == null ? null : sfNameId.trim();
    }

    public String getSfPosition() {
        return sfPosition;
    }

    public void setSfPosition(String sfPosition) {
        this.sfPosition = sfPosition == null ? null : sfPosition.trim();
    }

    public String getSfIcon() {
        return sfIcon;
    }

    public void setSfIcon(String sfIcon) {
        this.sfIcon = sfIcon == null ? null : sfIcon.trim();
    }

    public Short getSfUseKey() {
        return sfUseKey;
    }

    public void setSfUseKey(Short sfUseKey) {
        this.sfUseKey = sfUseKey;
    }

    public String getSfContent() {
        return sfContent;
    }

    public void setSfContent(String sfContent) {
        this.sfContent = sfContent == null ? null : sfContent.trim();
    }

    public Short getSfUseMarco() {
        return sfUseMarco;
    }

    public void setSfUseMarco(Short sfUseMarco) {
        this.sfUseMarco = sfUseMarco;
    }

    public String getSfConfirmData() {
        return sfConfirmData;
    }

    public void setSfConfirmData(String sfConfirmData) {
        this.sfConfirmData = sfConfirmData == null ? null : sfConfirmData.trim();
    }

    public String getSfDialogTitle() {
        return sfDialogTitle;
    }

    public void setSfDialogTitle(String sfDialogTitle) {
        this.sfDialogTitle = sfDialogTitle == null ? null : sfDialogTitle.trim();
    }

    public String getSfInfo() {
        return sfInfo;
    }

    public void setSfInfo(String sfInfo) {
        this.sfInfo = sfInfo == null ? null : sfInfo.trim();
    }

    public Integer getSfOrder() {
        return sfOrder;
    }

    public void setSfOrder(Integer sfOrder) {
        this.sfOrder = sfOrder;
    }

    public String getSfPage() {
        return sfPage;
    }

    public void setSfPage(String sfPage) {
        this.sfPage = sfPage == null ? null : sfPage.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sfId=").append(sfId);
        sb.append(", sfFnId=").append(sfFnId);
        sb.append(", sfName=").append(sfName);
        sb.append(", sfNameId=").append(sfNameId);
        sb.append(", sfPosition=").append(sfPosition);
        sb.append(", sfIcon=").append(sfIcon);
        sb.append(", sfUseKey=").append(sfUseKey);
        sb.append(", sfContent=").append(sfContent);
        sb.append(", sfUseMarco=").append(sfUseMarco);
        sb.append(", sfConfirmData=").append(sfConfirmData);
        sb.append(", sfDialogTitle=").append(sfDialogTitle);
        sb.append(", sfInfo=").append(sfInfo);
        sb.append(", sfOrder=").append(sfOrder);
        sb.append(", sfPage=").append(sfPage);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}