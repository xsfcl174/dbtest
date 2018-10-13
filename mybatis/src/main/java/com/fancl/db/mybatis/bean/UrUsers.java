package com.fancl.db.mybatis.bean;

import java.io.Serializable;
import java.util.Date;

public class UrUsers implements Serializable {
    private Integer userId;

    private String userName;

    private String userOrgId;

    private String userLoginName;

    private String userLoginPasswd;

    private Date userLoginDate;

    private String userPhone;

    private String userMobile;

    private String userEmail;

    private String userWorkNo;

    private String userSex;

    private Date userBirthday;

    private String userWorked;

    private String userEducation;

    private String userOrigin;

    private String userTitle;

    private String userWorkLimit;

    private String userIdentNo;

    private Date userInDate;

    private String userArea;

    private String userAddress;

    private String userPostal;

    private Short userActive;

    private Short userOut;

    private Date userOutDate;

    private String userNote;

    private String userCreateId;

    private Date userCreateDate;

    private String userUpdateId;

    private Date userUpdateDate;

    private Date userPasswdChangeDate;

    private Date userUnlockDate;

    private Short userAdmin;

    private String userUnused1;

    private String userUnused2;

    private Integer userUnused3;

    private Integer userUnused4;

    private Short userBeforeNine;

    private Integer userGather;

    private static final long serialVersionUID = 1L;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserOrgId() {
        return userOrgId;
    }

    public void setUserOrgId(String userOrgId) {
        this.userOrgId = userOrgId == null ? null : userOrgId.trim();
    }

    public String getUserLoginName() {
        return userLoginName;
    }

    public void setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName == null ? null : userLoginName.trim();
    }

    public String getUserLoginPasswd() {
        return userLoginPasswd;
    }

    public void setUserLoginPasswd(String userLoginPasswd) {
        this.userLoginPasswd = userLoginPasswd == null ? null : userLoginPasswd.trim();
    }

    public Date getUserLoginDate() {
        return userLoginDate;
    }

    public void setUserLoginDate(Date userLoginDate) {
        this.userLoginDate = userLoginDate;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserWorkNo() {
        return userWorkNo;
    }

    public void setUserWorkNo(String userWorkNo) {
        this.userWorkNo = userWorkNo == null ? null : userWorkNo.trim();
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserWorked() {
        return userWorked;
    }

    public void setUserWorked(String userWorked) {
        this.userWorked = userWorked == null ? null : userWorked.trim();
    }

    public String getUserEducation() {
        return userEducation;
    }

    public void setUserEducation(String userEducation) {
        this.userEducation = userEducation == null ? null : userEducation.trim();
    }

    public String getUserOrigin() {
        return userOrigin;
    }

    public void setUserOrigin(String userOrigin) {
        this.userOrigin = userOrigin == null ? null : userOrigin.trim();
    }

    public String getUserTitle() {
        return userTitle;
    }

    public void setUserTitle(String userTitle) {
        this.userTitle = userTitle == null ? null : userTitle.trim();
    }

    public String getUserWorkLimit() {
        return userWorkLimit;
    }

    public void setUserWorkLimit(String userWorkLimit) {
        this.userWorkLimit = userWorkLimit == null ? null : userWorkLimit.trim();
    }

    public String getUserIdentNo() {
        return userIdentNo;
    }

    public void setUserIdentNo(String userIdentNo) {
        this.userIdentNo = userIdentNo == null ? null : userIdentNo.trim();
    }

    public Date getUserInDate() {
        return userInDate;
    }

    public void setUserInDate(Date userInDate) {
        this.userInDate = userInDate;
    }

    public String getUserArea() {
        return userArea;
    }

    public void setUserArea(String userArea) {
        this.userArea = userArea == null ? null : userArea.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public String getUserPostal() {
        return userPostal;
    }

    public void setUserPostal(String userPostal) {
        this.userPostal = userPostal == null ? null : userPostal.trim();
    }

    public Short getUserActive() {
        return userActive;
    }

    public void setUserActive(Short userActive) {
        this.userActive = userActive;
    }

    public Short getUserOut() {
        return userOut;
    }

    public void setUserOut(Short userOut) {
        this.userOut = userOut;
    }

    public Date getUserOutDate() {
        return userOutDate;
    }

    public void setUserOutDate(Date userOutDate) {
        this.userOutDate = userOutDate;
    }

    public String getUserNote() {
        return userNote;
    }

    public void setUserNote(String userNote) {
        this.userNote = userNote == null ? null : userNote.trim();
    }

    public String getUserCreateId() {
        return userCreateId;
    }

    public void setUserCreateId(String userCreateId) {
        this.userCreateId = userCreateId == null ? null : userCreateId.trim();
    }

    public Date getUserCreateDate() {
        return userCreateDate;
    }

    public void setUserCreateDate(Date userCreateDate) {
        this.userCreateDate = userCreateDate;
    }

    public String getUserUpdateId() {
        return userUpdateId;
    }

    public void setUserUpdateId(String userUpdateId) {
        this.userUpdateId = userUpdateId == null ? null : userUpdateId.trim();
    }

    public Date getUserUpdateDate() {
        return userUpdateDate;
    }

    public void setUserUpdateDate(Date userUpdateDate) {
        this.userUpdateDate = userUpdateDate;
    }

    public Date getUserPasswdChangeDate() {
        return userPasswdChangeDate;
    }

    public void setUserPasswdChangeDate(Date userPasswdChangeDate) {
        this.userPasswdChangeDate = userPasswdChangeDate;
    }

    public Date getUserUnlockDate() {
        return userUnlockDate;
    }

    public void setUserUnlockDate(Date userUnlockDate) {
        this.userUnlockDate = userUnlockDate;
    }

    public Short getUserAdmin() {
        return userAdmin;
    }

    public void setUserAdmin(Short userAdmin) {
        this.userAdmin = userAdmin;
    }

    public String getUserUnused1() {
        return userUnused1;
    }

    public void setUserUnused1(String userUnused1) {
        this.userUnused1 = userUnused1 == null ? null : userUnused1.trim();
    }

    public String getUserUnused2() {
        return userUnused2;
    }

    public void setUserUnused2(String userUnused2) {
        this.userUnused2 = userUnused2 == null ? null : userUnused2.trim();
    }

    public Integer getUserUnused3() {
        return userUnused3;
    }

    public void setUserUnused3(Integer userUnused3) {
        this.userUnused3 = userUnused3;
    }

    public Integer getUserUnused4() {
        return userUnused4;
    }

    public void setUserUnused4(Integer userUnused4) {
        this.userUnused4 = userUnused4;
    }

    public Short getUserBeforeNine() {
        return userBeforeNine;
    }

    public void setUserBeforeNine(Short userBeforeNine) {
        this.userBeforeNine = userBeforeNine;
    }

    public Integer getUserGather() {
        return userGather;
    }

    public void setUserGather(Integer userGather) {
        this.userGather = userGather;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", userOrgId=").append(userOrgId);
        sb.append(", userLoginName=").append(userLoginName);
        sb.append(", userLoginPasswd=").append(userLoginPasswd);
        sb.append(", userLoginDate=").append(userLoginDate);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", userMobile=").append(userMobile);
        sb.append(", userEmail=").append(userEmail);
        sb.append(", userWorkNo=").append(userWorkNo);
        sb.append(", userSex=").append(userSex);
        sb.append(", userBirthday=").append(userBirthday);
        sb.append(", userWorked=").append(userWorked);
        sb.append(", userEducation=").append(userEducation);
        sb.append(", userOrigin=").append(userOrigin);
        sb.append(", userTitle=").append(userTitle);
        sb.append(", userWorkLimit=").append(userWorkLimit);
        sb.append(", userIdentNo=").append(userIdentNo);
        sb.append(", userInDate=").append(userInDate);
        sb.append(", userArea=").append(userArea);
        sb.append(", userAddress=").append(userAddress);
        sb.append(", userPostal=").append(userPostal);
        sb.append(", userActive=").append(userActive);
        sb.append(", userOut=").append(userOut);
        sb.append(", userOutDate=").append(userOutDate);
        sb.append(", userNote=").append(userNote);
        sb.append(", userCreateId=").append(userCreateId);
        sb.append(", userCreateDate=").append(userCreateDate);
        sb.append(", userUpdateId=").append(userUpdateId);
        sb.append(", userUpdateDate=").append(userUpdateDate);
        sb.append(", userPasswdChangeDate=").append(userPasswdChangeDate);
        sb.append(", userUnlockDate=").append(userUnlockDate);
        sb.append(", userAdmin=").append(userAdmin);
        sb.append(", userUnused1=").append(userUnused1);
        sb.append(", userUnused2=").append(userUnused2);
        sb.append(", userUnused3=").append(userUnused3);
        sb.append(", userUnused4=").append(userUnused4);
        sb.append(", userBeforeNine=").append(userBeforeNine);
        sb.append(", userGather=").append(userGather);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}