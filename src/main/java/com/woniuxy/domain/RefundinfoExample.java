package com.woniuxy.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RefundinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RefundinfoExample() {
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

        public Criteria andRefundinfoidIsNull() {
            addCriterion("refundinfoid is null");
            return (Criteria) this;
        }

        public Criteria andRefundinfoidIsNotNull() {
            addCriterion("refundinfoid is not null");
            return (Criteria) this;
        }

        public Criteria andRefundinfoidEqualTo(Integer value) {
            addCriterion("refundinfoid =", value, "refundinfoid");
            return (Criteria) this;
        }

        public Criteria andRefundinfoidNotEqualTo(Integer value) {
            addCriterion("refundinfoid <>", value, "refundinfoid");
            return (Criteria) this;
        }

        public Criteria andRefundinfoidGreaterThan(Integer value) {
            addCriterion("refundinfoid >", value, "refundinfoid");
            return (Criteria) this;
        }

        public Criteria andRefundinfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("refundinfoid >=", value, "refundinfoid");
            return (Criteria) this;
        }

        public Criteria andRefundinfoidLessThan(Integer value) {
            addCriterion("refundinfoid <", value, "refundinfoid");
            return (Criteria) this;
        }

        public Criteria andRefundinfoidLessThanOrEqualTo(Integer value) {
            addCriterion("refundinfoid <=", value, "refundinfoid");
            return (Criteria) this;
        }

        public Criteria andRefundinfoidIn(List<Integer> values) {
            addCriterion("refundinfoid in", values, "refundinfoid");
            return (Criteria) this;
        }

        public Criteria andRefundinfoidNotIn(List<Integer> values) {
            addCriterion("refundinfoid not in", values, "refundinfoid");
            return (Criteria) this;
        }

        public Criteria andRefundinfoidBetween(Integer value1, Integer value2) {
            addCriterion("refundinfoid between", value1, value2, "refundinfoid");
            return (Criteria) this;
        }

        public Criteria andRefundinfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("refundinfoid not between", value1, value2, "refundinfoid");
            return (Criteria) this;
        }

        public Criteria andRefundinfopriceIsNull() {
            addCriterion("refundinfoprice is null");
            return (Criteria) this;
        }

        public Criteria andRefundinfopriceIsNotNull() {
            addCriterion("refundinfoprice is not null");
            return (Criteria) this;
        }

        public Criteria andRefundinfopriceEqualTo(BigDecimal value) {
            addCriterion("refundinfoprice =", value, "refundinfoprice");
            return (Criteria) this;
        }

        public Criteria andRefundinfopriceNotEqualTo(BigDecimal value) {
            addCriterion("refundinfoprice <>", value, "refundinfoprice");
            return (Criteria) this;
        }

        public Criteria andRefundinfopriceGreaterThan(BigDecimal value) {
            addCriterion("refundinfoprice >", value, "refundinfoprice");
            return (Criteria) this;
        }

        public Criteria andRefundinfopriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("refundinfoprice >=", value, "refundinfoprice");
            return (Criteria) this;
        }

        public Criteria andRefundinfopriceLessThan(BigDecimal value) {
            addCriterion("refundinfoprice <", value, "refundinfoprice");
            return (Criteria) this;
        }

        public Criteria andRefundinfopriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("refundinfoprice <=", value, "refundinfoprice");
            return (Criteria) this;
        }

        public Criteria andRefundinfopriceIn(List<BigDecimal> values) {
            addCriterion("refundinfoprice in", values, "refundinfoprice");
            return (Criteria) this;
        }

        public Criteria andRefundinfopriceNotIn(List<BigDecimal> values) {
            addCriterion("refundinfoprice not in", values, "refundinfoprice");
            return (Criteria) this;
        }

        public Criteria andRefundinfopriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refundinfoprice between", value1, value2, "refundinfoprice");
            return (Criteria) this;
        }

        public Criteria andRefundinfopriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refundinfoprice not between", value1, value2, "refundinfoprice");
            return (Criteria) this;
        }

        public Criteria andRefundinfocountIsNull() {
            addCriterion("refundinfocount is null");
            return (Criteria) this;
        }

        public Criteria andRefundinfocountIsNotNull() {
            addCriterion("refundinfocount is not null");
            return (Criteria) this;
        }

        public Criteria andRefundinfocountEqualTo(Integer value) {
            addCriterion("refundinfocount =", value, "refundinfocount");
            return (Criteria) this;
        }

        public Criteria andRefundinfocountNotEqualTo(Integer value) {
            addCriterion("refundinfocount <>", value, "refundinfocount");
            return (Criteria) this;
        }

        public Criteria andRefundinfocountGreaterThan(Integer value) {
            addCriterion("refundinfocount >", value, "refundinfocount");
            return (Criteria) this;
        }

        public Criteria andRefundinfocountGreaterThanOrEqualTo(Integer value) {
            addCriterion("refundinfocount >=", value, "refundinfocount");
            return (Criteria) this;
        }

        public Criteria andRefundinfocountLessThan(Integer value) {
            addCriterion("refundinfocount <", value, "refundinfocount");
            return (Criteria) this;
        }

        public Criteria andRefundinfocountLessThanOrEqualTo(Integer value) {
            addCriterion("refundinfocount <=", value, "refundinfocount");
            return (Criteria) this;
        }

        public Criteria andRefundinfocountIn(List<Integer> values) {
            addCriterion("refundinfocount in", values, "refundinfocount");
            return (Criteria) this;
        }

        public Criteria andRefundinfocountNotIn(List<Integer> values) {
            addCriterion("refundinfocount not in", values, "refundinfocount");
            return (Criteria) this;
        }

        public Criteria andRefundinfocountBetween(Integer value1, Integer value2) {
            addCriterion("refundinfocount between", value1, value2, "refundinfocount");
            return (Criteria) this;
        }

        public Criteria andRefundinfocountNotBetween(Integer value1, Integer value2) {
            addCriterion("refundinfocount not between", value1, value2, "refundinfocount");
            return (Criteria) this;
        }

        public Criteria andRefundinmoneyIsNull() {
            addCriterion("refundinmoney is null");
            return (Criteria) this;
        }

        public Criteria andRefundinmoneyIsNotNull() {
            addCriterion("refundinmoney is not null");
            return (Criteria) this;
        }

        public Criteria andRefundinmoneyEqualTo(BigDecimal value) {
            addCriterion("refundinmoney =", value, "refundinmoney");
            return (Criteria) this;
        }

        public Criteria andRefundinmoneyNotEqualTo(BigDecimal value) {
            addCriterion("refundinmoney <>", value, "refundinmoney");
            return (Criteria) this;
        }

        public Criteria andRefundinmoneyGreaterThan(BigDecimal value) {
            addCriterion("refundinmoney >", value, "refundinmoney");
            return (Criteria) this;
        }

        public Criteria andRefundinmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("refundinmoney >=", value, "refundinmoney");
            return (Criteria) this;
        }

        public Criteria andRefundinmoneyLessThan(BigDecimal value) {
            addCriterion("refundinmoney <", value, "refundinmoney");
            return (Criteria) this;
        }

        public Criteria andRefundinmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("refundinmoney <=", value, "refundinmoney");
            return (Criteria) this;
        }

        public Criteria andRefundinmoneyIn(List<BigDecimal> values) {
            addCriterion("refundinmoney in", values, "refundinmoney");
            return (Criteria) this;
        }

        public Criteria andRefundinmoneyNotIn(List<BigDecimal> values) {
            addCriterion("refundinmoney not in", values, "refundinmoney");
            return (Criteria) this;
        }

        public Criteria andRefundinmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refundinmoney between", value1, value2, "refundinmoney");
            return (Criteria) this;
        }

        public Criteria andRefundinmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refundinmoney not between", value1, value2, "refundinmoney");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andClientidIsNull() {
            addCriterion("clientid is null");
            return (Criteria) this;
        }

        public Criteria andClientidIsNotNull() {
            addCriterion("clientid is not null");
            return (Criteria) this;
        }

        public Criteria andClientidEqualTo(Integer value) {
            addCriterion("clientid =", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotEqualTo(Integer value) {
            addCriterion("clientid <>", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidGreaterThan(Integer value) {
            addCriterion("clientid >", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidGreaterThanOrEqualTo(Integer value) {
            addCriterion("clientid >=", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidLessThan(Integer value) {
            addCriterion("clientid <", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidLessThanOrEqualTo(Integer value) {
            addCriterion("clientid <=", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidIn(List<Integer> values) {
            addCriterion("clientid in", values, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotIn(List<Integer> values) {
            addCriterion("clientid not in", values, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidBetween(Integer value1, Integer value2) {
            addCriterion("clientid between", value1, value2, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotBetween(Integer value1, Integer value2) {
            addCriterion("clientid not between", value1, value2, "clientid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andRefundidIsNull() {
            addCriterion("refundid is null");
            return (Criteria) this;
        }

        public Criteria andRefundidIsNotNull() {
            addCriterion("refundid is not null");
            return (Criteria) this;
        }

        public Criteria andRefundidEqualTo(Integer value) {
            addCriterion("refundid =", value, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidNotEqualTo(Integer value) {
            addCriterion("refundid <>", value, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidGreaterThan(Integer value) {
            addCriterion("refundid >", value, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidGreaterThanOrEqualTo(Integer value) {
            addCriterion("refundid >=", value, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidLessThan(Integer value) {
            addCriterion("refundid <", value, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidLessThanOrEqualTo(Integer value) {
            addCriterion("refundid <=", value, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidIn(List<Integer> values) {
            addCriterion("refundid in", values, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidNotIn(List<Integer> values) {
            addCriterion("refundid not in", values, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidBetween(Integer value1, Integer value2) {
            addCriterion("refundid between", value1, value2, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidNotBetween(Integer value1, Integer value2) {
            addCriterion("refundid not between", value1, value2, "refundid");
            return (Criteria) this;
        }

        public Criteria andBookidIsNull() {
            addCriterion("bookid is null");
            return (Criteria) this;
        }

        public Criteria andBookidIsNotNull() {
            addCriterion("bookid is not null");
            return (Criteria) this;
        }

        public Criteria andBookidEqualTo(Integer value) {
            addCriterion("bookid =", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotEqualTo(Integer value) {
            addCriterion("bookid <>", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidGreaterThan(Integer value) {
            addCriterion("bookid >", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bookid >=", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidLessThan(Integer value) {
            addCriterion("bookid <", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidLessThanOrEqualTo(Integer value) {
            addCriterion("bookid <=", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidIn(List<Integer> values) {
            addCriterion("bookid in", values, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotIn(List<Integer> values) {
            addCriterion("bookid not in", values, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidBetween(Integer value1, Integer value2) {
            addCriterion("bookid between", value1, value2, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotBetween(Integer value1, Integer value2) {
            addCriterion("bookid not between", value1, value2, "bookid");
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