package com.woniuxy.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ClientlevlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClientlevlExample() {
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

        public Criteria andClientlevlidIsNull() {
            addCriterion("clientlevlid is null");
            return (Criteria) this;
        }

        public Criteria andClientlevlidIsNotNull() {
            addCriterion("clientlevlid is not null");
            return (Criteria) this;
        }

        public Criteria andClientlevlidEqualTo(Integer value) {
            addCriterion("clientlevlid =", value, "clientlevlid");
            return (Criteria) this;
        }

        public Criteria andClientlevlidNotEqualTo(Integer value) {
            addCriterion("clientlevlid <>", value, "clientlevlid");
            return (Criteria) this;
        }

        public Criteria andClientlevlidGreaterThan(Integer value) {
            addCriterion("clientlevlid >", value, "clientlevlid");
            return (Criteria) this;
        }

        public Criteria andClientlevlidGreaterThanOrEqualTo(Integer value) {
            addCriterion("clientlevlid >=", value, "clientlevlid");
            return (Criteria) this;
        }

        public Criteria andClientlevlidLessThan(Integer value) {
            addCriterion("clientlevlid <", value, "clientlevlid");
            return (Criteria) this;
        }

        public Criteria andClientlevlidLessThanOrEqualTo(Integer value) {
            addCriterion("clientlevlid <=", value, "clientlevlid");
            return (Criteria) this;
        }

        public Criteria andClientlevlidIn(List<Integer> values) {
            addCriterion("clientlevlid in", values, "clientlevlid");
            return (Criteria) this;
        }

        public Criteria andClientlevlidNotIn(List<Integer> values) {
            addCriterion("clientlevlid not in", values, "clientlevlid");
            return (Criteria) this;
        }

        public Criteria andClientlevlidBetween(Integer value1, Integer value2) {
            addCriterion("clientlevlid between", value1, value2, "clientlevlid");
            return (Criteria) this;
        }

        public Criteria andClientlevlidNotBetween(Integer value1, Integer value2) {
            addCriterion("clientlevlid not between", value1, value2, "clientlevlid");
            return (Criteria) this;
        }

        public Criteria andClientlevlnameIsNull() {
            addCriterion("clientlevlname is null");
            return (Criteria) this;
        }

        public Criteria andClientlevlnameIsNotNull() {
            addCriterion("clientlevlname is not null");
            return (Criteria) this;
        }

        public Criteria andClientlevlnameEqualTo(String value) {
            addCriterion("clientlevlname =", value, "clientlevlname");
            return (Criteria) this;
        }

        public Criteria andClientlevlnameNotEqualTo(String value) {
            addCriterion("clientlevlname <>", value, "clientlevlname");
            return (Criteria) this;
        }

        public Criteria andClientlevlnameGreaterThan(String value) {
            addCriterion("clientlevlname >", value, "clientlevlname");
            return (Criteria) this;
        }

        public Criteria andClientlevlnameGreaterThanOrEqualTo(String value) {
            addCriterion("clientlevlname >=", value, "clientlevlname");
            return (Criteria) this;
        }

        public Criteria andClientlevlnameLessThan(String value) {
            addCriterion("clientlevlname <", value, "clientlevlname");
            return (Criteria) this;
        }

        public Criteria andClientlevlnameLessThanOrEqualTo(String value) {
            addCriterion("clientlevlname <=", value, "clientlevlname");
            return (Criteria) this;
        }

        public Criteria andClientlevlnameLike(String value) {
            addCriterion("clientlevlname like", value, "clientlevlname");
            return (Criteria) this;
        }

        public Criteria andClientlevlnameNotLike(String value) {
            addCriterion("clientlevlname not like", value, "clientlevlname");
            return (Criteria) this;
        }

        public Criteria andClientlevlnameIn(List<String> values) {
            addCriterion("clientlevlname in", values, "clientlevlname");
            return (Criteria) this;
        }

        public Criteria andClientlevlnameNotIn(List<String> values) {
            addCriterion("clientlevlname not in", values, "clientlevlname");
            return (Criteria) this;
        }

        public Criteria andClientlevlnameBetween(String value1, String value2) {
            addCriterion("clientlevlname between", value1, value2, "clientlevlname");
            return (Criteria) this;
        }

        public Criteria andClientlevlnameNotBetween(String value1, String value2) {
            addCriterion("clientlevlname not between", value1, value2, "clientlevlname");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(BigDecimal value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(BigDecimal value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(BigDecimal value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(BigDecimal value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<BigDecimal> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<BigDecimal> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount not between", value1, value2, "discount");
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