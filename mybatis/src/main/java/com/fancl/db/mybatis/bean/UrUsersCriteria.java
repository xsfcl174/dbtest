package com.fancl.db.mybatis.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UrUsersCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public UrUsersCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo=pageNo;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setStartRow(Integer startRow) {
        this.startRow=startRow;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize=pageSize;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setFields(String fields) {
        this.fields=fields;
    }

    public String getFields() {
        return fields;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserOrgIdIsNull() {
            addCriterion("USER_ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserOrgIdIsNotNull() {
            addCriterion("USER_ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserOrgIdEqualTo(String value) {
            addCriterion("USER_ORG_ID =", value, "userOrgId");
            return (Criteria) this;
        }

        public Criteria andUserOrgIdNotEqualTo(String value) {
            addCriterion("USER_ORG_ID <>", value, "userOrgId");
            return (Criteria) this;
        }

        public Criteria andUserOrgIdGreaterThan(String value) {
            addCriterion("USER_ORG_ID >", value, "userOrgId");
            return (Criteria) this;
        }

        public Criteria andUserOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ORG_ID >=", value, "userOrgId");
            return (Criteria) this;
        }

        public Criteria andUserOrgIdLessThan(String value) {
            addCriterion("USER_ORG_ID <", value, "userOrgId");
            return (Criteria) this;
        }

        public Criteria andUserOrgIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ORG_ID <=", value, "userOrgId");
            return (Criteria) this;
        }

        public Criteria andUserOrgIdLike(String value) {
            addCriterion("USER_ORG_ID like", value, "userOrgId");
            return (Criteria) this;
        }

        public Criteria andUserOrgIdNotLike(String value) {
            addCriterion("USER_ORG_ID not like", value, "userOrgId");
            return (Criteria) this;
        }

        public Criteria andUserOrgIdIn(List<String> values) {
            addCriterion("USER_ORG_ID in", values, "userOrgId");
            return (Criteria) this;
        }

        public Criteria andUserOrgIdNotIn(List<String> values) {
            addCriterion("USER_ORG_ID not in", values, "userOrgId");
            return (Criteria) this;
        }

        public Criteria andUserOrgIdBetween(String value1, String value2) {
            addCriterion("USER_ORG_ID between", value1, value2, "userOrgId");
            return (Criteria) this;
        }

        public Criteria andUserOrgIdNotBetween(String value1, String value2) {
            addCriterion("USER_ORG_ID not between", value1, value2, "userOrgId");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameIsNull() {
            addCriterion("USER_LOGIN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameIsNotNull() {
            addCriterion("USER_LOGIN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameEqualTo(String value) {
            addCriterion("USER_LOGIN_NAME =", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameNotEqualTo(String value) {
            addCriterion("USER_LOGIN_NAME <>", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameGreaterThan(String value) {
            addCriterion("USER_LOGIN_NAME >", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_LOGIN_NAME >=", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameLessThan(String value) {
            addCriterion("USER_LOGIN_NAME <", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameLessThanOrEqualTo(String value) {
            addCriterion("USER_LOGIN_NAME <=", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameLike(String value) {
            addCriterion("USER_LOGIN_NAME like", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameNotLike(String value) {
            addCriterion("USER_LOGIN_NAME not like", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameIn(List<String> values) {
            addCriterion("USER_LOGIN_NAME in", values, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameNotIn(List<String> values) {
            addCriterion("USER_LOGIN_NAME not in", values, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameBetween(String value1, String value2) {
            addCriterion("USER_LOGIN_NAME between", value1, value2, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameNotBetween(String value1, String value2) {
            addCriterion("USER_LOGIN_NAME not between", value1, value2, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswdIsNull() {
            addCriterion("USER_LOGIN_PASSWD is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswdIsNotNull() {
            addCriterion("USER_LOGIN_PASSWD is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswdEqualTo(String value) {
            addCriterion("USER_LOGIN_PASSWD =", value, "userLoginPasswd");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswdNotEqualTo(String value) {
            addCriterion("USER_LOGIN_PASSWD <>", value, "userLoginPasswd");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswdGreaterThan(String value) {
            addCriterion("USER_LOGIN_PASSWD >", value, "userLoginPasswd");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_LOGIN_PASSWD >=", value, "userLoginPasswd");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswdLessThan(String value) {
            addCriterion("USER_LOGIN_PASSWD <", value, "userLoginPasswd");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswdLessThanOrEqualTo(String value) {
            addCriterion("USER_LOGIN_PASSWD <=", value, "userLoginPasswd");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswdLike(String value) {
            addCriterion("USER_LOGIN_PASSWD like", value, "userLoginPasswd");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswdNotLike(String value) {
            addCriterion("USER_LOGIN_PASSWD not like", value, "userLoginPasswd");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswdIn(List<String> values) {
            addCriterion("USER_LOGIN_PASSWD in", values, "userLoginPasswd");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswdNotIn(List<String> values) {
            addCriterion("USER_LOGIN_PASSWD not in", values, "userLoginPasswd");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswdBetween(String value1, String value2) {
            addCriterion("USER_LOGIN_PASSWD between", value1, value2, "userLoginPasswd");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswdNotBetween(String value1, String value2) {
            addCriterion("USER_LOGIN_PASSWD not between", value1, value2, "userLoginPasswd");
            return (Criteria) this;
        }

        public Criteria andUserLoginDateIsNull() {
            addCriterion("USER_LOGIN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginDateIsNotNull() {
            addCriterion("USER_LOGIN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginDateEqualTo(Date value) {
            addCriterion("USER_LOGIN_DATE =", value, "userLoginDate");
            return (Criteria) this;
        }

        public Criteria andUserLoginDateNotEqualTo(Date value) {
            addCriterion("USER_LOGIN_DATE <>", value, "userLoginDate");
            return (Criteria) this;
        }

        public Criteria andUserLoginDateGreaterThan(Date value) {
            addCriterion("USER_LOGIN_DATE >", value, "userLoginDate");
            return (Criteria) this;
        }

        public Criteria andUserLoginDateGreaterThanOrEqualTo(Date value) {
            addCriterion("USER_LOGIN_DATE >=", value, "userLoginDate");
            return (Criteria) this;
        }

        public Criteria andUserLoginDateLessThan(Date value) {
            addCriterion("USER_LOGIN_DATE <", value, "userLoginDate");
            return (Criteria) this;
        }

        public Criteria andUserLoginDateLessThanOrEqualTo(Date value) {
            addCriterion("USER_LOGIN_DATE <=", value, "userLoginDate");
            return (Criteria) this;
        }

        public Criteria andUserLoginDateIn(List<Date> values) {
            addCriterion("USER_LOGIN_DATE in", values, "userLoginDate");
            return (Criteria) this;
        }

        public Criteria andUserLoginDateNotIn(List<Date> values) {
            addCriterion("USER_LOGIN_DATE not in", values, "userLoginDate");
            return (Criteria) this;
        }

        public Criteria andUserLoginDateBetween(Date value1, Date value2) {
            addCriterion("USER_LOGIN_DATE between", value1, value2, "userLoginDate");
            return (Criteria) this;
        }

        public Criteria andUserLoginDateNotBetween(Date value1, Date value2) {
            addCriterion("USER_LOGIN_DATE not between", value1, value2, "userLoginDate");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("USER_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("USER_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("USER_PHONE =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("USER_PHONE <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("USER_PHONE >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("USER_PHONE >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("USER_PHONE <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("USER_PHONE <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("USER_PHONE like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("USER_PHONE not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("USER_PHONE in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("USER_PHONE not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("USER_PHONE between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("USER_PHONE not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserMobileIsNull() {
            addCriterion("USER_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andUserMobileIsNotNull() {
            addCriterion("USER_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andUserMobileEqualTo(String value) {
            addCriterion("USER_MOBILE =", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotEqualTo(String value) {
            addCriterion("USER_MOBILE <>", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileGreaterThan(String value) {
            addCriterion("USER_MOBILE >", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileGreaterThanOrEqualTo(String value) {
            addCriterion("USER_MOBILE >=", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLessThan(String value) {
            addCriterion("USER_MOBILE <", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLessThanOrEqualTo(String value) {
            addCriterion("USER_MOBILE <=", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLike(String value) {
            addCriterion("USER_MOBILE like", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotLike(String value) {
            addCriterion("USER_MOBILE not like", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileIn(List<String> values) {
            addCriterion("USER_MOBILE in", values, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotIn(List<String> values) {
            addCriterion("USER_MOBILE not in", values, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileBetween(String value1, String value2) {
            addCriterion("USER_MOBILE between", value1, value2, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotBetween(String value1, String value2) {
            addCriterion("USER_MOBILE not between", value1, value2, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("USER_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("USER_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("USER_EMAIL =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("USER_EMAIL <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("USER_EMAIL >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("USER_EMAIL >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("USER_EMAIL <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("USER_EMAIL <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("USER_EMAIL like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("USER_EMAIL not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("USER_EMAIL in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("USER_EMAIL not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("USER_EMAIL between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("USER_EMAIL not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserWorkNoIsNull() {
            addCriterion("USER_WORK_NO is null");
            return (Criteria) this;
        }

        public Criteria andUserWorkNoIsNotNull() {
            addCriterion("USER_WORK_NO is not null");
            return (Criteria) this;
        }

        public Criteria andUserWorkNoEqualTo(String value) {
            addCriterion("USER_WORK_NO =", value, "userWorkNo");
            return (Criteria) this;
        }

        public Criteria andUserWorkNoNotEqualTo(String value) {
            addCriterion("USER_WORK_NO <>", value, "userWorkNo");
            return (Criteria) this;
        }

        public Criteria andUserWorkNoGreaterThan(String value) {
            addCriterion("USER_WORK_NO >", value, "userWorkNo");
            return (Criteria) this;
        }

        public Criteria andUserWorkNoGreaterThanOrEqualTo(String value) {
            addCriterion("USER_WORK_NO >=", value, "userWorkNo");
            return (Criteria) this;
        }

        public Criteria andUserWorkNoLessThan(String value) {
            addCriterion("USER_WORK_NO <", value, "userWorkNo");
            return (Criteria) this;
        }

        public Criteria andUserWorkNoLessThanOrEqualTo(String value) {
            addCriterion("USER_WORK_NO <=", value, "userWorkNo");
            return (Criteria) this;
        }

        public Criteria andUserWorkNoLike(String value) {
            addCriterion("USER_WORK_NO like", value, "userWorkNo");
            return (Criteria) this;
        }

        public Criteria andUserWorkNoNotLike(String value) {
            addCriterion("USER_WORK_NO not like", value, "userWorkNo");
            return (Criteria) this;
        }

        public Criteria andUserWorkNoIn(List<String> values) {
            addCriterion("USER_WORK_NO in", values, "userWorkNo");
            return (Criteria) this;
        }

        public Criteria andUserWorkNoNotIn(List<String> values) {
            addCriterion("USER_WORK_NO not in", values, "userWorkNo");
            return (Criteria) this;
        }

        public Criteria andUserWorkNoBetween(String value1, String value2) {
            addCriterion("USER_WORK_NO between", value1, value2, "userWorkNo");
            return (Criteria) this;
        }

        public Criteria andUserWorkNoNotBetween(String value1, String value2) {
            addCriterion("USER_WORK_NO not between", value1, value2, "userWorkNo");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNull() {
            addCriterion("USER_SEX is null");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNotNull() {
            addCriterion("USER_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andUserSexEqualTo(String value) {
            addCriterion("USER_SEX =", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotEqualTo(String value) {
            addCriterion("USER_SEX <>", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThan(String value) {
            addCriterion("USER_SEX >", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThanOrEqualTo(String value) {
            addCriterion("USER_SEX >=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThan(String value) {
            addCriterion("USER_SEX <", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThanOrEqualTo(String value) {
            addCriterion("USER_SEX <=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLike(String value) {
            addCriterion("USER_SEX like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotLike(String value) {
            addCriterion("USER_SEX not like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexIn(List<String> values) {
            addCriterion("USER_SEX in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotIn(List<String> values) {
            addCriterion("USER_SEX not in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexBetween(String value1, String value2) {
            addCriterion("USER_SEX between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotBetween(String value1, String value2) {
            addCriterion("USER_SEX not between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIsNull() {
            addCriterion("USER_BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIsNotNull() {
            addCriterion("USER_BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayEqualTo(Date value) {
            addCriterion("USER_BIRTHDAY =", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotEqualTo(Date value) {
            addCriterion("USER_BIRTHDAY <>", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayGreaterThan(Date value) {
            addCriterion("USER_BIRTHDAY >", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("USER_BIRTHDAY >=", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayLessThan(Date value) {
            addCriterion("USER_BIRTHDAY <", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("USER_BIRTHDAY <=", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIn(List<Date> values) {
            addCriterion("USER_BIRTHDAY in", values, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotIn(List<Date> values) {
            addCriterion("USER_BIRTHDAY not in", values, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayBetween(Date value1, Date value2) {
            addCriterion("USER_BIRTHDAY between", value1, value2, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("USER_BIRTHDAY not between", value1, value2, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserWorkedIsNull() {
            addCriterion("USER_WORKED is null");
            return (Criteria) this;
        }

        public Criteria andUserWorkedIsNotNull() {
            addCriterion("USER_WORKED is not null");
            return (Criteria) this;
        }

        public Criteria andUserWorkedEqualTo(String value) {
            addCriterion("USER_WORKED =", value, "userWorked");
            return (Criteria) this;
        }

        public Criteria andUserWorkedNotEqualTo(String value) {
            addCriterion("USER_WORKED <>", value, "userWorked");
            return (Criteria) this;
        }

        public Criteria andUserWorkedGreaterThan(String value) {
            addCriterion("USER_WORKED >", value, "userWorked");
            return (Criteria) this;
        }

        public Criteria andUserWorkedGreaterThanOrEqualTo(String value) {
            addCriterion("USER_WORKED >=", value, "userWorked");
            return (Criteria) this;
        }

        public Criteria andUserWorkedLessThan(String value) {
            addCriterion("USER_WORKED <", value, "userWorked");
            return (Criteria) this;
        }

        public Criteria andUserWorkedLessThanOrEqualTo(String value) {
            addCriterion("USER_WORKED <=", value, "userWorked");
            return (Criteria) this;
        }

        public Criteria andUserWorkedLike(String value) {
            addCriterion("USER_WORKED like", value, "userWorked");
            return (Criteria) this;
        }

        public Criteria andUserWorkedNotLike(String value) {
            addCriterion("USER_WORKED not like", value, "userWorked");
            return (Criteria) this;
        }

        public Criteria andUserWorkedIn(List<String> values) {
            addCriterion("USER_WORKED in", values, "userWorked");
            return (Criteria) this;
        }

        public Criteria andUserWorkedNotIn(List<String> values) {
            addCriterion("USER_WORKED not in", values, "userWorked");
            return (Criteria) this;
        }

        public Criteria andUserWorkedBetween(String value1, String value2) {
            addCriterion("USER_WORKED between", value1, value2, "userWorked");
            return (Criteria) this;
        }

        public Criteria andUserWorkedNotBetween(String value1, String value2) {
            addCriterion("USER_WORKED not between", value1, value2, "userWorked");
            return (Criteria) this;
        }

        public Criteria andUserEducationIsNull() {
            addCriterion("USER_EDUCATION is null");
            return (Criteria) this;
        }

        public Criteria andUserEducationIsNotNull() {
            addCriterion("USER_EDUCATION is not null");
            return (Criteria) this;
        }

        public Criteria andUserEducationEqualTo(String value) {
            addCriterion("USER_EDUCATION =", value, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserEducationNotEqualTo(String value) {
            addCriterion("USER_EDUCATION <>", value, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserEducationGreaterThan(String value) {
            addCriterion("USER_EDUCATION >", value, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserEducationGreaterThanOrEqualTo(String value) {
            addCriterion("USER_EDUCATION >=", value, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserEducationLessThan(String value) {
            addCriterion("USER_EDUCATION <", value, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserEducationLessThanOrEqualTo(String value) {
            addCriterion("USER_EDUCATION <=", value, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserEducationLike(String value) {
            addCriterion("USER_EDUCATION like", value, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserEducationNotLike(String value) {
            addCriterion("USER_EDUCATION not like", value, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserEducationIn(List<String> values) {
            addCriterion("USER_EDUCATION in", values, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserEducationNotIn(List<String> values) {
            addCriterion("USER_EDUCATION not in", values, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserEducationBetween(String value1, String value2) {
            addCriterion("USER_EDUCATION between", value1, value2, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserEducationNotBetween(String value1, String value2) {
            addCriterion("USER_EDUCATION not between", value1, value2, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserOriginIsNull() {
            addCriterion("USER_ORIGIN is null");
            return (Criteria) this;
        }

        public Criteria andUserOriginIsNotNull() {
            addCriterion("USER_ORIGIN is not null");
            return (Criteria) this;
        }

        public Criteria andUserOriginEqualTo(String value) {
            addCriterion("USER_ORIGIN =", value, "userOrigin");
            return (Criteria) this;
        }

        public Criteria andUserOriginNotEqualTo(String value) {
            addCriterion("USER_ORIGIN <>", value, "userOrigin");
            return (Criteria) this;
        }

        public Criteria andUserOriginGreaterThan(String value) {
            addCriterion("USER_ORIGIN >", value, "userOrigin");
            return (Criteria) this;
        }

        public Criteria andUserOriginGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ORIGIN >=", value, "userOrigin");
            return (Criteria) this;
        }

        public Criteria andUserOriginLessThan(String value) {
            addCriterion("USER_ORIGIN <", value, "userOrigin");
            return (Criteria) this;
        }

        public Criteria andUserOriginLessThanOrEqualTo(String value) {
            addCriterion("USER_ORIGIN <=", value, "userOrigin");
            return (Criteria) this;
        }

        public Criteria andUserOriginLike(String value) {
            addCriterion("USER_ORIGIN like", value, "userOrigin");
            return (Criteria) this;
        }

        public Criteria andUserOriginNotLike(String value) {
            addCriterion("USER_ORIGIN not like", value, "userOrigin");
            return (Criteria) this;
        }

        public Criteria andUserOriginIn(List<String> values) {
            addCriterion("USER_ORIGIN in", values, "userOrigin");
            return (Criteria) this;
        }

        public Criteria andUserOriginNotIn(List<String> values) {
            addCriterion("USER_ORIGIN not in", values, "userOrigin");
            return (Criteria) this;
        }

        public Criteria andUserOriginBetween(String value1, String value2) {
            addCriterion("USER_ORIGIN between", value1, value2, "userOrigin");
            return (Criteria) this;
        }

        public Criteria andUserOriginNotBetween(String value1, String value2) {
            addCriterion("USER_ORIGIN not between", value1, value2, "userOrigin");
            return (Criteria) this;
        }

        public Criteria andUserTitleIsNull() {
            addCriterion("USER_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andUserTitleIsNotNull() {
            addCriterion("USER_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andUserTitleEqualTo(String value) {
            addCriterion("USER_TITLE =", value, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserTitleNotEqualTo(String value) {
            addCriterion("USER_TITLE <>", value, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserTitleGreaterThan(String value) {
            addCriterion("USER_TITLE >", value, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserTitleGreaterThanOrEqualTo(String value) {
            addCriterion("USER_TITLE >=", value, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserTitleLessThan(String value) {
            addCriterion("USER_TITLE <", value, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserTitleLessThanOrEqualTo(String value) {
            addCriterion("USER_TITLE <=", value, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserTitleLike(String value) {
            addCriterion("USER_TITLE like", value, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserTitleNotLike(String value) {
            addCriterion("USER_TITLE not like", value, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserTitleIn(List<String> values) {
            addCriterion("USER_TITLE in", values, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserTitleNotIn(List<String> values) {
            addCriterion("USER_TITLE not in", values, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserTitleBetween(String value1, String value2) {
            addCriterion("USER_TITLE between", value1, value2, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserTitleNotBetween(String value1, String value2) {
            addCriterion("USER_TITLE not between", value1, value2, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserWorkLimitIsNull() {
            addCriterion("USER_WORK_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andUserWorkLimitIsNotNull() {
            addCriterion("USER_WORK_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andUserWorkLimitEqualTo(String value) {
            addCriterion("USER_WORK_LIMIT =", value, "userWorkLimit");
            return (Criteria) this;
        }

        public Criteria andUserWorkLimitNotEqualTo(String value) {
            addCriterion("USER_WORK_LIMIT <>", value, "userWorkLimit");
            return (Criteria) this;
        }

        public Criteria andUserWorkLimitGreaterThan(String value) {
            addCriterion("USER_WORK_LIMIT >", value, "userWorkLimit");
            return (Criteria) this;
        }

        public Criteria andUserWorkLimitGreaterThanOrEqualTo(String value) {
            addCriterion("USER_WORK_LIMIT >=", value, "userWorkLimit");
            return (Criteria) this;
        }

        public Criteria andUserWorkLimitLessThan(String value) {
            addCriterion("USER_WORK_LIMIT <", value, "userWorkLimit");
            return (Criteria) this;
        }

        public Criteria andUserWorkLimitLessThanOrEqualTo(String value) {
            addCriterion("USER_WORK_LIMIT <=", value, "userWorkLimit");
            return (Criteria) this;
        }

        public Criteria andUserWorkLimitLike(String value) {
            addCriterion("USER_WORK_LIMIT like", value, "userWorkLimit");
            return (Criteria) this;
        }

        public Criteria andUserWorkLimitNotLike(String value) {
            addCriterion("USER_WORK_LIMIT not like", value, "userWorkLimit");
            return (Criteria) this;
        }

        public Criteria andUserWorkLimitIn(List<String> values) {
            addCriterion("USER_WORK_LIMIT in", values, "userWorkLimit");
            return (Criteria) this;
        }

        public Criteria andUserWorkLimitNotIn(List<String> values) {
            addCriterion("USER_WORK_LIMIT not in", values, "userWorkLimit");
            return (Criteria) this;
        }

        public Criteria andUserWorkLimitBetween(String value1, String value2) {
            addCriterion("USER_WORK_LIMIT between", value1, value2, "userWorkLimit");
            return (Criteria) this;
        }

        public Criteria andUserWorkLimitNotBetween(String value1, String value2) {
            addCriterion("USER_WORK_LIMIT not between", value1, value2, "userWorkLimit");
            return (Criteria) this;
        }

        public Criteria andUserIdentNoIsNull() {
            addCriterion("USER_IDENT_NO is null");
            return (Criteria) this;
        }

        public Criteria andUserIdentNoIsNotNull() {
            addCriterion("USER_IDENT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdentNoEqualTo(String value) {
            addCriterion("USER_IDENT_NO =", value, "userIdentNo");
            return (Criteria) this;
        }

        public Criteria andUserIdentNoNotEqualTo(String value) {
            addCriterion("USER_IDENT_NO <>", value, "userIdentNo");
            return (Criteria) this;
        }

        public Criteria andUserIdentNoGreaterThan(String value) {
            addCriterion("USER_IDENT_NO >", value, "userIdentNo");
            return (Criteria) this;
        }

        public Criteria andUserIdentNoGreaterThanOrEqualTo(String value) {
            addCriterion("USER_IDENT_NO >=", value, "userIdentNo");
            return (Criteria) this;
        }

        public Criteria andUserIdentNoLessThan(String value) {
            addCriterion("USER_IDENT_NO <", value, "userIdentNo");
            return (Criteria) this;
        }

        public Criteria andUserIdentNoLessThanOrEqualTo(String value) {
            addCriterion("USER_IDENT_NO <=", value, "userIdentNo");
            return (Criteria) this;
        }

        public Criteria andUserIdentNoLike(String value) {
            addCriterion("USER_IDENT_NO like", value, "userIdentNo");
            return (Criteria) this;
        }

        public Criteria andUserIdentNoNotLike(String value) {
            addCriterion("USER_IDENT_NO not like", value, "userIdentNo");
            return (Criteria) this;
        }

        public Criteria andUserIdentNoIn(List<String> values) {
            addCriterion("USER_IDENT_NO in", values, "userIdentNo");
            return (Criteria) this;
        }

        public Criteria andUserIdentNoNotIn(List<String> values) {
            addCriterion("USER_IDENT_NO not in", values, "userIdentNo");
            return (Criteria) this;
        }

        public Criteria andUserIdentNoBetween(String value1, String value2) {
            addCriterion("USER_IDENT_NO between", value1, value2, "userIdentNo");
            return (Criteria) this;
        }

        public Criteria andUserIdentNoNotBetween(String value1, String value2) {
            addCriterion("USER_IDENT_NO not between", value1, value2, "userIdentNo");
            return (Criteria) this;
        }

        public Criteria andUserInDateIsNull() {
            addCriterion("USER_IN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUserInDateIsNotNull() {
            addCriterion("USER_IN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUserInDateEqualTo(Date value) {
            addCriterion("USER_IN_DATE =", value, "userInDate");
            return (Criteria) this;
        }

        public Criteria andUserInDateNotEqualTo(Date value) {
            addCriterion("USER_IN_DATE <>", value, "userInDate");
            return (Criteria) this;
        }

        public Criteria andUserInDateGreaterThan(Date value) {
            addCriterion("USER_IN_DATE >", value, "userInDate");
            return (Criteria) this;
        }

        public Criteria andUserInDateGreaterThanOrEqualTo(Date value) {
            addCriterion("USER_IN_DATE >=", value, "userInDate");
            return (Criteria) this;
        }

        public Criteria andUserInDateLessThan(Date value) {
            addCriterion("USER_IN_DATE <", value, "userInDate");
            return (Criteria) this;
        }

        public Criteria andUserInDateLessThanOrEqualTo(Date value) {
            addCriterion("USER_IN_DATE <=", value, "userInDate");
            return (Criteria) this;
        }

        public Criteria andUserInDateIn(List<Date> values) {
            addCriterion("USER_IN_DATE in", values, "userInDate");
            return (Criteria) this;
        }

        public Criteria andUserInDateNotIn(List<Date> values) {
            addCriterion("USER_IN_DATE not in", values, "userInDate");
            return (Criteria) this;
        }

        public Criteria andUserInDateBetween(Date value1, Date value2) {
            addCriterion("USER_IN_DATE between", value1, value2, "userInDate");
            return (Criteria) this;
        }

        public Criteria andUserInDateNotBetween(Date value1, Date value2) {
            addCriterion("USER_IN_DATE not between", value1, value2, "userInDate");
            return (Criteria) this;
        }

        public Criteria andUserAreaIsNull() {
            addCriterion("USER_AREA is null");
            return (Criteria) this;
        }

        public Criteria andUserAreaIsNotNull() {
            addCriterion("USER_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andUserAreaEqualTo(String value) {
            addCriterion("USER_AREA =", value, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaNotEqualTo(String value) {
            addCriterion("USER_AREA <>", value, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaGreaterThan(String value) {
            addCriterion("USER_AREA >", value, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaGreaterThanOrEqualTo(String value) {
            addCriterion("USER_AREA >=", value, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaLessThan(String value) {
            addCriterion("USER_AREA <", value, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaLessThanOrEqualTo(String value) {
            addCriterion("USER_AREA <=", value, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaLike(String value) {
            addCriterion("USER_AREA like", value, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaNotLike(String value) {
            addCriterion("USER_AREA not like", value, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaIn(List<String> values) {
            addCriterion("USER_AREA in", values, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaNotIn(List<String> values) {
            addCriterion("USER_AREA not in", values, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaBetween(String value1, String value2) {
            addCriterion("USER_AREA between", value1, value2, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaNotBetween(String value1, String value2) {
            addCriterion("USER_AREA not between", value1, value2, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNull() {
            addCriterion("USER_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNotNull() {
            addCriterion("USER_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressEqualTo(String value) {
            addCriterion("USER_ADDRESS =", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotEqualTo(String value) {
            addCriterion("USER_ADDRESS <>", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThan(String value) {
            addCriterion("USER_ADDRESS >", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ADDRESS >=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThan(String value) {
            addCriterion("USER_ADDRESS <", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThanOrEqualTo(String value) {
            addCriterion("USER_ADDRESS <=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLike(String value) {
            addCriterion("USER_ADDRESS like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotLike(String value) {
            addCriterion("USER_ADDRESS not like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressIn(List<String> values) {
            addCriterion("USER_ADDRESS in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotIn(List<String> values) {
            addCriterion("USER_ADDRESS not in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressBetween(String value1, String value2) {
            addCriterion("USER_ADDRESS between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotBetween(String value1, String value2) {
            addCriterion("USER_ADDRESS not between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserPostalIsNull() {
            addCriterion("USER_POSTAL is null");
            return (Criteria) this;
        }

        public Criteria andUserPostalIsNotNull() {
            addCriterion("USER_POSTAL is not null");
            return (Criteria) this;
        }

        public Criteria andUserPostalEqualTo(String value) {
            addCriterion("USER_POSTAL =", value, "userPostal");
            return (Criteria) this;
        }

        public Criteria andUserPostalNotEqualTo(String value) {
            addCriterion("USER_POSTAL <>", value, "userPostal");
            return (Criteria) this;
        }

        public Criteria andUserPostalGreaterThan(String value) {
            addCriterion("USER_POSTAL >", value, "userPostal");
            return (Criteria) this;
        }

        public Criteria andUserPostalGreaterThanOrEqualTo(String value) {
            addCriterion("USER_POSTAL >=", value, "userPostal");
            return (Criteria) this;
        }

        public Criteria andUserPostalLessThan(String value) {
            addCriterion("USER_POSTAL <", value, "userPostal");
            return (Criteria) this;
        }

        public Criteria andUserPostalLessThanOrEqualTo(String value) {
            addCriterion("USER_POSTAL <=", value, "userPostal");
            return (Criteria) this;
        }

        public Criteria andUserPostalLike(String value) {
            addCriterion("USER_POSTAL like", value, "userPostal");
            return (Criteria) this;
        }

        public Criteria andUserPostalNotLike(String value) {
            addCriterion("USER_POSTAL not like", value, "userPostal");
            return (Criteria) this;
        }

        public Criteria andUserPostalIn(List<String> values) {
            addCriterion("USER_POSTAL in", values, "userPostal");
            return (Criteria) this;
        }

        public Criteria andUserPostalNotIn(List<String> values) {
            addCriterion("USER_POSTAL not in", values, "userPostal");
            return (Criteria) this;
        }

        public Criteria andUserPostalBetween(String value1, String value2) {
            addCriterion("USER_POSTAL between", value1, value2, "userPostal");
            return (Criteria) this;
        }

        public Criteria andUserPostalNotBetween(String value1, String value2) {
            addCriterion("USER_POSTAL not between", value1, value2, "userPostal");
            return (Criteria) this;
        }

        public Criteria andUserActiveIsNull() {
            addCriterion("USER_ACTIVE is null");
            return (Criteria) this;
        }

        public Criteria andUserActiveIsNotNull() {
            addCriterion("USER_ACTIVE is not null");
            return (Criteria) this;
        }

        public Criteria andUserActiveEqualTo(Short value) {
            addCriterion("USER_ACTIVE =", value, "userActive");
            return (Criteria) this;
        }

        public Criteria andUserActiveNotEqualTo(Short value) {
            addCriterion("USER_ACTIVE <>", value, "userActive");
            return (Criteria) this;
        }

        public Criteria andUserActiveGreaterThan(Short value) {
            addCriterion("USER_ACTIVE >", value, "userActive");
            return (Criteria) this;
        }

        public Criteria andUserActiveGreaterThanOrEqualTo(Short value) {
            addCriterion("USER_ACTIVE >=", value, "userActive");
            return (Criteria) this;
        }

        public Criteria andUserActiveLessThan(Short value) {
            addCriterion("USER_ACTIVE <", value, "userActive");
            return (Criteria) this;
        }

        public Criteria andUserActiveLessThanOrEqualTo(Short value) {
            addCriterion("USER_ACTIVE <=", value, "userActive");
            return (Criteria) this;
        }

        public Criteria andUserActiveIn(List<Short> values) {
            addCriterion("USER_ACTIVE in", values, "userActive");
            return (Criteria) this;
        }

        public Criteria andUserActiveNotIn(List<Short> values) {
            addCriterion("USER_ACTIVE not in", values, "userActive");
            return (Criteria) this;
        }

        public Criteria andUserActiveBetween(Short value1, Short value2) {
            addCriterion("USER_ACTIVE between", value1, value2, "userActive");
            return (Criteria) this;
        }

        public Criteria andUserActiveNotBetween(Short value1, Short value2) {
            addCriterion("USER_ACTIVE not between", value1, value2, "userActive");
            return (Criteria) this;
        }

        public Criteria andUserOutIsNull() {
            addCriterion("USER_OUT is null");
            return (Criteria) this;
        }

        public Criteria andUserOutIsNotNull() {
            addCriterion("USER_OUT is not null");
            return (Criteria) this;
        }

        public Criteria andUserOutEqualTo(Short value) {
            addCriterion("USER_OUT =", value, "userOut");
            return (Criteria) this;
        }

        public Criteria andUserOutNotEqualTo(Short value) {
            addCriterion("USER_OUT <>", value, "userOut");
            return (Criteria) this;
        }

        public Criteria andUserOutGreaterThan(Short value) {
            addCriterion("USER_OUT >", value, "userOut");
            return (Criteria) this;
        }

        public Criteria andUserOutGreaterThanOrEqualTo(Short value) {
            addCriterion("USER_OUT >=", value, "userOut");
            return (Criteria) this;
        }

        public Criteria andUserOutLessThan(Short value) {
            addCriterion("USER_OUT <", value, "userOut");
            return (Criteria) this;
        }

        public Criteria andUserOutLessThanOrEqualTo(Short value) {
            addCriterion("USER_OUT <=", value, "userOut");
            return (Criteria) this;
        }

        public Criteria andUserOutIn(List<Short> values) {
            addCriterion("USER_OUT in", values, "userOut");
            return (Criteria) this;
        }

        public Criteria andUserOutNotIn(List<Short> values) {
            addCriterion("USER_OUT not in", values, "userOut");
            return (Criteria) this;
        }

        public Criteria andUserOutBetween(Short value1, Short value2) {
            addCriterion("USER_OUT between", value1, value2, "userOut");
            return (Criteria) this;
        }

        public Criteria andUserOutNotBetween(Short value1, Short value2) {
            addCriterion("USER_OUT not between", value1, value2, "userOut");
            return (Criteria) this;
        }

        public Criteria andUserOutDateIsNull() {
            addCriterion("USER_OUT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUserOutDateIsNotNull() {
            addCriterion("USER_OUT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUserOutDateEqualTo(Date value) {
            addCriterion("USER_OUT_DATE =", value, "userOutDate");
            return (Criteria) this;
        }

        public Criteria andUserOutDateNotEqualTo(Date value) {
            addCriterion("USER_OUT_DATE <>", value, "userOutDate");
            return (Criteria) this;
        }

        public Criteria andUserOutDateGreaterThan(Date value) {
            addCriterion("USER_OUT_DATE >", value, "userOutDate");
            return (Criteria) this;
        }

        public Criteria andUserOutDateGreaterThanOrEqualTo(Date value) {
            addCriterion("USER_OUT_DATE >=", value, "userOutDate");
            return (Criteria) this;
        }

        public Criteria andUserOutDateLessThan(Date value) {
            addCriterion("USER_OUT_DATE <", value, "userOutDate");
            return (Criteria) this;
        }

        public Criteria andUserOutDateLessThanOrEqualTo(Date value) {
            addCriterion("USER_OUT_DATE <=", value, "userOutDate");
            return (Criteria) this;
        }

        public Criteria andUserOutDateIn(List<Date> values) {
            addCriterion("USER_OUT_DATE in", values, "userOutDate");
            return (Criteria) this;
        }

        public Criteria andUserOutDateNotIn(List<Date> values) {
            addCriterion("USER_OUT_DATE not in", values, "userOutDate");
            return (Criteria) this;
        }

        public Criteria andUserOutDateBetween(Date value1, Date value2) {
            addCriterion("USER_OUT_DATE between", value1, value2, "userOutDate");
            return (Criteria) this;
        }

        public Criteria andUserOutDateNotBetween(Date value1, Date value2) {
            addCriterion("USER_OUT_DATE not between", value1, value2, "userOutDate");
            return (Criteria) this;
        }

        public Criteria andUserNoteIsNull() {
            addCriterion("USER_NOTE is null");
            return (Criteria) this;
        }

        public Criteria andUserNoteIsNotNull() {
            addCriterion("USER_NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andUserNoteEqualTo(String value) {
            addCriterion("USER_NOTE =", value, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteNotEqualTo(String value) {
            addCriterion("USER_NOTE <>", value, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteGreaterThan(String value) {
            addCriterion("USER_NOTE >", value, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NOTE >=", value, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteLessThan(String value) {
            addCriterion("USER_NOTE <", value, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteLessThanOrEqualTo(String value) {
            addCriterion("USER_NOTE <=", value, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteLike(String value) {
            addCriterion("USER_NOTE like", value, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteNotLike(String value) {
            addCriterion("USER_NOTE not like", value, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteIn(List<String> values) {
            addCriterion("USER_NOTE in", values, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteNotIn(List<String> values) {
            addCriterion("USER_NOTE not in", values, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteBetween(String value1, String value2) {
            addCriterion("USER_NOTE between", value1, value2, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteNotBetween(String value1, String value2) {
            addCriterion("USER_NOTE not between", value1, value2, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserCreateIdIsNull() {
            addCriterion("USER_CREATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserCreateIdIsNotNull() {
            addCriterion("USER_CREATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserCreateIdEqualTo(String value) {
            addCriterion("USER_CREATE_ID =", value, "userCreateId");
            return (Criteria) this;
        }

        public Criteria andUserCreateIdNotEqualTo(String value) {
            addCriterion("USER_CREATE_ID <>", value, "userCreateId");
            return (Criteria) this;
        }

        public Criteria andUserCreateIdGreaterThan(String value) {
            addCriterion("USER_CREATE_ID >", value, "userCreateId");
            return (Criteria) this;
        }

        public Criteria andUserCreateIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_CREATE_ID >=", value, "userCreateId");
            return (Criteria) this;
        }

        public Criteria andUserCreateIdLessThan(String value) {
            addCriterion("USER_CREATE_ID <", value, "userCreateId");
            return (Criteria) this;
        }

        public Criteria andUserCreateIdLessThanOrEqualTo(String value) {
            addCriterion("USER_CREATE_ID <=", value, "userCreateId");
            return (Criteria) this;
        }

        public Criteria andUserCreateIdLike(String value) {
            addCriterion("USER_CREATE_ID like", value, "userCreateId");
            return (Criteria) this;
        }

        public Criteria andUserCreateIdNotLike(String value) {
            addCriterion("USER_CREATE_ID not like", value, "userCreateId");
            return (Criteria) this;
        }

        public Criteria andUserCreateIdIn(List<String> values) {
            addCriterion("USER_CREATE_ID in", values, "userCreateId");
            return (Criteria) this;
        }

        public Criteria andUserCreateIdNotIn(List<String> values) {
            addCriterion("USER_CREATE_ID not in", values, "userCreateId");
            return (Criteria) this;
        }

        public Criteria andUserCreateIdBetween(String value1, String value2) {
            addCriterion("USER_CREATE_ID between", value1, value2, "userCreateId");
            return (Criteria) this;
        }

        public Criteria andUserCreateIdNotBetween(String value1, String value2) {
            addCriterion("USER_CREATE_ID not between", value1, value2, "userCreateId");
            return (Criteria) this;
        }

        public Criteria andUserCreateDateIsNull() {
            addCriterion("USER_CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUserCreateDateIsNotNull() {
            addCriterion("USER_CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUserCreateDateEqualTo(Date value) {
            addCriterion("USER_CREATE_DATE =", value, "userCreateDate");
            return (Criteria) this;
        }

        public Criteria andUserCreateDateNotEqualTo(Date value) {
            addCriterion("USER_CREATE_DATE <>", value, "userCreateDate");
            return (Criteria) this;
        }

        public Criteria andUserCreateDateGreaterThan(Date value) {
            addCriterion("USER_CREATE_DATE >", value, "userCreateDate");
            return (Criteria) this;
        }

        public Criteria andUserCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("USER_CREATE_DATE >=", value, "userCreateDate");
            return (Criteria) this;
        }

        public Criteria andUserCreateDateLessThan(Date value) {
            addCriterion("USER_CREATE_DATE <", value, "userCreateDate");
            return (Criteria) this;
        }

        public Criteria andUserCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("USER_CREATE_DATE <=", value, "userCreateDate");
            return (Criteria) this;
        }

        public Criteria andUserCreateDateIn(List<Date> values) {
            addCriterion("USER_CREATE_DATE in", values, "userCreateDate");
            return (Criteria) this;
        }

        public Criteria andUserCreateDateNotIn(List<Date> values) {
            addCriterion("USER_CREATE_DATE not in", values, "userCreateDate");
            return (Criteria) this;
        }

        public Criteria andUserCreateDateBetween(Date value1, Date value2) {
            addCriterion("USER_CREATE_DATE between", value1, value2, "userCreateDate");
            return (Criteria) this;
        }

        public Criteria andUserCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("USER_CREATE_DATE not between", value1, value2, "userCreateDate");
            return (Criteria) this;
        }

        public Criteria andUserUpdateIdIsNull() {
            addCriterion("USER_UPDATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserUpdateIdIsNotNull() {
            addCriterion("USER_UPDATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserUpdateIdEqualTo(String value) {
            addCriterion("USER_UPDATE_ID =", value, "userUpdateId");
            return (Criteria) this;
        }

        public Criteria andUserUpdateIdNotEqualTo(String value) {
            addCriterion("USER_UPDATE_ID <>", value, "userUpdateId");
            return (Criteria) this;
        }

        public Criteria andUserUpdateIdGreaterThan(String value) {
            addCriterion("USER_UPDATE_ID >", value, "userUpdateId");
            return (Criteria) this;
        }

        public Criteria andUserUpdateIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_UPDATE_ID >=", value, "userUpdateId");
            return (Criteria) this;
        }

        public Criteria andUserUpdateIdLessThan(String value) {
            addCriterion("USER_UPDATE_ID <", value, "userUpdateId");
            return (Criteria) this;
        }

        public Criteria andUserUpdateIdLessThanOrEqualTo(String value) {
            addCriterion("USER_UPDATE_ID <=", value, "userUpdateId");
            return (Criteria) this;
        }

        public Criteria andUserUpdateIdLike(String value) {
            addCriterion("USER_UPDATE_ID like", value, "userUpdateId");
            return (Criteria) this;
        }

        public Criteria andUserUpdateIdNotLike(String value) {
            addCriterion("USER_UPDATE_ID not like", value, "userUpdateId");
            return (Criteria) this;
        }

        public Criteria andUserUpdateIdIn(List<String> values) {
            addCriterion("USER_UPDATE_ID in", values, "userUpdateId");
            return (Criteria) this;
        }

        public Criteria andUserUpdateIdNotIn(List<String> values) {
            addCriterion("USER_UPDATE_ID not in", values, "userUpdateId");
            return (Criteria) this;
        }

        public Criteria andUserUpdateIdBetween(String value1, String value2) {
            addCriterion("USER_UPDATE_ID between", value1, value2, "userUpdateId");
            return (Criteria) this;
        }

        public Criteria andUserUpdateIdNotBetween(String value1, String value2) {
            addCriterion("USER_UPDATE_ID not between", value1, value2, "userUpdateId");
            return (Criteria) this;
        }

        public Criteria andUserUpdateDateIsNull() {
            addCriterion("USER_UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUserUpdateDateIsNotNull() {
            addCriterion("USER_UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUserUpdateDateEqualTo(Date value) {
            addCriterion("USER_UPDATE_DATE =", value, "userUpdateDate");
            return (Criteria) this;
        }

        public Criteria andUserUpdateDateNotEqualTo(Date value) {
            addCriterion("USER_UPDATE_DATE <>", value, "userUpdateDate");
            return (Criteria) this;
        }

        public Criteria andUserUpdateDateGreaterThan(Date value) {
            addCriterion("USER_UPDATE_DATE >", value, "userUpdateDate");
            return (Criteria) this;
        }

        public Criteria andUserUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("USER_UPDATE_DATE >=", value, "userUpdateDate");
            return (Criteria) this;
        }

        public Criteria andUserUpdateDateLessThan(Date value) {
            addCriterion("USER_UPDATE_DATE <", value, "userUpdateDate");
            return (Criteria) this;
        }

        public Criteria andUserUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("USER_UPDATE_DATE <=", value, "userUpdateDate");
            return (Criteria) this;
        }

        public Criteria andUserUpdateDateIn(List<Date> values) {
            addCriterion("USER_UPDATE_DATE in", values, "userUpdateDate");
            return (Criteria) this;
        }

        public Criteria andUserUpdateDateNotIn(List<Date> values) {
            addCriterion("USER_UPDATE_DATE not in", values, "userUpdateDate");
            return (Criteria) this;
        }

        public Criteria andUserUpdateDateBetween(Date value1, Date value2) {
            addCriterion("USER_UPDATE_DATE between", value1, value2, "userUpdateDate");
            return (Criteria) this;
        }

        public Criteria andUserUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("USER_UPDATE_DATE not between", value1, value2, "userUpdateDate");
            return (Criteria) this;
        }

        public Criteria andUserPasswdChangeDateIsNull() {
            addCriterion("USER_PASSWD_CHANGE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswdChangeDateIsNotNull() {
            addCriterion("USER_PASSWD_CHANGE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswdChangeDateEqualTo(Date value) {
            addCriterion("USER_PASSWD_CHANGE_DATE =", value, "userPasswdChangeDate");
            return (Criteria) this;
        }

        public Criteria andUserPasswdChangeDateNotEqualTo(Date value) {
            addCriterion("USER_PASSWD_CHANGE_DATE <>", value, "userPasswdChangeDate");
            return (Criteria) this;
        }

        public Criteria andUserPasswdChangeDateGreaterThan(Date value) {
            addCriterion("USER_PASSWD_CHANGE_DATE >", value, "userPasswdChangeDate");
            return (Criteria) this;
        }

        public Criteria andUserPasswdChangeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("USER_PASSWD_CHANGE_DATE >=", value, "userPasswdChangeDate");
            return (Criteria) this;
        }

        public Criteria andUserPasswdChangeDateLessThan(Date value) {
            addCriterion("USER_PASSWD_CHANGE_DATE <", value, "userPasswdChangeDate");
            return (Criteria) this;
        }

        public Criteria andUserPasswdChangeDateLessThanOrEqualTo(Date value) {
            addCriterion("USER_PASSWD_CHANGE_DATE <=", value, "userPasswdChangeDate");
            return (Criteria) this;
        }

        public Criteria andUserPasswdChangeDateIn(List<Date> values) {
            addCriterion("USER_PASSWD_CHANGE_DATE in", values, "userPasswdChangeDate");
            return (Criteria) this;
        }

        public Criteria andUserPasswdChangeDateNotIn(List<Date> values) {
            addCriterion("USER_PASSWD_CHANGE_DATE not in", values, "userPasswdChangeDate");
            return (Criteria) this;
        }

        public Criteria andUserPasswdChangeDateBetween(Date value1, Date value2) {
            addCriterion("USER_PASSWD_CHANGE_DATE between", value1, value2, "userPasswdChangeDate");
            return (Criteria) this;
        }

        public Criteria andUserPasswdChangeDateNotBetween(Date value1, Date value2) {
            addCriterion("USER_PASSWD_CHANGE_DATE not between", value1, value2, "userPasswdChangeDate");
            return (Criteria) this;
        }

        public Criteria andUserUnlockDateIsNull() {
            addCriterion("USER_UNLOCK_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUserUnlockDateIsNotNull() {
            addCriterion("USER_UNLOCK_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUserUnlockDateEqualTo(Date value) {
            addCriterion("USER_UNLOCK_DATE =", value, "userUnlockDate");
            return (Criteria) this;
        }

        public Criteria andUserUnlockDateNotEqualTo(Date value) {
            addCriterion("USER_UNLOCK_DATE <>", value, "userUnlockDate");
            return (Criteria) this;
        }

        public Criteria andUserUnlockDateGreaterThan(Date value) {
            addCriterion("USER_UNLOCK_DATE >", value, "userUnlockDate");
            return (Criteria) this;
        }

        public Criteria andUserUnlockDateGreaterThanOrEqualTo(Date value) {
            addCriterion("USER_UNLOCK_DATE >=", value, "userUnlockDate");
            return (Criteria) this;
        }

        public Criteria andUserUnlockDateLessThan(Date value) {
            addCriterion("USER_UNLOCK_DATE <", value, "userUnlockDate");
            return (Criteria) this;
        }

        public Criteria andUserUnlockDateLessThanOrEqualTo(Date value) {
            addCriterion("USER_UNLOCK_DATE <=", value, "userUnlockDate");
            return (Criteria) this;
        }

        public Criteria andUserUnlockDateIn(List<Date> values) {
            addCriterion("USER_UNLOCK_DATE in", values, "userUnlockDate");
            return (Criteria) this;
        }

        public Criteria andUserUnlockDateNotIn(List<Date> values) {
            addCriterion("USER_UNLOCK_DATE not in", values, "userUnlockDate");
            return (Criteria) this;
        }

        public Criteria andUserUnlockDateBetween(Date value1, Date value2) {
            addCriterion("USER_UNLOCK_DATE between", value1, value2, "userUnlockDate");
            return (Criteria) this;
        }

        public Criteria andUserUnlockDateNotBetween(Date value1, Date value2) {
            addCriterion("USER_UNLOCK_DATE not between", value1, value2, "userUnlockDate");
            return (Criteria) this;
        }

        public Criteria andUserAdminIsNull() {
            addCriterion("USER_ADMIN is null");
            return (Criteria) this;
        }

        public Criteria andUserAdminIsNotNull() {
            addCriterion("USER_ADMIN is not null");
            return (Criteria) this;
        }

        public Criteria andUserAdminEqualTo(Short value) {
            addCriterion("USER_ADMIN =", value, "userAdmin");
            return (Criteria) this;
        }

        public Criteria andUserAdminNotEqualTo(Short value) {
            addCriterion("USER_ADMIN <>", value, "userAdmin");
            return (Criteria) this;
        }

        public Criteria andUserAdminGreaterThan(Short value) {
            addCriterion("USER_ADMIN >", value, "userAdmin");
            return (Criteria) this;
        }

        public Criteria andUserAdminGreaterThanOrEqualTo(Short value) {
            addCriterion("USER_ADMIN >=", value, "userAdmin");
            return (Criteria) this;
        }

        public Criteria andUserAdminLessThan(Short value) {
            addCriterion("USER_ADMIN <", value, "userAdmin");
            return (Criteria) this;
        }

        public Criteria andUserAdminLessThanOrEqualTo(Short value) {
            addCriterion("USER_ADMIN <=", value, "userAdmin");
            return (Criteria) this;
        }

        public Criteria andUserAdminIn(List<Short> values) {
            addCriterion("USER_ADMIN in", values, "userAdmin");
            return (Criteria) this;
        }

        public Criteria andUserAdminNotIn(List<Short> values) {
            addCriterion("USER_ADMIN not in", values, "userAdmin");
            return (Criteria) this;
        }

        public Criteria andUserAdminBetween(Short value1, Short value2) {
            addCriterion("USER_ADMIN between", value1, value2, "userAdmin");
            return (Criteria) this;
        }

        public Criteria andUserAdminNotBetween(Short value1, Short value2) {
            addCriterion("USER_ADMIN not between", value1, value2, "userAdmin");
            return (Criteria) this;
        }

        public Criteria andUserUnused1IsNull() {
            addCriterion("USER_UNUSED1 is null");
            return (Criteria) this;
        }

        public Criteria andUserUnused1IsNotNull() {
            addCriterion("USER_UNUSED1 is not null");
            return (Criteria) this;
        }

        public Criteria andUserUnused1EqualTo(String value) {
            addCriterion("USER_UNUSED1 =", value, "userUnused1");
            return (Criteria) this;
        }

        public Criteria andUserUnused1NotEqualTo(String value) {
            addCriterion("USER_UNUSED1 <>", value, "userUnused1");
            return (Criteria) this;
        }

        public Criteria andUserUnused1GreaterThan(String value) {
            addCriterion("USER_UNUSED1 >", value, "userUnused1");
            return (Criteria) this;
        }

        public Criteria andUserUnused1GreaterThanOrEqualTo(String value) {
            addCriterion("USER_UNUSED1 >=", value, "userUnused1");
            return (Criteria) this;
        }

        public Criteria andUserUnused1LessThan(String value) {
            addCriterion("USER_UNUSED1 <", value, "userUnused1");
            return (Criteria) this;
        }

        public Criteria andUserUnused1LessThanOrEqualTo(String value) {
            addCriterion("USER_UNUSED1 <=", value, "userUnused1");
            return (Criteria) this;
        }

        public Criteria andUserUnused1Like(String value) {
            addCriterion("USER_UNUSED1 like", value, "userUnused1");
            return (Criteria) this;
        }

        public Criteria andUserUnused1NotLike(String value) {
            addCriterion("USER_UNUSED1 not like", value, "userUnused1");
            return (Criteria) this;
        }

        public Criteria andUserUnused1In(List<String> values) {
            addCriterion("USER_UNUSED1 in", values, "userUnused1");
            return (Criteria) this;
        }

        public Criteria andUserUnused1NotIn(List<String> values) {
            addCriterion("USER_UNUSED1 not in", values, "userUnused1");
            return (Criteria) this;
        }

        public Criteria andUserUnused1Between(String value1, String value2) {
            addCriterion("USER_UNUSED1 between", value1, value2, "userUnused1");
            return (Criteria) this;
        }

        public Criteria andUserUnused1NotBetween(String value1, String value2) {
            addCriterion("USER_UNUSED1 not between", value1, value2, "userUnused1");
            return (Criteria) this;
        }

        public Criteria andUserUnused2IsNull() {
            addCriterion("USER_UNUSED2 is null");
            return (Criteria) this;
        }

        public Criteria andUserUnused2IsNotNull() {
            addCriterion("USER_UNUSED2 is not null");
            return (Criteria) this;
        }

        public Criteria andUserUnused2EqualTo(String value) {
            addCriterion("USER_UNUSED2 =", value, "userUnused2");
            return (Criteria) this;
        }

        public Criteria andUserUnused2NotEqualTo(String value) {
            addCriterion("USER_UNUSED2 <>", value, "userUnused2");
            return (Criteria) this;
        }

        public Criteria andUserUnused2GreaterThan(String value) {
            addCriterion("USER_UNUSED2 >", value, "userUnused2");
            return (Criteria) this;
        }

        public Criteria andUserUnused2GreaterThanOrEqualTo(String value) {
            addCriterion("USER_UNUSED2 >=", value, "userUnused2");
            return (Criteria) this;
        }

        public Criteria andUserUnused2LessThan(String value) {
            addCriterion("USER_UNUSED2 <", value, "userUnused2");
            return (Criteria) this;
        }

        public Criteria andUserUnused2LessThanOrEqualTo(String value) {
            addCriterion("USER_UNUSED2 <=", value, "userUnused2");
            return (Criteria) this;
        }

        public Criteria andUserUnused2Like(String value) {
            addCriterion("USER_UNUSED2 like", value, "userUnused2");
            return (Criteria) this;
        }

        public Criteria andUserUnused2NotLike(String value) {
            addCriterion("USER_UNUSED2 not like", value, "userUnused2");
            return (Criteria) this;
        }

        public Criteria andUserUnused2In(List<String> values) {
            addCriterion("USER_UNUSED2 in", values, "userUnused2");
            return (Criteria) this;
        }

        public Criteria andUserUnused2NotIn(List<String> values) {
            addCriterion("USER_UNUSED2 not in", values, "userUnused2");
            return (Criteria) this;
        }

        public Criteria andUserUnused2Between(String value1, String value2) {
            addCriterion("USER_UNUSED2 between", value1, value2, "userUnused2");
            return (Criteria) this;
        }

        public Criteria andUserUnused2NotBetween(String value1, String value2) {
            addCriterion("USER_UNUSED2 not between", value1, value2, "userUnused2");
            return (Criteria) this;
        }

        public Criteria andUserUnused3IsNull() {
            addCriterion("USER_UNUSED3 is null");
            return (Criteria) this;
        }

        public Criteria andUserUnused3IsNotNull() {
            addCriterion("USER_UNUSED3 is not null");
            return (Criteria) this;
        }

        public Criteria andUserUnused3EqualTo(Integer value) {
            addCriterion("USER_UNUSED3 =", value, "userUnused3");
            return (Criteria) this;
        }

        public Criteria andUserUnused3NotEqualTo(Integer value) {
            addCriterion("USER_UNUSED3 <>", value, "userUnused3");
            return (Criteria) this;
        }

        public Criteria andUserUnused3GreaterThan(Integer value) {
            addCriterion("USER_UNUSED3 >", value, "userUnused3");
            return (Criteria) this;
        }

        public Criteria andUserUnused3GreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_UNUSED3 >=", value, "userUnused3");
            return (Criteria) this;
        }

        public Criteria andUserUnused3LessThan(Integer value) {
            addCriterion("USER_UNUSED3 <", value, "userUnused3");
            return (Criteria) this;
        }

        public Criteria andUserUnused3LessThanOrEqualTo(Integer value) {
            addCriterion("USER_UNUSED3 <=", value, "userUnused3");
            return (Criteria) this;
        }

        public Criteria andUserUnused3In(List<Integer> values) {
            addCriterion("USER_UNUSED3 in", values, "userUnused3");
            return (Criteria) this;
        }

        public Criteria andUserUnused3NotIn(List<Integer> values) {
            addCriterion("USER_UNUSED3 not in", values, "userUnused3");
            return (Criteria) this;
        }

        public Criteria andUserUnused3Between(Integer value1, Integer value2) {
            addCriterion("USER_UNUSED3 between", value1, value2, "userUnused3");
            return (Criteria) this;
        }

        public Criteria andUserUnused3NotBetween(Integer value1, Integer value2) {
            addCriterion("USER_UNUSED3 not between", value1, value2, "userUnused3");
            return (Criteria) this;
        }

        public Criteria andUserUnused4IsNull() {
            addCriterion("USER_UNUSED4 is null");
            return (Criteria) this;
        }

        public Criteria andUserUnused4IsNotNull() {
            addCriterion("USER_UNUSED4 is not null");
            return (Criteria) this;
        }

        public Criteria andUserUnused4EqualTo(Integer value) {
            addCriterion("USER_UNUSED4 =", value, "userUnused4");
            return (Criteria) this;
        }

        public Criteria andUserUnused4NotEqualTo(Integer value) {
            addCriterion("USER_UNUSED4 <>", value, "userUnused4");
            return (Criteria) this;
        }

        public Criteria andUserUnused4GreaterThan(Integer value) {
            addCriterion("USER_UNUSED4 >", value, "userUnused4");
            return (Criteria) this;
        }

        public Criteria andUserUnused4GreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_UNUSED4 >=", value, "userUnused4");
            return (Criteria) this;
        }

        public Criteria andUserUnused4LessThan(Integer value) {
            addCriterion("USER_UNUSED4 <", value, "userUnused4");
            return (Criteria) this;
        }

        public Criteria andUserUnused4LessThanOrEqualTo(Integer value) {
            addCriterion("USER_UNUSED4 <=", value, "userUnused4");
            return (Criteria) this;
        }

        public Criteria andUserUnused4In(List<Integer> values) {
            addCriterion("USER_UNUSED4 in", values, "userUnused4");
            return (Criteria) this;
        }

        public Criteria andUserUnused4NotIn(List<Integer> values) {
            addCriterion("USER_UNUSED4 not in", values, "userUnused4");
            return (Criteria) this;
        }

        public Criteria andUserUnused4Between(Integer value1, Integer value2) {
            addCriterion("USER_UNUSED4 between", value1, value2, "userUnused4");
            return (Criteria) this;
        }

        public Criteria andUserUnused4NotBetween(Integer value1, Integer value2) {
            addCriterion("USER_UNUSED4 not between", value1, value2, "userUnused4");
            return (Criteria) this;
        }

        public Criteria andUserBeforeNineIsNull() {
            addCriterion("USER_BEFORE_NINE is null");
            return (Criteria) this;
        }

        public Criteria andUserBeforeNineIsNotNull() {
            addCriterion("USER_BEFORE_NINE is not null");
            return (Criteria) this;
        }

        public Criteria andUserBeforeNineEqualTo(Short value) {
            addCriterion("USER_BEFORE_NINE =", value, "userBeforeNine");
            return (Criteria) this;
        }

        public Criteria andUserBeforeNineNotEqualTo(Short value) {
            addCriterion("USER_BEFORE_NINE <>", value, "userBeforeNine");
            return (Criteria) this;
        }

        public Criteria andUserBeforeNineGreaterThan(Short value) {
            addCriterion("USER_BEFORE_NINE >", value, "userBeforeNine");
            return (Criteria) this;
        }

        public Criteria andUserBeforeNineGreaterThanOrEqualTo(Short value) {
            addCriterion("USER_BEFORE_NINE >=", value, "userBeforeNine");
            return (Criteria) this;
        }

        public Criteria andUserBeforeNineLessThan(Short value) {
            addCriterion("USER_BEFORE_NINE <", value, "userBeforeNine");
            return (Criteria) this;
        }

        public Criteria andUserBeforeNineLessThanOrEqualTo(Short value) {
            addCriterion("USER_BEFORE_NINE <=", value, "userBeforeNine");
            return (Criteria) this;
        }

        public Criteria andUserBeforeNineIn(List<Short> values) {
            addCriterion("USER_BEFORE_NINE in", values, "userBeforeNine");
            return (Criteria) this;
        }

        public Criteria andUserBeforeNineNotIn(List<Short> values) {
            addCriterion("USER_BEFORE_NINE not in", values, "userBeforeNine");
            return (Criteria) this;
        }

        public Criteria andUserBeforeNineBetween(Short value1, Short value2) {
            addCriterion("USER_BEFORE_NINE between", value1, value2, "userBeforeNine");
            return (Criteria) this;
        }

        public Criteria andUserBeforeNineNotBetween(Short value1, Short value2) {
            addCriterion("USER_BEFORE_NINE not between", value1, value2, "userBeforeNine");
            return (Criteria) this;
        }

        public Criteria andUserGatherIsNull() {
            addCriterion("USER_GATHER is null");
            return (Criteria) this;
        }

        public Criteria andUserGatherIsNotNull() {
            addCriterion("USER_GATHER is not null");
            return (Criteria) this;
        }

        public Criteria andUserGatherEqualTo(Integer value) {
            addCriterion("USER_GATHER =", value, "userGather");
            return (Criteria) this;
        }

        public Criteria andUserGatherNotEqualTo(Integer value) {
            addCriterion("USER_GATHER <>", value, "userGather");
            return (Criteria) this;
        }

        public Criteria andUserGatherGreaterThan(Integer value) {
            addCriterion("USER_GATHER >", value, "userGather");
            return (Criteria) this;
        }

        public Criteria andUserGatherGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_GATHER >=", value, "userGather");
            return (Criteria) this;
        }

        public Criteria andUserGatherLessThan(Integer value) {
            addCriterion("USER_GATHER <", value, "userGather");
            return (Criteria) this;
        }

        public Criteria andUserGatherLessThanOrEqualTo(Integer value) {
            addCriterion("USER_GATHER <=", value, "userGather");
            return (Criteria) this;
        }

        public Criteria andUserGatherIn(List<Integer> values) {
            addCriterion("USER_GATHER in", values, "userGather");
            return (Criteria) this;
        }

        public Criteria andUserGatherNotIn(List<Integer> values) {
            addCriterion("USER_GATHER not in", values, "userGather");
            return (Criteria) this;
        }

        public Criteria andUserGatherBetween(Integer value1, Integer value2) {
            addCriterion("USER_GATHER between", value1, value2, "userGather");
            return (Criteria) this;
        }

        public Criteria andUserGatherNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_GATHER not between", value1, value2, "userGather");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}