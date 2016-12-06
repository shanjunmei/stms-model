package com.ffzx.stms.model;

import com.ffzx.orm.common.GenericExample.GeneratedCriteria;
import com.ffzx.orm.common.GenericExample;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PriceSchemeDetailExample extends GenericExample<PriceSchemeDetailExample.Criteria> {

    public PriceSchemeDetailExample() {
        oredCriteria = new ArrayList<PriceSchemeDetailExample.Criteria>();
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

        public Criteria andEffectiveProgrammeCodeIsNull() {
            addCriterion("effective_programme_code is null");
            return (Criteria) this;
        }

        public Criteria andEffectiveProgrammeCodeIsNotNull() {
            addCriterion("effective_programme_code is not null");
            return (Criteria) this;
        }

        public Criteria andEffectiveProgrammeCodeEqualTo(String value) {
            addCriterion("effective_programme_code =", value, "effectiveProgrammeCode");
            return (Criteria) this;
        }

        public Criteria andEffectiveProgrammeCodeNotEqualTo(String value) {
            addCriterion("effective_programme_code <>", value, "effectiveProgrammeCode");
            return (Criteria) this;
        }

        public Criteria andEffectiveProgrammeCodeGreaterThan(String value) {
            addCriterion("effective_programme_code >", value, "effectiveProgrammeCode");
            return (Criteria) this;
        }

        public Criteria andEffectiveProgrammeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("effective_programme_code >=", value, "effectiveProgrammeCode");
            return (Criteria) this;
        }

        public Criteria andEffectiveProgrammeCodeLessThan(String value) {
            addCriterion("effective_programme_code <", value, "effectiveProgrammeCode");
            return (Criteria) this;
        }

        public Criteria andEffectiveProgrammeCodeLessThanOrEqualTo(String value) {
            addCriterion("effective_programme_code <=", value, "effectiveProgrammeCode");
            return (Criteria) this;
        }

        public Criteria andEffectiveProgrammeCodeLike(String value) {
            addCriterion("effective_programme_code like", value, "effectiveProgrammeCode");
            return (Criteria) this;
        }

        public Criteria andEffectiveProgrammeCodeNotLike(String value) {
            addCriterion("effective_programme_code not like", value, "effectiveProgrammeCode");
            return (Criteria) this;
        }

        public Criteria andEffectiveProgrammeCodeIn(List<String> values) {
            addCriterion("effective_programme_code in", values, "effectiveProgrammeCode");
            return (Criteria) this;
        }

        public Criteria andEffectiveProgrammeCodeNotIn(List<String> values) {
            addCriterion("effective_programme_code not in", values, "effectiveProgrammeCode");
            return (Criteria) this;
        }

        public Criteria andEffectiveProgrammeCodeBetween(String value1, String value2) {
            addCriterion("effective_programme_code between", value1, value2, "effectiveProgrammeCode");
            return (Criteria) this;
        }

        public Criteria andEffectiveProgrammeCodeNotBetween(String value1, String value2) {
            addCriterion("effective_programme_code not between", value1, value2, "effectiveProgrammeCode");
            return (Criteria) this;
        }

        public Criteria andSkuBarcodeIsNull() {
            addCriterion("sku_barcode is null");
            return (Criteria) this;
        }

        public Criteria andSkuBarcodeIsNotNull() {
            addCriterion("sku_barcode is not null");
            return (Criteria) this;
        }

        public Criteria andSkuBarcodeEqualTo(String value) {
            addCriterion("sku_barcode =", value, "skuBarcode");
            return (Criteria) this;
        }

        public Criteria andSkuBarcodeNotEqualTo(String value) {
            addCriterion("sku_barcode <>", value, "skuBarcode");
            return (Criteria) this;
        }

        public Criteria andSkuBarcodeGreaterThan(String value) {
            addCriterion("sku_barcode >", value, "skuBarcode");
            return (Criteria) this;
        }

        public Criteria andSkuBarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("sku_barcode >=", value, "skuBarcode");
            return (Criteria) this;
        }

        public Criteria andSkuBarcodeLessThan(String value) {
            addCriterion("sku_barcode <", value, "skuBarcode");
            return (Criteria) this;
        }

        public Criteria andSkuBarcodeLessThanOrEqualTo(String value) {
            addCriterion("sku_barcode <=", value, "skuBarcode");
            return (Criteria) this;
        }

        public Criteria andSkuBarcodeLike(String value) {
            addCriterion("sku_barcode like", value, "skuBarcode");
            return (Criteria) this;
        }

        public Criteria andSkuBarcodeNotLike(String value) {
            addCriterion("sku_barcode not like", value, "skuBarcode");
            return (Criteria) this;
        }

        public Criteria andSkuBarcodeIn(List<String> values) {
            addCriterion("sku_barcode in", values, "skuBarcode");
            return (Criteria) this;
        }

        public Criteria andSkuBarcodeNotIn(List<String> values) {
            addCriterion("sku_barcode not in", values, "skuBarcode");
            return (Criteria) this;
        }

        public Criteria andSkuBarcodeBetween(String value1, String value2) {
            addCriterion("sku_barcode between", value1, value2, "skuBarcode");
            return (Criteria) this;
        }

        public Criteria andSkuBarcodeNotBetween(String value1, String value2) {
            addCriterion("sku_barcode not between", value1, value2, "skuBarcode");
            return (Criteria) this;
        }

        public Criteria andCommodityAttributeValuesIsNull() {
            addCriterion("commodity_attribute_values is null");
            return (Criteria) this;
        }

        public Criteria andCommodityAttributeValuesIsNotNull() {
            addCriterion("commodity_attribute_values is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityAttributeValuesEqualTo(String value) {
            addCriterion("commodity_attribute_values =", value, "commodityAttributeValues");
            return (Criteria) this;
        }

        public Criteria andCommodityAttributeValuesNotEqualTo(String value) {
            addCriterion("commodity_attribute_values <>", value, "commodityAttributeValues");
            return (Criteria) this;
        }

        public Criteria andCommodityAttributeValuesGreaterThan(String value) {
            addCriterion("commodity_attribute_values >", value, "commodityAttributeValues");
            return (Criteria) this;
        }

        public Criteria andCommodityAttributeValuesGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_attribute_values >=", value, "commodityAttributeValues");
            return (Criteria) this;
        }

        public Criteria andCommodityAttributeValuesLessThan(String value) {
            addCriterion("commodity_attribute_values <", value, "commodityAttributeValues");
            return (Criteria) this;
        }

        public Criteria andCommodityAttributeValuesLessThanOrEqualTo(String value) {
            addCriterion("commodity_attribute_values <=", value, "commodityAttributeValues");
            return (Criteria) this;
        }

        public Criteria andCommodityAttributeValuesLike(String value) {
            addCriterion("commodity_attribute_values like", value, "commodityAttributeValues");
            return (Criteria) this;
        }

        public Criteria andCommodityAttributeValuesNotLike(String value) {
            addCriterion("commodity_attribute_values not like", value, "commodityAttributeValues");
            return (Criteria) this;
        }

        public Criteria andCommodityAttributeValuesIn(List<String> values) {
            addCriterion("commodity_attribute_values in", values, "commodityAttributeValues");
            return (Criteria) this;
        }

        public Criteria andCommodityAttributeValuesNotIn(List<String> values) {
            addCriterion("commodity_attribute_values not in", values, "commodityAttributeValues");
            return (Criteria) this;
        }

        public Criteria andCommodityAttributeValuesBetween(String value1, String value2) {
            addCriterion("commodity_attribute_values between", value1, value2, "commodityAttributeValues");
            return (Criteria) this;
        }

        public Criteria andCommodityAttributeValuesNotBetween(String value1, String value2) {
            addCriterion("commodity_attribute_values not between", value1, value2, "commodityAttributeValues");
            return (Criteria) this;
        }

        public Criteria andSkuActFlagIsNull() {
            addCriterion("sku_act_flag is null");
            return (Criteria) this;
        }

        public Criteria andSkuActFlagIsNotNull() {
            addCriterion("sku_act_flag is not null");
            return (Criteria) this;
        }

        public Criteria andSkuActFlagEqualTo(String value) {
            addCriterion("sku_act_flag =", value, "skuActFlag");
            return (Criteria) this;
        }

        public Criteria andSkuActFlagNotEqualTo(String value) {
            addCriterion("sku_act_flag <>", value, "skuActFlag");
            return (Criteria) this;
        }

        public Criteria andSkuActFlagGreaterThan(String value) {
            addCriterion("sku_act_flag >", value, "skuActFlag");
            return (Criteria) this;
        }

        public Criteria andSkuActFlagGreaterThanOrEqualTo(String value) {
            addCriterion("sku_act_flag >=", value, "skuActFlag");
            return (Criteria) this;
        }

        public Criteria andSkuActFlagLessThan(String value) {
            addCriterion("sku_act_flag <", value, "skuActFlag");
            return (Criteria) this;
        }

        public Criteria andSkuActFlagLessThanOrEqualTo(String value) {
            addCriterion("sku_act_flag <=", value, "skuActFlag");
            return (Criteria) this;
        }

        public Criteria andSkuActFlagLike(String value) {
            addCriterion("sku_act_flag like", value, "skuActFlag");
            return (Criteria) this;
        }

        public Criteria andSkuActFlagNotLike(String value) {
            addCriterion("sku_act_flag not like", value, "skuActFlag");
            return (Criteria) this;
        }

        public Criteria andSkuActFlagIn(List<String> values) {
            addCriterion("sku_act_flag in", values, "skuActFlag");
            return (Criteria) this;
        }

        public Criteria andSkuActFlagNotIn(List<String> values) {
            addCriterion("sku_act_flag not in", values, "skuActFlag");
            return (Criteria) this;
        }

        public Criteria andSkuActFlagBetween(String value1, String value2) {
            addCriterion("sku_act_flag between", value1, value2, "skuActFlag");
            return (Criteria) this;
        }

        public Criteria andSkuActFlagNotBetween(String value1, String value2) {
            addCriterion("sku_act_flag not between", value1, value2, "skuActFlag");
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

        public Criteria andPointsIsNull() {
            addCriterion("points is null");
            return (Criteria) this;
        }

        public Criteria andPointsIsNotNull() {
            addCriterion("points is not null");
            return (Criteria) this;
        }

        public Criteria andPointsEqualTo(BigDecimal value) {
            addCriterion("points =", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotEqualTo(BigDecimal value) {
            addCriterion("points <>", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThan(BigDecimal value) {
            addCriterion("points >", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("points >=", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsLessThan(BigDecimal value) {
            addCriterion("points <", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("points <=", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsIn(List<BigDecimal> values) {
            addCriterion("points in", values, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotIn(List<BigDecimal> values) {
            addCriterion("points not in", values, "points");
            return (Criteria) this;
        }

        public Criteria andPointsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("points between", value1, value2, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("points not between", value1, value2, "points");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceIsNull() {
            addCriterion("supply_price is null");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceIsNotNull() {
            addCriterion("supply_price is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceEqualTo(BigDecimal value) {
            addCriterion("supply_price =", value, "supplyPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceNotEqualTo(BigDecimal value) {
            addCriterion("supply_price <>", value, "supplyPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceGreaterThan(BigDecimal value) {
            addCriterion("supply_price >", value, "supplyPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("supply_price >=", value, "supplyPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceLessThan(BigDecimal value) {
            addCriterion("supply_price <", value, "supplyPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("supply_price <=", value, "supplyPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceIn(List<BigDecimal> values) {
            addCriterion("supply_price in", values, "supplyPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceNotIn(List<BigDecimal> values) {
            addCriterion("supply_price not in", values, "supplyPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("supply_price between", value1, value2, "supplyPrice");
            return (Criteria) this;
        }

        public Criteria andSupplyPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("supply_price not between", value1, value2, "supplyPrice");
            return (Criteria) this;
        }
    }
}