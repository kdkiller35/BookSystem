package com.woniuxy.domain;

import java.util.ArrayList;
import java.util.List;

public class ProviderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProviderExample() {
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

        public Criteria andPnameIsNull() {
            addCriterion("pname is null");
            return (Criteria) this;
        }

        public Criteria andPnameIsNotNull() {
            addCriterion("pname is not null");
            return (Criteria) this;
        }

        public Criteria andPnameEqualTo(String value) {
            addCriterion("pname =", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotEqualTo(String value) {
            addCriterion("pname <>", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThan(String value) {
            addCriterion("pname >", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThanOrEqualTo(String value) {
            addCriterion("pname >=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThan(String value) {
            addCriterion("pname <", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThanOrEqualTo(String value) {
            addCriterion("pname <=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLike(String value) {
            addCriterion("pname like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotLike(String value) {
            addCriterion("pname not like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameIn(List<String> values) {
            addCriterion("pname in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotIn(List<String> values) {
            addCriterion("pname not in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameBetween(String value1, String value2) {
            addCriterion("pname between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotBetween(String value1, String value2) {
            addCriterion("pname not between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPersonIsNull() {
            addCriterion("person is null");
            return (Criteria) this;
        }

        public Criteria andPersonIsNotNull() {
            addCriterion("person is not null");
            return (Criteria) this;
        }

        public Criteria andPersonEqualTo(String value) {
            addCriterion("person =", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonNotEqualTo(String value) {
            addCriterion("person <>", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonGreaterThan(String value) {
            addCriterion("person >", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonGreaterThanOrEqualTo(String value) {
            addCriterion("person >=", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonLessThan(String value) {
            addCriterion("person <", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonLessThanOrEqualTo(String value) {
            addCriterion("person <=", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonLike(String value) {
            addCriterion("person like", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonNotLike(String value) {
            addCriterion("person not like", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonIn(List<String> values) {
            addCriterion("person in", values, "person");
            return (Criteria) this;
        }

        public Criteria andPersonNotIn(List<String> values) {
            addCriterion("person not in", values, "person");
            return (Criteria) this;
        }

        public Criteria andPersonBetween(String value1, String value2) {
            addCriterion("person between", value1, value2, "person");
            return (Criteria) this;
        }

        public Criteria andPersonNotBetween(String value1, String value2) {
            addCriterion("person not between", value1, value2, "person");
            return (Criteria) this;
        }

        public Criteria andPcallIsNull() {
            addCriterion("pcall is null");
            return (Criteria) this;
        }

        public Criteria andPcallIsNotNull() {
            addCriterion("pcall is not null");
            return (Criteria) this;
        }

        public Criteria andPcallEqualTo(String value) {
            addCriterion("pcall =", value, "pcall");
            return (Criteria) this;
        }

        public Criteria andPcallNotEqualTo(String value) {
            addCriterion("pcall <>", value, "pcall");
            return (Criteria) this;
        }

        public Criteria andPcallGreaterThan(String value) {
            addCriterion("pcall >", value, "pcall");
            return (Criteria) this;
        }

        public Criteria andPcallGreaterThanOrEqualTo(String value) {
            addCriterion("pcall >=", value, "pcall");
            return (Criteria) this;
        }

        public Criteria andPcallLessThan(String value) {
            addCriterion("pcall <", value, "pcall");
            return (Criteria) this;
        }

        public Criteria andPcallLessThanOrEqualTo(String value) {
            addCriterion("pcall <=", value, "pcall");
            return (Criteria) this;
        }

        public Criteria andPcallLike(String value) {
            addCriterion("pcall like", value, "pcall");
            return (Criteria) this;
        }

        public Criteria andPcallNotLike(String value) {
            addCriterion("pcall not like", value, "pcall");
            return (Criteria) this;
        }

        public Criteria andPcallIn(List<String> values) {
            addCriterion("pcall in", values, "pcall");
            return (Criteria) this;
        }

        public Criteria andPcallNotIn(List<String> values) {
            addCriterion("pcall not in", values, "pcall");
            return (Criteria) this;
        }

        public Criteria andPcallBetween(String value1, String value2) {
            addCriterion("pcall between", value1, value2, "pcall");
            return (Criteria) this;
        }

        public Criteria andPcallNotBetween(String value1, String value2) {
            addCriterion("pcall not between", value1, value2, "pcall");
            return (Criteria) this;
        }

        public Criteria andPsexIsNull() {
            addCriterion("psex is null");
            return (Criteria) this;
        }

        public Criteria andPsexIsNotNull() {
            addCriterion("psex is not null");
            return (Criteria) this;
        }

        public Criteria andPsexEqualTo(String value) {
            addCriterion("psex =", value, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexNotEqualTo(String value) {
            addCriterion("psex <>", value, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexGreaterThan(String value) {
            addCriterion("psex >", value, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexGreaterThanOrEqualTo(String value) {
            addCriterion("psex >=", value, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexLessThan(String value) {
            addCriterion("psex <", value, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexLessThanOrEqualTo(String value) {
            addCriterion("psex <=", value, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexLike(String value) {
            addCriterion("psex like", value, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexNotLike(String value) {
            addCriterion("psex not like", value, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexIn(List<String> values) {
            addCriterion("psex in", values, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexNotIn(List<String> values) {
            addCriterion("psex not in", values, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexBetween(String value1, String value2) {
            addCriterion("psex between", value1, value2, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexNotBetween(String value1, String value2) {
            addCriterion("psex not between", value1, value2, "psex");
            return (Criteria) this;
        }

        public Criteria andPcardidIsNull() {
            addCriterion("pcardid is null");
            return (Criteria) this;
        }

        public Criteria andPcardidIsNotNull() {
            addCriterion("pcardid is not null");
            return (Criteria) this;
        }

        public Criteria andPcardidEqualTo(String value) {
            addCriterion("pcardid =", value, "pcardid");
            return (Criteria) this;
        }

        public Criteria andPcardidNotEqualTo(String value) {
            addCriterion("pcardid <>", value, "pcardid");
            return (Criteria) this;
        }

        public Criteria andPcardidGreaterThan(String value) {
            addCriterion("pcardid >", value, "pcardid");
            return (Criteria) this;
        }

        public Criteria andPcardidGreaterThanOrEqualTo(String value) {
            addCriterion("pcardid >=", value, "pcardid");
            return (Criteria) this;
        }

        public Criteria andPcardidLessThan(String value) {
            addCriterion("pcardid <", value, "pcardid");
            return (Criteria) this;
        }

        public Criteria andPcardidLessThanOrEqualTo(String value) {
            addCriterion("pcardid <=", value, "pcardid");
            return (Criteria) this;
        }

        public Criteria andPcardidLike(String value) {
            addCriterion("pcardid like", value, "pcardid");
            return (Criteria) this;
        }

        public Criteria andPcardidNotLike(String value) {
            addCriterion("pcardid not like", value, "pcardid");
            return (Criteria) this;
        }

        public Criteria andPcardidIn(List<String> values) {
            addCriterion("pcardid in", values, "pcardid");
            return (Criteria) this;
        }

        public Criteria andPcardidNotIn(List<String> values) {
            addCriterion("pcardid not in", values, "pcardid");
            return (Criteria) this;
        }

        public Criteria andPcardidBetween(String value1, String value2) {
            addCriterion("pcardid between", value1, value2, "pcardid");
            return (Criteria) this;
        }

        public Criteria andPcardidNotBetween(String value1, String value2) {
            addCriterion("pcardid not between", value1, value2, "pcardid");
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