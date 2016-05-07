package com.lmars.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbWmsContactExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbWmsContactExample() {
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

        public Criteria andWmsIdIsNull() {
            addCriterion("wms_id is null");
            return (Criteria) this;
        }

        public Criteria andWmsIdIsNotNull() {
            addCriterion("wms_id is not null");
            return (Criteria) this;
        }

        public Criteria andWmsIdEqualTo(Long value) {
            addCriterion("wms_id =", value, "wmsId");
            return (Criteria) this;
        }

        public Criteria andWmsIdNotEqualTo(Long value) {
            addCriterion("wms_id <>", value, "wmsId");
            return (Criteria) this;
        }

        public Criteria andWmsIdGreaterThan(Long value) {
            addCriterion("wms_id >", value, "wmsId");
            return (Criteria) this;
        }

        public Criteria andWmsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("wms_id >=", value, "wmsId");
            return (Criteria) this;
        }

        public Criteria andWmsIdLessThan(Long value) {
            addCriterion("wms_id <", value, "wmsId");
            return (Criteria) this;
        }

        public Criteria andWmsIdLessThanOrEqualTo(Long value) {
            addCriterion("wms_id <=", value, "wmsId");
            return (Criteria) this;
        }

        public Criteria andWmsIdIn(List<Long> values) {
            addCriterion("wms_id in", values, "wmsId");
            return (Criteria) this;
        }

        public Criteria andWmsIdNotIn(List<Long> values) {
            addCriterion("wms_id not in", values, "wmsId");
            return (Criteria) this;
        }

        public Criteria andWmsIdBetween(Long value1, Long value2) {
            addCriterion("wms_id between", value1, value2, "wmsId");
            return (Criteria) this;
        }

        public Criteria andWmsIdNotBetween(Long value1, Long value2) {
            addCriterion("wms_id not between", value1, value2, "wmsId");
            return (Criteria) this;
        }

        public Criteria andPersonIsNull() {
            addCriterion("Person is null");
            return (Criteria) this;
        }

        public Criteria andPersonIsNotNull() {
            addCriterion("Person is not null");
            return (Criteria) this;
        }

        public Criteria andPersonEqualTo(String value) {
            addCriterion("Person =", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonNotEqualTo(String value) {
            addCriterion("Person <>", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonGreaterThan(String value) {
            addCriterion("Person >", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonGreaterThanOrEqualTo(String value) {
            addCriterion("Person >=", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonLessThan(String value) {
            addCriterion("Person <", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonLessThanOrEqualTo(String value) {
            addCriterion("Person <=", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonLike(String value) {
            addCriterion("Person like", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonNotLike(String value) {
            addCriterion("Person not like", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonIn(List<String> values) {
            addCriterion("Person in", values, "person");
            return (Criteria) this;
        }

        public Criteria andPersonNotIn(List<String> values) {
            addCriterion("Person not in", values, "person");
            return (Criteria) this;
        }

        public Criteria andPersonBetween(String value1, String value2) {
            addCriterion("Person between", value1, value2, "person");
            return (Criteria) this;
        }

        public Criteria andPersonNotBetween(String value1, String value2) {
            addCriterion("Person not between", value1, value2, "person");
            return (Criteria) this;
        }

        public Criteria andOrganizationIsNull() {
            addCriterion("Organization is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIsNotNull() {
            addCriterion("Organization is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationEqualTo(String value) {
            addCriterion("Organization =", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotEqualTo(String value) {
            addCriterion("Organization <>", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationGreaterThan(String value) {
            addCriterion("Organization >", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationGreaterThanOrEqualTo(String value) {
            addCriterion("Organization >=", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLessThan(String value) {
            addCriterion("Organization <", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLessThanOrEqualTo(String value) {
            addCriterion("Organization <=", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLike(String value) {
            addCriterion("Organization like", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotLike(String value) {
            addCriterion("Organization not like", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationIn(List<String> values) {
            addCriterion("Organization in", values, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotIn(List<String> values) {
            addCriterion("Organization not in", values, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationBetween(String value1, String value2) {
            addCriterion("Organization between", value1, value2, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotBetween(String value1, String value2) {
            addCriterion("Organization not between", value1, value2, "organization");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("Position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("Position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("Position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("Position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("Position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("Position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("Position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("Position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("Position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("Position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("Position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("Position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("Position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("Position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andAddresstypeIsNull() {
            addCriterion("AddressType is null");
            return (Criteria) this;
        }

        public Criteria andAddresstypeIsNotNull() {
            addCriterion("AddressType is not null");
            return (Criteria) this;
        }

        public Criteria andAddresstypeEqualTo(String value) {
            addCriterion("AddressType =", value, "addresstype");
            return (Criteria) this;
        }

        public Criteria andAddresstypeNotEqualTo(String value) {
            addCriterion("AddressType <>", value, "addresstype");
            return (Criteria) this;
        }

        public Criteria andAddresstypeGreaterThan(String value) {
            addCriterion("AddressType >", value, "addresstype");
            return (Criteria) this;
        }

        public Criteria andAddresstypeGreaterThanOrEqualTo(String value) {
            addCriterion("AddressType >=", value, "addresstype");
            return (Criteria) this;
        }

        public Criteria andAddresstypeLessThan(String value) {
            addCriterion("AddressType <", value, "addresstype");
            return (Criteria) this;
        }

        public Criteria andAddresstypeLessThanOrEqualTo(String value) {
            addCriterion("AddressType <=", value, "addresstype");
            return (Criteria) this;
        }

        public Criteria andAddresstypeLike(String value) {
            addCriterion("AddressType like", value, "addresstype");
            return (Criteria) this;
        }

        public Criteria andAddresstypeNotLike(String value) {
            addCriterion("AddressType not like", value, "addresstype");
            return (Criteria) this;
        }

        public Criteria andAddresstypeIn(List<String> values) {
            addCriterion("AddressType in", values, "addresstype");
            return (Criteria) this;
        }

        public Criteria andAddresstypeNotIn(List<String> values) {
            addCriterion("AddressType not in", values, "addresstype");
            return (Criteria) this;
        }

        public Criteria andAddresstypeBetween(String value1, String value2) {
            addCriterion("AddressType between", value1, value2, "addresstype");
            return (Criteria) this;
        }

        public Criteria andAddresstypeNotBetween(String value1, String value2) {
            addCriterion("AddressType not between", value1, value2, "addresstype");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("Address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("Address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("Address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("Address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("Address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("Address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("Address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("Address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("Address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("Address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("Address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("Address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("Address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("Address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("City is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("City is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("City =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("City <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("City >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("City >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("City <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("City <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("City like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("City not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("City in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("City not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("City between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("City not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andStateorprovinceIsNull() {
            addCriterion("StateOrProvince is null");
            return (Criteria) this;
        }

        public Criteria andStateorprovinceIsNotNull() {
            addCriterion("StateOrProvince is not null");
            return (Criteria) this;
        }

        public Criteria andStateorprovinceEqualTo(String value) {
            addCriterion("StateOrProvince =", value, "stateorprovince");
            return (Criteria) this;
        }

        public Criteria andStateorprovinceNotEqualTo(String value) {
            addCriterion("StateOrProvince <>", value, "stateorprovince");
            return (Criteria) this;
        }

        public Criteria andStateorprovinceGreaterThan(String value) {
            addCriterion("StateOrProvince >", value, "stateorprovince");
            return (Criteria) this;
        }

        public Criteria andStateorprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("StateOrProvince >=", value, "stateorprovince");
            return (Criteria) this;
        }

        public Criteria andStateorprovinceLessThan(String value) {
            addCriterion("StateOrProvince <", value, "stateorprovince");
            return (Criteria) this;
        }

        public Criteria andStateorprovinceLessThanOrEqualTo(String value) {
            addCriterion("StateOrProvince <=", value, "stateorprovince");
            return (Criteria) this;
        }

        public Criteria andStateorprovinceLike(String value) {
            addCriterion("StateOrProvince like", value, "stateorprovince");
            return (Criteria) this;
        }

        public Criteria andStateorprovinceNotLike(String value) {
            addCriterion("StateOrProvince not like", value, "stateorprovince");
            return (Criteria) this;
        }

        public Criteria andStateorprovinceIn(List<String> values) {
            addCriterion("StateOrProvince in", values, "stateorprovince");
            return (Criteria) this;
        }

        public Criteria andStateorprovinceNotIn(List<String> values) {
            addCriterion("StateOrProvince not in", values, "stateorprovince");
            return (Criteria) this;
        }

        public Criteria andStateorprovinceBetween(String value1, String value2) {
            addCriterion("StateOrProvince between", value1, value2, "stateorprovince");
            return (Criteria) this;
        }

        public Criteria andStateorprovinceNotBetween(String value1, String value2) {
            addCriterion("StateOrProvince not between", value1, value2, "stateorprovince");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("Country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("Country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("Country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("Country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("Country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("Country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("Country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("Country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("Country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("Country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("Country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("Country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("Country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("Country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNull() {
            addCriterion("PostCode is null");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNotNull() {
            addCriterion("PostCode is not null");
            return (Criteria) this;
        }

        public Criteria andPostcodeEqualTo(String value) {
            addCriterion("PostCode =", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotEqualTo(String value) {
            addCriterion("PostCode <>", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThan(String value) {
            addCriterion("PostCode >", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("PostCode >=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThan(String value) {
            addCriterion("PostCode <", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThanOrEqualTo(String value) {
            addCriterion("PostCode <=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLike(String value) {
            addCriterion("PostCode like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotLike(String value) {
            addCriterion("PostCode not like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeIn(List<String> values) {
            addCriterion("PostCode in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotIn(List<String> values) {
            addCriterion("PostCode not in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeBetween(String value1, String value2) {
            addCriterion("PostCode between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotBetween(String value1, String value2) {
            addCriterion("PostCode not between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andVoicetelephoneIsNull() {
            addCriterion("VoiceTelephone is null");
            return (Criteria) this;
        }

        public Criteria andVoicetelephoneIsNotNull() {
            addCriterion("VoiceTelephone is not null");
            return (Criteria) this;
        }

        public Criteria andVoicetelephoneEqualTo(String value) {
            addCriterion("VoiceTelephone =", value, "voicetelephone");
            return (Criteria) this;
        }

        public Criteria andVoicetelephoneNotEqualTo(String value) {
            addCriterion("VoiceTelephone <>", value, "voicetelephone");
            return (Criteria) this;
        }

        public Criteria andVoicetelephoneGreaterThan(String value) {
            addCriterion("VoiceTelephone >", value, "voicetelephone");
            return (Criteria) this;
        }

        public Criteria andVoicetelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("VoiceTelephone >=", value, "voicetelephone");
            return (Criteria) this;
        }

        public Criteria andVoicetelephoneLessThan(String value) {
            addCriterion("VoiceTelephone <", value, "voicetelephone");
            return (Criteria) this;
        }

        public Criteria andVoicetelephoneLessThanOrEqualTo(String value) {
            addCriterion("VoiceTelephone <=", value, "voicetelephone");
            return (Criteria) this;
        }

        public Criteria andVoicetelephoneLike(String value) {
            addCriterion("VoiceTelephone like", value, "voicetelephone");
            return (Criteria) this;
        }

        public Criteria andVoicetelephoneNotLike(String value) {
            addCriterion("VoiceTelephone not like", value, "voicetelephone");
            return (Criteria) this;
        }

        public Criteria andVoicetelephoneIn(List<String> values) {
            addCriterion("VoiceTelephone in", values, "voicetelephone");
            return (Criteria) this;
        }

        public Criteria andVoicetelephoneNotIn(List<String> values) {
            addCriterion("VoiceTelephone not in", values, "voicetelephone");
            return (Criteria) this;
        }

        public Criteria andVoicetelephoneBetween(String value1, String value2) {
            addCriterion("VoiceTelephone between", value1, value2, "voicetelephone");
            return (Criteria) this;
        }

        public Criteria andVoicetelephoneNotBetween(String value1, String value2) {
            addCriterion("VoiceTelephone not between", value1, value2, "voicetelephone");
            return (Criteria) this;
        }

        public Criteria andFacsimiletelephoneIsNull() {
            addCriterion("FacsimileTelephone is null");
            return (Criteria) this;
        }

        public Criteria andFacsimiletelephoneIsNotNull() {
            addCriterion("FacsimileTelephone is not null");
            return (Criteria) this;
        }

        public Criteria andFacsimiletelephoneEqualTo(String value) {
            addCriterion("FacsimileTelephone =", value, "facsimiletelephone");
            return (Criteria) this;
        }

        public Criteria andFacsimiletelephoneNotEqualTo(String value) {
            addCriterion("FacsimileTelephone <>", value, "facsimiletelephone");
            return (Criteria) this;
        }

        public Criteria andFacsimiletelephoneGreaterThan(String value) {
            addCriterion("FacsimileTelephone >", value, "facsimiletelephone");
            return (Criteria) this;
        }

        public Criteria andFacsimiletelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("FacsimileTelephone >=", value, "facsimiletelephone");
            return (Criteria) this;
        }

        public Criteria andFacsimiletelephoneLessThan(String value) {
            addCriterion("FacsimileTelephone <", value, "facsimiletelephone");
            return (Criteria) this;
        }

        public Criteria andFacsimiletelephoneLessThanOrEqualTo(String value) {
            addCriterion("FacsimileTelephone <=", value, "facsimiletelephone");
            return (Criteria) this;
        }

        public Criteria andFacsimiletelephoneLike(String value) {
            addCriterion("FacsimileTelephone like", value, "facsimiletelephone");
            return (Criteria) this;
        }

        public Criteria andFacsimiletelephoneNotLike(String value) {
            addCriterion("FacsimileTelephone not like", value, "facsimiletelephone");
            return (Criteria) this;
        }

        public Criteria andFacsimiletelephoneIn(List<String> values) {
            addCriterion("FacsimileTelephone in", values, "facsimiletelephone");
            return (Criteria) this;
        }

        public Criteria andFacsimiletelephoneNotIn(List<String> values) {
            addCriterion("FacsimileTelephone not in", values, "facsimiletelephone");
            return (Criteria) this;
        }

        public Criteria andFacsimiletelephoneBetween(String value1, String value2) {
            addCriterion("FacsimileTelephone between", value1, value2, "facsimiletelephone");
            return (Criteria) this;
        }

        public Criteria andFacsimiletelephoneNotBetween(String value1, String value2) {
            addCriterion("FacsimileTelephone not between", value1, value2, "facsimiletelephone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
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