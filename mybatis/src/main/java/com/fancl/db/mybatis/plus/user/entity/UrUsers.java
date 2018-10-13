package com.fancl.db.mybatis.plus.user.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author fancl
 * @since 2018-10-13
 */
public class UrUsers implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("USER_ID")
    private Integer userId;

    @TableField("USER_NAME")
    private String userName;

    @TableField("USER_ORG_ID")
    private String userOrgId;

    @TableField("USER_LOGIN_NAME")
    private String userLoginName;

    @TableField("USER_LOGIN_PASSWD")
    private String userLoginPasswd;

    @TableField("USER_LOGIN_DATE")
    private LocalDateTime userLoginDate;

    @TableField("USER_PHONE")
    private String userPhone;

    @TableField("USER_MOBILE")
    private String userMobile;

    @TableField("USER_EMAIL")
    private String userEmail;

    @TableField("USER_WORK_NO")
    private String userWorkNo;

    @TableField("USER_SEX")
    private String userSex;

    @TableField("USER_BIRTHDAY")
    private LocalDateTime userBirthday;

    @TableField("USER_WORKED")
    private String userWorked;

    @TableField("USER_EDUCATION")
    private String userEducation;

    @TableField("USER_ORIGIN")
    private String userOrigin;

    @TableField("USER_TITLE")
    private String userTitle;

    @TableField("USER_WORK_LIMIT")
    private String userWorkLimit;

    @TableField("USER_IDENT_NO")
    private String userIdentNo;

    @TableField("USER_IN_DATE")
    private LocalDateTime userInDate;

    @TableField("USER_AREA")
    private String userArea;

    @TableField("USER_ADDRESS")
    private String userAddress;

    @TableField("USER_POSTAL")
    private String userPostal;

    @TableField("USER_ACTIVE")
    private Integer userActive;

    @TableField("USER_OUT")
    private Integer userOut;

    @TableField("USER_OUT_DATE")
    private LocalDateTime userOutDate;

    @TableField("USER_NOTE")
    private String userNote;

    @TableField("USER_CREATE_ID")
    private String userCreateId;

    @TableField("USER_CREATE_DATE")
    private LocalDateTime userCreateDate;

    @TableField("USER_UPDATE_ID")
    private String userUpdateId;

    @TableField("USER_UPDATE_DATE")
    private LocalDateTime userUpdateDate;

    @TableField("USER_PASSWD_CHANGE_DATE")
    private LocalDateTime userPasswdChangeDate;

    @TableField("USER_UNLOCK_DATE")
    private LocalDateTime userUnlockDate;

    @TableField("USER_ADMIN")
    private Integer userAdmin;

    @TableField("USER_UNUSED1")
    private String userUnused1;

    @TableField("USER_UNUSED2")
    private String userUnused2;

    @TableField("USER_UNUSED3")
    private Integer userUnused3;

    @TableField("USER_UNUSED4")
    private Integer userUnused4;

    @TableField("USER_BEFORE_NINE")
    private Integer userBeforeNine;

    @TableField("USER_GATHER")
    private Integer userGather;

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
        this.userName = userName;
    }
    public String getUserOrgId() {
        return userOrgId;
    }

    public void setUserOrgId(String userOrgId) {
        this.userOrgId = userOrgId;
    }
    public String getUserLoginName() {
        return userLoginName;
    }

    public void setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName;
    }
    public String getUserLoginPasswd() {
        return userLoginPasswd;
    }

    public void setUserLoginPasswd(String userLoginPasswd) {
        this.userLoginPasswd = userLoginPasswd;
    }
    public LocalDateTime getUserLoginDate() {
        return userLoginDate;
    }

    public void setUserLoginDate(LocalDateTime userLoginDate) {
        this.userLoginDate = userLoginDate;
    }
    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    public String getUserWorkNo() {
        return userWorkNo;
    }

    public void setUserWorkNo(String userWorkNo) {
        this.userWorkNo = userWorkNo;
    }
    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }
    public LocalDateTime getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(LocalDateTime userBirthday) {
        this.userBirthday = userBirthday;
    }
    public String getUserWorked() {
        return userWorked;
    }

    public void setUserWorked(String userWorked) {
        this.userWorked = userWorked;
    }
    public String getUserEducation() {
        return userEducation;
    }

    public void setUserEducation(String userEducation) {
        this.userEducation = userEducation;
    }
    public String getUserOrigin() {
        return userOrigin;
    }

    public void setUserOrigin(String userOrigin) {
        this.userOrigin = userOrigin;
    }
    public String getUserTitle() {
        return userTitle;
    }

    public void setUserTitle(String userTitle) {
        this.userTitle = userTitle;
    }
    public String getUserWorkLimit() {
        return userWorkLimit;
    }

    public void setUserWorkLimit(String userWorkLimit) {
        this.userWorkLimit = userWorkLimit;
    }
    public String getUserIdentNo() {
        return userIdentNo;
    }

    public void setUserIdentNo(String userIdentNo) {
        this.userIdentNo = userIdentNo;
    }
    public LocalDateTime getUserInDate() {
        return userInDate;
    }

    public void setUserInDate(LocalDateTime userInDate) {
        this.userInDate = userInDate;
    }
    public String getUserArea() {
        return userArea;
    }

    public void setUserArea(String userArea) {
        this.userArea = userArea;
    }
    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
    public String getUserPostal() {
        return userPostal;
    }

    public void setUserPostal(String userPostal) {
        this.userPostal = userPostal;
    }
    public Integer getUserActive() {
        return userActive;
    }

    public void setUserActive(Integer userActive) {
        this.userActive = userActive;
    }
    public Integer getUserOut() {
        return userOut;
    }

    public void setUserOut(Integer userOut) {
        this.userOut = userOut;
    }
    public LocalDateTime getUserOutDate() {
        return userOutDate;
    }

    public void setUserOutDate(LocalDateTime userOutDate) {
        this.userOutDate = userOutDate;
    }
    public String getUserNote() {
        return userNote;
    }

    public void setUserNote(String userNote) {
        this.userNote = userNote;
    }
    public String getUserCreateId() {
        return userCreateId;
    }

    public void setUserCreateId(String userCreateId) {
        this.userCreateId = userCreateId;
    }
    public LocalDateTime getUserCreateDate() {
        return userCreateDate;
    }

    public void setUserCreateDate(LocalDateTime userCreateDate) {
        this.userCreateDate = userCreateDate;
    }
    public String getUserUpdateId() {
        return userUpdateId;
    }

    public void setUserUpdateId(String userUpdateId) {
        this.userUpdateId = userUpdateId;
    }
    public LocalDateTime getUserUpdateDate() {
        return userUpdateDate;
    }

    public void setUserUpdateDate(LocalDateTime userUpdateDate) {
        this.userUpdateDate = userUpdateDate;
    }
    public LocalDateTime getUserPasswdChangeDate() {
        return userPasswdChangeDate;
    }

    public void setUserPasswdChangeDate(LocalDateTime userPasswdChangeDate) {
        this.userPasswdChangeDate = userPasswdChangeDate;
    }
    public LocalDateTime getUserUnlockDate() {
        return userUnlockDate;
    }

    public void setUserUnlockDate(LocalDateTime userUnlockDate) {
        this.userUnlockDate = userUnlockDate;
    }
    public Integer getUserAdmin() {
        return userAdmin;
    }

    public void setUserAdmin(Integer userAdmin) {
        this.userAdmin = userAdmin;
    }
    public String getUserUnused1() {
        return userUnused1;
    }

    public void setUserUnused1(String userUnused1) {
        this.userUnused1 = userUnused1;
    }
    public String getUserUnused2() {
        return userUnused2;
    }

    public void setUserUnused2(String userUnused2) {
        this.userUnused2 = userUnused2;
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
    public Integer getUserBeforeNine() {
        return userBeforeNine;
    }

    public void setUserBeforeNine(Integer userBeforeNine) {
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
        return "UrUsers{" +
        "userId=" + userId +
        ", userName=" + userName +
        ", userOrgId=" + userOrgId +
        ", userLoginName=" + userLoginName +
        ", userLoginPasswd=" + userLoginPasswd +
        ", userLoginDate=" + userLoginDate +
        ", userPhone=" + userPhone +
        ", userMobile=" + userMobile +
        ", userEmail=" + userEmail +
        ", userWorkNo=" + userWorkNo +
        ", userSex=" + userSex +
        ", userBirthday=" + userBirthday +
        ", userWorked=" + userWorked +
        ", userEducation=" + userEducation +
        ", userOrigin=" + userOrigin +
        ", userTitle=" + userTitle +
        ", userWorkLimit=" + userWorkLimit +
        ", userIdentNo=" + userIdentNo +
        ", userInDate=" + userInDate +
        ", userArea=" + userArea +
        ", userAddress=" + userAddress +
        ", userPostal=" + userPostal +
        ", userActive=" + userActive +
        ", userOut=" + userOut +
        ", userOutDate=" + userOutDate +
        ", userNote=" + userNote +
        ", userCreateId=" + userCreateId +
        ", userCreateDate=" + userCreateDate +
        ", userUpdateId=" + userUpdateId +
        ", userUpdateDate=" + userUpdateDate +
        ", userPasswdChangeDate=" + userPasswdChangeDate +
        ", userUnlockDate=" + userUnlockDate +
        ", userAdmin=" + userAdmin +
        ", userUnused1=" + userUnused1 +
        ", userUnused2=" + userUnused2 +
        ", userUnused3=" + userUnused3 +
        ", userUnused4=" + userUnused4 +
        ", userBeforeNine=" + userBeforeNine +
        ", userGather=" + userGather +
        "}";
    }
}
