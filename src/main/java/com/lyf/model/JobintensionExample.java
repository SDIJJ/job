package com.lyf.model;

import java.util.ArrayList;
import java.util.List;

public class JobintensionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JobintensionExample() {
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

        public Criteria andTypeweightIsNull() {
            addCriterion("typeWeight is null");
            return (Criteria) this;
        }

        public Criteria andTypeweightIsNotNull() {
            addCriterion("typeWeight is not null");
            return (Criteria) this;
        }

        public Criteria andTypeweightEqualTo(Integer value) {
            addCriterion("typeWeight =", value, "typeweight");
            return (Criteria) this;
        }

        public Criteria andTypeweightNotEqualTo(Integer value) {
            addCriterion("typeWeight <>", value, "typeweight");
            return (Criteria) this;
        }

        public Criteria andTypeweightGreaterThan(Integer value) {
            addCriterion("typeWeight >", value, "typeweight");
            return (Criteria) this;
        }

        public Criteria andTypeweightGreaterThanOrEqualTo(Integer value) {
            addCriterion("typeWeight >=", value, "typeweight");
            return (Criteria) this;
        }

        public Criteria andTypeweightLessThan(Integer value) {
            addCriterion("typeWeight <", value, "typeweight");
            return (Criteria) this;
        }

        public Criteria andTypeweightLessThanOrEqualTo(Integer value) {
            addCriterion("typeWeight <=", value, "typeweight");
            return (Criteria) this;
        }

        public Criteria andTypeweightIn(List<Integer> values) {
            addCriterion("typeWeight in", values, "typeweight");
            return (Criteria) this;
        }

        public Criteria andTypeweightNotIn(List<Integer> values) {
            addCriterion("typeWeight not in", values, "typeweight");
            return (Criteria) this;
        }

        public Criteria andTypeweightBetween(Integer value1, Integer value2) {
            addCriterion("typeWeight between", value1, value2, "typeweight");
            return (Criteria) this;
        }

        public Criteria andTypeweightNotBetween(Integer value1, Integer value2) {
            addCriterion("typeWeight not between", value1, value2, "typeweight");
            return (Criteria) this;
        }

        public Criteria andPlaceweightIsNull() {
            addCriterion("placeWeight is null");
            return (Criteria) this;
        }

        public Criteria andPlaceweightIsNotNull() {
            addCriterion("placeWeight is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceweightEqualTo(Integer value) {
            addCriterion("placeWeight =", value, "placeweight");
            return (Criteria) this;
        }

        public Criteria andPlaceweightNotEqualTo(Integer value) {
            addCriterion("placeWeight <>", value, "placeweight");
            return (Criteria) this;
        }

        public Criteria andPlaceweightGreaterThan(Integer value) {
            addCriterion("placeWeight >", value, "placeweight");
            return (Criteria) this;
        }

        public Criteria andPlaceweightGreaterThanOrEqualTo(Integer value) {
            addCriterion("placeWeight >=", value, "placeweight");
            return (Criteria) this;
        }

        public Criteria andPlaceweightLessThan(Integer value) {
            addCriterion("placeWeight <", value, "placeweight");
            return (Criteria) this;
        }

        public Criteria andPlaceweightLessThanOrEqualTo(Integer value) {
            addCriterion("placeWeight <=", value, "placeweight");
            return (Criteria) this;
        }

        public Criteria andPlaceweightIn(List<Integer> values) {
            addCriterion("placeWeight in", values, "placeweight");
            return (Criteria) this;
        }

        public Criteria andPlaceweightNotIn(List<Integer> values) {
            addCriterion("placeWeight not in", values, "placeweight");
            return (Criteria) this;
        }

        public Criteria andPlaceweightBetween(Integer value1, Integer value2) {
            addCriterion("placeWeight between", value1, value2, "placeweight");
            return (Criteria) this;
        }

        public Criteria andPlaceweightNotBetween(Integer value1, Integer value2) {
            addCriterion("placeWeight not between", value1, value2, "placeweight");
            return (Criteria) this;
        }

        public Criteria andAidIsNull() {
            addCriterion("aid is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("aid is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(Integer value) {
            addCriterion("aid =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(Integer value) {
            addCriterion("aid <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(Integer value) {
            addCriterion("aid >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(Integer value) {
            addCriterion("aid >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(Integer value) {
            addCriterion("aid <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(Integer value) {
            addCriterion("aid <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<Integer> values) {
            addCriterion("aid in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<Integer> values) {
            addCriterion("aid not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(Integer value1, Integer value2) {
            addCriterion("aid between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(Integer value1, Integer value2) {
            addCriterion("aid not between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
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