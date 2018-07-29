package com.hwua.entity;

import java.util.ArrayList;
import java.util.List;

public class EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeExample() {
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

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPassIsNull() {
            addCriterion("PASS is null");
            return (Criteria) this;
        }

        public Criteria andPassIsNotNull() {
            addCriterion("PASS is not null");
            return (Criteria) this;
        }

        public Criteria andPassEqualTo(String value) {
            addCriterion("PASS =", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotEqualTo(String value) {
            addCriterion("PASS <>", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassGreaterThan(String value) {
            addCriterion("PASS >", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassGreaterThanOrEqualTo(String value) {
            addCriterion("PASS >=", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassLessThan(String value) {
            addCriterion("PASS <", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassLessThanOrEqualTo(String value) {
            addCriterion("PASS <=", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassLike(String value) {
            addCriterion("PASS like", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotLike(String value) {
            addCriterion("PASS not like", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassIn(List<String> values) {
            addCriterion("PASS in", values, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotIn(List<String> values) {
            addCriterion("PASS not in", values, "pass");
            return (Criteria) this;
        }

        public Criteria andPassBetween(String value1, String value2) {
            addCriterion("PASS between", value1, value2, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotBetween(String value1, String value2) {
            addCriterion("PASS not between", value1, value2, "pass");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("NICKNAME is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("NICKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("NICKNAME =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("NICKNAME <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("NICKNAME >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("NICKNAME >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("NICKNAME <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("NICKNAME <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("NICKNAME like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("NICKNAME not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("NICKNAME in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("NICKNAME not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("NICKNAME between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("NICKNAME not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("REALNAME is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("REALNAME is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("REALNAME =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("REALNAME <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("REALNAME >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("REALNAME >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("REALNAME <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("REALNAME <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("REALNAME like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("REALNAME not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("REALNAME in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("REALNAME not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("REALNAME between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("REALNAME not between", value1, value2, "realname");
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

        public Criteria andDepartmentidIsNull() {
            addCriterion("DEPARTMENTID is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNotNull() {
            addCriterion("DEPARTMENTID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidEqualTo(Long value) {
            addCriterion("DEPARTMENTID =", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotEqualTo(Long value) {
            addCriterion("DEPARTMENTID <>", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThan(Long value) {
            addCriterion("DEPARTMENTID >", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThanOrEqualTo(Long value) {
            addCriterion("DEPARTMENTID >=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThan(Long value) {
            addCriterion("DEPARTMENTID <", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThanOrEqualTo(Long value) {
            addCriterion("DEPARTMENTID <=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIn(List<Long> values) {
            addCriterion("DEPARTMENTID in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotIn(List<Long> values) {
            addCriterion("DEPARTMENTID not in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidBetween(Long value1, Long value2) {
            addCriterion("DEPARTMENTID between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotBetween(Long value1, Long value2) {
            addCriterion("DEPARTMENTID not between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andPhonenoIsNull() {
            addCriterion("PHONENO is null");
            return (Criteria) this;
        }

        public Criteria andPhonenoIsNotNull() {
            addCriterion("PHONENO is not null");
            return (Criteria) this;
        }

        public Criteria andPhonenoEqualTo(String value) {
            addCriterion("PHONENO =", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoNotEqualTo(String value) {
            addCriterion("PHONENO <>", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoGreaterThan(String value) {
            addCriterion("PHONENO >", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoGreaterThanOrEqualTo(String value) {
            addCriterion("PHONENO >=", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoLessThan(String value) {
            addCriterion("PHONENO <", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoLessThanOrEqualTo(String value) {
            addCriterion("PHONENO <=", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoLike(String value) {
            addCriterion("PHONENO like", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoNotLike(String value) {
            addCriterion("PHONENO not like", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoIn(List<String> values) {
            addCriterion("PHONENO in", values, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoNotIn(List<String> values) {
            addCriterion("PHONENO not in", values, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoBetween(String value1, String value2) {
            addCriterion("PHONENO between", value1, value2, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoNotBetween(String value1, String value2) {
            addCriterion("PHONENO not between", value1, value2, "phoneno");
            return (Criteria) this;
        }

        public Criteria andOfficetelIsNull() {
            addCriterion("OFFICETEL is null");
            return (Criteria) this;
        }

        public Criteria andOfficetelIsNotNull() {
            addCriterion("OFFICETEL is not null");
            return (Criteria) this;
        }

        public Criteria andOfficetelEqualTo(String value) {
            addCriterion("OFFICETEL =", value, "officetel");
            return (Criteria) this;
        }

        public Criteria andOfficetelNotEqualTo(String value) {
            addCriterion("OFFICETEL <>", value, "officetel");
            return (Criteria) this;
        }

        public Criteria andOfficetelGreaterThan(String value) {
            addCriterion("OFFICETEL >", value, "officetel");
            return (Criteria) this;
        }

        public Criteria andOfficetelGreaterThanOrEqualTo(String value) {
            addCriterion("OFFICETEL >=", value, "officetel");
            return (Criteria) this;
        }

        public Criteria andOfficetelLessThan(String value) {
            addCriterion("OFFICETEL <", value, "officetel");
            return (Criteria) this;
        }

        public Criteria andOfficetelLessThanOrEqualTo(String value) {
            addCriterion("OFFICETEL <=", value, "officetel");
            return (Criteria) this;
        }

        public Criteria andOfficetelLike(String value) {
            addCriterion("OFFICETEL like", value, "officetel");
            return (Criteria) this;
        }

        public Criteria andOfficetelNotLike(String value) {
            addCriterion("OFFICETEL not like", value, "officetel");
            return (Criteria) this;
        }

        public Criteria andOfficetelIn(List<String> values) {
            addCriterion("OFFICETEL in", values, "officetel");
            return (Criteria) this;
        }

        public Criteria andOfficetelNotIn(List<String> values) {
            addCriterion("OFFICETEL not in", values, "officetel");
            return (Criteria) this;
        }

        public Criteria andOfficetelBetween(String value1, String value2) {
            addCriterion("OFFICETEL between", value1, value2, "officetel");
            return (Criteria) this;
        }

        public Criteria andOfficetelNotBetween(String value1, String value2) {
            addCriterion("OFFICETEL not between", value1, value2, "officetel");
            return (Criteria) this;
        }

        public Criteria andWorkstatuIsNull() {
            addCriterion("WORKSTATU is null");
            return (Criteria) this;
        }

        public Criteria andWorkstatuIsNotNull() {
            addCriterion("WORKSTATU is not null");
            return (Criteria) this;
        }

        public Criteria andWorkstatuEqualTo(String value) {
            addCriterion("WORKSTATU =", value, "workstatu");
            return (Criteria) this;
        }

        public Criteria andWorkstatuNotEqualTo(String value) {
            addCriterion("WORKSTATU <>", value, "workstatu");
            return (Criteria) this;
        }

        public Criteria andWorkstatuGreaterThan(String value) {
            addCriterion("WORKSTATU >", value, "workstatu");
            return (Criteria) this;
        }

        public Criteria andWorkstatuGreaterThanOrEqualTo(String value) {
            addCriterion("WORKSTATU >=", value, "workstatu");
            return (Criteria) this;
        }

        public Criteria andWorkstatuLessThan(String value) {
            addCriterion("WORKSTATU <", value, "workstatu");
            return (Criteria) this;
        }

        public Criteria andWorkstatuLessThanOrEqualTo(String value) {
            addCriterion("WORKSTATU <=", value, "workstatu");
            return (Criteria) this;
        }

        public Criteria andWorkstatuLike(String value) {
            addCriterion("WORKSTATU like", value, "workstatu");
            return (Criteria) this;
        }

        public Criteria andWorkstatuNotLike(String value) {
            addCriterion("WORKSTATU not like", value, "workstatu");
            return (Criteria) this;
        }

        public Criteria andWorkstatuIn(List<String> values) {
            addCriterion("WORKSTATU in", values, "workstatu");
            return (Criteria) this;
        }

        public Criteria andWorkstatuNotIn(List<String> values) {
            addCriterion("WORKSTATU not in", values, "workstatu");
            return (Criteria) this;
        }

        public Criteria andWorkstatuBetween(String value1, String value2) {
            addCriterion("WORKSTATU between", value1, value2, "workstatu");
            return (Criteria) this;
        }

        public Criteria andWorkstatuNotBetween(String value1, String value2) {
            addCriterion("WORKSTATU not between", value1, value2, "workstatu");
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