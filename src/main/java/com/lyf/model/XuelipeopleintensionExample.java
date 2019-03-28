package com.lyf.model;

import java.util.ArrayList;
import java.util.List;

public class XuelipeopleintensionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XuelipeopleintensionExample() {
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

        public Criteria andXueliidIsNull() {
            addCriterion("xueliid is null");
            return (Criteria) this;
        }

        public Criteria andXueliidIsNotNull() {
            addCriterion("xueliid is not null");
            return (Criteria) this;
        }

        public Criteria andXueliidEqualTo(Integer value) {
            addCriterion("xueliid =", value, "xueliid");
            return (Criteria) this;
        }

        public Criteria andXueliidNotEqualTo(Integer value) {
            addCriterion("xueliid <>", value, "xueliid");
            return (Criteria) this;
        }

        public Criteria andXueliidGreaterThan(Integer value) {
            addCriterion("xueliid >", value, "xueliid");
            return (Criteria) this;
        }

        public Criteria andXueliidGreaterThanOrEqualTo(Integer value) {
            addCriterion("xueliid >=", value, "xueliid");
            return (Criteria) this;
        }

        public Criteria andXueliidLessThan(Integer value) {
            addCriterion("xueliid <", value, "xueliid");
            return (Criteria) this;
        }

        public Criteria andXueliidLessThanOrEqualTo(Integer value) {
            addCriterion("xueliid <=", value, "xueliid");
            return (Criteria) this;
        }

        public Criteria andXueliidIn(List<Integer> values) {
            addCriterion("xueliid in", values, "xueliid");
            return (Criteria) this;
        }

        public Criteria andXueliidNotIn(List<Integer> values) {
            addCriterion("xueliid not in", values, "xueliid");
            return (Criteria) this;
        }

        public Criteria andXueliidBetween(Integer value1, Integer value2) {
            addCriterion("xueliid between", value1, value2, "xueliid");
            return (Criteria) this;
        }

        public Criteria andXueliidNotBetween(Integer value1, Integer value2) {
            addCriterion("xueliid not between", value1, value2, "xueliid");
            return (Criteria) this;
        }

        public Criteria andXuelinameIsNull() {
            addCriterion("xueliname is null");
            return (Criteria) this;
        }

        public Criteria andXuelinameIsNotNull() {
            addCriterion("xueliname is not null");
            return (Criteria) this;
        }

        public Criteria andXuelinameEqualTo(String value) {
            addCriterion("xueliname =", value, "xueliname");
            return (Criteria) this;
        }

        public Criteria andXuelinameNotEqualTo(String value) {
            addCriterion("xueliname <>", value, "xueliname");
            return (Criteria) this;
        }

        public Criteria andXuelinameGreaterThan(String value) {
            addCriterion("xueliname >", value, "xueliname");
            return (Criteria) this;
        }

        public Criteria andXuelinameGreaterThanOrEqualTo(String value) {
            addCriterion("xueliname >=", value, "xueliname");
            return (Criteria) this;
        }

        public Criteria andXuelinameLessThan(String value) {
            addCriterion("xueliname <", value, "xueliname");
            return (Criteria) this;
        }

        public Criteria andXuelinameLessThanOrEqualTo(String value) {
            addCriterion("xueliname <=", value, "xueliname");
            return (Criteria) this;
        }

        public Criteria andXuelinameLike(String value) {
            addCriterion("xueliname like", value, "xueliname");
            return (Criteria) this;
        }

        public Criteria andXuelinameNotLike(String value) {
            addCriterion("xueliname not like", value, "xueliname");
            return (Criteria) this;
        }

        public Criteria andXuelinameIn(List<String> values) {
            addCriterion("xueliname in", values, "xueliname");
            return (Criteria) this;
        }

        public Criteria andXuelinameNotIn(List<String> values) {
            addCriterion("xueliname not in", values, "xueliname");
            return (Criteria) this;
        }

        public Criteria andXuelinameBetween(String value1, String value2) {
            addCriterion("xueliname between", value1, value2, "xueliname");
            return (Criteria) this;
        }

        public Criteria andXuelinameNotBetween(String value1, String value2) {
            addCriterion("xueliname not between", value1, value2, "xueliname");
            return (Criteria) this;
        }

        public Criteria andXueliscoreIsNull() {
            addCriterion("xueliscore is null");
            return (Criteria) this;
        }

        public Criteria andXueliscoreIsNotNull() {
            addCriterion("xueliscore is not null");
            return (Criteria) this;
        }

        public Criteria andXueliscoreEqualTo(Integer value) {
            addCriterion("xueliscore =", value, "xueliscore");
            return (Criteria) this;
        }

        public Criteria andXueliscoreNotEqualTo(Integer value) {
            addCriterion("xueliscore <>", value, "xueliscore");
            return (Criteria) this;
        }

        public Criteria andXueliscoreGreaterThan(Integer value) {
            addCriterion("xueliscore >", value, "xueliscore");
            return (Criteria) this;
        }

        public Criteria andXueliscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("xueliscore >=", value, "xueliscore");
            return (Criteria) this;
        }

        public Criteria andXueliscoreLessThan(Integer value) {
            addCriterion("xueliscore <", value, "xueliscore");
            return (Criteria) this;
        }

        public Criteria andXueliscoreLessThanOrEqualTo(Integer value) {
            addCriterion("xueliscore <=", value, "xueliscore");
            return (Criteria) this;
        }

        public Criteria andXueliscoreIn(List<Integer> values) {
            addCriterion("xueliscore in", values, "xueliscore");
            return (Criteria) this;
        }

        public Criteria andXueliscoreNotIn(List<Integer> values) {
            addCriterion("xueliscore not in", values, "xueliscore");
            return (Criteria) this;
        }

        public Criteria andXueliscoreBetween(Integer value1, Integer value2) {
            addCriterion("xueliscore between", value1, value2, "xueliscore");
            return (Criteria) this;
        }

        public Criteria andXueliscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("xueliscore not between", value1, value2, "xueliscore");
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