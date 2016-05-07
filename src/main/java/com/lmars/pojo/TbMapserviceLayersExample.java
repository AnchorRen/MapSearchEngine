package com.lmars.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbMapserviceLayersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbMapserviceLayersExample() {
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

        public Criteria andMapserviceidIsNull() {
            addCriterion("mapserviceId is null");
            return (Criteria) this;
        }

        public Criteria andMapserviceidIsNotNull() {
            addCriterion("mapserviceId is not null");
            return (Criteria) this;
        }

        public Criteria andMapserviceidEqualTo(Long value) {
            addCriterion("mapserviceId =", value, "mapserviceid");
            return (Criteria) this;
        }

        public Criteria andMapserviceidNotEqualTo(Long value) {
            addCriterion("mapserviceId <>", value, "mapserviceid");
            return (Criteria) this;
        }

        public Criteria andMapserviceidGreaterThan(Long value) {
            addCriterion("mapserviceId >", value, "mapserviceid");
            return (Criteria) this;
        }

        public Criteria andMapserviceidGreaterThanOrEqualTo(Long value) {
            addCriterion("mapserviceId >=", value, "mapserviceid");
            return (Criteria) this;
        }

        public Criteria andMapserviceidLessThan(Long value) {
            addCriterion("mapserviceId <", value, "mapserviceid");
            return (Criteria) this;
        }

        public Criteria andMapserviceidLessThanOrEqualTo(Long value) {
            addCriterion("mapserviceId <=", value, "mapserviceid");
            return (Criteria) this;
        }

        public Criteria andMapserviceidIn(List<Long> values) {
            addCriterion("mapserviceId in", values, "mapserviceid");
            return (Criteria) this;
        }

        public Criteria andMapserviceidNotIn(List<Long> values) {
            addCriterion("mapserviceId not in", values, "mapserviceid");
            return (Criteria) this;
        }

        public Criteria andMapserviceidBetween(Long value1, Long value2) {
            addCriterion("mapserviceId between", value1, value2, "mapserviceid");
            return (Criteria) this;
        }

        public Criteria andMapserviceidNotBetween(Long value1, Long value2) {
            addCriterion("mapserviceId not between", value1, value2, "mapserviceid");
            return (Criteria) this;
        }

        public Criteria andLayerurlIsNull() {
            addCriterion("layerUrl is null");
            return (Criteria) this;
        }

        public Criteria andLayerurlIsNotNull() {
            addCriterion("layerUrl is not null");
            return (Criteria) this;
        }

        public Criteria andLayerurlEqualTo(String value) {
            addCriterion("layerUrl =", value, "layerurl");
            return (Criteria) this;
        }

        public Criteria andLayerurlNotEqualTo(String value) {
            addCriterion("layerUrl <>", value, "layerurl");
            return (Criteria) this;
        }

        public Criteria andLayerurlGreaterThan(String value) {
            addCriterion("layerUrl >", value, "layerurl");
            return (Criteria) this;
        }

        public Criteria andLayerurlGreaterThanOrEqualTo(String value) {
            addCriterion("layerUrl >=", value, "layerurl");
            return (Criteria) this;
        }

        public Criteria andLayerurlLessThan(String value) {
            addCriterion("layerUrl <", value, "layerurl");
            return (Criteria) this;
        }

        public Criteria andLayerurlLessThanOrEqualTo(String value) {
            addCriterion("layerUrl <=", value, "layerurl");
            return (Criteria) this;
        }

        public Criteria andLayerurlLike(String value) {
            addCriterion("layerUrl like", value, "layerurl");
            return (Criteria) this;
        }

        public Criteria andLayerurlNotLike(String value) {
            addCriterion("layerUrl not like", value, "layerurl");
            return (Criteria) this;
        }

        public Criteria andLayerurlIn(List<String> values) {
            addCriterion("layerUrl in", values, "layerurl");
            return (Criteria) this;
        }

        public Criteria andLayerurlNotIn(List<String> values) {
            addCriterion("layerUrl not in", values, "layerurl");
            return (Criteria) this;
        }

        public Criteria andLayerurlBetween(String value1, String value2) {
            addCriterion("layerUrl between", value1, value2, "layerurl");
            return (Criteria) this;
        }

        public Criteria andLayerurlNotBetween(String value1, String value2) {
            addCriterion("layerUrl not between", value1, value2, "layerurl");
            return (Criteria) this;
        }

        public Criteria andLayernameIsNull() {
            addCriterion("layerName is null");
            return (Criteria) this;
        }

        public Criteria andLayernameIsNotNull() {
            addCriterion("layerName is not null");
            return (Criteria) this;
        }

        public Criteria andLayernameEqualTo(String value) {
            addCriterion("layerName =", value, "layername");
            return (Criteria) this;
        }

        public Criteria andLayernameNotEqualTo(String value) {
            addCriterion("layerName <>", value, "layername");
            return (Criteria) this;
        }

        public Criteria andLayernameGreaterThan(String value) {
            addCriterion("layerName >", value, "layername");
            return (Criteria) this;
        }

        public Criteria andLayernameGreaterThanOrEqualTo(String value) {
            addCriterion("layerName >=", value, "layername");
            return (Criteria) this;
        }

        public Criteria andLayernameLessThan(String value) {
            addCriterion("layerName <", value, "layername");
            return (Criteria) this;
        }

        public Criteria andLayernameLessThanOrEqualTo(String value) {
            addCriterion("layerName <=", value, "layername");
            return (Criteria) this;
        }

        public Criteria andLayernameLike(String value) {
            addCriterion("layerName like", value, "layername");
            return (Criteria) this;
        }

        public Criteria andLayernameNotLike(String value) {
            addCriterion("layerName not like", value, "layername");
            return (Criteria) this;
        }

        public Criteria andLayernameIn(List<String> values) {
            addCriterion("layerName in", values, "layername");
            return (Criteria) this;
        }

        public Criteria andLayernameNotIn(List<String> values) {
            addCriterion("layerName not in", values, "layername");
            return (Criteria) this;
        }

        public Criteria andLayernameBetween(String value1, String value2) {
            addCriterion("layerName between", value1, value2, "layername");
            return (Criteria) this;
        }

        public Criteria andLayernameNotBetween(String value1, String value2) {
            addCriterion("layerName not between", value1, value2, "layername");
            return (Criteria) this;
        }

        public Criteria andLayeridIsNull() {
            addCriterion("layerId is null");
            return (Criteria) this;
        }

        public Criteria andLayeridIsNotNull() {
            addCriterion("layerId is not null");
            return (Criteria) this;
        }

        public Criteria andLayeridEqualTo(Long value) {
            addCriterion("layerId =", value, "layerid");
            return (Criteria) this;
        }

        public Criteria andLayeridNotEqualTo(Long value) {
            addCriterion("layerId <>", value, "layerid");
            return (Criteria) this;
        }

        public Criteria andLayeridGreaterThan(Long value) {
            addCriterion("layerId >", value, "layerid");
            return (Criteria) this;
        }

        public Criteria andLayeridGreaterThanOrEqualTo(Long value) {
            addCriterion("layerId >=", value, "layerid");
            return (Criteria) this;
        }

        public Criteria andLayeridLessThan(Long value) {
            addCriterion("layerId <", value, "layerid");
            return (Criteria) this;
        }

        public Criteria andLayeridLessThanOrEqualTo(Long value) {
            addCriterion("layerId <=", value, "layerid");
            return (Criteria) this;
        }

        public Criteria andLayeridIn(List<Long> values) {
            addCriterion("layerId in", values, "layerid");
            return (Criteria) this;
        }

        public Criteria andLayeridNotIn(List<Long> values) {
            addCriterion("layerId not in", values, "layerid");
            return (Criteria) this;
        }

        public Criteria andLayeridBetween(Long value1, Long value2) {
            addCriterion("layerId between", value1, value2, "layerid");
            return (Criteria) this;
        }

        public Criteria andLayeridNotBetween(Long value1, Long value2) {
            addCriterion("layerId not between", value1, value2, "layerid");
            return (Criteria) this;
        }

        public Criteria andImagesIsNull() {
            addCriterion("images is null");
            return (Criteria) this;
        }

        public Criteria andImagesIsNotNull() {
            addCriterion("images is not null");
            return (Criteria) this;
        }

        public Criteria andImagesEqualTo(String value) {
            addCriterion("images =", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotEqualTo(String value) {
            addCriterion("images <>", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesGreaterThan(String value) {
            addCriterion("images >", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesGreaterThanOrEqualTo(String value) {
            addCriterion("images >=", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLessThan(String value) {
            addCriterion("images <", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLessThanOrEqualTo(String value) {
            addCriterion("images <=", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLike(String value) {
            addCriterion("images like", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotLike(String value) {
            addCriterion("images not like", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesIn(List<String> values) {
            addCriterion("images in", values, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotIn(List<String> values) {
            addCriterion("images not in", values, "images");
            return (Criteria) this;
        }

        public Criteria andImagesBetween(String value1, String value2) {
            addCriterion("images between", value1, value2, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotBetween(String value1, String value2) {
            addCriterion("images not between", value1, value2, "images");
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