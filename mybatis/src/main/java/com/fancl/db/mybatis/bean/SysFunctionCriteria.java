package com.fancl.db.mybatis.bean;

import java.util.ArrayList;
import java.util.List;

public class SysFunctionCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public SysFunctionCriteria() {
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

        public Criteria andFnIdIsNull() {
            addCriterion("FN_ID is null");
            return (Criteria) this;
        }

        public Criteria andFnIdIsNotNull() {
            addCriterion("FN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFnIdEqualTo(Integer value) {
            addCriterion("FN_ID =", value, "fnId");
            return (Criteria) this;
        }

        public Criteria andFnIdNotEqualTo(Integer value) {
            addCriterion("FN_ID <>", value, "fnId");
            return (Criteria) this;
        }

        public Criteria andFnIdGreaterThan(Integer value) {
            addCriterion("FN_ID >", value, "fnId");
            return (Criteria) this;
        }

        public Criteria andFnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("FN_ID >=", value, "fnId");
            return (Criteria) this;
        }

        public Criteria andFnIdLessThan(Integer value) {
            addCriterion("FN_ID <", value, "fnId");
            return (Criteria) this;
        }

        public Criteria andFnIdLessThanOrEqualTo(Integer value) {
            addCriterion("FN_ID <=", value, "fnId");
            return (Criteria) this;
        }

        public Criteria andFnIdIn(List<Integer> values) {
            addCriterion("FN_ID in", values, "fnId");
            return (Criteria) this;
        }

        public Criteria andFnIdNotIn(List<Integer> values) {
            addCriterion("FN_ID not in", values, "fnId");
            return (Criteria) this;
        }

        public Criteria andFnIdBetween(Integer value1, Integer value2) {
            addCriterion("FN_ID between", value1, value2, "fnId");
            return (Criteria) this;
        }

        public Criteria andFnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("FN_ID not between", value1, value2, "fnId");
            return (Criteria) this;
        }

        public Criteria andFnShortNameIsNull() {
            addCriterion("FN_SHORT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFnShortNameIsNotNull() {
            addCriterion("FN_SHORT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFnShortNameEqualTo(String value) {
            addCriterion("FN_SHORT_NAME =", value, "fnShortName");
            return (Criteria) this;
        }

        public Criteria andFnShortNameNotEqualTo(String value) {
            addCriterion("FN_SHORT_NAME <>", value, "fnShortName");
            return (Criteria) this;
        }

        public Criteria andFnShortNameGreaterThan(String value) {
            addCriterion("FN_SHORT_NAME >", value, "fnShortName");
            return (Criteria) this;
        }

        public Criteria andFnShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("FN_SHORT_NAME >=", value, "fnShortName");
            return (Criteria) this;
        }

        public Criteria andFnShortNameLessThan(String value) {
            addCriterion("FN_SHORT_NAME <", value, "fnShortName");
            return (Criteria) this;
        }

        public Criteria andFnShortNameLessThanOrEqualTo(String value) {
            addCriterion("FN_SHORT_NAME <=", value, "fnShortName");
            return (Criteria) this;
        }

        public Criteria andFnShortNameLike(String value) {
            addCriterion("FN_SHORT_NAME like", value, "fnShortName");
            return (Criteria) this;
        }

        public Criteria andFnShortNameNotLike(String value) {
            addCriterion("FN_SHORT_NAME not like", value, "fnShortName");
            return (Criteria) this;
        }

        public Criteria andFnShortNameIn(List<String> values) {
            addCriterion("FN_SHORT_NAME in", values, "fnShortName");
            return (Criteria) this;
        }

        public Criteria andFnShortNameNotIn(List<String> values) {
            addCriterion("FN_SHORT_NAME not in", values, "fnShortName");
            return (Criteria) this;
        }

        public Criteria andFnShortNameBetween(String value1, String value2) {
            addCriterion("FN_SHORT_NAME between", value1, value2, "fnShortName");
            return (Criteria) this;
        }

        public Criteria andFnShortNameNotBetween(String value1, String value2) {
            addCriterion("FN_SHORT_NAME not between", value1, value2, "fnShortName");
            return (Criteria) this;
        }

        public Criteria andFnNameIsNull() {
            addCriterion("FN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFnNameIsNotNull() {
            addCriterion("FN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFnNameEqualTo(String value) {
            addCriterion("FN_NAME =", value, "fnName");
            return (Criteria) this;
        }

        public Criteria andFnNameNotEqualTo(String value) {
            addCriterion("FN_NAME <>", value, "fnName");
            return (Criteria) this;
        }

        public Criteria andFnNameGreaterThan(String value) {
            addCriterion("FN_NAME >", value, "fnName");
            return (Criteria) this;
        }

        public Criteria andFnNameGreaterThanOrEqualTo(String value) {
            addCriterion("FN_NAME >=", value, "fnName");
            return (Criteria) this;
        }

        public Criteria andFnNameLessThan(String value) {
            addCriterion("FN_NAME <", value, "fnName");
            return (Criteria) this;
        }

        public Criteria andFnNameLessThanOrEqualTo(String value) {
            addCriterion("FN_NAME <=", value, "fnName");
            return (Criteria) this;
        }

        public Criteria andFnNameLike(String value) {
            addCriterion("FN_NAME like", value, "fnName");
            return (Criteria) this;
        }

        public Criteria andFnNameNotLike(String value) {
            addCriterion("FN_NAME not like", value, "fnName");
            return (Criteria) this;
        }

        public Criteria andFnNameIn(List<String> values) {
            addCriterion("FN_NAME in", values, "fnName");
            return (Criteria) this;
        }

        public Criteria andFnNameNotIn(List<String> values) {
            addCriterion("FN_NAME not in", values, "fnName");
            return (Criteria) this;
        }

        public Criteria andFnNameBetween(String value1, String value2) {
            addCriterion("FN_NAME between", value1, value2, "fnName");
            return (Criteria) this;
        }

        public Criteria andFnNameNotBetween(String value1, String value2) {
            addCriterion("FN_NAME not between", value1, value2, "fnName");
            return (Criteria) this;
        }

        public Criteria andFnUrlIsNull() {
            addCriterion("FN_URL is null");
            return (Criteria) this;
        }

        public Criteria andFnUrlIsNotNull() {
            addCriterion("FN_URL is not null");
            return (Criteria) this;
        }

        public Criteria andFnUrlEqualTo(String value) {
            addCriterion("FN_URL =", value, "fnUrl");
            return (Criteria) this;
        }

        public Criteria andFnUrlNotEqualTo(String value) {
            addCriterion("FN_URL <>", value, "fnUrl");
            return (Criteria) this;
        }

        public Criteria andFnUrlGreaterThan(String value) {
            addCriterion("FN_URL >", value, "fnUrl");
            return (Criteria) this;
        }

        public Criteria andFnUrlGreaterThanOrEqualTo(String value) {
            addCriterion("FN_URL >=", value, "fnUrl");
            return (Criteria) this;
        }

        public Criteria andFnUrlLessThan(String value) {
            addCriterion("FN_URL <", value, "fnUrl");
            return (Criteria) this;
        }

        public Criteria andFnUrlLessThanOrEqualTo(String value) {
            addCriterion("FN_URL <=", value, "fnUrl");
            return (Criteria) this;
        }

        public Criteria andFnUrlLike(String value) {
            addCriterion("FN_URL like", value, "fnUrl");
            return (Criteria) this;
        }

        public Criteria andFnUrlNotLike(String value) {
            addCriterion("FN_URL not like", value, "fnUrl");
            return (Criteria) this;
        }

        public Criteria andFnUrlIn(List<String> values) {
            addCriterion("FN_URL in", values, "fnUrl");
            return (Criteria) this;
        }

        public Criteria andFnUrlNotIn(List<String> values) {
            addCriterion("FN_URL not in", values, "fnUrl");
            return (Criteria) this;
        }

        public Criteria andFnUrlBetween(String value1, String value2) {
            addCriterion("FN_URL between", value1, value2, "fnUrl");
            return (Criteria) this;
        }

        public Criteria andFnUrlNotBetween(String value1, String value2) {
            addCriterion("FN_URL not between", value1, value2, "fnUrl");
            return (Criteria) this;
        }

        public Criteria andFnParentIdIsNull() {
            addCriterion("FN_PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andFnParentIdIsNotNull() {
            addCriterion("FN_PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFnParentIdEqualTo(Integer value) {
            addCriterion("FN_PARENT_ID =", value, "fnParentId");
            return (Criteria) this;
        }

        public Criteria andFnParentIdNotEqualTo(Integer value) {
            addCriterion("FN_PARENT_ID <>", value, "fnParentId");
            return (Criteria) this;
        }

        public Criteria andFnParentIdGreaterThan(Integer value) {
            addCriterion("FN_PARENT_ID >", value, "fnParentId");
            return (Criteria) this;
        }

        public Criteria andFnParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("FN_PARENT_ID >=", value, "fnParentId");
            return (Criteria) this;
        }

        public Criteria andFnParentIdLessThan(Integer value) {
            addCriterion("FN_PARENT_ID <", value, "fnParentId");
            return (Criteria) this;
        }

        public Criteria andFnParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("FN_PARENT_ID <=", value, "fnParentId");
            return (Criteria) this;
        }

        public Criteria andFnParentIdIn(List<Integer> values) {
            addCriterion("FN_PARENT_ID in", values, "fnParentId");
            return (Criteria) this;
        }

        public Criteria andFnParentIdNotIn(List<Integer> values) {
            addCriterion("FN_PARENT_ID not in", values, "fnParentId");
            return (Criteria) this;
        }

        public Criteria andFnParentIdBetween(Integer value1, Integer value2) {
            addCriterion("FN_PARENT_ID between", value1, value2, "fnParentId");
            return (Criteria) this;
        }

        public Criteria andFnParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("FN_PARENT_ID not between", value1, value2, "fnParentId");
            return (Criteria) this;
        }

        public Criteria andFnIsLeafIsNull() {
            addCriterion("FN_IS_LEAF is null");
            return (Criteria) this;
        }

        public Criteria andFnIsLeafIsNotNull() {
            addCriterion("FN_IS_LEAF is not null");
            return (Criteria) this;
        }

        public Criteria andFnIsLeafEqualTo(Short value) {
            addCriterion("FN_IS_LEAF =", value, "fnIsLeaf");
            return (Criteria) this;
        }

        public Criteria andFnIsLeafNotEqualTo(Short value) {
            addCriterion("FN_IS_LEAF <>", value, "fnIsLeaf");
            return (Criteria) this;
        }

        public Criteria andFnIsLeafGreaterThan(Short value) {
            addCriterion("FN_IS_LEAF >", value, "fnIsLeaf");
            return (Criteria) this;
        }

        public Criteria andFnIsLeafGreaterThanOrEqualTo(Short value) {
            addCriterion("FN_IS_LEAF >=", value, "fnIsLeaf");
            return (Criteria) this;
        }

        public Criteria andFnIsLeafLessThan(Short value) {
            addCriterion("FN_IS_LEAF <", value, "fnIsLeaf");
            return (Criteria) this;
        }

        public Criteria andFnIsLeafLessThanOrEqualTo(Short value) {
            addCriterion("FN_IS_LEAF <=", value, "fnIsLeaf");
            return (Criteria) this;
        }

        public Criteria andFnIsLeafIn(List<Short> values) {
            addCriterion("FN_IS_LEAF in", values, "fnIsLeaf");
            return (Criteria) this;
        }

        public Criteria andFnIsLeafNotIn(List<Short> values) {
            addCriterion("FN_IS_LEAF not in", values, "fnIsLeaf");
            return (Criteria) this;
        }

        public Criteria andFnIsLeafBetween(Short value1, Short value2) {
            addCriterion("FN_IS_LEAF between", value1, value2, "fnIsLeaf");
            return (Criteria) this;
        }

        public Criteria andFnIsLeafNotBetween(Short value1, Short value2) {
            addCriterion("FN_IS_LEAF not between", value1, value2, "fnIsLeaf");
            return (Criteria) this;
        }

        public Criteria andFnTreeLayerIsNull() {
            addCriterion("FN_TREE_LAYER is null");
            return (Criteria) this;
        }

        public Criteria andFnTreeLayerIsNotNull() {
            addCriterion("FN_TREE_LAYER is not null");
            return (Criteria) this;
        }

        public Criteria andFnTreeLayerEqualTo(String value) {
            addCriterion("FN_TREE_LAYER =", value, "fnTreeLayer");
            return (Criteria) this;
        }

        public Criteria andFnTreeLayerNotEqualTo(String value) {
            addCriterion("FN_TREE_LAYER <>", value, "fnTreeLayer");
            return (Criteria) this;
        }

        public Criteria andFnTreeLayerGreaterThan(String value) {
            addCriterion("FN_TREE_LAYER >", value, "fnTreeLayer");
            return (Criteria) this;
        }

        public Criteria andFnTreeLayerGreaterThanOrEqualTo(String value) {
            addCriterion("FN_TREE_LAYER >=", value, "fnTreeLayer");
            return (Criteria) this;
        }

        public Criteria andFnTreeLayerLessThan(String value) {
            addCriterion("FN_TREE_LAYER <", value, "fnTreeLayer");
            return (Criteria) this;
        }

        public Criteria andFnTreeLayerLessThanOrEqualTo(String value) {
            addCriterion("FN_TREE_LAYER <=", value, "fnTreeLayer");
            return (Criteria) this;
        }

        public Criteria andFnTreeLayerLike(String value) {
            addCriterion("FN_TREE_LAYER like", value, "fnTreeLayer");
            return (Criteria) this;
        }

        public Criteria andFnTreeLayerNotLike(String value) {
            addCriterion("FN_TREE_LAYER not like", value, "fnTreeLayer");
            return (Criteria) this;
        }

        public Criteria andFnTreeLayerIn(List<String> values) {
            addCriterion("FN_TREE_LAYER in", values, "fnTreeLayer");
            return (Criteria) this;
        }

        public Criteria andFnTreeLayerNotIn(List<String> values) {
            addCriterion("FN_TREE_LAYER not in", values, "fnTreeLayer");
            return (Criteria) this;
        }

        public Criteria andFnTreeLayerBetween(String value1, String value2) {
            addCriterion("FN_TREE_LAYER between", value1, value2, "fnTreeLayer");
            return (Criteria) this;
        }

        public Criteria andFnTreeLayerNotBetween(String value1, String value2) {
            addCriterion("FN_TREE_LAYER not between", value1, value2, "fnTreeLayer");
            return (Criteria) this;
        }

        public Criteria andFnReverse1IsNull() {
            addCriterion("FN_REVERSE1 is null");
            return (Criteria) this;
        }

        public Criteria andFnReverse1IsNotNull() {
            addCriterion("FN_REVERSE1 is not null");
            return (Criteria) this;
        }

        public Criteria andFnReverse1EqualTo(String value) {
            addCriterion("FN_REVERSE1 =", value, "fnReverse1");
            return (Criteria) this;
        }

        public Criteria andFnReverse1NotEqualTo(String value) {
            addCriterion("FN_REVERSE1 <>", value, "fnReverse1");
            return (Criteria) this;
        }

        public Criteria andFnReverse1GreaterThan(String value) {
            addCriterion("FN_REVERSE1 >", value, "fnReverse1");
            return (Criteria) this;
        }

        public Criteria andFnReverse1GreaterThanOrEqualTo(String value) {
            addCriterion("FN_REVERSE1 >=", value, "fnReverse1");
            return (Criteria) this;
        }

        public Criteria andFnReverse1LessThan(String value) {
            addCriterion("FN_REVERSE1 <", value, "fnReverse1");
            return (Criteria) this;
        }

        public Criteria andFnReverse1LessThanOrEqualTo(String value) {
            addCriterion("FN_REVERSE1 <=", value, "fnReverse1");
            return (Criteria) this;
        }

        public Criteria andFnReverse1Like(String value) {
            addCriterion("FN_REVERSE1 like", value, "fnReverse1");
            return (Criteria) this;
        }

        public Criteria andFnReverse1NotLike(String value) {
            addCriterion("FN_REVERSE1 not like", value, "fnReverse1");
            return (Criteria) this;
        }

        public Criteria andFnReverse1In(List<String> values) {
            addCriterion("FN_REVERSE1 in", values, "fnReverse1");
            return (Criteria) this;
        }

        public Criteria andFnReverse1NotIn(List<String> values) {
            addCriterion("FN_REVERSE1 not in", values, "fnReverse1");
            return (Criteria) this;
        }

        public Criteria andFnReverse1Between(String value1, String value2) {
            addCriterion("FN_REVERSE1 between", value1, value2, "fnReverse1");
            return (Criteria) this;
        }

        public Criteria andFnReverse1NotBetween(String value1, String value2) {
            addCriterion("FN_REVERSE1 not between", value1, value2, "fnReverse1");
            return (Criteria) this;
        }

        public Criteria andFnReverse2IsNull() {
            addCriterion("FN_REVERSE2 is null");
            return (Criteria) this;
        }

        public Criteria andFnReverse2IsNotNull() {
            addCriterion("FN_REVERSE2 is not null");
            return (Criteria) this;
        }

        public Criteria andFnReverse2EqualTo(String value) {
            addCriterion("FN_REVERSE2 =", value, "fnReverse2");
            return (Criteria) this;
        }

        public Criteria andFnReverse2NotEqualTo(String value) {
            addCriterion("FN_REVERSE2 <>", value, "fnReverse2");
            return (Criteria) this;
        }

        public Criteria andFnReverse2GreaterThan(String value) {
            addCriterion("FN_REVERSE2 >", value, "fnReverse2");
            return (Criteria) this;
        }

        public Criteria andFnReverse2GreaterThanOrEqualTo(String value) {
            addCriterion("FN_REVERSE2 >=", value, "fnReverse2");
            return (Criteria) this;
        }

        public Criteria andFnReverse2LessThan(String value) {
            addCriterion("FN_REVERSE2 <", value, "fnReverse2");
            return (Criteria) this;
        }

        public Criteria andFnReverse2LessThanOrEqualTo(String value) {
            addCriterion("FN_REVERSE2 <=", value, "fnReverse2");
            return (Criteria) this;
        }

        public Criteria andFnReverse2Like(String value) {
            addCriterion("FN_REVERSE2 like", value, "fnReverse2");
            return (Criteria) this;
        }

        public Criteria andFnReverse2NotLike(String value) {
            addCriterion("FN_REVERSE2 not like", value, "fnReverse2");
            return (Criteria) this;
        }

        public Criteria andFnReverse2In(List<String> values) {
            addCriterion("FN_REVERSE2 in", values, "fnReverse2");
            return (Criteria) this;
        }

        public Criteria andFnReverse2NotIn(List<String> values) {
            addCriterion("FN_REVERSE2 not in", values, "fnReverse2");
            return (Criteria) this;
        }

        public Criteria andFnReverse2Between(String value1, String value2) {
            addCriterion("FN_REVERSE2 between", value1, value2, "fnReverse2");
            return (Criteria) this;
        }

        public Criteria andFnReverse2NotBetween(String value1, String value2) {
            addCriterion("FN_REVERSE2 not between", value1, value2, "fnReverse2");
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