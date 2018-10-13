package com.fancl.db.mybatis.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysOrganizationCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public SysOrganizationCriteria() {
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

        public Criteria andOrgIdIsNull() {
            addCriterion("ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(String value) {
            addCriterion("ORG_ID =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(String value) {
            addCriterion("ORG_ID <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(String value) {
            addCriterion("ORG_ID >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_ID >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(String value) {
            addCriterion("ORG_ID <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(String value) {
            addCriterion("ORG_ID <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLike(String value) {
            addCriterion("ORG_ID like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotLike(String value) {
            addCriterion("ORG_ID not like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<String> values) {
            addCriterion("ORG_ID in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<String> values) {
            addCriterion("ORG_ID not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(String value1, String value2) {
            addCriterion("ORG_ID between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(String value1, String value2) {
            addCriterion("ORG_ID not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNull() {
            addCriterion("ORG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNotNull() {
            addCriterion("ORG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNameEqualTo(String value) {
            addCriterion("ORG_NAME =", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotEqualTo(String value) {
            addCriterion("ORG_NAME <>", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThan(String value) {
            addCriterion("ORG_NAME >", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_NAME >=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThan(String value) {
            addCriterion("ORG_NAME <", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThanOrEqualTo(String value) {
            addCriterion("ORG_NAME <=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLike(String value) {
            addCriterion("ORG_NAME like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotLike(String value) {
            addCriterion("ORG_NAME not like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameIn(List<String> values) {
            addCriterion("ORG_NAME in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotIn(List<String> values) {
            addCriterion("ORG_NAME not in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameBetween(String value1, String value2) {
            addCriterion("ORG_NAME between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotBetween(String value1, String value2) {
            addCriterion("ORG_NAME not between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNull() {
            addCriterion("ORG_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNotNull() {
            addCriterion("ORG_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeEqualTo(String value) {
            addCriterion("ORG_CODE =", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotEqualTo(String value) {
            addCriterion("ORG_CODE <>", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThan(String value) {
            addCriterion("ORG_CODE >", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_CODE >=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThan(String value) {
            addCriterion("ORG_CODE <", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("ORG_CODE <=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLike(String value) {
            addCriterion("ORG_CODE like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotLike(String value) {
            addCriterion("ORG_CODE not like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIn(List<String> values) {
            addCriterion("ORG_CODE in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotIn(List<String> values) {
            addCriterion("ORG_CODE not in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeBetween(String value1, String value2) {
            addCriterion("ORG_CODE between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotBetween(String value1, String value2) {
            addCriterion("ORG_CODE not between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCityIsNull() {
            addCriterion("ORG_CITY is null");
            return (Criteria) this;
        }

        public Criteria andOrgCityIsNotNull() {
            addCriterion("ORG_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCityEqualTo(String value) {
            addCriterion("ORG_CITY =", value, "orgCity");
            return (Criteria) this;
        }

        public Criteria andOrgCityNotEqualTo(String value) {
            addCriterion("ORG_CITY <>", value, "orgCity");
            return (Criteria) this;
        }

        public Criteria andOrgCityGreaterThan(String value) {
            addCriterion("ORG_CITY >", value, "orgCity");
            return (Criteria) this;
        }

        public Criteria andOrgCityGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_CITY >=", value, "orgCity");
            return (Criteria) this;
        }

        public Criteria andOrgCityLessThan(String value) {
            addCriterion("ORG_CITY <", value, "orgCity");
            return (Criteria) this;
        }

        public Criteria andOrgCityLessThanOrEqualTo(String value) {
            addCriterion("ORG_CITY <=", value, "orgCity");
            return (Criteria) this;
        }

        public Criteria andOrgCityLike(String value) {
            addCriterion("ORG_CITY like", value, "orgCity");
            return (Criteria) this;
        }

        public Criteria andOrgCityNotLike(String value) {
            addCriterion("ORG_CITY not like", value, "orgCity");
            return (Criteria) this;
        }

        public Criteria andOrgCityIn(List<String> values) {
            addCriterion("ORG_CITY in", values, "orgCity");
            return (Criteria) this;
        }

        public Criteria andOrgCityNotIn(List<String> values) {
            addCriterion("ORG_CITY not in", values, "orgCity");
            return (Criteria) this;
        }

        public Criteria andOrgCityBetween(String value1, String value2) {
            addCriterion("ORG_CITY between", value1, value2, "orgCity");
            return (Criteria) this;
        }

        public Criteria andOrgCityNotBetween(String value1, String value2) {
            addCriterion("ORG_CITY not between", value1, value2, "orgCity");
            return (Criteria) this;
        }

        public Criteria andOrgLevelIsNull() {
            addCriterion("ORG_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andOrgLevelIsNotNull() {
            addCriterion("ORG_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andOrgLevelEqualTo(String value) {
            addCriterion("ORG_LEVEL =", value, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelNotEqualTo(String value) {
            addCriterion("ORG_LEVEL <>", value, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelGreaterThan(String value) {
            addCriterion("ORG_LEVEL >", value, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_LEVEL >=", value, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelLessThan(String value) {
            addCriterion("ORG_LEVEL <", value, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelLessThanOrEqualTo(String value) {
            addCriterion("ORG_LEVEL <=", value, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelLike(String value) {
            addCriterion("ORG_LEVEL like", value, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelNotLike(String value) {
            addCriterion("ORG_LEVEL not like", value, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelIn(List<String> values) {
            addCriterion("ORG_LEVEL in", values, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelNotIn(List<String> values) {
            addCriterion("ORG_LEVEL not in", values, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelBetween(String value1, String value2) {
            addCriterion("ORG_LEVEL between", value1, value2, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelNotBetween(String value1, String value2) {
            addCriterion("ORG_LEVEL not between", value1, value2, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLayerIsNull() {
            addCriterion("ORG_LAYER is null");
            return (Criteria) this;
        }

        public Criteria andOrgLayerIsNotNull() {
            addCriterion("ORG_LAYER is not null");
            return (Criteria) this;
        }

        public Criteria andOrgLayerEqualTo(String value) {
            addCriterion("ORG_LAYER =", value, "orgLayer");
            return (Criteria) this;
        }

        public Criteria andOrgLayerNotEqualTo(String value) {
            addCriterion("ORG_LAYER <>", value, "orgLayer");
            return (Criteria) this;
        }

        public Criteria andOrgLayerGreaterThan(String value) {
            addCriterion("ORG_LAYER >", value, "orgLayer");
            return (Criteria) this;
        }

        public Criteria andOrgLayerGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_LAYER >=", value, "orgLayer");
            return (Criteria) this;
        }

        public Criteria andOrgLayerLessThan(String value) {
            addCriterion("ORG_LAYER <", value, "orgLayer");
            return (Criteria) this;
        }

        public Criteria andOrgLayerLessThanOrEqualTo(String value) {
            addCriterion("ORG_LAYER <=", value, "orgLayer");
            return (Criteria) this;
        }

        public Criteria andOrgLayerLike(String value) {
            addCriterion("ORG_LAYER like", value, "orgLayer");
            return (Criteria) this;
        }

        public Criteria andOrgLayerNotLike(String value) {
            addCriterion("ORG_LAYER not like", value, "orgLayer");
            return (Criteria) this;
        }

        public Criteria andOrgLayerIn(List<String> values) {
            addCriterion("ORG_LAYER in", values, "orgLayer");
            return (Criteria) this;
        }

        public Criteria andOrgLayerNotIn(List<String> values) {
            addCriterion("ORG_LAYER not in", values, "orgLayer");
            return (Criteria) this;
        }

        public Criteria andOrgLayerBetween(String value1, String value2) {
            addCriterion("ORG_LAYER between", value1, value2, "orgLayer");
            return (Criteria) this;
        }

        public Criteria andOrgLayerNotBetween(String value1, String value2) {
            addCriterion("ORG_LAYER not between", value1, value2, "orgLayer");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdIsNull() {
            addCriterion("ORG_PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdIsNotNull() {
            addCriterion("ORG_PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdEqualTo(String value) {
            addCriterion("ORG_PARENT_ID =", value, "orgParentId");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdNotEqualTo(String value) {
            addCriterion("ORG_PARENT_ID <>", value, "orgParentId");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdGreaterThan(String value) {
            addCriterion("ORG_PARENT_ID >", value, "orgParentId");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_PARENT_ID >=", value, "orgParentId");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdLessThan(String value) {
            addCriterion("ORG_PARENT_ID <", value, "orgParentId");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdLessThanOrEqualTo(String value) {
            addCriterion("ORG_PARENT_ID <=", value, "orgParentId");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdLike(String value) {
            addCriterion("ORG_PARENT_ID like", value, "orgParentId");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdNotLike(String value) {
            addCriterion("ORG_PARENT_ID not like", value, "orgParentId");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdIn(List<String> values) {
            addCriterion("ORG_PARENT_ID in", values, "orgParentId");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdNotIn(List<String> values) {
            addCriterion("ORG_PARENT_ID not in", values, "orgParentId");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdBetween(String value1, String value2) {
            addCriterion("ORG_PARENT_ID between", value1, value2, "orgParentId");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdNotBetween(String value1, String value2) {
            addCriterion("ORG_PARENT_ID not between", value1, value2, "orgParentId");
            return (Criteria) this;
        }

        public Criteria andOrgIsLeafIsNull() {
            addCriterion("ORG_IS_LEAF is null");
            return (Criteria) this;
        }

        public Criteria andOrgIsLeafIsNotNull() {
            addCriterion("ORG_IS_LEAF is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIsLeafEqualTo(Short value) {
            addCriterion("ORG_IS_LEAF =", value, "orgIsLeaf");
            return (Criteria) this;
        }

        public Criteria andOrgIsLeafNotEqualTo(Short value) {
            addCriterion("ORG_IS_LEAF <>", value, "orgIsLeaf");
            return (Criteria) this;
        }

        public Criteria andOrgIsLeafGreaterThan(Short value) {
            addCriterion("ORG_IS_LEAF >", value, "orgIsLeaf");
            return (Criteria) this;
        }

        public Criteria andOrgIsLeafGreaterThanOrEqualTo(Short value) {
            addCriterion("ORG_IS_LEAF >=", value, "orgIsLeaf");
            return (Criteria) this;
        }

        public Criteria andOrgIsLeafLessThan(Short value) {
            addCriterion("ORG_IS_LEAF <", value, "orgIsLeaf");
            return (Criteria) this;
        }

        public Criteria andOrgIsLeafLessThanOrEqualTo(Short value) {
            addCriterion("ORG_IS_LEAF <=", value, "orgIsLeaf");
            return (Criteria) this;
        }

        public Criteria andOrgIsLeafIn(List<Short> values) {
            addCriterion("ORG_IS_LEAF in", values, "orgIsLeaf");
            return (Criteria) this;
        }

        public Criteria andOrgIsLeafNotIn(List<Short> values) {
            addCriterion("ORG_IS_LEAF not in", values, "orgIsLeaf");
            return (Criteria) this;
        }

        public Criteria andOrgIsLeafBetween(Short value1, Short value2) {
            addCriterion("ORG_IS_LEAF between", value1, value2, "orgIsLeaf");
            return (Criteria) this;
        }

        public Criteria andOrgIsLeafNotBetween(Short value1, Short value2) {
            addCriterion("ORG_IS_LEAF not between", value1, value2, "orgIsLeaf");
            return (Criteria) this;
        }

        public Criteria andOrgManagerIsNull() {
            addCriterion("ORG_MANAGER is null");
            return (Criteria) this;
        }

        public Criteria andOrgManagerIsNotNull() {
            addCriterion("ORG_MANAGER is not null");
            return (Criteria) this;
        }

        public Criteria andOrgManagerEqualTo(String value) {
            addCriterion("ORG_MANAGER =", value, "orgManager");
            return (Criteria) this;
        }

        public Criteria andOrgManagerNotEqualTo(String value) {
            addCriterion("ORG_MANAGER <>", value, "orgManager");
            return (Criteria) this;
        }

        public Criteria andOrgManagerGreaterThan(String value) {
            addCriterion("ORG_MANAGER >", value, "orgManager");
            return (Criteria) this;
        }

        public Criteria andOrgManagerGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_MANAGER >=", value, "orgManager");
            return (Criteria) this;
        }

        public Criteria andOrgManagerLessThan(String value) {
            addCriterion("ORG_MANAGER <", value, "orgManager");
            return (Criteria) this;
        }

        public Criteria andOrgManagerLessThanOrEqualTo(String value) {
            addCriterion("ORG_MANAGER <=", value, "orgManager");
            return (Criteria) this;
        }

        public Criteria andOrgManagerLike(String value) {
            addCriterion("ORG_MANAGER like", value, "orgManager");
            return (Criteria) this;
        }

        public Criteria andOrgManagerNotLike(String value) {
            addCriterion("ORG_MANAGER not like", value, "orgManager");
            return (Criteria) this;
        }

        public Criteria andOrgManagerIn(List<String> values) {
            addCriterion("ORG_MANAGER in", values, "orgManager");
            return (Criteria) this;
        }

        public Criteria andOrgManagerNotIn(List<String> values) {
            addCriterion("ORG_MANAGER not in", values, "orgManager");
            return (Criteria) this;
        }

        public Criteria andOrgManagerBetween(String value1, String value2) {
            addCriterion("ORG_MANAGER between", value1, value2, "orgManager");
            return (Criteria) this;
        }

        public Criteria andOrgManagerNotBetween(String value1, String value2) {
            addCriterion("ORG_MANAGER not between", value1, value2, "orgManager");
            return (Criteria) this;
        }

        public Criteria andOrgManagerPhoneIsNull() {
            addCriterion("ORG_MANAGER_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andOrgManagerPhoneIsNotNull() {
            addCriterion("ORG_MANAGER_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgManagerPhoneEqualTo(String value) {
            addCriterion("ORG_MANAGER_PHONE =", value, "orgManagerPhone");
            return (Criteria) this;
        }

        public Criteria andOrgManagerPhoneNotEqualTo(String value) {
            addCriterion("ORG_MANAGER_PHONE <>", value, "orgManagerPhone");
            return (Criteria) this;
        }

        public Criteria andOrgManagerPhoneGreaterThan(String value) {
            addCriterion("ORG_MANAGER_PHONE >", value, "orgManagerPhone");
            return (Criteria) this;
        }

        public Criteria andOrgManagerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_MANAGER_PHONE >=", value, "orgManagerPhone");
            return (Criteria) this;
        }

        public Criteria andOrgManagerPhoneLessThan(String value) {
            addCriterion("ORG_MANAGER_PHONE <", value, "orgManagerPhone");
            return (Criteria) this;
        }

        public Criteria andOrgManagerPhoneLessThanOrEqualTo(String value) {
            addCriterion("ORG_MANAGER_PHONE <=", value, "orgManagerPhone");
            return (Criteria) this;
        }

        public Criteria andOrgManagerPhoneLike(String value) {
            addCriterion("ORG_MANAGER_PHONE like", value, "orgManagerPhone");
            return (Criteria) this;
        }

        public Criteria andOrgManagerPhoneNotLike(String value) {
            addCriterion("ORG_MANAGER_PHONE not like", value, "orgManagerPhone");
            return (Criteria) this;
        }

        public Criteria andOrgManagerPhoneIn(List<String> values) {
            addCriterion("ORG_MANAGER_PHONE in", values, "orgManagerPhone");
            return (Criteria) this;
        }

        public Criteria andOrgManagerPhoneNotIn(List<String> values) {
            addCriterion("ORG_MANAGER_PHONE not in", values, "orgManagerPhone");
            return (Criteria) this;
        }

        public Criteria andOrgManagerPhoneBetween(String value1, String value2) {
            addCriterion("ORG_MANAGER_PHONE between", value1, value2, "orgManagerPhone");
            return (Criteria) this;
        }

        public Criteria andOrgManagerPhoneNotBetween(String value1, String value2) {
            addCriterion("ORG_MANAGER_PHONE not between", value1, value2, "orgManagerPhone");
            return (Criteria) this;
        }

        public Criteria andOrgAddressIsNull() {
            addCriterion("ORG_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andOrgAddressIsNotNull() {
            addCriterion("ORG_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andOrgAddressEqualTo(String value) {
            addCriterion("ORG_ADDRESS =", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressNotEqualTo(String value) {
            addCriterion("ORG_ADDRESS <>", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressGreaterThan(String value) {
            addCriterion("ORG_ADDRESS >", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_ADDRESS >=", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressLessThan(String value) {
            addCriterion("ORG_ADDRESS <", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressLessThanOrEqualTo(String value) {
            addCriterion("ORG_ADDRESS <=", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressLike(String value) {
            addCriterion("ORG_ADDRESS like", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressNotLike(String value) {
            addCriterion("ORG_ADDRESS not like", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressIn(List<String> values) {
            addCriterion("ORG_ADDRESS in", values, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressNotIn(List<String> values) {
            addCriterion("ORG_ADDRESS not in", values, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressBetween(String value1, String value2) {
            addCriterion("ORG_ADDRESS between", value1, value2, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressNotBetween(String value1, String value2) {
            addCriterion("ORG_ADDRESS not between", value1, value2, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgBillAddressIsNull() {
            addCriterion("ORG_BILL_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andOrgBillAddressIsNotNull() {
            addCriterion("ORG_BILL_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andOrgBillAddressEqualTo(String value) {
            addCriterion("ORG_BILL_ADDRESS =", value, "orgBillAddress");
            return (Criteria) this;
        }

        public Criteria andOrgBillAddressNotEqualTo(String value) {
            addCriterion("ORG_BILL_ADDRESS <>", value, "orgBillAddress");
            return (Criteria) this;
        }

        public Criteria andOrgBillAddressGreaterThan(String value) {
            addCriterion("ORG_BILL_ADDRESS >", value, "orgBillAddress");
            return (Criteria) this;
        }

        public Criteria andOrgBillAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_BILL_ADDRESS >=", value, "orgBillAddress");
            return (Criteria) this;
        }

        public Criteria andOrgBillAddressLessThan(String value) {
            addCriterion("ORG_BILL_ADDRESS <", value, "orgBillAddress");
            return (Criteria) this;
        }

        public Criteria andOrgBillAddressLessThanOrEqualTo(String value) {
            addCriterion("ORG_BILL_ADDRESS <=", value, "orgBillAddress");
            return (Criteria) this;
        }

        public Criteria andOrgBillAddressLike(String value) {
            addCriterion("ORG_BILL_ADDRESS like", value, "orgBillAddress");
            return (Criteria) this;
        }

        public Criteria andOrgBillAddressNotLike(String value) {
            addCriterion("ORG_BILL_ADDRESS not like", value, "orgBillAddress");
            return (Criteria) this;
        }

        public Criteria andOrgBillAddressIn(List<String> values) {
            addCriterion("ORG_BILL_ADDRESS in", values, "orgBillAddress");
            return (Criteria) this;
        }

        public Criteria andOrgBillAddressNotIn(List<String> values) {
            addCriterion("ORG_BILL_ADDRESS not in", values, "orgBillAddress");
            return (Criteria) this;
        }

        public Criteria andOrgBillAddressBetween(String value1, String value2) {
            addCriterion("ORG_BILL_ADDRESS between", value1, value2, "orgBillAddress");
            return (Criteria) this;
        }

        public Criteria andOrgBillAddressNotBetween(String value1, String value2) {
            addCriterion("ORG_BILL_ADDRESS not between", value1, value2, "orgBillAddress");
            return (Criteria) this;
        }

        public Criteria andOrgPostCodeIsNull() {
            addCriterion("ORG_POST_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOrgPostCodeIsNotNull() {
            addCriterion("ORG_POST_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgPostCodeEqualTo(String value) {
            addCriterion("ORG_POST_CODE =", value, "orgPostCode");
            return (Criteria) this;
        }

        public Criteria andOrgPostCodeNotEqualTo(String value) {
            addCriterion("ORG_POST_CODE <>", value, "orgPostCode");
            return (Criteria) this;
        }

        public Criteria andOrgPostCodeGreaterThan(String value) {
            addCriterion("ORG_POST_CODE >", value, "orgPostCode");
            return (Criteria) this;
        }

        public Criteria andOrgPostCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_POST_CODE >=", value, "orgPostCode");
            return (Criteria) this;
        }

        public Criteria andOrgPostCodeLessThan(String value) {
            addCriterion("ORG_POST_CODE <", value, "orgPostCode");
            return (Criteria) this;
        }

        public Criteria andOrgPostCodeLessThanOrEqualTo(String value) {
            addCriterion("ORG_POST_CODE <=", value, "orgPostCode");
            return (Criteria) this;
        }

        public Criteria andOrgPostCodeLike(String value) {
            addCriterion("ORG_POST_CODE like", value, "orgPostCode");
            return (Criteria) this;
        }

        public Criteria andOrgPostCodeNotLike(String value) {
            addCriterion("ORG_POST_CODE not like", value, "orgPostCode");
            return (Criteria) this;
        }

        public Criteria andOrgPostCodeIn(List<String> values) {
            addCriterion("ORG_POST_CODE in", values, "orgPostCode");
            return (Criteria) this;
        }

        public Criteria andOrgPostCodeNotIn(List<String> values) {
            addCriterion("ORG_POST_CODE not in", values, "orgPostCode");
            return (Criteria) this;
        }

        public Criteria andOrgPostCodeBetween(String value1, String value2) {
            addCriterion("ORG_POST_CODE between", value1, value2, "orgPostCode");
            return (Criteria) this;
        }

        public Criteria andOrgPostCodeNotBetween(String value1, String value2) {
            addCriterion("ORG_POST_CODE not between", value1, value2, "orgPostCode");
            return (Criteria) this;
        }

        public Criteria andOrgTelephoneIsNull() {
            addCriterion("ORG_TELEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andOrgTelephoneIsNotNull() {
            addCriterion("ORG_TELEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgTelephoneEqualTo(String value) {
            addCriterion("ORG_TELEPHONE =", value, "orgTelephone");
            return (Criteria) this;
        }

        public Criteria andOrgTelephoneNotEqualTo(String value) {
            addCriterion("ORG_TELEPHONE <>", value, "orgTelephone");
            return (Criteria) this;
        }

        public Criteria andOrgTelephoneGreaterThan(String value) {
            addCriterion("ORG_TELEPHONE >", value, "orgTelephone");
            return (Criteria) this;
        }

        public Criteria andOrgTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_TELEPHONE >=", value, "orgTelephone");
            return (Criteria) this;
        }

        public Criteria andOrgTelephoneLessThan(String value) {
            addCriterion("ORG_TELEPHONE <", value, "orgTelephone");
            return (Criteria) this;
        }

        public Criteria andOrgTelephoneLessThanOrEqualTo(String value) {
            addCriterion("ORG_TELEPHONE <=", value, "orgTelephone");
            return (Criteria) this;
        }

        public Criteria andOrgTelephoneLike(String value) {
            addCriterion("ORG_TELEPHONE like", value, "orgTelephone");
            return (Criteria) this;
        }

        public Criteria andOrgTelephoneNotLike(String value) {
            addCriterion("ORG_TELEPHONE not like", value, "orgTelephone");
            return (Criteria) this;
        }

        public Criteria andOrgTelephoneIn(List<String> values) {
            addCriterion("ORG_TELEPHONE in", values, "orgTelephone");
            return (Criteria) this;
        }

        public Criteria andOrgTelephoneNotIn(List<String> values) {
            addCriterion("ORG_TELEPHONE not in", values, "orgTelephone");
            return (Criteria) this;
        }

        public Criteria andOrgTelephoneBetween(String value1, String value2) {
            addCriterion("ORG_TELEPHONE between", value1, value2, "orgTelephone");
            return (Criteria) this;
        }

        public Criteria andOrgTelephoneNotBetween(String value1, String value2) {
            addCriterion("ORG_TELEPHONE not between", value1, value2, "orgTelephone");
            return (Criteria) this;
        }

        public Criteria andOrgUniteIsNull() {
            addCriterion("ORG_UNITE is null");
            return (Criteria) this;
        }

        public Criteria andOrgUniteIsNotNull() {
            addCriterion("ORG_UNITE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgUniteEqualTo(String value) {
            addCriterion("ORG_UNITE =", value, "orgUnite");
            return (Criteria) this;
        }

        public Criteria andOrgUniteNotEqualTo(String value) {
            addCriterion("ORG_UNITE <>", value, "orgUnite");
            return (Criteria) this;
        }

        public Criteria andOrgUniteGreaterThan(String value) {
            addCriterion("ORG_UNITE >", value, "orgUnite");
            return (Criteria) this;
        }

        public Criteria andOrgUniteGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_UNITE >=", value, "orgUnite");
            return (Criteria) this;
        }

        public Criteria andOrgUniteLessThan(String value) {
            addCriterion("ORG_UNITE <", value, "orgUnite");
            return (Criteria) this;
        }

        public Criteria andOrgUniteLessThanOrEqualTo(String value) {
            addCriterion("ORG_UNITE <=", value, "orgUnite");
            return (Criteria) this;
        }

        public Criteria andOrgUniteLike(String value) {
            addCriterion("ORG_UNITE like", value, "orgUnite");
            return (Criteria) this;
        }

        public Criteria andOrgUniteNotLike(String value) {
            addCriterion("ORG_UNITE not like", value, "orgUnite");
            return (Criteria) this;
        }

        public Criteria andOrgUniteIn(List<String> values) {
            addCriterion("ORG_UNITE in", values, "orgUnite");
            return (Criteria) this;
        }

        public Criteria andOrgUniteNotIn(List<String> values) {
            addCriterion("ORG_UNITE not in", values, "orgUnite");
            return (Criteria) this;
        }

        public Criteria andOrgUniteBetween(String value1, String value2) {
            addCriterion("ORG_UNITE between", value1, value2, "orgUnite");
            return (Criteria) this;
        }

        public Criteria andOrgUniteNotBetween(String value1, String value2) {
            addCriterion("ORG_UNITE not between", value1, value2, "orgUnite");
            return (Criteria) this;
        }

        public Criteria andOrgActiveIsNull() {
            addCriterion("ORG_ACTIVE is null");
            return (Criteria) this;
        }

        public Criteria andOrgActiveIsNotNull() {
            addCriterion("ORG_ACTIVE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgActiveEqualTo(Short value) {
            addCriterion("ORG_ACTIVE =", value, "orgActive");
            return (Criteria) this;
        }

        public Criteria andOrgActiveNotEqualTo(Short value) {
            addCriterion("ORG_ACTIVE <>", value, "orgActive");
            return (Criteria) this;
        }

        public Criteria andOrgActiveGreaterThan(Short value) {
            addCriterion("ORG_ACTIVE >", value, "orgActive");
            return (Criteria) this;
        }

        public Criteria andOrgActiveGreaterThanOrEqualTo(Short value) {
            addCriterion("ORG_ACTIVE >=", value, "orgActive");
            return (Criteria) this;
        }

        public Criteria andOrgActiveLessThan(Short value) {
            addCriterion("ORG_ACTIVE <", value, "orgActive");
            return (Criteria) this;
        }

        public Criteria andOrgActiveLessThanOrEqualTo(Short value) {
            addCriterion("ORG_ACTIVE <=", value, "orgActive");
            return (Criteria) this;
        }

        public Criteria andOrgActiveIn(List<Short> values) {
            addCriterion("ORG_ACTIVE in", values, "orgActive");
            return (Criteria) this;
        }

        public Criteria andOrgActiveNotIn(List<Short> values) {
            addCriterion("ORG_ACTIVE not in", values, "orgActive");
            return (Criteria) this;
        }

        public Criteria andOrgActiveBetween(Short value1, Short value2) {
            addCriterion("ORG_ACTIVE between", value1, value2, "orgActive");
            return (Criteria) this;
        }

        public Criteria andOrgActiveNotBetween(Short value1, Short value2) {
            addCriterion("ORG_ACTIVE not between", value1, value2, "orgActive");
            return (Criteria) this;
        }

        public Criteria andOrgNoteIsNull() {
            addCriterion("ORG_NOTE is null");
            return (Criteria) this;
        }

        public Criteria andOrgNoteIsNotNull() {
            addCriterion("ORG_NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNoteEqualTo(String value) {
            addCriterion("ORG_NOTE =", value, "orgNote");
            return (Criteria) this;
        }

        public Criteria andOrgNoteNotEqualTo(String value) {
            addCriterion("ORG_NOTE <>", value, "orgNote");
            return (Criteria) this;
        }

        public Criteria andOrgNoteGreaterThan(String value) {
            addCriterion("ORG_NOTE >", value, "orgNote");
            return (Criteria) this;
        }

        public Criteria andOrgNoteGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_NOTE >=", value, "orgNote");
            return (Criteria) this;
        }

        public Criteria andOrgNoteLessThan(String value) {
            addCriterion("ORG_NOTE <", value, "orgNote");
            return (Criteria) this;
        }

        public Criteria andOrgNoteLessThanOrEqualTo(String value) {
            addCriterion("ORG_NOTE <=", value, "orgNote");
            return (Criteria) this;
        }

        public Criteria andOrgNoteLike(String value) {
            addCriterion("ORG_NOTE like", value, "orgNote");
            return (Criteria) this;
        }

        public Criteria andOrgNoteNotLike(String value) {
            addCriterion("ORG_NOTE not like", value, "orgNote");
            return (Criteria) this;
        }

        public Criteria andOrgNoteIn(List<String> values) {
            addCriterion("ORG_NOTE in", values, "orgNote");
            return (Criteria) this;
        }

        public Criteria andOrgNoteNotIn(List<String> values) {
            addCriterion("ORG_NOTE not in", values, "orgNote");
            return (Criteria) this;
        }

        public Criteria andOrgNoteBetween(String value1, String value2) {
            addCriterion("ORG_NOTE between", value1, value2, "orgNote");
            return (Criteria) this;
        }

        public Criteria andOrgNoteNotBetween(String value1, String value2) {
            addCriterion("ORG_NOTE not between", value1, value2, "orgNote");
            return (Criteria) this;
        }

        public Criteria andOrgCreateIdIsNull() {
            addCriterion("ORG_CREATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrgCreateIdIsNotNull() {
            addCriterion("ORG_CREATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCreateIdEqualTo(String value) {
            addCriterion("ORG_CREATE_ID =", value, "orgCreateId");
            return (Criteria) this;
        }

        public Criteria andOrgCreateIdNotEqualTo(String value) {
            addCriterion("ORG_CREATE_ID <>", value, "orgCreateId");
            return (Criteria) this;
        }

        public Criteria andOrgCreateIdGreaterThan(String value) {
            addCriterion("ORG_CREATE_ID >", value, "orgCreateId");
            return (Criteria) this;
        }

        public Criteria andOrgCreateIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_CREATE_ID >=", value, "orgCreateId");
            return (Criteria) this;
        }

        public Criteria andOrgCreateIdLessThan(String value) {
            addCriterion("ORG_CREATE_ID <", value, "orgCreateId");
            return (Criteria) this;
        }

        public Criteria andOrgCreateIdLessThanOrEqualTo(String value) {
            addCriterion("ORG_CREATE_ID <=", value, "orgCreateId");
            return (Criteria) this;
        }

        public Criteria andOrgCreateIdLike(String value) {
            addCriterion("ORG_CREATE_ID like", value, "orgCreateId");
            return (Criteria) this;
        }

        public Criteria andOrgCreateIdNotLike(String value) {
            addCriterion("ORG_CREATE_ID not like", value, "orgCreateId");
            return (Criteria) this;
        }

        public Criteria andOrgCreateIdIn(List<String> values) {
            addCriterion("ORG_CREATE_ID in", values, "orgCreateId");
            return (Criteria) this;
        }

        public Criteria andOrgCreateIdNotIn(List<String> values) {
            addCriterion("ORG_CREATE_ID not in", values, "orgCreateId");
            return (Criteria) this;
        }

        public Criteria andOrgCreateIdBetween(String value1, String value2) {
            addCriterion("ORG_CREATE_ID between", value1, value2, "orgCreateId");
            return (Criteria) this;
        }

        public Criteria andOrgCreateIdNotBetween(String value1, String value2) {
            addCriterion("ORG_CREATE_ID not between", value1, value2, "orgCreateId");
            return (Criteria) this;
        }

        public Criteria andOrgCreateDateIsNull() {
            addCriterion("ORG_CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andOrgCreateDateIsNotNull() {
            addCriterion("ORG_CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCreateDateEqualTo(Date value) {
            addCriterion("ORG_CREATE_DATE =", value, "orgCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrgCreateDateNotEqualTo(Date value) {
            addCriterion("ORG_CREATE_DATE <>", value, "orgCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrgCreateDateGreaterThan(Date value) {
            addCriterion("ORG_CREATE_DATE >", value, "orgCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrgCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ORG_CREATE_DATE >=", value, "orgCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrgCreateDateLessThan(Date value) {
            addCriterion("ORG_CREATE_DATE <", value, "orgCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrgCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("ORG_CREATE_DATE <=", value, "orgCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrgCreateDateIn(List<Date> values) {
            addCriterion("ORG_CREATE_DATE in", values, "orgCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrgCreateDateNotIn(List<Date> values) {
            addCriterion("ORG_CREATE_DATE not in", values, "orgCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrgCreateDateBetween(Date value1, Date value2) {
            addCriterion("ORG_CREATE_DATE between", value1, value2, "orgCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrgCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("ORG_CREATE_DATE not between", value1, value2, "orgCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrgUpdateIdIsNull() {
            addCriterion("ORG_UPDATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrgUpdateIdIsNotNull() {
            addCriterion("ORG_UPDATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgUpdateIdEqualTo(String value) {
            addCriterion("ORG_UPDATE_ID =", value, "orgUpdateId");
            return (Criteria) this;
        }

        public Criteria andOrgUpdateIdNotEqualTo(String value) {
            addCriterion("ORG_UPDATE_ID <>", value, "orgUpdateId");
            return (Criteria) this;
        }

        public Criteria andOrgUpdateIdGreaterThan(String value) {
            addCriterion("ORG_UPDATE_ID >", value, "orgUpdateId");
            return (Criteria) this;
        }

        public Criteria andOrgUpdateIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_UPDATE_ID >=", value, "orgUpdateId");
            return (Criteria) this;
        }

        public Criteria andOrgUpdateIdLessThan(String value) {
            addCriterion("ORG_UPDATE_ID <", value, "orgUpdateId");
            return (Criteria) this;
        }

        public Criteria andOrgUpdateIdLessThanOrEqualTo(String value) {
            addCriterion("ORG_UPDATE_ID <=", value, "orgUpdateId");
            return (Criteria) this;
        }

        public Criteria andOrgUpdateIdLike(String value) {
            addCriterion("ORG_UPDATE_ID like", value, "orgUpdateId");
            return (Criteria) this;
        }

        public Criteria andOrgUpdateIdNotLike(String value) {
            addCriterion("ORG_UPDATE_ID not like", value, "orgUpdateId");
            return (Criteria) this;
        }

        public Criteria andOrgUpdateIdIn(List<String> values) {
            addCriterion("ORG_UPDATE_ID in", values, "orgUpdateId");
            return (Criteria) this;
        }

        public Criteria andOrgUpdateIdNotIn(List<String> values) {
            addCriterion("ORG_UPDATE_ID not in", values, "orgUpdateId");
            return (Criteria) this;
        }

        public Criteria andOrgUpdateIdBetween(String value1, String value2) {
            addCriterion("ORG_UPDATE_ID between", value1, value2, "orgUpdateId");
            return (Criteria) this;
        }

        public Criteria andOrgUpdateIdNotBetween(String value1, String value2) {
            addCriterion("ORG_UPDATE_ID not between", value1, value2, "orgUpdateId");
            return (Criteria) this;
        }

        public Criteria andOrgUpdateDateIsNull() {
            addCriterion("ORG_UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andOrgUpdateDateIsNotNull() {
            addCriterion("ORG_UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgUpdateDateEqualTo(Date value) {
            addCriterion("ORG_UPDATE_DATE =", value, "orgUpdateDate");
            return (Criteria) this;
        }

        public Criteria andOrgUpdateDateNotEqualTo(Date value) {
            addCriterion("ORG_UPDATE_DATE <>", value, "orgUpdateDate");
            return (Criteria) this;
        }

        public Criteria andOrgUpdateDateGreaterThan(Date value) {
            addCriterion("ORG_UPDATE_DATE >", value, "orgUpdateDate");
            return (Criteria) this;
        }

        public Criteria andOrgUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ORG_UPDATE_DATE >=", value, "orgUpdateDate");
            return (Criteria) this;
        }

        public Criteria andOrgUpdateDateLessThan(Date value) {
            addCriterion("ORG_UPDATE_DATE <", value, "orgUpdateDate");
            return (Criteria) this;
        }

        public Criteria andOrgUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("ORG_UPDATE_DATE <=", value, "orgUpdateDate");
            return (Criteria) this;
        }

        public Criteria andOrgUpdateDateIn(List<Date> values) {
            addCriterion("ORG_UPDATE_DATE in", values, "orgUpdateDate");
            return (Criteria) this;
        }

        public Criteria andOrgUpdateDateNotIn(List<Date> values) {
            addCriterion("ORG_UPDATE_DATE not in", values, "orgUpdateDate");
            return (Criteria) this;
        }

        public Criteria andOrgUpdateDateBetween(Date value1, Date value2) {
            addCriterion("ORG_UPDATE_DATE between", value1, value2, "orgUpdateDate");
            return (Criteria) this;
        }

        public Criteria andOrgUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("ORG_UPDATE_DATE not between", value1, value2, "orgUpdateDate");
            return (Criteria) this;
        }

        public Criteria andOrgUnused1IsNull() {
            addCriterion("ORG_UNUSED1 is null");
            return (Criteria) this;
        }

        public Criteria andOrgUnused1IsNotNull() {
            addCriterion("ORG_UNUSED1 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgUnused1EqualTo(String value) {
            addCriterion("ORG_UNUSED1 =", value, "orgUnused1");
            return (Criteria) this;
        }

        public Criteria andOrgUnused1NotEqualTo(String value) {
            addCriterion("ORG_UNUSED1 <>", value, "orgUnused1");
            return (Criteria) this;
        }

        public Criteria andOrgUnused1GreaterThan(String value) {
            addCriterion("ORG_UNUSED1 >", value, "orgUnused1");
            return (Criteria) this;
        }

        public Criteria andOrgUnused1GreaterThanOrEqualTo(String value) {
            addCriterion("ORG_UNUSED1 >=", value, "orgUnused1");
            return (Criteria) this;
        }

        public Criteria andOrgUnused1LessThan(String value) {
            addCriterion("ORG_UNUSED1 <", value, "orgUnused1");
            return (Criteria) this;
        }

        public Criteria andOrgUnused1LessThanOrEqualTo(String value) {
            addCriterion("ORG_UNUSED1 <=", value, "orgUnused1");
            return (Criteria) this;
        }

        public Criteria andOrgUnused1Like(String value) {
            addCriterion("ORG_UNUSED1 like", value, "orgUnused1");
            return (Criteria) this;
        }

        public Criteria andOrgUnused1NotLike(String value) {
            addCriterion("ORG_UNUSED1 not like", value, "orgUnused1");
            return (Criteria) this;
        }

        public Criteria andOrgUnused1In(List<String> values) {
            addCriterion("ORG_UNUSED1 in", values, "orgUnused1");
            return (Criteria) this;
        }

        public Criteria andOrgUnused1NotIn(List<String> values) {
            addCriterion("ORG_UNUSED1 not in", values, "orgUnused1");
            return (Criteria) this;
        }

        public Criteria andOrgUnused1Between(String value1, String value2) {
            addCriterion("ORG_UNUSED1 between", value1, value2, "orgUnused1");
            return (Criteria) this;
        }

        public Criteria andOrgUnused1NotBetween(String value1, String value2) {
            addCriterion("ORG_UNUSED1 not between", value1, value2, "orgUnused1");
            return (Criteria) this;
        }

        public Criteria andOrgUnused2IsNull() {
            addCriterion("ORG_UNUSED2 is null");
            return (Criteria) this;
        }

        public Criteria andOrgUnused2IsNotNull() {
            addCriterion("ORG_UNUSED2 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgUnused2EqualTo(String value) {
            addCriterion("ORG_UNUSED2 =", value, "orgUnused2");
            return (Criteria) this;
        }

        public Criteria andOrgUnused2NotEqualTo(String value) {
            addCriterion("ORG_UNUSED2 <>", value, "orgUnused2");
            return (Criteria) this;
        }

        public Criteria andOrgUnused2GreaterThan(String value) {
            addCriterion("ORG_UNUSED2 >", value, "orgUnused2");
            return (Criteria) this;
        }

        public Criteria andOrgUnused2GreaterThanOrEqualTo(String value) {
            addCriterion("ORG_UNUSED2 >=", value, "orgUnused2");
            return (Criteria) this;
        }

        public Criteria andOrgUnused2LessThan(String value) {
            addCriterion("ORG_UNUSED2 <", value, "orgUnused2");
            return (Criteria) this;
        }

        public Criteria andOrgUnused2LessThanOrEqualTo(String value) {
            addCriterion("ORG_UNUSED2 <=", value, "orgUnused2");
            return (Criteria) this;
        }

        public Criteria andOrgUnused2Like(String value) {
            addCriterion("ORG_UNUSED2 like", value, "orgUnused2");
            return (Criteria) this;
        }

        public Criteria andOrgUnused2NotLike(String value) {
            addCriterion("ORG_UNUSED2 not like", value, "orgUnused2");
            return (Criteria) this;
        }

        public Criteria andOrgUnused2In(List<String> values) {
            addCriterion("ORG_UNUSED2 in", values, "orgUnused2");
            return (Criteria) this;
        }

        public Criteria andOrgUnused2NotIn(List<String> values) {
            addCriterion("ORG_UNUSED2 not in", values, "orgUnused2");
            return (Criteria) this;
        }

        public Criteria andOrgUnused2Between(String value1, String value2) {
            addCriterion("ORG_UNUSED2 between", value1, value2, "orgUnused2");
            return (Criteria) this;
        }

        public Criteria andOrgUnused2NotBetween(String value1, String value2) {
            addCriterion("ORG_UNUSED2 not between", value1, value2, "orgUnused2");
            return (Criteria) this;
        }

        public Criteria andOrgUnused3IsNull() {
            addCriterion("ORG_UNUSED3 is null");
            return (Criteria) this;
        }

        public Criteria andOrgUnused3IsNotNull() {
            addCriterion("ORG_UNUSED3 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgUnused3EqualTo(Integer value) {
            addCriterion("ORG_UNUSED3 =", value, "orgUnused3");
            return (Criteria) this;
        }

        public Criteria andOrgUnused3NotEqualTo(Integer value) {
            addCriterion("ORG_UNUSED3 <>", value, "orgUnused3");
            return (Criteria) this;
        }

        public Criteria andOrgUnused3GreaterThan(Integer value) {
            addCriterion("ORG_UNUSED3 >", value, "orgUnused3");
            return (Criteria) this;
        }

        public Criteria andOrgUnused3GreaterThanOrEqualTo(Integer value) {
            addCriterion("ORG_UNUSED3 >=", value, "orgUnused3");
            return (Criteria) this;
        }

        public Criteria andOrgUnused3LessThan(Integer value) {
            addCriterion("ORG_UNUSED3 <", value, "orgUnused3");
            return (Criteria) this;
        }

        public Criteria andOrgUnused3LessThanOrEqualTo(Integer value) {
            addCriterion("ORG_UNUSED3 <=", value, "orgUnused3");
            return (Criteria) this;
        }

        public Criteria andOrgUnused3In(List<Integer> values) {
            addCriterion("ORG_UNUSED3 in", values, "orgUnused3");
            return (Criteria) this;
        }

        public Criteria andOrgUnused3NotIn(List<Integer> values) {
            addCriterion("ORG_UNUSED3 not in", values, "orgUnused3");
            return (Criteria) this;
        }

        public Criteria andOrgUnused3Between(Integer value1, Integer value2) {
            addCriterion("ORG_UNUSED3 between", value1, value2, "orgUnused3");
            return (Criteria) this;
        }

        public Criteria andOrgUnused3NotBetween(Integer value1, Integer value2) {
            addCriterion("ORG_UNUSED3 not between", value1, value2, "orgUnused3");
            return (Criteria) this;
        }

        public Criteria andOrgUnused4IsNull() {
            addCriterion("ORG_UNUSED4 is null");
            return (Criteria) this;
        }

        public Criteria andOrgUnused4IsNotNull() {
            addCriterion("ORG_UNUSED4 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgUnused4EqualTo(Integer value) {
            addCriterion("ORG_UNUSED4 =", value, "orgUnused4");
            return (Criteria) this;
        }

        public Criteria andOrgUnused4NotEqualTo(Integer value) {
            addCriterion("ORG_UNUSED4 <>", value, "orgUnused4");
            return (Criteria) this;
        }

        public Criteria andOrgUnused4GreaterThan(Integer value) {
            addCriterion("ORG_UNUSED4 >", value, "orgUnused4");
            return (Criteria) this;
        }

        public Criteria andOrgUnused4GreaterThanOrEqualTo(Integer value) {
            addCriterion("ORG_UNUSED4 >=", value, "orgUnused4");
            return (Criteria) this;
        }

        public Criteria andOrgUnused4LessThan(Integer value) {
            addCriterion("ORG_UNUSED4 <", value, "orgUnused4");
            return (Criteria) this;
        }

        public Criteria andOrgUnused4LessThanOrEqualTo(Integer value) {
            addCriterion("ORG_UNUSED4 <=", value, "orgUnused4");
            return (Criteria) this;
        }

        public Criteria andOrgUnused4In(List<Integer> values) {
            addCriterion("ORG_UNUSED4 in", values, "orgUnused4");
            return (Criteria) this;
        }

        public Criteria andOrgUnused4NotIn(List<Integer> values) {
            addCriterion("ORG_UNUSED4 not in", values, "orgUnused4");
            return (Criteria) this;
        }

        public Criteria andOrgUnused4Between(Integer value1, Integer value2) {
            addCriterion("ORG_UNUSED4 between", value1, value2, "orgUnused4");
            return (Criteria) this;
        }

        public Criteria andOrgUnused4NotBetween(Integer value1, Integer value2) {
            addCriterion("ORG_UNUSED4 not between", value1, value2, "orgUnused4");
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