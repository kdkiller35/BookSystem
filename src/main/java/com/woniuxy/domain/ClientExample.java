package com.woniuxy.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ClientExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClientExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andClientnameIsNull() {
            addCriterion("clientname is null");
            return (Criteria) this;
        }

        public Criteria andClientnameIsNotNull() {
            addCriterion("clientname is not null");
            return (Criteria) this;
        }

        public Criteria andClientnameEqualTo(String value) {
            addCriterion("clientname =", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotEqualTo(String value) {
            addCriterion("clientname <>", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameGreaterThan(String value) {
            addCriterion("clientname >", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameGreaterThanOrEqualTo(String value) {
            addCriterion("clientname >=", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameLessThan(String value) {
            addCriterion("clientname <", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameLessThanOrEqualTo(String value) {
            addCriterion("clientname <=", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameLike(String value) {
            addCriterion("clientname like", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotLike(String value) {
            addCriterion("clientname not like", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameIn(List<String> values) {
            addCriterion("clientname in", values, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotIn(List<String> values) {
            addCriterion("clientname not in", values, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameBetween(String value1, String value2) {
            addCriterion("clientname between", value1, value2, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotBetween(String value1, String value2) {
            addCriterion("clientname not between", value1, value2, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientsexIsNull() {
            addCriterion("clientsex is null");
            return (Criteria) this;
        }

        public Criteria andClientsexIsNotNull() {
            addCriterion("clientsex is not null");
            return (Criteria) this;
        }

        public Criteria andClientsexEqualTo(String value) {
            addCriterion("clientsex =", value, "clientsex");
            return (Criteria) this;
        }

        public Criteria andClientsexNotEqualTo(String value) {
            addCriterion("clientsex <>", value, "clientsex");
            return (Criteria) this;
        }

        public Criteria andClientsexGreaterThan(String value) {
            addCriterion("clientsex >", value, "clientsex");
            return (Criteria) this;
        }

        public Criteria andClientsexGreaterThanOrEqualTo(String value) {
            addCriterion("clientsex >=", value, "clientsex");
            return (Criteria) this;
        }

        public Criteria andClientsexLessThan(String value) {
            addCriterion("clientsex <", value, "clientsex");
            return (Criteria) this;
        }

        public Criteria andClientsexLessThanOrEqualTo(String value) {
            addCriterion("clientsex <=", value, "clientsex");
            return (Criteria) this;
        }

        public Criteria andClientsexLike(String value) {
            addCriterion("clientsex like", value, "clientsex");
            return (Criteria) this;
        }

        public Criteria andClientsexNotLike(String value) {
            addCriterion("clientsex not like", value, "clientsex");
            return (Criteria) this;
        }

        public Criteria andClientsexIn(List<String> values) {
            addCriterion("clientsex in", values, "clientsex");
            return (Criteria) this;
        }

        public Criteria andClientsexNotIn(List<String> values) {
            addCriterion("clientsex not in", values, "clientsex");
            return (Criteria) this;
        }

        public Criteria andClientsexBetween(String value1, String value2) {
            addCriterion("clientsex between", value1, value2, "clientsex");
            return (Criteria) this;
        }

        public Criteria andClientsexNotBetween(String value1, String value2) {
            addCriterion("clientsex not between", value1, value2, "clientsex");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andUsercallIsNull() {
            addCriterion("usercall is null");
            return (Criteria) this;
        }

        public Criteria andUsercallIsNotNull() {
            addCriterion("usercall is not null");
            return (Criteria) this;
        }

        public Criteria andUsercallEqualTo(String value) {
            addCriterion("usercall =", value, "usercall");
            return (Criteria) this;
        }

        public Criteria andUsercallNotEqualTo(String value) {
            addCriterion("usercall <>", value, "usercall");
            return (Criteria) this;
        }

        public Criteria andUsercallGreaterThan(String value) {
            addCriterion("usercall >", value, "usercall");
            return (Criteria) this;
        }

        public Criteria andUsercallGreaterThanOrEqualTo(String value) {
            addCriterion("usercall >=", value, "usercall");
            return (Criteria) this;
        }

        public Criteria andUsercallLessThan(String value) {
            addCriterion("usercall <", value, "usercall");
            return (Criteria) this;
        }

        public Criteria andUsercallLessThanOrEqualTo(String value) {
            addCriterion("usercall <=", value, "usercall");
            return (Criteria) this;
        }

        public Criteria andUsercallLike(String value) {
            addCriterion("usercall like", value, "usercall");
            return (Criteria) this;
        }

        public Criteria andUsercallNotLike(String value) {
            addCriterion("usercall not like", value, "usercall");
            return (Criteria) this;
        }

        public Criteria andUsercallIn(List<String> values) {
            addCriterion("usercall in", values, "usercall");
            return (Criteria) this;
        }

        public Criteria andUsercallNotIn(List<String> values) {
            addCriterion("usercall not in", values, "usercall");
            return (Criteria) this;
        }

        public Criteria andUsercallBetween(String value1, String value2) {
            addCriterion("usercall between", value1, value2, "usercall");
            return (Criteria) this;
        }

        public Criteria andUsercallNotBetween(String value1, String value2) {
            addCriterion("usercall not between", value1, value2, "usercall");
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