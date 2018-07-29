package com.hwua.entity;

import java.util.ArrayList;
import java.util.List;

public class RightsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RightsExample() {
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

        public Criteria andRidIsNull() {
            addCriterion("RID is null");
            return (Criteria) this;
        }

        public Criteria andRidIsNotNull() {
            addCriterion("RID is not null");
            return (Criteria) this;
        }

        public Criteria andRidEqualTo(Long value) {
            addCriterion("RID =", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotEqualTo(Long value) {
            addCriterion("RID <>", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThan(Long value) {
            addCriterion("RID >", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThanOrEqualTo(Long value) {
            addCriterion("RID >=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThan(Long value) {
            addCriterion("RID <", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThanOrEqualTo(Long value) {
            addCriterion("RID <=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidIn(List<Long> values) {
            addCriterion("RID in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotIn(List<Long> values) {
            addCriterion("RID not in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidBetween(Long value1, Long value2) {
            addCriterion("RID between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotBetween(Long value1, Long value2) {
            addCriterion("RID not between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRightnameIsNull() {
            addCriterion("RIGHTNAME is null");
            return (Criteria) this;
        }

        public Criteria andRightnameIsNotNull() {
            addCriterion("RIGHTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andRightnameEqualTo(String value) {
            addCriterion("RIGHTNAME =", value, "rightname");
            return (Criteria) this;
        }

        public Criteria andRightnameNotEqualTo(String value) {
            addCriterion("RIGHTNAME <>", value, "rightname");
            return (Criteria) this;
        }

        public Criteria andRightnameGreaterThan(String value) {
            addCriterion("RIGHTNAME >", value, "rightname");
            return (Criteria) this;
        }

        public Criteria andRightnameGreaterThanOrEqualTo(String value) {
            addCriterion("RIGHTNAME >=", value, "rightname");
            return (Criteria) this;
        }

        public Criteria andRightnameLessThan(String value) {
            addCriterion("RIGHTNAME <", value, "rightname");
            return (Criteria) this;
        }

        public Criteria andRightnameLessThanOrEqualTo(String value) {
            addCriterion("RIGHTNAME <=", value, "rightname");
            return (Criteria) this;
        }

        public Criteria andRightnameLike(String value) {
            addCriterion("RIGHTNAME like", value, "rightname");
            return (Criteria) this;
        }

        public Criteria andRightnameNotLike(String value) {
            addCriterion("RIGHTNAME not like", value, "rightname");
            return (Criteria) this;
        }

        public Criteria andRightnameIn(List<String> values) {
            addCriterion("RIGHTNAME in", values, "rightname");
            return (Criteria) this;
        }

        public Criteria andRightnameNotIn(List<String> values) {
            addCriterion("RIGHTNAME not in", values, "rightname");
            return (Criteria) this;
        }

        public Criteria andRightnameBetween(String value1, String value2) {
            addCriterion("RIGHTNAME between", value1, value2, "rightname");
            return (Criteria) this;
        }

        public Criteria andRightnameNotBetween(String value1, String value2) {
            addCriterion("RIGHTNAME not between", value1, value2, "rightname");
            return (Criteria) this;
        }

        public Criteria andRighttypeIsNull() {
            addCriterion("RIGHTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andRighttypeIsNotNull() {
            addCriterion("RIGHTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRighttypeEqualTo(String value) {
            addCriterion("RIGHTTYPE =", value, "righttype");
            return (Criteria) this;
        }

        public Criteria andRighttypeNotEqualTo(String value) {
            addCriterion("RIGHTTYPE <>", value, "righttype");
            return (Criteria) this;
        }

        public Criteria andRighttypeGreaterThan(String value) {
            addCriterion("RIGHTTYPE >", value, "righttype");
            return (Criteria) this;
        }

        public Criteria andRighttypeGreaterThanOrEqualTo(String value) {
            addCriterion("RIGHTTYPE >=", value, "righttype");
            return (Criteria) this;
        }

        public Criteria andRighttypeLessThan(String value) {
            addCriterion("RIGHTTYPE <", value, "righttype");
            return (Criteria) this;
        }

        public Criteria andRighttypeLessThanOrEqualTo(String value) {
            addCriterion("RIGHTTYPE <=", value, "righttype");
            return (Criteria) this;
        }

        public Criteria andRighttypeLike(String value) {
            addCriterion("RIGHTTYPE like", value, "righttype");
            return (Criteria) this;
        }

        public Criteria andRighttypeNotLike(String value) {
            addCriterion("RIGHTTYPE not like", value, "righttype");
            return (Criteria) this;
        }

        public Criteria andRighttypeIn(List<String> values) {
            addCriterion("RIGHTTYPE in", values, "righttype");
            return (Criteria) this;
        }

        public Criteria andRighttypeNotIn(List<String> values) {
            addCriterion("RIGHTTYPE not in", values, "righttype");
            return (Criteria) this;
        }

        public Criteria andRighttypeBetween(String value1, String value2) {
            addCriterion("RIGHTTYPE between", value1, value2, "righttype");
            return (Criteria) this;
        }

        public Criteria andRighttypeNotBetween(String value1, String value2) {
            addCriterion("RIGHTTYPE not between", value1, value2, "righttype");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("URL is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("URL is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("URL =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("URL <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("URL >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("URL >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("URL <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("URL <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("URL like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("URL not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("URL in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("URL not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("URL between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("URL not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("PID is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("PID is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Long value) {
            addCriterion("PID =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Long value) {
            addCriterion("PID <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Long value) {
            addCriterion("PID >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Long value) {
            addCriterion("PID >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Long value) {
            addCriterion("PID <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Long value) {
            addCriterion("PID <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Long> values) {
            addCriterion("PID in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Long> values) {
            addCriterion("PID not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Long value1, Long value2) {
            addCriterion("PID between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Long value1, Long value2) {
            addCriterion("PID not between", value1, value2, "pid");
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