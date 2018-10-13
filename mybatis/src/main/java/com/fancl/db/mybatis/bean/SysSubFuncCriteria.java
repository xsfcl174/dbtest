package com.fancl.db.mybatis.bean;

import java.util.ArrayList;
import java.util.List;

public class SysSubFuncCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public SysSubFuncCriteria() {
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

        public Criteria andSfIdIsNull() {
            addCriterion("SF_ID is null");
            return (Criteria) this;
        }

        public Criteria andSfIdIsNotNull() {
            addCriterion("SF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSfIdEqualTo(Integer value) {
            addCriterion("SF_ID =", value, "sfId");
            return (Criteria) this;
        }

        public Criteria andSfIdNotEqualTo(Integer value) {
            addCriterion("SF_ID <>", value, "sfId");
            return (Criteria) this;
        }

        public Criteria andSfIdGreaterThan(Integer value) {
            addCriterion("SF_ID >", value, "sfId");
            return (Criteria) this;
        }

        public Criteria andSfIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SF_ID >=", value, "sfId");
            return (Criteria) this;
        }

        public Criteria andSfIdLessThan(Integer value) {
            addCriterion("SF_ID <", value, "sfId");
            return (Criteria) this;
        }

        public Criteria andSfIdLessThanOrEqualTo(Integer value) {
            addCriterion("SF_ID <=", value, "sfId");
            return (Criteria) this;
        }

        public Criteria andSfIdIn(List<Integer> values) {
            addCriterion("SF_ID in", values, "sfId");
            return (Criteria) this;
        }

        public Criteria andSfIdNotIn(List<Integer> values) {
            addCriterion("SF_ID not in", values, "sfId");
            return (Criteria) this;
        }

        public Criteria andSfIdBetween(Integer value1, Integer value2) {
            addCriterion("SF_ID between", value1, value2, "sfId");
            return (Criteria) this;
        }

        public Criteria andSfIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SF_ID not between", value1, value2, "sfId");
            return (Criteria) this;
        }

        public Criteria andSfFnIdIsNull() {
            addCriterion("SF_FN_ID is null");
            return (Criteria) this;
        }

        public Criteria andSfFnIdIsNotNull() {
            addCriterion("SF_FN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSfFnIdEqualTo(Integer value) {
            addCriterion("SF_FN_ID =", value, "sfFnId");
            return (Criteria) this;
        }

        public Criteria andSfFnIdNotEqualTo(Integer value) {
            addCriterion("SF_FN_ID <>", value, "sfFnId");
            return (Criteria) this;
        }

        public Criteria andSfFnIdGreaterThan(Integer value) {
            addCriterion("SF_FN_ID >", value, "sfFnId");
            return (Criteria) this;
        }

        public Criteria andSfFnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SF_FN_ID >=", value, "sfFnId");
            return (Criteria) this;
        }

        public Criteria andSfFnIdLessThan(Integer value) {
            addCriterion("SF_FN_ID <", value, "sfFnId");
            return (Criteria) this;
        }

        public Criteria andSfFnIdLessThanOrEqualTo(Integer value) {
            addCriterion("SF_FN_ID <=", value, "sfFnId");
            return (Criteria) this;
        }

        public Criteria andSfFnIdIn(List<Integer> values) {
            addCriterion("SF_FN_ID in", values, "sfFnId");
            return (Criteria) this;
        }

        public Criteria andSfFnIdNotIn(List<Integer> values) {
            addCriterion("SF_FN_ID not in", values, "sfFnId");
            return (Criteria) this;
        }

        public Criteria andSfFnIdBetween(Integer value1, Integer value2) {
            addCriterion("SF_FN_ID between", value1, value2, "sfFnId");
            return (Criteria) this;
        }

        public Criteria andSfFnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SF_FN_ID not between", value1, value2, "sfFnId");
            return (Criteria) this;
        }

        public Criteria andSfNameIsNull() {
            addCriterion("SF_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSfNameIsNotNull() {
            addCriterion("SF_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSfNameEqualTo(String value) {
            addCriterion("SF_NAME =", value, "sfName");
            return (Criteria) this;
        }

        public Criteria andSfNameNotEqualTo(String value) {
            addCriterion("SF_NAME <>", value, "sfName");
            return (Criteria) this;
        }

        public Criteria andSfNameGreaterThan(String value) {
            addCriterion("SF_NAME >", value, "sfName");
            return (Criteria) this;
        }

        public Criteria andSfNameGreaterThanOrEqualTo(String value) {
            addCriterion("SF_NAME >=", value, "sfName");
            return (Criteria) this;
        }

        public Criteria andSfNameLessThan(String value) {
            addCriterion("SF_NAME <", value, "sfName");
            return (Criteria) this;
        }

        public Criteria andSfNameLessThanOrEqualTo(String value) {
            addCriterion("SF_NAME <=", value, "sfName");
            return (Criteria) this;
        }

        public Criteria andSfNameLike(String value) {
            addCriterion("SF_NAME like", value, "sfName");
            return (Criteria) this;
        }

        public Criteria andSfNameNotLike(String value) {
            addCriterion("SF_NAME not like", value, "sfName");
            return (Criteria) this;
        }

        public Criteria andSfNameIn(List<String> values) {
            addCriterion("SF_NAME in", values, "sfName");
            return (Criteria) this;
        }

        public Criteria andSfNameNotIn(List<String> values) {
            addCriterion("SF_NAME not in", values, "sfName");
            return (Criteria) this;
        }

        public Criteria andSfNameBetween(String value1, String value2) {
            addCriterion("SF_NAME between", value1, value2, "sfName");
            return (Criteria) this;
        }

        public Criteria andSfNameNotBetween(String value1, String value2) {
            addCriterion("SF_NAME not between", value1, value2, "sfName");
            return (Criteria) this;
        }

        public Criteria andSfNameIdIsNull() {
            addCriterion("SF_NAME_ID is null");
            return (Criteria) this;
        }

        public Criteria andSfNameIdIsNotNull() {
            addCriterion("SF_NAME_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSfNameIdEqualTo(String value) {
            addCriterion("SF_NAME_ID =", value, "sfNameId");
            return (Criteria) this;
        }

        public Criteria andSfNameIdNotEqualTo(String value) {
            addCriterion("SF_NAME_ID <>", value, "sfNameId");
            return (Criteria) this;
        }

        public Criteria andSfNameIdGreaterThan(String value) {
            addCriterion("SF_NAME_ID >", value, "sfNameId");
            return (Criteria) this;
        }

        public Criteria andSfNameIdGreaterThanOrEqualTo(String value) {
            addCriterion("SF_NAME_ID >=", value, "sfNameId");
            return (Criteria) this;
        }

        public Criteria andSfNameIdLessThan(String value) {
            addCriterion("SF_NAME_ID <", value, "sfNameId");
            return (Criteria) this;
        }

        public Criteria andSfNameIdLessThanOrEqualTo(String value) {
            addCriterion("SF_NAME_ID <=", value, "sfNameId");
            return (Criteria) this;
        }

        public Criteria andSfNameIdLike(String value) {
            addCriterion("SF_NAME_ID like", value, "sfNameId");
            return (Criteria) this;
        }

        public Criteria andSfNameIdNotLike(String value) {
            addCriterion("SF_NAME_ID not like", value, "sfNameId");
            return (Criteria) this;
        }

        public Criteria andSfNameIdIn(List<String> values) {
            addCriterion("SF_NAME_ID in", values, "sfNameId");
            return (Criteria) this;
        }

        public Criteria andSfNameIdNotIn(List<String> values) {
            addCriterion("SF_NAME_ID not in", values, "sfNameId");
            return (Criteria) this;
        }

        public Criteria andSfNameIdBetween(String value1, String value2) {
            addCriterion("SF_NAME_ID between", value1, value2, "sfNameId");
            return (Criteria) this;
        }

        public Criteria andSfNameIdNotBetween(String value1, String value2) {
            addCriterion("SF_NAME_ID not between", value1, value2, "sfNameId");
            return (Criteria) this;
        }

        public Criteria andSfPositionIsNull() {
            addCriterion("SF_POSITION is null");
            return (Criteria) this;
        }

        public Criteria andSfPositionIsNotNull() {
            addCriterion("SF_POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andSfPositionEqualTo(String value) {
            addCriterion("SF_POSITION =", value, "sfPosition");
            return (Criteria) this;
        }

        public Criteria andSfPositionNotEqualTo(String value) {
            addCriterion("SF_POSITION <>", value, "sfPosition");
            return (Criteria) this;
        }

        public Criteria andSfPositionGreaterThan(String value) {
            addCriterion("SF_POSITION >", value, "sfPosition");
            return (Criteria) this;
        }

        public Criteria andSfPositionGreaterThanOrEqualTo(String value) {
            addCriterion("SF_POSITION >=", value, "sfPosition");
            return (Criteria) this;
        }

        public Criteria andSfPositionLessThan(String value) {
            addCriterion("SF_POSITION <", value, "sfPosition");
            return (Criteria) this;
        }

        public Criteria andSfPositionLessThanOrEqualTo(String value) {
            addCriterion("SF_POSITION <=", value, "sfPosition");
            return (Criteria) this;
        }

        public Criteria andSfPositionLike(String value) {
            addCriterion("SF_POSITION like", value, "sfPosition");
            return (Criteria) this;
        }

        public Criteria andSfPositionNotLike(String value) {
            addCriterion("SF_POSITION not like", value, "sfPosition");
            return (Criteria) this;
        }

        public Criteria andSfPositionIn(List<String> values) {
            addCriterion("SF_POSITION in", values, "sfPosition");
            return (Criteria) this;
        }

        public Criteria andSfPositionNotIn(List<String> values) {
            addCriterion("SF_POSITION not in", values, "sfPosition");
            return (Criteria) this;
        }

        public Criteria andSfPositionBetween(String value1, String value2) {
            addCriterion("SF_POSITION between", value1, value2, "sfPosition");
            return (Criteria) this;
        }

        public Criteria andSfPositionNotBetween(String value1, String value2) {
            addCriterion("SF_POSITION not between", value1, value2, "sfPosition");
            return (Criteria) this;
        }

        public Criteria andSfIconIsNull() {
            addCriterion("SF_ICON is null");
            return (Criteria) this;
        }

        public Criteria andSfIconIsNotNull() {
            addCriterion("SF_ICON is not null");
            return (Criteria) this;
        }

        public Criteria andSfIconEqualTo(String value) {
            addCriterion("SF_ICON =", value, "sfIcon");
            return (Criteria) this;
        }

        public Criteria andSfIconNotEqualTo(String value) {
            addCriterion("SF_ICON <>", value, "sfIcon");
            return (Criteria) this;
        }

        public Criteria andSfIconGreaterThan(String value) {
            addCriterion("SF_ICON >", value, "sfIcon");
            return (Criteria) this;
        }

        public Criteria andSfIconGreaterThanOrEqualTo(String value) {
            addCriterion("SF_ICON >=", value, "sfIcon");
            return (Criteria) this;
        }

        public Criteria andSfIconLessThan(String value) {
            addCriterion("SF_ICON <", value, "sfIcon");
            return (Criteria) this;
        }

        public Criteria andSfIconLessThanOrEqualTo(String value) {
            addCriterion("SF_ICON <=", value, "sfIcon");
            return (Criteria) this;
        }

        public Criteria andSfIconLike(String value) {
            addCriterion("SF_ICON like", value, "sfIcon");
            return (Criteria) this;
        }

        public Criteria andSfIconNotLike(String value) {
            addCriterion("SF_ICON not like", value, "sfIcon");
            return (Criteria) this;
        }

        public Criteria andSfIconIn(List<String> values) {
            addCriterion("SF_ICON in", values, "sfIcon");
            return (Criteria) this;
        }

        public Criteria andSfIconNotIn(List<String> values) {
            addCriterion("SF_ICON not in", values, "sfIcon");
            return (Criteria) this;
        }

        public Criteria andSfIconBetween(String value1, String value2) {
            addCriterion("SF_ICON between", value1, value2, "sfIcon");
            return (Criteria) this;
        }

        public Criteria andSfIconNotBetween(String value1, String value2) {
            addCriterion("SF_ICON not between", value1, value2, "sfIcon");
            return (Criteria) this;
        }

        public Criteria andSfUseKeyIsNull() {
            addCriterion("SF_USE_KEY is null");
            return (Criteria) this;
        }

        public Criteria andSfUseKeyIsNotNull() {
            addCriterion("SF_USE_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andSfUseKeyEqualTo(Short value) {
            addCriterion("SF_USE_KEY =", value, "sfUseKey");
            return (Criteria) this;
        }

        public Criteria andSfUseKeyNotEqualTo(Short value) {
            addCriterion("SF_USE_KEY <>", value, "sfUseKey");
            return (Criteria) this;
        }

        public Criteria andSfUseKeyGreaterThan(Short value) {
            addCriterion("SF_USE_KEY >", value, "sfUseKey");
            return (Criteria) this;
        }

        public Criteria andSfUseKeyGreaterThanOrEqualTo(Short value) {
            addCriterion("SF_USE_KEY >=", value, "sfUseKey");
            return (Criteria) this;
        }

        public Criteria andSfUseKeyLessThan(Short value) {
            addCriterion("SF_USE_KEY <", value, "sfUseKey");
            return (Criteria) this;
        }

        public Criteria andSfUseKeyLessThanOrEqualTo(Short value) {
            addCriterion("SF_USE_KEY <=", value, "sfUseKey");
            return (Criteria) this;
        }

        public Criteria andSfUseKeyIn(List<Short> values) {
            addCriterion("SF_USE_KEY in", values, "sfUseKey");
            return (Criteria) this;
        }

        public Criteria andSfUseKeyNotIn(List<Short> values) {
            addCriterion("SF_USE_KEY not in", values, "sfUseKey");
            return (Criteria) this;
        }

        public Criteria andSfUseKeyBetween(Short value1, Short value2) {
            addCriterion("SF_USE_KEY between", value1, value2, "sfUseKey");
            return (Criteria) this;
        }

        public Criteria andSfUseKeyNotBetween(Short value1, Short value2) {
            addCriterion("SF_USE_KEY not between", value1, value2, "sfUseKey");
            return (Criteria) this;
        }

        public Criteria andSfContentIsNull() {
            addCriterion("SF_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andSfContentIsNotNull() {
            addCriterion("SF_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andSfContentEqualTo(String value) {
            addCriterion("SF_CONTENT =", value, "sfContent");
            return (Criteria) this;
        }

        public Criteria andSfContentNotEqualTo(String value) {
            addCriterion("SF_CONTENT <>", value, "sfContent");
            return (Criteria) this;
        }

        public Criteria andSfContentGreaterThan(String value) {
            addCriterion("SF_CONTENT >", value, "sfContent");
            return (Criteria) this;
        }

        public Criteria andSfContentGreaterThanOrEqualTo(String value) {
            addCriterion("SF_CONTENT >=", value, "sfContent");
            return (Criteria) this;
        }

        public Criteria andSfContentLessThan(String value) {
            addCriterion("SF_CONTENT <", value, "sfContent");
            return (Criteria) this;
        }

        public Criteria andSfContentLessThanOrEqualTo(String value) {
            addCriterion("SF_CONTENT <=", value, "sfContent");
            return (Criteria) this;
        }

        public Criteria andSfContentLike(String value) {
            addCriterion("SF_CONTENT like", value, "sfContent");
            return (Criteria) this;
        }

        public Criteria andSfContentNotLike(String value) {
            addCriterion("SF_CONTENT not like", value, "sfContent");
            return (Criteria) this;
        }

        public Criteria andSfContentIn(List<String> values) {
            addCriterion("SF_CONTENT in", values, "sfContent");
            return (Criteria) this;
        }

        public Criteria andSfContentNotIn(List<String> values) {
            addCriterion("SF_CONTENT not in", values, "sfContent");
            return (Criteria) this;
        }

        public Criteria andSfContentBetween(String value1, String value2) {
            addCriterion("SF_CONTENT between", value1, value2, "sfContent");
            return (Criteria) this;
        }

        public Criteria andSfContentNotBetween(String value1, String value2) {
            addCriterion("SF_CONTENT not between", value1, value2, "sfContent");
            return (Criteria) this;
        }

        public Criteria andSfUseMarcoIsNull() {
            addCriterion("SF_USE_MARCO is null");
            return (Criteria) this;
        }

        public Criteria andSfUseMarcoIsNotNull() {
            addCriterion("SF_USE_MARCO is not null");
            return (Criteria) this;
        }

        public Criteria andSfUseMarcoEqualTo(Short value) {
            addCriterion("SF_USE_MARCO =", value, "sfUseMarco");
            return (Criteria) this;
        }

        public Criteria andSfUseMarcoNotEqualTo(Short value) {
            addCriterion("SF_USE_MARCO <>", value, "sfUseMarco");
            return (Criteria) this;
        }

        public Criteria andSfUseMarcoGreaterThan(Short value) {
            addCriterion("SF_USE_MARCO >", value, "sfUseMarco");
            return (Criteria) this;
        }

        public Criteria andSfUseMarcoGreaterThanOrEqualTo(Short value) {
            addCriterion("SF_USE_MARCO >=", value, "sfUseMarco");
            return (Criteria) this;
        }

        public Criteria andSfUseMarcoLessThan(Short value) {
            addCriterion("SF_USE_MARCO <", value, "sfUseMarco");
            return (Criteria) this;
        }

        public Criteria andSfUseMarcoLessThanOrEqualTo(Short value) {
            addCriterion("SF_USE_MARCO <=", value, "sfUseMarco");
            return (Criteria) this;
        }

        public Criteria andSfUseMarcoIn(List<Short> values) {
            addCriterion("SF_USE_MARCO in", values, "sfUseMarco");
            return (Criteria) this;
        }

        public Criteria andSfUseMarcoNotIn(List<Short> values) {
            addCriterion("SF_USE_MARCO not in", values, "sfUseMarco");
            return (Criteria) this;
        }

        public Criteria andSfUseMarcoBetween(Short value1, Short value2) {
            addCriterion("SF_USE_MARCO between", value1, value2, "sfUseMarco");
            return (Criteria) this;
        }

        public Criteria andSfUseMarcoNotBetween(Short value1, Short value2) {
            addCriterion("SF_USE_MARCO not between", value1, value2, "sfUseMarco");
            return (Criteria) this;
        }

        public Criteria andSfConfirmDataIsNull() {
            addCriterion("SF_CONFIRM_DATA is null");
            return (Criteria) this;
        }

        public Criteria andSfConfirmDataIsNotNull() {
            addCriterion("SF_CONFIRM_DATA is not null");
            return (Criteria) this;
        }

        public Criteria andSfConfirmDataEqualTo(String value) {
            addCriterion("SF_CONFIRM_DATA =", value, "sfConfirmData");
            return (Criteria) this;
        }

        public Criteria andSfConfirmDataNotEqualTo(String value) {
            addCriterion("SF_CONFIRM_DATA <>", value, "sfConfirmData");
            return (Criteria) this;
        }

        public Criteria andSfConfirmDataGreaterThan(String value) {
            addCriterion("SF_CONFIRM_DATA >", value, "sfConfirmData");
            return (Criteria) this;
        }

        public Criteria andSfConfirmDataGreaterThanOrEqualTo(String value) {
            addCriterion("SF_CONFIRM_DATA >=", value, "sfConfirmData");
            return (Criteria) this;
        }

        public Criteria andSfConfirmDataLessThan(String value) {
            addCriterion("SF_CONFIRM_DATA <", value, "sfConfirmData");
            return (Criteria) this;
        }

        public Criteria andSfConfirmDataLessThanOrEqualTo(String value) {
            addCriterion("SF_CONFIRM_DATA <=", value, "sfConfirmData");
            return (Criteria) this;
        }

        public Criteria andSfConfirmDataLike(String value) {
            addCriterion("SF_CONFIRM_DATA like", value, "sfConfirmData");
            return (Criteria) this;
        }

        public Criteria andSfConfirmDataNotLike(String value) {
            addCriterion("SF_CONFIRM_DATA not like", value, "sfConfirmData");
            return (Criteria) this;
        }

        public Criteria andSfConfirmDataIn(List<String> values) {
            addCriterion("SF_CONFIRM_DATA in", values, "sfConfirmData");
            return (Criteria) this;
        }

        public Criteria andSfConfirmDataNotIn(List<String> values) {
            addCriterion("SF_CONFIRM_DATA not in", values, "sfConfirmData");
            return (Criteria) this;
        }

        public Criteria andSfConfirmDataBetween(String value1, String value2) {
            addCriterion("SF_CONFIRM_DATA between", value1, value2, "sfConfirmData");
            return (Criteria) this;
        }

        public Criteria andSfConfirmDataNotBetween(String value1, String value2) {
            addCriterion("SF_CONFIRM_DATA not between", value1, value2, "sfConfirmData");
            return (Criteria) this;
        }

        public Criteria andSfDialogTitleIsNull() {
            addCriterion("SF_DIALOG_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andSfDialogTitleIsNotNull() {
            addCriterion("SF_DIALOG_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andSfDialogTitleEqualTo(String value) {
            addCriterion("SF_DIALOG_TITLE =", value, "sfDialogTitle");
            return (Criteria) this;
        }

        public Criteria andSfDialogTitleNotEqualTo(String value) {
            addCriterion("SF_DIALOG_TITLE <>", value, "sfDialogTitle");
            return (Criteria) this;
        }

        public Criteria andSfDialogTitleGreaterThan(String value) {
            addCriterion("SF_DIALOG_TITLE >", value, "sfDialogTitle");
            return (Criteria) this;
        }

        public Criteria andSfDialogTitleGreaterThanOrEqualTo(String value) {
            addCriterion("SF_DIALOG_TITLE >=", value, "sfDialogTitle");
            return (Criteria) this;
        }

        public Criteria andSfDialogTitleLessThan(String value) {
            addCriterion("SF_DIALOG_TITLE <", value, "sfDialogTitle");
            return (Criteria) this;
        }

        public Criteria andSfDialogTitleLessThanOrEqualTo(String value) {
            addCriterion("SF_DIALOG_TITLE <=", value, "sfDialogTitle");
            return (Criteria) this;
        }

        public Criteria andSfDialogTitleLike(String value) {
            addCriterion("SF_DIALOG_TITLE like", value, "sfDialogTitle");
            return (Criteria) this;
        }

        public Criteria andSfDialogTitleNotLike(String value) {
            addCriterion("SF_DIALOG_TITLE not like", value, "sfDialogTitle");
            return (Criteria) this;
        }

        public Criteria andSfDialogTitleIn(List<String> values) {
            addCriterion("SF_DIALOG_TITLE in", values, "sfDialogTitle");
            return (Criteria) this;
        }

        public Criteria andSfDialogTitleNotIn(List<String> values) {
            addCriterion("SF_DIALOG_TITLE not in", values, "sfDialogTitle");
            return (Criteria) this;
        }

        public Criteria andSfDialogTitleBetween(String value1, String value2) {
            addCriterion("SF_DIALOG_TITLE between", value1, value2, "sfDialogTitle");
            return (Criteria) this;
        }

        public Criteria andSfDialogTitleNotBetween(String value1, String value2) {
            addCriterion("SF_DIALOG_TITLE not between", value1, value2, "sfDialogTitle");
            return (Criteria) this;
        }

        public Criteria andSfInfoIsNull() {
            addCriterion("SF_INFO is null");
            return (Criteria) this;
        }

        public Criteria andSfInfoIsNotNull() {
            addCriterion("SF_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andSfInfoEqualTo(String value) {
            addCriterion("SF_INFO =", value, "sfInfo");
            return (Criteria) this;
        }

        public Criteria andSfInfoNotEqualTo(String value) {
            addCriterion("SF_INFO <>", value, "sfInfo");
            return (Criteria) this;
        }

        public Criteria andSfInfoGreaterThan(String value) {
            addCriterion("SF_INFO >", value, "sfInfo");
            return (Criteria) this;
        }

        public Criteria andSfInfoGreaterThanOrEqualTo(String value) {
            addCriterion("SF_INFO >=", value, "sfInfo");
            return (Criteria) this;
        }

        public Criteria andSfInfoLessThan(String value) {
            addCriterion("SF_INFO <", value, "sfInfo");
            return (Criteria) this;
        }

        public Criteria andSfInfoLessThanOrEqualTo(String value) {
            addCriterion("SF_INFO <=", value, "sfInfo");
            return (Criteria) this;
        }

        public Criteria andSfInfoLike(String value) {
            addCriterion("SF_INFO like", value, "sfInfo");
            return (Criteria) this;
        }

        public Criteria andSfInfoNotLike(String value) {
            addCriterion("SF_INFO not like", value, "sfInfo");
            return (Criteria) this;
        }

        public Criteria andSfInfoIn(List<String> values) {
            addCriterion("SF_INFO in", values, "sfInfo");
            return (Criteria) this;
        }

        public Criteria andSfInfoNotIn(List<String> values) {
            addCriterion("SF_INFO not in", values, "sfInfo");
            return (Criteria) this;
        }

        public Criteria andSfInfoBetween(String value1, String value2) {
            addCriterion("SF_INFO between", value1, value2, "sfInfo");
            return (Criteria) this;
        }

        public Criteria andSfInfoNotBetween(String value1, String value2) {
            addCriterion("SF_INFO not between", value1, value2, "sfInfo");
            return (Criteria) this;
        }

        public Criteria andSfOrderIsNull() {
            addCriterion("SF_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andSfOrderIsNotNull() {
            addCriterion("SF_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andSfOrderEqualTo(Integer value) {
            addCriterion("SF_ORDER =", value, "sfOrder");
            return (Criteria) this;
        }

        public Criteria andSfOrderNotEqualTo(Integer value) {
            addCriterion("SF_ORDER <>", value, "sfOrder");
            return (Criteria) this;
        }

        public Criteria andSfOrderGreaterThan(Integer value) {
            addCriterion("SF_ORDER >", value, "sfOrder");
            return (Criteria) this;
        }

        public Criteria andSfOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("SF_ORDER >=", value, "sfOrder");
            return (Criteria) this;
        }

        public Criteria andSfOrderLessThan(Integer value) {
            addCriterion("SF_ORDER <", value, "sfOrder");
            return (Criteria) this;
        }

        public Criteria andSfOrderLessThanOrEqualTo(Integer value) {
            addCriterion("SF_ORDER <=", value, "sfOrder");
            return (Criteria) this;
        }

        public Criteria andSfOrderIn(List<Integer> values) {
            addCriterion("SF_ORDER in", values, "sfOrder");
            return (Criteria) this;
        }

        public Criteria andSfOrderNotIn(List<Integer> values) {
            addCriterion("SF_ORDER not in", values, "sfOrder");
            return (Criteria) this;
        }

        public Criteria andSfOrderBetween(Integer value1, Integer value2) {
            addCriterion("SF_ORDER between", value1, value2, "sfOrder");
            return (Criteria) this;
        }

        public Criteria andSfOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("SF_ORDER not between", value1, value2, "sfOrder");
            return (Criteria) this;
        }

        public Criteria andSfPageIsNull() {
            addCriterion("SF_PAGE is null");
            return (Criteria) this;
        }

        public Criteria andSfPageIsNotNull() {
            addCriterion("SF_PAGE is not null");
            return (Criteria) this;
        }

        public Criteria andSfPageEqualTo(String value) {
            addCriterion("SF_PAGE =", value, "sfPage");
            return (Criteria) this;
        }

        public Criteria andSfPageNotEqualTo(String value) {
            addCriterion("SF_PAGE <>", value, "sfPage");
            return (Criteria) this;
        }

        public Criteria andSfPageGreaterThan(String value) {
            addCriterion("SF_PAGE >", value, "sfPage");
            return (Criteria) this;
        }

        public Criteria andSfPageGreaterThanOrEqualTo(String value) {
            addCriterion("SF_PAGE >=", value, "sfPage");
            return (Criteria) this;
        }

        public Criteria andSfPageLessThan(String value) {
            addCriterion("SF_PAGE <", value, "sfPage");
            return (Criteria) this;
        }

        public Criteria andSfPageLessThanOrEqualTo(String value) {
            addCriterion("SF_PAGE <=", value, "sfPage");
            return (Criteria) this;
        }

        public Criteria andSfPageLike(String value) {
            addCriterion("SF_PAGE like", value, "sfPage");
            return (Criteria) this;
        }

        public Criteria andSfPageNotLike(String value) {
            addCriterion("SF_PAGE not like", value, "sfPage");
            return (Criteria) this;
        }

        public Criteria andSfPageIn(List<String> values) {
            addCriterion("SF_PAGE in", values, "sfPage");
            return (Criteria) this;
        }

        public Criteria andSfPageNotIn(List<String> values) {
            addCriterion("SF_PAGE not in", values, "sfPage");
            return (Criteria) this;
        }

        public Criteria andSfPageBetween(String value1, String value2) {
            addCriterion("SF_PAGE between", value1, value2, "sfPage");
            return (Criteria) this;
        }

        public Criteria andSfPageNotBetween(String value1, String value2) {
            addCriterion("SF_PAGE not between", value1, value2, "sfPage");
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