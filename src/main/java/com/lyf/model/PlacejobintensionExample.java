package com.lyf.model;

import java.util.ArrayList;
import java.util.List;

public class PlacejobintensionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlacejobintensionExample() {
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

        public Criteria andPlaceidIsNull() {
            addCriterion("placeid is null");
            return (Criteria) this;
        }

        public Criteria andPlaceidIsNotNull() {
            addCriterion("placeid is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceidEqualTo(Integer value) {
            addCriterion("placeid =", value, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidNotEqualTo(Integer value) {
            addCriterion("placeid <>", value, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidGreaterThan(Integer value) {
            addCriterion("placeid >", value, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("placeid >=", value, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidLessThan(Integer value) {
            addCriterion("placeid <", value, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidLessThanOrEqualTo(Integer value) {
            addCriterion("placeid <=", value, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidIn(List<Integer> values) {
            addCriterion("placeid in", values, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidNotIn(List<Integer> values) {
            addCriterion("placeid not in", values, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidBetween(Integer value1, Integer value2) {
            addCriterion("placeid between", value1, value2, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidNotBetween(Integer value1, Integer value2) {
            addCriterion("placeid not between", value1, value2, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlacenameIsNull() {
            addCriterion("placename is null");
            return (Criteria) this;
        }

        public Criteria andPlacenameIsNotNull() {
            addCriterion("placename is not null");
            return (Criteria) this;
        }

        public Criteria andPlacenameEqualTo(String value) {
            addCriterion("placename =", value, "placename");
            return (Criteria) this;
        }

        public Criteria andPlacenameNotEqualTo(String value) {
            addCriterion("placename <>", value, "placename");
            return (Criteria) this;
        }

        public Criteria andPlacenameGreaterThan(String value) {
            addCriterion("placename >", value, "placename");
            return (Criteria) this;
        }

        public Criteria andPlacenameGreaterThanOrEqualTo(String value) {
            addCriterion("placename >=", value, "placename");
            return (Criteria) this;
        }

        public Criteria andPlacenameLessThan(String value) {
            addCriterion("placename <", value, "placename");
            return (Criteria) this;
        }

        public Criteria andPlacenameLessThanOrEqualTo(String value) {
            addCriterion("placename <=", value, "placename");
            return (Criteria) this;
        }

        public Criteria andPlacenameLike(String value) {
            addCriterion("placename like", value, "placename");
            return (Criteria) this;
        }

        public Criteria andPlacenameNotLike(String value) {
            addCriterion("placename not like", value, "placename");
            return (Criteria) this;
        }

        public Criteria andPlacenameIn(List<String> values) {
            addCriterion("placename in", values, "placename");
            return (Criteria) this;
        }

        public Criteria andPlacenameNotIn(List<String> values) {
            addCriterion("placename not in", values, "placename");
            return (Criteria) this;
        }

        public Criteria andPlacenameBetween(String value1, String value2) {
            addCriterion("placename between", value1, value2, "placename");
            return (Criteria) this;
        }

        public Criteria andPlacenameNotBetween(String value1, String value2) {
            addCriterion("placename not between", value1, value2, "placename");
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

        public Criteria andJidIsNull() {
            addCriterion("jid is null");
            return (Criteria) this;
        }

        public Criteria andJidIsNotNull() {
            addCriterion("jid is not null");
            return (Criteria) this;
        }

        public Criteria andJidEqualTo(Integer value) {
            addCriterion("jid =", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidNotEqualTo(Integer value) {
            addCriterion("jid <>", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidGreaterThan(Integer value) {
            addCriterion("jid >", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidGreaterThanOrEqualTo(Integer value) {
            addCriterion("jid >=", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidLessThan(Integer value) {
            addCriterion("jid <", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidLessThanOrEqualTo(Integer value) {
            addCriterion("jid <=", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidIn(List<Integer> values) {
            addCriterion("jid in", values, "jid");
            return (Criteria) this;
        }

        public Criteria andJidNotIn(List<Integer> values) {
            addCriterion("jid not in", values, "jid");
            return (Criteria) this;
        }

        public Criteria andJidBetween(Integer value1, Integer value2) {
            addCriterion("jid between", value1, value2, "jid");
            return (Criteria) this;
        }

        public Criteria andJidNotBetween(Integer value1, Integer value2) {
            addCriterion("jid not between", value1, value2, "jid");
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