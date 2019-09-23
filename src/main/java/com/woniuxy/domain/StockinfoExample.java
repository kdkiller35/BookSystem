package com.woniuxy.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class StockinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockinfoExample() {
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

        public Criteria andStockinfoidIsNull() {
            addCriterion("stockinfoid is null");
            return (Criteria) this;
        }

        public Criteria andStockinfoidIsNotNull() {
            addCriterion("stockinfoid is not null");
            return (Criteria) this;
        }

        public Criteria andStockinfoidEqualTo(Integer value) {
            addCriterion("stockinfoid =", value, "stockinfoid");
            return (Criteria) this;
        }

        public Criteria andStockinfoidNotEqualTo(Integer value) {
            addCriterion("stockinfoid <>", value, "stockinfoid");
            return (Criteria) this;
        }

        public Criteria andStockinfoidGreaterThan(Integer value) {
            addCriterion("stockinfoid >", value, "stockinfoid");
            return (Criteria) this;
        }

        public Criteria andStockinfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stockinfoid >=", value, "stockinfoid");
            return (Criteria) this;
        }

        public Criteria andStockinfoidLessThan(Integer value) {
            addCriterion("stockinfoid <", value, "stockinfoid");
            return (Criteria) this;
        }

        public Criteria andStockinfoidLessThanOrEqualTo(Integer value) {
            addCriterion("stockinfoid <=", value, "stockinfoid");
            return (Criteria) this;
        }

        public Criteria andStockinfoidIn(List<Integer> values) {
            addCriterion("stockinfoid in", values, "stockinfoid");
            return (Criteria) this;
        }

        public Criteria andStockinfoidNotIn(List<Integer> values) {
            addCriterion("stockinfoid not in", values, "stockinfoid");
            return (Criteria) this;
        }

        public Criteria andStockinfoidBetween(Integer value1, Integer value2) {
            addCriterion("stockinfoid between", value1, value2, "stockinfoid");
            return (Criteria) this;
        }

        public Criteria andStockinfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("stockinfoid not between", value1, value2, "stockinfoid");
            return (Criteria) this;
        }

        public Criteria andStockpriceIsNull() {
            addCriterion("stockprice is null");
            return (Criteria) this;
        }

        public Criteria andStockpriceIsNotNull() {
            addCriterion("stockprice is not null");
            return (Criteria) this;
        }

        public Criteria andStockpriceEqualTo(BigDecimal value) {
            addCriterion("stockprice =", value, "stockprice");
            return (Criteria) this;
        }

        public Criteria andStockpriceNotEqualTo(BigDecimal value) {
            addCriterion("stockprice <>", value, "stockprice");
            return (Criteria) this;
        }

        public Criteria andStockpriceGreaterThan(BigDecimal value) {
            addCriterion("stockprice >", value, "stockprice");
            return (Criteria) this;
        }

        public Criteria andStockpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("stockprice >=", value, "stockprice");
            return (Criteria) this;
        }

        public Criteria andStockpriceLessThan(BigDecimal value) {
            addCriterion("stockprice <", value, "stockprice");
            return (Criteria) this;
        }

        public Criteria andStockpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("stockprice <=", value, "stockprice");
            return (Criteria) this;
        }

        public Criteria andStockpriceIn(List<BigDecimal> values) {
            addCriterion("stockprice in", values, "stockprice");
            return (Criteria) this;
        }

        public Criteria andStockpriceNotIn(List<BigDecimal> values) {
            addCriterion("stockprice not in", values, "stockprice");
            return (Criteria) this;
        }

        public Criteria andStockpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stockprice between", value1, value2, "stockprice");
            return (Criteria) this;
        }

        public Criteria andStockpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stockprice not between", value1, value2, "stockprice");
            return (Criteria) this;
        }

        public Criteria andStockcountIsNull() {
            addCriterion("stockcount is null");
            return (Criteria) this;
        }

        public Criteria andStockcountIsNotNull() {
            addCriterion("stockcount is not null");
            return (Criteria) this;
        }

        public Criteria andStockcountEqualTo(Integer value) {
            addCriterion("stockcount =", value, "stockcount");
            return (Criteria) this;
        }

        public Criteria andStockcountNotEqualTo(Integer value) {
            addCriterion("stockcount <>", value, "stockcount");
            return (Criteria) this;
        }

        public Criteria andStockcountGreaterThan(Integer value) {
            addCriterion("stockcount >", value, "stockcount");
            return (Criteria) this;
        }

        public Criteria andStockcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("stockcount >=", value, "stockcount");
            return (Criteria) this;
        }

        public Criteria andStockcountLessThan(Integer value) {
            addCriterion("stockcount <", value, "stockcount");
            return (Criteria) this;
        }

        public Criteria andStockcountLessThanOrEqualTo(Integer value) {
            addCriterion("stockcount <=", value, "stockcount");
            return (Criteria) this;
        }

        public Criteria andStockcountIn(List<Integer> values) {
            addCriterion("stockcount in", values, "stockcount");
            return (Criteria) this;
        }

        public Criteria andStockcountNotIn(List<Integer> values) {
            addCriterion("stockcount not in", values, "stockcount");
            return (Criteria) this;
        }

        public Criteria andStockcountBetween(Integer value1, Integer value2) {
            addCriterion("stockcount between", value1, value2, "stockcount");
            return (Criteria) this;
        }

        public Criteria andStockcountNotBetween(Integer value1, Integer value2) {
            addCriterion("stockcount not between", value1, value2, "stockcount");
            return (Criteria) this;
        }

        public Criteria andStockmoneyIsNull() {
            addCriterion("stockmoney is null");
            return (Criteria) this;
        }

        public Criteria andStockmoneyIsNotNull() {
            addCriterion("stockmoney is not null");
            return (Criteria) this;
        }

        public Criteria andStockmoneyEqualTo(BigDecimal value) {
            addCriterion("stockmoney =", value, "stockmoney");
            return (Criteria) this;
        }

        public Criteria andStockmoneyNotEqualTo(BigDecimal value) {
            addCriterion("stockmoney <>", value, "stockmoney");
            return (Criteria) this;
        }

        public Criteria andStockmoneyGreaterThan(BigDecimal value) {
            addCriterion("stockmoney >", value, "stockmoney");
            return (Criteria) this;
        }

        public Criteria andStockmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("stockmoney >=", value, "stockmoney");
            return (Criteria) this;
        }

        public Criteria andStockmoneyLessThan(BigDecimal value) {
            addCriterion("stockmoney <", value, "stockmoney");
            return (Criteria) this;
        }

        public Criteria andStockmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("stockmoney <=", value, "stockmoney");
            return (Criteria) this;
        }

        public Criteria andStockmoneyIn(List<BigDecimal> values) {
            addCriterion("stockmoney in", values, "stockmoney");
            return (Criteria) this;
        }

        public Criteria andStockmoneyNotIn(List<BigDecimal> values) {
            addCriterion("stockmoney not in", values, "stockmoney");
            return (Criteria) this;
        }

        public Criteria andStockmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stockmoney between", value1, value2, "stockmoney");
            return (Criteria) this;
        }

        public Criteria andStockmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stockmoney not between", value1, value2, "stockmoney");
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

        public Criteria andStockidIsNull() {
            addCriterion("stockid is null");
            return (Criteria) this;
        }

        public Criteria andStockidIsNotNull() {
            addCriterion("stockid is not null");
            return (Criteria) this;
        }

        public Criteria andStockidEqualTo(Integer value) {
            addCriterion("stockid =", value, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidNotEqualTo(Integer value) {
            addCriterion("stockid <>", value, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidGreaterThan(Integer value) {
            addCriterion("stockid >", value, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stockid >=", value, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidLessThan(Integer value) {
            addCriterion("stockid <", value, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidLessThanOrEqualTo(Integer value) {
            addCriterion("stockid <=", value, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidIn(List<Integer> values) {
            addCriterion("stockid in", values, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidNotIn(List<Integer> values) {
            addCriterion("stockid not in", values, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidBetween(Integer value1, Integer value2) {
            addCriterion("stockid between", value1, value2, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidNotBetween(Integer value1, Integer value2) {
            addCriterion("stockid not between", value1, value2, "stockid");
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