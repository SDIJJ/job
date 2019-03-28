package com.lyf.model;

import java.util.ArrayList;
import java.util.List;

public class WorkexppeopleintensionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkexppeopleintensionExample() {
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

        public Criteria andWorkexpidIsNull() {
            addCriterion("workexpid is null");
            return (Criteria) this;
        }

        public Criteria andWorkexpidIsNotNull() {
            addCriterion("workexpid is not null");
            return (Criteria) this;
        }

        public Criteria andWorkexpidEqualTo(Integer value) {
            addCriterion("workexpid =", value, "workexpid");
            return (Criteria) this;
        }

        public Criteria andWorkexpidNotEqualTo(Integer value) {
            addCriterion("workexpid <>", value, "workexpid");
            return (Criteria) this;
        }

        public Criteria andWorkexpidGreaterThan(Integer value) {
            addCriterion("workexpid >", value, "workexpid");
            return (Criteria) this;
        }

        public Criteria andWorkexpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("workexpid >=", value, "workexpid");
            return (Criteria) this;
        }

        public Criteria andWorkexpidLessThan(Integer value) {
            addCriterion("workexpid <", value, "workexpid");
            return (Criteria) this;
        }

        public Criteria andWorkexpidLessThanOrEqualTo(Integer value) {
            addCriterion("workexpid <=", value, "workexpid");
            return (Criteria) this;
        }

        public Criteria andWorkexpidIn(List<Integer> values) {
            addCriterion("workexpid in", values, "workexpid");
            return (Criteria) this;
        }

        public Criteria andWorkexpidNotIn(List<Integer> values) {
            addCriterion("workexpid not in", values, "workexpid");
            return (Criteria) this;
        }

        public Criteria andWorkexpidBetween(Integer value1, Integer value2) {
            addCriterion("workexpid between", value1, value2, "workexpid");
            return (Criteria) this;
        }

        public Criteria andWorkexpidNotBetween(Integer value1, Integer value2) {
            addCriterion("workexpid not between", value1, value2, "workexpid");
            return (Criteria) this;
        }

        public Criteria andWorkexpIsNull() {
            addCriterion("workexp is null");
            return (Criteria) this;
        }

        public Criteria andWorkexpIsNotNull() {
            addCriterion("workexp is not null");
            return (Criteria) this;
        }

        public Criteria andWorkexpEqualTo(String value) {
            addCriterion("workexp =", value, "workexp");
            return (Criteria) this;
        }

        public Criteria andWorkexpNotEqualTo(String value) {
            addCriterion("workexp <>", value, "workexp");
            return (Criteria) this;
        }

        public Criteria andWorkexpGreaterThan(String value) {
            addCriterion("workexp >", value, "workexp");
            return (Criteria) this;
        }

        public Criteria andWorkexpGreaterThanOrEqualTo(String value) {
            addCriterion("workexp >=", value, "workexp");
            return (Criteria) this;
        }

        public Criteria andWorkexpLessThan(String value) {
            addCriterion("workexp <", value, "workexp");
            return (Criteria) this;
        }

        public Criteria andWorkexpLessThanOrEqualTo(String value) {
            addCriterion("workexp <=", value, "workexp");
            return (Criteria) this;
        }

        public Criteria andWorkexpLike(String value) {
            addCriterion("workexp like", value, "workexp");
            return (Criteria) this;
        }

        public Criteria andWorkexpNotLike(String value) {
            addCriterion("workexp not like", value, "workexp");
            return (Criteria) this;
        }

        public Criteria andWorkexpIn(List<String> values) {
            addCriterion("workexp in", values, "workexp");
            return (Criteria) this;
        }

        public Criteria andWorkexpNotIn(List<String> values) {
            addCriterion("workexp not in", values, "workexp");
            return (Criteria) this;
        }

        public Criteria andWorkexpBetween(String value1, String value2) {
            addCriterion("workexp between", value1, value2, "workexp");
            return (Criteria) this;
        }

        public Criteria andWorkexpNotBetween(String value1, String value2) {
            addCriterion("workexp not between", value1, value2, "workexp");
            return (Criteria) this;
        }

        public Criteria andPlacescoreIsNull() {
            addCriterion("placescore is null");
            return (Criteria) this;
        }

        public Criteria andPlacescoreIsNotNull() {
            addCriterion("placescore is not null");
            return (Criteria) this;
        }

        public Criteria andPlacescoreEqualTo(Integer value) {
            addCriterion("placescore =", value, "placescore");
            return (Criteria) this;
        }

        public Criteria andPlacescoreNotEqualTo(Integer value) {
            addCriterion("placescore <>", value, "placescore");
            return (Criteria) this;
        }

        public Criteria andPlacescoreGreaterThan(Integer value) {
            addCriterion("placescore >", value, "placescore");
            return (Criteria) this;
        }

        public Criteria andPlacescoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("placescore >=", value, "placescore");
            return (Criteria) this;
        }

        public Criteria andPlacescoreLessThan(Integer value) {
            addCriterion("placescore <", value, "placescore");
            return (Criteria) this;
        }

        public Criteria andPlacescoreLessThanOrEqualTo(Integer value) {
            addCriterion("placescore <=", value, "placescore");
            return (Criteria) this;
        }

        public Criteria andPlacescoreIn(List<Integer> values) {
            addCriterion("placescore in", values, "placescore");
            return (Criteria) this;
        }

        public Criteria andPlacescoreNotIn(List<Integer> values) {
            addCriterion("placescore not in", values, "placescore");
            return (Criteria) this;
        }

        public Criteria andPlacescoreBetween(Integer value1, Integer value2) {
            addCriterion("placescore between", value1, value2, "placescore");
            return (Criteria) this;
        }

        public Criteria andPlacescoreNotBetween(Integer value1, Integer value2) {
            addCriterion("placescore not between", value1, value2, "placescore");
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