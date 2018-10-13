package com.fancl.db.mybatis.bean;

import java.util.ArrayList;
import java.util.List;

public class SysRoleFuncCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public SysRoleFuncCriteria() {
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

        public Criteria andPfRoleIdIsNull() {
            addCriterion("PF_ROLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andPfRoleIdIsNotNull() {
            addCriterion("PF_ROLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPfRoleIdEqualTo(Integer value) {
            addCriterion("PF_ROLE_ID =", value, "pfRoleId");
            return (Criteria) this;
        }

        public Criteria andPfRoleIdNotEqualTo(Integer value) {
            addCriterion("PF_ROLE_ID <>", value, "pfRoleId");
            return (Criteria) this;
        }

        public Criteria andPfRoleIdGreaterThan(Integer value) {
            addCriterion("PF_ROLE_ID >", value, "pfRoleId");
            return (Criteria) this;
        }

        public Criteria andPfRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PF_ROLE_ID >=", value, "pfRoleId");
            return (Criteria) this;
        }

        public Criteria andPfRoleIdLessThan(Integer value) {
            addCriterion("PF_ROLE_ID <", value, "pfRoleId");
            return (Criteria) this;
        }

        public Criteria andPfRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("PF_ROLE_ID <=", value, "pfRoleId");
            return (Criteria) this;
        }

        public Criteria andPfRoleIdIn(List<Integer> values) {
            addCriterion("PF_ROLE_ID in", values, "pfRoleId");
            return (Criteria) this;
        }

        public Criteria andPfRoleIdNotIn(List<Integer> values) {
            addCriterion("PF_ROLE_ID not in", values, "pfRoleId");
            return (Criteria) this;
        }

        public Criteria andPfRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("PF_ROLE_ID between", value1, value2, "pfRoleId");
            return (Criteria) this;
        }

        public Criteria andPfRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PF_ROLE_ID not between", value1, value2, "pfRoleId");
            return (Criteria) this;
        }

        public Criteria andPfFnIdIsNull() {
            addCriterion("PF_FN_ID is null");
            return (Criteria) this;
        }

        public Criteria andPfFnIdIsNotNull() {
            addCriterion("PF_FN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPfFnIdEqualTo(Integer value) {
            addCriterion("PF_FN_ID =", value, "pfFnId");
            return (Criteria) this;
        }

        public Criteria andPfFnIdNotEqualTo(Integer value) {
            addCriterion("PF_FN_ID <>", value, "pfFnId");
            return (Criteria) this;
        }

        public Criteria andPfFnIdGreaterThan(Integer value) {
            addCriterion("PF_FN_ID >", value, "pfFnId");
            return (Criteria) this;
        }

        public Criteria andPfFnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PF_FN_ID >=", value, "pfFnId");
            return (Criteria) this;
        }

        public Criteria andPfFnIdLessThan(Integer value) {
            addCriterion("PF_FN_ID <", value, "pfFnId");
            return (Criteria) this;
        }

        public Criteria andPfFnIdLessThanOrEqualTo(Integer value) {
            addCriterion("PF_FN_ID <=", value, "pfFnId");
            return (Criteria) this;
        }

        public Criteria andPfFnIdIn(List<Integer> values) {
            addCriterion("PF_FN_ID in", values, "pfFnId");
            return (Criteria) this;
        }

        public Criteria andPfFnIdNotIn(List<Integer> values) {
            addCriterion("PF_FN_ID not in", values, "pfFnId");
            return (Criteria) this;
        }

        public Criteria andPfFnIdBetween(Integer value1, Integer value2) {
            addCriterion("PF_FN_ID between", value1, value2, "pfFnId");
            return (Criteria) this;
        }

        public Criteria andPfFnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PF_FN_ID not between", value1, value2, "pfFnId");
            return (Criteria) this;
        }

        public Criteria andPfIsFuncIsNull() {
            addCriterion("PF_IS_FUNC is null");
            return (Criteria) this;
        }

        public Criteria andPfIsFuncIsNotNull() {
            addCriterion("PF_IS_FUNC is not null");
            return (Criteria) this;
        }

        public Criteria andPfIsFuncEqualTo(Short value) {
            addCriterion("PF_IS_FUNC =", value, "pfIsFunc");
            return (Criteria) this;
        }

        public Criteria andPfIsFuncNotEqualTo(Short value) {
            addCriterion("PF_IS_FUNC <>", value, "pfIsFunc");
            return (Criteria) this;
        }

        public Criteria andPfIsFuncGreaterThan(Short value) {
            addCriterion("PF_IS_FUNC >", value, "pfIsFunc");
            return (Criteria) this;
        }

        public Criteria andPfIsFuncGreaterThanOrEqualTo(Short value) {
            addCriterion("PF_IS_FUNC >=", value, "pfIsFunc");
            return (Criteria) this;
        }

        public Criteria andPfIsFuncLessThan(Short value) {
            addCriterion("PF_IS_FUNC <", value, "pfIsFunc");
            return (Criteria) this;
        }

        public Criteria andPfIsFuncLessThanOrEqualTo(Short value) {
            addCriterion("PF_IS_FUNC <=", value, "pfIsFunc");
            return (Criteria) this;
        }

        public Criteria andPfIsFuncIn(List<Short> values) {
            addCriterion("PF_IS_FUNC in", values, "pfIsFunc");
            return (Criteria) this;
        }

        public Criteria andPfIsFuncNotIn(List<Short> values) {
            addCriterion("PF_IS_FUNC not in", values, "pfIsFunc");
            return (Criteria) this;
        }

        public Criteria andPfIsFuncBetween(Short value1, Short value2) {
            addCriterion("PF_IS_FUNC between", value1, value2, "pfIsFunc");
            return (Criteria) this;
        }

        public Criteria andPfIsFuncNotBetween(Short value1, Short value2) {
            addCriterion("PF_IS_FUNC not between", value1, value2, "pfIsFunc");
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