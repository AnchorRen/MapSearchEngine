package com.lmars.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbMapserviceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbMapserviceExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMapserviceurlIsNull() {
            addCriterion("MapServiceURL is null");
            return (Criteria) this;
        }

        public Criteria andMapserviceurlIsNotNull() {
            addCriterion("MapServiceURL is not null");
            return (Criteria) this;
        }

        public Criteria andMapserviceurlEqualTo(String value) {
            addCriterion("MapServiceURL =", value, "mapserviceurl");
            return (Criteria) this;
        }

        public Criteria andMapserviceurlNotEqualTo(String value) {
            addCriterion("MapServiceURL <>", value, "mapserviceurl");
            return (Criteria) this;
        }

        public Criteria andMapserviceurlGreaterThan(String value) {
            addCriterion("MapServiceURL >", value, "mapserviceurl");
            return (Criteria) this;
        }

        public Criteria andMapserviceurlGreaterThanOrEqualTo(String value) {
            addCriterion("MapServiceURL >=", value, "mapserviceurl");
            return (Criteria) this;
        }

        public Criteria andMapserviceurlLessThan(String value) {
            addCriterion("MapServiceURL <", value, "mapserviceurl");
            return (Criteria) this;
        }

        public Criteria andMapserviceurlLessThanOrEqualTo(String value) {
            addCriterion("MapServiceURL <=", value, "mapserviceurl");
            return (Criteria) this;
        }

        public Criteria andMapserviceurlLike(String value) {
            addCriterion("MapServiceURL like", value, "mapserviceurl");
            return (Criteria) this;
        }

        public Criteria andMapserviceurlNotLike(String value) {
            addCriterion("MapServiceURL not like", value, "mapserviceurl");
            return (Criteria) this;
        }

        public Criteria andMapserviceurlIn(List<String> values) {
            addCriterion("MapServiceURL in", values, "mapserviceurl");
            return (Criteria) this;
        }

        public Criteria andMapserviceurlNotIn(List<String> values) {
            addCriterion("MapServiceURL not in", values, "mapserviceurl");
            return (Criteria) this;
        }

        public Criteria andMapserviceurlBetween(String value1, String value2) {
            addCriterion("MapServiceURL between", value1, value2, "mapserviceurl");
            return (Criteria) this;
        }

        public Criteria andMapserviceurlNotBetween(String value1, String value2) {
            addCriterion("MapServiceURL not between", value1, value2, "mapserviceurl");
            return (Criteria) this;
        }

        public Criteria andCurrentversionIsNull() {
            addCriterion("currentVersion is null");
            return (Criteria) this;
        }

        public Criteria andCurrentversionIsNotNull() {
            addCriterion("currentVersion is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentversionEqualTo(String value) {
            addCriterion("currentVersion =", value, "currentversion");
            return (Criteria) this;
        }

        public Criteria andCurrentversionNotEqualTo(String value) {
            addCriterion("currentVersion <>", value, "currentversion");
            return (Criteria) this;
        }

        public Criteria andCurrentversionGreaterThan(String value) {
            addCriterion("currentVersion >", value, "currentversion");
            return (Criteria) this;
        }

        public Criteria andCurrentversionGreaterThanOrEqualTo(String value) {
            addCriterion("currentVersion >=", value, "currentversion");
            return (Criteria) this;
        }

        public Criteria andCurrentversionLessThan(String value) {
            addCriterion("currentVersion <", value, "currentversion");
            return (Criteria) this;
        }

        public Criteria andCurrentversionLessThanOrEqualTo(String value) {
            addCriterion("currentVersion <=", value, "currentversion");
            return (Criteria) this;
        }

        public Criteria andCurrentversionLike(String value) {
            addCriterion("currentVersion like", value, "currentversion");
            return (Criteria) this;
        }

        public Criteria andCurrentversionNotLike(String value) {
            addCriterion("currentVersion not like", value, "currentversion");
            return (Criteria) this;
        }

        public Criteria andCurrentversionIn(List<String> values) {
            addCriterion("currentVersion in", values, "currentversion");
            return (Criteria) this;
        }

        public Criteria andCurrentversionNotIn(List<String> values) {
            addCriterion("currentVersion not in", values, "currentversion");
            return (Criteria) this;
        }

        public Criteria andCurrentversionBetween(String value1, String value2) {
            addCriterion("currentVersion between", value1, value2, "currentversion");
            return (Criteria) this;
        }

        public Criteria andCurrentversionNotBetween(String value1, String value2) {
            addCriterion("currentVersion not between", value1, value2, "currentversion");
            return (Criteria) this;
        }

        public Criteria andMapnameIsNull() {
            addCriterion("MapName is null");
            return (Criteria) this;
        }

        public Criteria andMapnameIsNotNull() {
            addCriterion("MapName is not null");
            return (Criteria) this;
        }

        public Criteria andMapnameEqualTo(String value) {
            addCriterion("MapName =", value, "mapname");
            return (Criteria) this;
        }

        public Criteria andMapnameNotEqualTo(String value) {
            addCriterion("MapName <>", value, "mapname");
            return (Criteria) this;
        }

        public Criteria andMapnameGreaterThan(String value) {
            addCriterion("MapName >", value, "mapname");
            return (Criteria) this;
        }

        public Criteria andMapnameGreaterThanOrEqualTo(String value) {
            addCriterion("MapName >=", value, "mapname");
            return (Criteria) this;
        }

        public Criteria andMapnameLessThan(String value) {
            addCriterion("MapName <", value, "mapname");
            return (Criteria) this;
        }

        public Criteria andMapnameLessThanOrEqualTo(String value) {
            addCriterion("MapName <=", value, "mapname");
            return (Criteria) this;
        }

        public Criteria andMapnameLike(String value) {
            addCriterion("MapName like", value, "mapname");
            return (Criteria) this;
        }

        public Criteria andMapnameNotLike(String value) {
            addCriterion("MapName not like", value, "mapname");
            return (Criteria) this;
        }

        public Criteria andMapnameIn(List<String> values) {
            addCriterion("MapName in", values, "mapname");
            return (Criteria) this;
        }

        public Criteria andMapnameNotIn(List<String> values) {
            addCriterion("MapName not in", values, "mapname");
            return (Criteria) this;
        }

        public Criteria andMapnameBetween(String value1, String value2) {
            addCriterion("MapName between", value1, value2, "mapname");
            return (Criteria) this;
        }

        public Criteria andMapnameNotBetween(String value1, String value2) {
            addCriterion("MapName not between", value1, value2, "mapname");
            return (Criteria) this;
        }

        public Criteria andSinglefusedmapcacheIsNull() {
            addCriterion("singleFusedMapCache is null");
            return (Criteria) this;
        }

        public Criteria andSinglefusedmapcacheIsNotNull() {
            addCriterion("singleFusedMapCache is not null");
            return (Criteria) this;
        }

        public Criteria andSinglefusedmapcacheEqualTo(String value) {
            addCriterion("singleFusedMapCache =", value, "singlefusedmapcache");
            return (Criteria) this;
        }

        public Criteria andSinglefusedmapcacheNotEqualTo(String value) {
            addCriterion("singleFusedMapCache <>", value, "singlefusedmapcache");
            return (Criteria) this;
        }

        public Criteria andSinglefusedmapcacheGreaterThan(String value) {
            addCriterion("singleFusedMapCache >", value, "singlefusedmapcache");
            return (Criteria) this;
        }

        public Criteria andSinglefusedmapcacheGreaterThanOrEqualTo(String value) {
            addCriterion("singleFusedMapCache >=", value, "singlefusedmapcache");
            return (Criteria) this;
        }

        public Criteria andSinglefusedmapcacheLessThan(String value) {
            addCriterion("singleFusedMapCache <", value, "singlefusedmapcache");
            return (Criteria) this;
        }

        public Criteria andSinglefusedmapcacheLessThanOrEqualTo(String value) {
            addCriterion("singleFusedMapCache <=", value, "singlefusedmapcache");
            return (Criteria) this;
        }

        public Criteria andSinglefusedmapcacheLike(String value) {
            addCriterion("singleFusedMapCache like", value, "singlefusedmapcache");
            return (Criteria) this;
        }

        public Criteria andSinglefusedmapcacheNotLike(String value) {
            addCriterion("singleFusedMapCache not like", value, "singlefusedmapcache");
            return (Criteria) this;
        }

        public Criteria andSinglefusedmapcacheIn(List<String> values) {
            addCriterion("singleFusedMapCache in", values, "singlefusedmapcache");
            return (Criteria) this;
        }

        public Criteria andSinglefusedmapcacheNotIn(List<String> values) {
            addCriterion("singleFusedMapCache not in", values, "singlefusedmapcache");
            return (Criteria) this;
        }

        public Criteria andSinglefusedmapcacheBetween(String value1, String value2) {
            addCriterion("singleFusedMapCache between", value1, value2, "singlefusedmapcache");
            return (Criteria) this;
        }

        public Criteria andSinglefusedmapcacheNotBetween(String value1, String value2) {
            addCriterion("singleFusedMapCache not between", value1, value2, "singlefusedmapcache");
            return (Criteria) this;
        }

        public Criteria andInitialextendIsNull() {
            addCriterion("initialExtend is null");
            return (Criteria) this;
        }

        public Criteria andInitialextendIsNotNull() {
            addCriterion("initialExtend is not null");
            return (Criteria) this;
        }

        public Criteria andInitialextendEqualTo(String value) {
            addCriterion("initialExtend =", value, "initialextend");
            return (Criteria) this;
        }

        public Criteria andInitialextendNotEqualTo(String value) {
            addCriterion("initialExtend <>", value, "initialextend");
            return (Criteria) this;
        }

        public Criteria andInitialextendGreaterThan(String value) {
            addCriterion("initialExtend >", value, "initialextend");
            return (Criteria) this;
        }

        public Criteria andInitialextendGreaterThanOrEqualTo(String value) {
            addCriterion("initialExtend >=", value, "initialextend");
            return (Criteria) this;
        }

        public Criteria andInitialextendLessThan(String value) {
            addCriterion("initialExtend <", value, "initialextend");
            return (Criteria) this;
        }

        public Criteria andInitialextendLessThanOrEqualTo(String value) {
            addCriterion("initialExtend <=", value, "initialextend");
            return (Criteria) this;
        }

        public Criteria andInitialextendLike(String value) {
            addCriterion("initialExtend like", value, "initialextend");
            return (Criteria) this;
        }

        public Criteria andInitialextendNotLike(String value) {
            addCriterion("initialExtend not like", value, "initialextend");
            return (Criteria) this;
        }

        public Criteria andInitialextendIn(List<String> values) {
            addCriterion("initialExtend in", values, "initialextend");
            return (Criteria) this;
        }

        public Criteria andInitialextendNotIn(List<String> values) {
            addCriterion("initialExtend not in", values, "initialextend");
            return (Criteria) this;
        }

        public Criteria andInitialextendBetween(String value1, String value2) {
            addCriterion("initialExtend between", value1, value2, "initialextend");
            return (Criteria) this;
        }

        public Criteria andInitialextendNotBetween(String value1, String value2) {
            addCriterion("initialExtend not between", value1, value2, "initialextend");
            return (Criteria) this;
        }

        public Criteria andFullextendIsNull() {
            addCriterion("fullExtend is null");
            return (Criteria) this;
        }

        public Criteria andFullextendIsNotNull() {
            addCriterion("fullExtend is not null");
            return (Criteria) this;
        }

        public Criteria andFullextendEqualTo(String value) {
            addCriterion("fullExtend =", value, "fullextend");
            return (Criteria) this;
        }

        public Criteria andFullextendNotEqualTo(String value) {
            addCriterion("fullExtend <>", value, "fullextend");
            return (Criteria) this;
        }

        public Criteria andFullextendGreaterThan(String value) {
            addCriterion("fullExtend >", value, "fullextend");
            return (Criteria) this;
        }

        public Criteria andFullextendGreaterThanOrEqualTo(String value) {
            addCriterion("fullExtend >=", value, "fullextend");
            return (Criteria) this;
        }

        public Criteria andFullextendLessThan(String value) {
            addCriterion("fullExtend <", value, "fullextend");
            return (Criteria) this;
        }

        public Criteria andFullextendLessThanOrEqualTo(String value) {
            addCriterion("fullExtend <=", value, "fullextend");
            return (Criteria) this;
        }

        public Criteria andFullextendLike(String value) {
            addCriterion("fullExtend like", value, "fullextend");
            return (Criteria) this;
        }

        public Criteria andFullextendNotLike(String value) {
            addCriterion("fullExtend not like", value, "fullextend");
            return (Criteria) this;
        }

        public Criteria andFullextendIn(List<String> values) {
            addCriterion("fullExtend in", values, "fullextend");
            return (Criteria) this;
        }

        public Criteria andFullextendNotIn(List<String> values) {
            addCriterion("fullExtend not in", values, "fullextend");
            return (Criteria) this;
        }

        public Criteria andFullextendBetween(String value1, String value2) {
            addCriterion("fullExtend between", value1, value2, "fullextend");
            return (Criteria) this;
        }

        public Criteria andFullextendNotBetween(String value1, String value2) {
            addCriterion("fullExtend not between", value1, value2, "fullextend");
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