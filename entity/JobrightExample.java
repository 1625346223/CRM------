package com.hwua.entity;

import java.util.ArrayList;
import java.util.List;

public class JobrightExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JobrightExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andJobinfoidIsNull() {
            addCriterion("JOBINFOID is null");
            return (Criteria) this;
        }

        public Criteria andJobinfoidIsNotNull() {
            addCriterion("JOBINFOID is not null");
            return (Criteria) this;
        }

        public Criteria andJobinfoidEqualTo(Long value) {
            addCriterion("JOBINFOID =", value, "jobinfoid");
            return (Criteria) this;
        }

        public Criteria andJobinfoidNotEqualTo(Long value) {
            addCriterion("JOBINFOID <>", value, "jobinfoid");
            return (Criteria) this;
        }

        public Criteria andJobinfoidGreaterThan(Long value) {
            addCriterion("JOBINFOID >", value, "jobinfoid");
            return (Criteria) this;
        }

        public Criteria andJobinfoidGreaterThanOrEqualTo(Long value) {
            addCriterion("JOBINFOID >=", value, "jobinfoid");
            return (Criteria) this;
        }

        public Criteria andJobinfoidLessThan(Long value) {
            addCriterion("JOBINFOID <", value, "jobinfoid");
            return (Criteria) this;
        }

        public Criteria andJobinfoidLessThanOrEqualTo(Long value) {
            addCriterion("JOBINFOID <=", value, "jobinfoid");
            return (Criteria) this;
        }

        public Criteria andJobinfoidIn(List<Long> values) {
            addCriterion("JOBINFOID in", values, "jobinfoid");
            return (Criteria) this;
        }

        public Criteria andJobinfoidNotIn(List<Long> values) {
            addCriterion("JOBINFOID not in", values, "jobinfoid");
            return (Criteria) this;
        }

        public Criteria andJobinfoidBetween(Long value1, Long value2) {
            addCriterion("JOBINFOID between", value1, value2, "jobinfoid");
            return (Criteria) this;
        }

        public Criteria andJobinfoidNotBetween(Long value1, Long value2) {
            addCriterion("JOBINFOID not between", value1, value2, "jobinfoid");
            return (Criteria) this;
        }

        public Criteria andRightidIsNull() {
            addCriterion("RIGHTID is null");
            return (Criteria) this;
        }

        public Criteria andRightidIsNotNull() {
            addCriterion("RIGHTID is not null");
            return (Criteria) this;
        }

        public Criteria andRightidEqualTo(Long value) {
            addCriterion("RIGHTID =", value, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidNotEqualTo(Long value) {
            addCriterion("RIGHTID <>", value, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidGreaterThan(Long value) {
            addCriterion("RIGHTID >", value, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidGreaterThanOrEqualTo(Long value) {
            addCriterion("RIGHTID >=", value, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidLessThan(Long value) {
            addCriterion("RIGHTID <", value, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidLessThanOrEqualTo(Long value) {
            addCriterion("RIGHTID <=", value, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidIn(List<Long> values) {
            addCriterion("RIGHTID in", values, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidNotIn(List<Long> values) {
            addCriterion("RIGHTID not in", values, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidBetween(Long value1, Long value2) {
            addCriterion("RIGHTID between", value1, value2, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidNotBetween(Long value1, Long value2) {
            addCriterion("RIGHTID not between", value1, value2, "rightid");
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