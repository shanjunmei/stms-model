package com.ffzx.stms.model;

import com.ffzx.orm.common.GenericExample.GeneratedCriteria;
import com.ffzx.orm.common.GenericExample;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PriceSchemeExample extends GenericExample<PriceSchemeExample.Criteria> {

    public PriceSchemeExample() {
        oredCriteria = new ArrayList<PriceSchemeExample.Criteria>();
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

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeIsNull() {
            addCriterion("commodity_code is null");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeIsNotNull() {
            addCriterion("commodity_code is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeEqualTo(String value) {
            addCriterion("commodity_code =", value, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeNotEqualTo(String value) {
            addCriterion("commodity_code <>", value, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeGreaterThan(String value) {
            addCriterion("commodity_code >", value, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_code >=", value, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeLessThan(String value) {
            addCriterion("commodity_code <", value, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeLessThanOrEqualTo(String value) {
            addCriterion("commodity_code <=", value, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeLike(String value) {
            addCriterion("commodity_code like", value, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeNotLike(String value) {
            addCriterion("commodity_code not like", value, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeIn(List<String> values) {
            addCriterion("commodity_code in", values, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeNotIn(List<String> values) {
            addCriterion("commodity_code not in", values, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeBetween(String value1, String value2) {
            addCriterion("commodity_code between", value1, value2, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeNotBetween(String value1, String value2) {
            addCriterion("commodity_code not between", value1, value2, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andVendorCodeIsNull() {
            addCriterion("vendor_code is null");
            return (Criteria) this;
        }

        public Criteria andVendorCodeIsNotNull() {
            addCriterion("vendor_code is not null");
            return (Criteria) this;
        }

        public Criteria andVendorCodeEqualTo(String value) {
            addCriterion("vendor_code =", value, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andVendorCodeNotEqualTo(String value) {
            addCriterion("vendor_code <>", value, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andVendorCodeGreaterThan(String value) {
            addCriterion("vendor_code >", value, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andVendorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("vendor_code >=", value, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andVendorCodeLessThan(String value) {
            addCriterion("vendor_code <", value, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andVendorCodeLessThanOrEqualTo(String value) {
            addCriterion("vendor_code <=", value, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andVendorCodeLike(String value) {
            addCriterion("vendor_code like", value, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andVendorCodeNotLike(String value) {
            addCriterion("vendor_code not like", value, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andVendorCodeIn(List<String> values) {
            addCriterion("vendor_code in", values, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andVendorCodeNotIn(List<String> values) {
            addCriterion("vendor_code not in", values, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andVendorCodeBetween(String value1, String value2) {
            addCriterion("vendor_code between", value1, value2, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andVendorCodeNotBetween(String value1, String value2) {
            addCriterion("vendor_code not between", value1, value2, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIsNull() {
            addCriterion("purchase_type is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIsNotNull() {
            addCriterion("purchase_type is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeEqualTo(String value) {
            addCriterion("purchase_type =", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeNotEqualTo(String value) {
            addCriterion("purchase_type <>", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeGreaterThan(String value) {
            addCriterion("purchase_type >", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("purchase_type >=", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeLessThan(String value) {
            addCriterion("purchase_type <", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeLessThanOrEqualTo(String value) {
            addCriterion("purchase_type <=", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeLike(String value) {
            addCriterion("purchase_type like", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeNotLike(String value) {
            addCriterion("purchase_type not like", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIn(List<String> values) {
            addCriterion("purchase_type in", values, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeNotIn(List<String> values) {
            addCriterion("purchase_type not in", values, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeBetween(String value1, String value2) {
            addCriterion("purchase_type between", value1, value2, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeNotBetween(String value1, String value2) {
            addCriterion("purchase_type not between", value1, value2, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andSettlementPatternIsNull() {
            addCriterion("settlement_pattern is null");
            return (Criteria) this;
        }

        public Criteria andSettlementPatternIsNotNull() {
            addCriterion("settlement_pattern is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementPatternEqualTo(String value) {
            addCriterion("settlement_pattern =", value, "settlementPattern");
            return (Criteria) this;
        }

        public Criteria andSettlementPatternNotEqualTo(String value) {
            addCriterion("settlement_pattern <>", value, "settlementPattern");
            return (Criteria) this;
        }

        public Criteria andSettlementPatternGreaterThan(String value) {
            addCriterion("settlement_pattern >", value, "settlementPattern");
            return (Criteria) this;
        }

        public Criteria andSettlementPatternGreaterThanOrEqualTo(String value) {
            addCriterion("settlement_pattern >=", value, "settlementPattern");
            return (Criteria) this;
        }

        public Criteria andSettlementPatternLessThan(String value) {
            addCriterion("settlement_pattern <", value, "settlementPattern");
            return (Criteria) this;
        }

        public Criteria andSettlementPatternLessThanOrEqualTo(String value) {
            addCriterion("settlement_pattern <=", value, "settlementPattern");
            return (Criteria) this;
        }

        public Criteria andSettlementPatternLike(String value) {
            addCriterion("settlement_pattern like", value, "settlementPattern");
            return (Criteria) this;
        }

        public Criteria andSettlementPatternNotLike(String value) {
            addCriterion("settlement_pattern not like", value, "settlementPattern");
            return (Criteria) this;
        }

        public Criteria andSettlementPatternIn(List<String> values) {
            addCriterion("settlement_pattern in", values, "settlementPattern");
            return (Criteria) this;
        }

        public Criteria andSettlementPatternNotIn(List<String> values) {
            addCriterion("settlement_pattern not in", values, "settlementPattern");
            return (Criteria) this;
        }

        public Criteria andSettlementPatternBetween(String value1, String value2) {
            addCriterion("settlement_pattern between", value1, value2, "settlementPattern");
            return (Criteria) this;
        }

        public Criteria andSettlementPatternNotBetween(String value1, String value2) {
            addCriterion("settlement_pattern not between", value1, value2, "settlementPattern");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeIsNull() {
            addCriterion("effective_time is null");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeIsNotNull() {
            addCriterion("effective_time is not null");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeEqualTo(Date value) {
            addCriterion("effective_time =", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeNotEqualTo(Date value) {
            addCriterion("effective_time <>", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeGreaterThan(Date value) {
            addCriterion("effective_time >", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("effective_time >=", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeLessThan(Date value) {
            addCriterion("effective_time <", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("effective_time <=", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeIn(List<Date> values) {
            addCriterion("effective_time in", values, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeNotIn(List<Date> values) {
            addCriterion("effective_time not in", values, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeBetween(Date value1, Date value2) {
            addCriterion("effective_time between", value1, value2, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("effective_time not between", value1, value2, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeIsNull() {
            addCriterion("invalid_time is null");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeIsNotNull() {
            addCriterion("invalid_time is not null");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeEqualTo(Date value) {
            addCriterion("invalid_time =", value, "invalidTime");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeNotEqualTo(Date value) {
            addCriterion("invalid_time <>", value, "invalidTime");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeGreaterThan(Date value) {
            addCriterion("invalid_time >", value, "invalidTime");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("invalid_time >=", value, "invalidTime");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeLessThan(Date value) {
            addCriterion("invalid_time <", value, "invalidTime");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeLessThanOrEqualTo(Date value) {
            addCriterion("invalid_time <=", value, "invalidTime");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeIn(List<Date> values) {
            addCriterion("invalid_time in", values, "invalidTime");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeNotIn(List<Date> values) {
            addCriterion("invalid_time not in", values, "invalidTime");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeBetween(Date value1, Date value2) {
            addCriterion("invalid_time between", value1, value2, "invalidTime");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeNotBetween(Date value1, Date value2) {
            addCriterion("invalid_time not between", value1, value2, "invalidTime");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNameIsNull() {
            addCriterion("create_by_name is null");
            return (Criteria) this;
        }

        public Criteria andCreateByNameIsNotNull() {
            addCriterion("create_by_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByNameEqualTo(String value) {
            addCriterion("create_by_name =", value, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameNotEqualTo(String value) {
            addCriterion("create_by_name <>", value, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameGreaterThan(String value) {
            addCriterion("create_by_name >", value, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameGreaterThanOrEqualTo(String value) {
            addCriterion("create_by_name >=", value, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameLessThan(String value) {
            addCriterion("create_by_name <", value, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameLessThanOrEqualTo(String value) {
            addCriterion("create_by_name <=", value, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameLike(String value) {
            addCriterion("create_by_name like", value, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameNotLike(String value) {
            addCriterion("create_by_name not like", value, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameIn(List<String> values) {
            addCriterion("create_by_name in", values, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameNotIn(List<String> values) {
            addCriterion("create_by_name not in", values, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameBetween(String value1, String value2) {
            addCriterion("create_by_name between", value1, value2, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameNotBetween(String value1, String value2) {
            addCriterion("create_by_name not between", value1, value2, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByIsNull() {
            addCriterion("last_update_by is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByIsNotNull() {
            addCriterion("last_update_by is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByEqualTo(String value) {
            addCriterion("last_update_by =", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotEqualTo(String value) {
            addCriterion("last_update_by <>", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThan(String value) {
            addCriterion("last_update_by >", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("last_update_by >=", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThan(String value) {
            addCriterion("last_update_by <", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThanOrEqualTo(String value) {
            addCriterion("last_update_by <=", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLike(String value) {
            addCriterion("last_update_by like", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotLike(String value) {
            addCriterion("last_update_by not like", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByIn(List<String> values) {
            addCriterion("last_update_by in", values, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotIn(List<String> values) {
            addCriterion("last_update_by not in", values, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByBetween(String value1, String value2) {
            addCriterion("last_update_by between", value1, value2, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotBetween(String value1, String value2) {
            addCriterion("last_update_by not between", value1, value2, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNameIsNull() {
            addCriterion("last_update_by_name is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNameIsNotNull() {
            addCriterion("last_update_by_name is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNameEqualTo(String value) {
            addCriterion("last_update_by_name =", value, "lastUpdateByName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNameNotEqualTo(String value) {
            addCriterion("last_update_by_name <>", value, "lastUpdateByName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNameGreaterThan(String value) {
            addCriterion("last_update_by_name >", value, "lastUpdateByName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNameGreaterThanOrEqualTo(String value) {
            addCriterion("last_update_by_name >=", value, "lastUpdateByName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNameLessThan(String value) {
            addCriterion("last_update_by_name <", value, "lastUpdateByName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNameLessThanOrEqualTo(String value) {
            addCriterion("last_update_by_name <=", value, "lastUpdateByName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNameLike(String value) {
            addCriterion("last_update_by_name like", value, "lastUpdateByName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNameNotLike(String value) {
            addCriterion("last_update_by_name not like", value, "lastUpdateByName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNameIn(List<String> values) {
            addCriterion("last_update_by_name in", values, "lastUpdateByName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNameNotIn(List<String> values) {
            addCriterion("last_update_by_name not in", values, "lastUpdateByName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNameBetween(String value1, String value2) {
            addCriterion("last_update_by_name between", value1, value2, "lastUpdateByName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNameNotBetween(String value1, String value2) {
            addCriterion("last_update_by_name not between", value1, value2, "lastUpdateByName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNull() {
            addCriterion("last_update_date is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNotNull() {
            addCriterion("last_update_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateEqualTo(Date value) {
            addCriterion("last_update_date =", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotEqualTo(Date value) {
            addCriterion("last_update_date <>", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThan(Date value) {
            addCriterion("last_update_date >", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update_date >=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThan(Date value) {
            addCriterion("last_update_date <", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("last_update_date <=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIn(List<Date> values) {
            addCriterion("last_update_date in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotIn(List<Date> values) {
            addCriterion("last_update_date not in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateBetween(Date value1, Date value2) {
            addCriterion("last_update_date between", value1, value2, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("last_update_date not between", value1, value2, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andCancelByIsNull() {
            addCriterion("cancel_by is null");
            return (Criteria) this;
        }

        public Criteria andCancelByIsNotNull() {
            addCriterion("cancel_by is not null");
            return (Criteria) this;
        }

        public Criteria andCancelByEqualTo(String value) {
            addCriterion("cancel_by =", value, "cancelBy");
            return (Criteria) this;
        }

        public Criteria andCancelByNotEqualTo(String value) {
            addCriterion("cancel_by <>", value, "cancelBy");
            return (Criteria) this;
        }

        public Criteria andCancelByGreaterThan(String value) {
            addCriterion("cancel_by >", value, "cancelBy");
            return (Criteria) this;
        }

        public Criteria andCancelByGreaterThanOrEqualTo(String value) {
            addCriterion("cancel_by >=", value, "cancelBy");
            return (Criteria) this;
        }

        public Criteria andCancelByLessThan(String value) {
            addCriterion("cancel_by <", value, "cancelBy");
            return (Criteria) this;
        }

        public Criteria andCancelByLessThanOrEqualTo(String value) {
            addCriterion("cancel_by <=", value, "cancelBy");
            return (Criteria) this;
        }

        public Criteria andCancelByLike(String value) {
            addCriterion("cancel_by like", value, "cancelBy");
            return (Criteria) this;
        }

        public Criteria andCancelByNotLike(String value) {
            addCriterion("cancel_by not like", value, "cancelBy");
            return (Criteria) this;
        }

        public Criteria andCancelByIn(List<String> values) {
            addCriterion("cancel_by in", values, "cancelBy");
            return (Criteria) this;
        }

        public Criteria andCancelByNotIn(List<String> values) {
            addCriterion("cancel_by not in", values, "cancelBy");
            return (Criteria) this;
        }

        public Criteria andCancelByBetween(String value1, String value2) {
            addCriterion("cancel_by between", value1, value2, "cancelBy");
            return (Criteria) this;
        }

        public Criteria andCancelByNotBetween(String value1, String value2) {
            addCriterion("cancel_by not between", value1, value2, "cancelBy");
            return (Criteria) this;
        }

        public Criteria andCancelByNameIsNull() {
            addCriterion("cancel_by_name is null");
            return (Criteria) this;
        }

        public Criteria andCancelByNameIsNotNull() {
            addCriterion("cancel_by_name is not null");
            return (Criteria) this;
        }

        public Criteria andCancelByNameEqualTo(String value) {
            addCriterion("cancel_by_name =", value, "cancelByName");
            return (Criteria) this;
        }

        public Criteria andCancelByNameNotEqualTo(String value) {
            addCriterion("cancel_by_name <>", value, "cancelByName");
            return (Criteria) this;
        }

        public Criteria andCancelByNameGreaterThan(String value) {
            addCriterion("cancel_by_name >", value, "cancelByName");
            return (Criteria) this;
        }

        public Criteria andCancelByNameGreaterThanOrEqualTo(String value) {
            addCriterion("cancel_by_name >=", value, "cancelByName");
            return (Criteria) this;
        }

        public Criteria andCancelByNameLessThan(String value) {
            addCriterion("cancel_by_name <", value, "cancelByName");
            return (Criteria) this;
        }

        public Criteria andCancelByNameLessThanOrEqualTo(String value) {
            addCriterion("cancel_by_name <=", value, "cancelByName");
            return (Criteria) this;
        }

        public Criteria andCancelByNameLike(String value) {
            addCriterion("cancel_by_name like", value, "cancelByName");
            return (Criteria) this;
        }

        public Criteria andCancelByNameNotLike(String value) {
            addCriterion("cancel_by_name not like", value, "cancelByName");
            return (Criteria) this;
        }

        public Criteria andCancelByNameIn(List<String> values) {
            addCriterion("cancel_by_name in", values, "cancelByName");
            return (Criteria) this;
        }

        public Criteria andCancelByNameNotIn(List<String> values) {
            addCriterion("cancel_by_name not in", values, "cancelByName");
            return (Criteria) this;
        }

        public Criteria andCancelByNameBetween(String value1, String value2) {
            addCriterion("cancel_by_name between", value1, value2, "cancelByName");
            return (Criteria) this;
        }

        public Criteria andCancelByNameNotBetween(String value1, String value2) {
            addCriterion("cancel_by_name not between", value1, value2, "cancelByName");
            return (Criteria) this;
        }

        public Criteria andCancelDateIsNull() {
            addCriterion("cancel_date is null");
            return (Criteria) this;
        }

        public Criteria andCancelDateIsNotNull() {
            addCriterion("cancel_date is not null");
            return (Criteria) this;
        }

        public Criteria andCancelDateEqualTo(Date value) {
            addCriterion("cancel_date =", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateNotEqualTo(Date value) {
            addCriterion("cancel_date <>", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateGreaterThan(Date value) {
            addCriterion("cancel_date >", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateGreaterThanOrEqualTo(Date value) {
            addCriterion("cancel_date >=", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateLessThan(Date value) {
            addCriterion("cancel_date <", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateLessThanOrEqualTo(Date value) {
            addCriterion("cancel_date <=", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateIn(List<Date> values) {
            addCriterion("cancel_date in", values, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateNotIn(List<Date> values) {
            addCriterion("cancel_date not in", values, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateBetween(Date value1, Date value2) {
            addCriterion("cancel_date between", value1, value2, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateNotBetween(Date value1, Date value2) {
            addCriterion("cancel_date not between", value1, value2, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andActFlagIsNull() {
            addCriterion("act_flag is null");
            return (Criteria) this;
        }

        public Criteria andActFlagIsNotNull() {
            addCriterion("act_flag is not null");
            return (Criteria) this;
        }

        public Criteria andActFlagEqualTo(String value) {
            addCriterion("act_flag =", value, "actFlag");
            return (Criteria) this;
        }

        public Criteria andActFlagNotEqualTo(String value) {
            addCriterion("act_flag <>", value, "actFlag");
            return (Criteria) this;
        }

        public Criteria andActFlagGreaterThan(String value) {
            addCriterion("act_flag >", value, "actFlag");
            return (Criteria) this;
        }

        public Criteria andActFlagGreaterThanOrEqualTo(String value) {
            addCriterion("act_flag >=", value, "actFlag");
            return (Criteria) this;
        }

        public Criteria andActFlagLessThan(String value) {
            addCriterion("act_flag <", value, "actFlag");
            return (Criteria) this;
        }

        public Criteria andActFlagLessThanOrEqualTo(String value) {
            addCriterion("act_flag <=", value, "actFlag");
            return (Criteria) this;
        }

        public Criteria andActFlagLike(String value) {
            addCriterion("act_flag like", value, "actFlag");
            return (Criteria) this;
        }

        public Criteria andActFlagNotLike(String value) {
            addCriterion("act_flag not like", value, "actFlag");
            return (Criteria) this;
        }

        public Criteria andActFlagIn(List<String> values) {
            addCriterion("act_flag in", values, "actFlag");
            return (Criteria) this;
        }

        public Criteria andActFlagNotIn(List<String> values) {
            addCriterion("act_flag not in", values, "actFlag");
            return (Criteria) this;
        }

        public Criteria andActFlagBetween(String value1, String value2) {
            addCriterion("act_flag between", value1, value2, "actFlag");
            return (Criteria) this;
        }

        public Criteria andActFlagNotBetween(String value1, String value2) {
            addCriterion("act_flag not between", value1, value2, "actFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(String value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(String value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(String value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(String value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(String value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(String value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLike(String value) {
            addCriterion("del_flag like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotLike(String value) {
            addCriterion("del_flag not like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<String> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<String> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(String value1, String value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(String value1, String value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
            return (Criteria) this;
        }
    }
}