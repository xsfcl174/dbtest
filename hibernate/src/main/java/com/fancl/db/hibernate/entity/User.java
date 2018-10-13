package com.fancl.db.hibernate.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "ur_users", catalog = "user")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "table_gen")
    @TableGenerator(name = "table_gen",//name对应@GeneratedValue中generator 引用的名字
            table = "ident_generator", //对应数据库表中的名字,表键-字段名
            pkColumnName = "seq_name", //指定主键的名字
            pkColumnValue = "user_id",//指定下次插入主键时使用默认的值，表键-字段值
            valueColumnName = "seq_id", //该主键当前所生成的值，它的值将会随着每次创建累加,表值-字段名 
            initialValue = 1, //初始化值
            allocationSize = 1//累加值，每次累加1
    )
    @Column(name = "USER_ID")
    private Integer userId;
    @Column(name = "USER_NAME")
    private String name;
    @Column(name = "USER_LOGIN_NAME")
    private String username;
    @Column(name = "USER_ORG_ID")
    private String orgId;
    @Column(name = "USER_LOGIN_PASSWD")
    private String password;
    @Column(name = "USER_LOGIN_DATE")
    private Date loginDate;
    @Column(name = "USER_PHONE")
    private String phone;
    @Column(name = "USER_MOBILE")
    private String mobile;
    @Column(name = "USER_EMAIL")
    private String email;
    @Column(name = "USER_WORK_NO")
    private String workNo;
    @Column(name = "USER_SEX")
    private String sex;
    @Column(name = "USER_BIRTHDAY")
    private Date birthday;
    @Column(name = "USER_WORKED")
    private String worked;
    @Column(name = "USER_EDUCATION")
    private String education;
    @Column(name = "USER_ORIGIN")
    private String origin;
    @Column(name = "USER_TITLE")
    private String title;
    @Column(name = "USER_WORK_LIMIT")
    private String workLimit;
    @Column(name = "USER_IDENT_NO")
    private String identNo;
    @Column(name = "USER_IN_DATE")
    private Date inDate;
    @Column(name = "USER_AREA")
    private String area;
    @Column(name = "USER_ADDRESS")
    private String address;
    @Column(name = "USER_POSTAL")
    private String postal;
    @Column(name = "USER_ACTIVE")
    private boolean active;
    @Column(name = "USER_OUT")
    private boolean out;
    @Column(name = "USER_OUT_DATE")
    private Date outDate;
    @Column(name = "USER_NOTE")
    private String note;
    @Column(name = "USER_CREATE_ID")
    private String createId;
    @Column(name = "USER_CREATE_DATE")
    private Date createDate;
    @Column(name = "USER_UPDATE_ID")
    private String updateId;
    @Column(name = "USER_UPDATE_DATE")
    private Date updateDate;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWorkNo() {
        return workNo;
    }

    public void setWorkNo(String workNo) {
        this.workNo = workNo;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getWorked() {
        return worked;
    }

    public void setWorked(String worked) {
        this.worked = worked;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWorkLimit() {
        return workLimit;
    }

    public void setWorkLimit(String workLimit) {
        this.workLimit = workLimit;
    }

    public String getIdentNo() {
        return identNo;
    }

    public void setIdentNo(String identNo) {
        this.identNo = identNo;
    }

    public Date getInDate() {
        return inDate;
    }

    public void setInDate(Date inDate) {
        this.inDate = inDate;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isOut() {
        return out;
    }

    public void setOut(boolean out) {
        this.out = out;
    }

    public Date getOutDate() {
        return outDate;
    }

    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateId() {
        return updateId;
    }

    public void setUpdateId(String updateId) {
        this.updateId = updateId;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
