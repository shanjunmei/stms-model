package com.ffzx.stms.model;

import com.ffzx.orm.common.GenericExample.GeneratedCriteria;
import com.ffzx.orm.common.GenericExample;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BillExample extends GenericExample<BillExample.Criteria> {

    public BillExample() {
        oredCriteria = new ArrayList<BillExample.Criteria>();
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

        public Criteria andBillNoIsNull() {
            addCriterion("bill_no is null");
            return (Criteria) this;
        }

        public Criteria andBillNoIsNotNull() {
            addCriterion("bill_no is not null");
            return (Criteria) this;
        }

        public Criteria andBillNoEqualTo(String value) {
            addCriterion("bill_no =", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoNotEqualTo(String value) {
            addCriterion("bill_no <>", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoGreaterThan(String value) {
            addCriterion("bill_no >", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoGreaterThanOrEqualTo(String value) {
            addCriterion("bill_no >=", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoLessThan(String value) {
            addCriterion("bill_no <", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoLessThanOrEqualTo(String value) {
            addCriterion("bill_no <=", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoLike(String value) {
            addCriterion("bill_no like", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoNotLike(String value) {
            addCriterion("bill_no not like", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoIn(List<String> values) {
            addCriterion("bill_no in", values, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoNotIn(List<String> values) {
            addCriterion("bill_no not in", values, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoBetween(String value1, String value2) {
            addCriterion("bill_no between", value1, value2, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoNotBetween(String value1, String value2) {
            addCriterion("bill_no not between", value1, value2, "billNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumIsNull() {
            addCriterion("invoice_num is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumIsNotNull() {
            addCriterion("invoice_num is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumEqualTo(String value) {
            addCriterion("invoice_num =", value, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumNotEqualTo(String value) {
            addCriterion("invoice_num <>", value, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumGreaterThan(String value) {
            addCriterion("invoice_num >", value, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_num >=", value, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumLessThan(String value) {
            addCriterion("invoice_num <", value, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumLessThanOrEqualTo(String value) {
            addCriterion("invoice_num <=", value, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumLike(String value) {
            addCriterion("invoice_num like", value, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumNotLike(String value) {
            addCriterion("invoice_num not like", value, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumIn(List<String> values) {
            addCriterion("invoice_num in", values, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumNotIn(List<String> values) {
            addCriterion("invoice_num not in", values, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumBetween(String value1, String value2) {
            addCriterion("invoice_num between", value1, value2, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumNotBetween(String value1, String value2) {
            addCriterion("invoice_num not between", value1, value2, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusIsNull() {
            addCriterion("invoice_status is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusIsNotNull() {
            addCriterion("invoice_status is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusEqualTo(String value) {
            addCriterion("invoice_status =", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusNotEqualTo(String value) {
            addCriterion("invoice_status <>", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusGreaterThan(String value) {
            addCriterion("invoice_status >", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_status >=", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLessThan(String value) {
            addCriterion("invoice_status <", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLessThanOrEqualTo(String value) {
            addCriterion("invoice_status <=", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLike(String value) {
            addCriterion("invoice_status like", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusNotLike(String value) {
            addCriterion("invoice_status not like", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusIn(List<String> values) {
            addCriterion("invoice_status in", values, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusNotIn(List<String> values) {
            addCriterion("invoice_status not in", values, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusBetween(String value1, String value2) {
            addCriterion("invoice_status between", value1, value2, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusNotBetween(String value1, String value2) {
            addCriterion("invoice_status not between", value1, value2, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusIsNull() {
            addCriterion("bill_status is null");
            return (Criteria) this;
        }

        public Criteria andBillStatusIsNotNull() {
            addCriterion("bill_status is not null");
            return (Criteria) this;
        }

        public Criteria andBillStatusEqualTo(String value) {
            addCriterion("bill_status =", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusNotEqualTo(String value) {
            addCriterion("bill_status <>", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusGreaterThan(String value) {
            addCriterion("bill_status >", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusGreaterThanOrEqualTo(String value) {
            addCriterion("bill_status >=", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusLessThan(String value) {
            addCriterion("bill_status <", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusLessThanOrEqualTo(String value) {
            addCriterion("bill_status <=", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusLike(String value) {
            addCriterion("bill_status like", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusNotLike(String value) {
            addCriterion("bill_status not like", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusIn(List<String> values) {
            addCriterion("bill_status in", values, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusNotIn(List<String> values) {
            addCriterion("bill_status not in", values, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusBetween(String value1, String value2) {
            addCriterion("bill_status between", value1, value2, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusNotBetween(String value1, String value2) {
            addCriterion("bill_status not between", value1, value2, "billStatus");
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

        public Criteria andVendorNameIsNull() {
            addCriterion("vendor_name is null");
            return (Criteria) this;
        }

        public Criteria andVendorNameIsNotNull() {
            addCriterion("vendor_name is not null");
            return (Criteria) this;
        }

        public Criteria andVendorNameEqualTo(String value) {
            addCriterion("vendor_name =", value, "vendorName");
            return (Criteria) this;
        }

        public Criteria andVendorNameNotEqualTo(String value) {
            addCriterion("vendor_name <>", value, "vendorName");
            return (Criteria) this;
        }

        public Criteria andVendorNameGreaterThan(String value) {
            addCriterion("vendor_name >", value, "vendorName");
            return (Criteria) this;
        }

        public Criteria andVendorNameGreaterThanOrEqualTo(String value) {
            addCriterion("vendor_name >=", value, "vendorName");
            return (Criteria) this;
        }

        public Criteria andVendorNameLessThan(String value) {
            addCriterion("vendor_name <", value, "vendorName");
            return (Criteria) this;
        }

        public Criteria andVendorNameLessThanOrEqualTo(String value) {
            addCriterion("vendor_name <=", value, "vendorName");
            return (Criteria) this;
        }

        public Criteria andVendorNameLike(String value) {
            addCriterion("vendor_name like", value, "vendorName");
            return (Criteria) this;
        }

        public Criteria andVendorNameNotLike(String value) {
            addCriterion("vendor_name not like", value, "vendorName");
            return (Criteria) this;
        }

        public Criteria andVendorNameIn(List<String> values) {
            addCriterion("vendor_name in", values, "vendorName");
            return (Criteria) this;
        }

        public Criteria andVendorNameNotIn(List<String> values) {
            addCriterion("vendor_name not in", values, "vendorName");
            return (Criteria) this;
        }

        public Criteria andVendorNameBetween(String value1, String value2) {
            addCriterion("vendor_name between", value1, value2, "vendorName");
            return (Criteria) this;
        }

        public Criteria andVendorNameNotBetween(String value1, String value2) {
            addCriterion("vendor_name not between", value1, value2, "vendorName");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalCountIsNull() {
            addCriterion("goods_total_count is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalCountIsNotNull() {
            addCriterion("goods_total_count is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalCountEqualTo(BigDecimal value) {
            addCriterion("goods_total_count =", value, "goodsTotalCount");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalCountNotEqualTo(BigDecimal value) {
            addCriterion("goods_total_count <>", value, "goodsTotalCount");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalCountGreaterThan(BigDecimal value) {
            addCriterion("goods_total_count >", value, "goodsTotalCount");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalCountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_total_count >=", value, "goodsTotalCount");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalCountLessThan(BigDecimal value) {
            addCriterion("goods_total_count <", value, "goodsTotalCount");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalCountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_total_count <=", value, "goodsTotalCount");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalCountIn(List<BigDecimal> values) {
            addCriterion("goods_total_count in", values, "goodsTotalCount");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalCountNotIn(List<BigDecimal> values) {
            addCriterion("goods_total_count not in", values, "goodsTotalCount");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalCountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_total_count between", value1, value2, "goodsTotalCount");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalCountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_total_count not between", value1, value2, "goodsTotalCount");
            return (Criteria) this;
        }

        public Criteria andSupplyTotalIsNull() {
            addCriterion("supply_total is null");
            return (Criteria) this;
        }

        public Criteria andSupplyTotalIsNotNull() {
            addCriterion("supply_total is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyTotalEqualTo(BigDecimal value) {
            addCriterion("supply_total =", value, "supplyTotal");
            return (Criteria) this;
        }

        public Criteria andSupplyTotalNotEqualTo(BigDecimal value) {
            addCriterion("supply_total <>", value, "supplyTotal");
            return (Criteria) this;
        }

        public Criteria andSupplyTotalGreaterThan(BigDecimal value) {
            addCriterion("supply_total >", value, "supplyTotal");
            return (Criteria) this;
        }

        public Criteria andSupplyTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("supply_total >=", value, "supplyTotal");
            return (Criteria) this;
        }

        public Criteria andSupplyTotalLessThan(BigDecimal value) {
            addCriterion("supply_total <", value, "supplyTotal");
            return (Criteria) this;
        }

        public Criteria andSupplyTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("supply_total <=", value, "supplyTotal");
            return (Criteria) this;
        }

        public Criteria andSupplyTotalIn(List<BigDecimal> values) {
            addCriterion("supply_total in", values, "supplyTotal");
            return (Criteria) this;
        }

        public Criteria andSupplyTotalNotIn(List<BigDecimal> values) {
            addCriterion("supply_total not in", values, "supplyTotal");
            return (Criteria) this;
        }

        public Criteria andSupplyTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("supply_total between", value1, value2, "supplyTotal");
            return (Criteria) this;
        }

        public Criteria andSupplyTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("supply_total not between", value1, value2, "supplyTotal");
            return (Criteria) this;
        }

        public Criteria andPointsAmountTotalIsNull() {
            addCriterion("points_amount_total is null");
            return (Criteria) this;
        }

        public Criteria andPointsAmountTotalIsNotNull() {
            addCriterion("points_amount_total is not null");
            return (Criteria) this;
        }

        public Criteria andPointsAmountTotalEqualTo(BigDecimal value) {
            addCriterion("points_amount_total =", value, "pointsAmountTotal");
            return (Criteria) this;
        }

        public Criteria andPointsAmountTotalNotEqualTo(BigDecimal value) {
            addCriterion("points_amount_total <>", value, "pointsAmountTotal");
            return (Criteria) this;
        }

        public Criteria andPointsAmountTotalGreaterThan(BigDecimal value) {
            addCriterion("points_amount_total >", value, "pointsAmountTotal");
            return (Criteria) this;
        }

        public Criteria andPointsAmountTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("points_amount_total >=", value, "pointsAmountTotal");
            return (Criteria) this;
        }

        public Criteria andPointsAmountTotalLessThan(BigDecimal value) {
            addCriterion("points_amount_total <", value, "pointsAmountTotal");
            return (Criteria) this;
        }

        public Criteria andPointsAmountTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("points_amount_total <=", value, "pointsAmountTotal");
            return (Criteria) this;
        }

        public Criteria andPointsAmountTotalIn(List<BigDecimal> values) {
            addCriterion("points_amount_total in", values, "pointsAmountTotal");
            return (Criteria) this;
        }

        public Criteria andPointsAmountTotalNotIn(List<BigDecimal> values) {
            addCriterion("points_amount_total not in", values, "pointsAmountTotal");
            return (Criteria) this;
        }

        public Criteria andPointsAmountTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("points_amount_total between", value1, value2, "pointsAmountTotal");
            return (Criteria) this;
        }

        public Criteria andPointsAmountTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("points_amount_total not between", value1, value2, "pointsAmountTotal");
            return (Criteria) this;
        }

        public Criteria andPayableAmountTotalIsNull() {
            addCriterion("payable_amount_total is null");
            return (Criteria) this;
        }

        public Criteria andPayableAmountTotalIsNotNull() {
            addCriterion("payable_amount_total is not null");
            return (Criteria) this;
        }

        public Criteria andPayableAmountTotalEqualTo(BigDecimal value) {
            addCriterion("payable_amount_total =", value, "payableAmountTotal");
            return (Criteria) this;
        }

        public Criteria andPayableAmountTotalNotEqualTo(BigDecimal value) {
            addCriterion("payable_amount_total <>", value, "payableAmountTotal");
            return (Criteria) this;
        }

        public Criteria andPayableAmountTotalGreaterThan(BigDecimal value) {
            addCriterion("payable_amount_total >", value, "payableAmountTotal");
            return (Criteria) this;
        }

        public Criteria andPayableAmountTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("payable_amount_total >=", value, "payableAmountTotal");
            return (Criteria) this;
        }

        public Criteria andPayableAmountTotalLessThan(BigDecimal value) {
            addCriterion("payable_amount_total <", value, "payableAmountTotal");
            return (Criteria) this;
        }

        public Criteria andPayableAmountTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("payable_amount_total <=", value, "payableAmountTotal");
            return (Criteria) this;
        }

        public Criteria andPayableAmountTotalIn(List<BigDecimal> values) {
            addCriterion("payable_amount_total in", values, "payableAmountTotal");
            return (Criteria) this;
        }

        public Criteria andPayableAmountTotalNotIn(List<BigDecimal> values) {
            addCriterion("payable_amount_total not in", values, "payableAmountTotal");
            return (Criteria) this;
        }

        public Criteria andPayableAmountTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payable_amount_total between", value1, value2, "payableAmountTotal");
            return (Criteria) this;
        }

        public Criteria andPayableAmountTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payable_amount_total not between", value1, value2, "payableAmountTotal");
            return (Criteria) this;
        }

        public Criteria andPayableObtainAmountTotalIsNull() {
            addCriterion("payable_obtain_amount_total is null");
            return (Criteria) this;
        }

        public Criteria andPayableObtainAmountTotalIsNotNull() {
            addCriterion("payable_obtain_amount_total is not null");
            return (Criteria) this;
        }

        public Criteria andPayableObtainAmountTotalEqualTo(BigDecimal value) {
            addCriterion("payable_obtain_amount_total =", value, "payableObtainAmountTotal");
            return (Criteria) this;
        }

        public Criteria andPayableObtainAmountTotalNotEqualTo(BigDecimal value) {
            addCriterion("payable_obtain_amount_total <>", value, "payableObtainAmountTotal");
            return (Criteria) this;
        }

        public Criteria andPayableObtainAmountTotalGreaterThan(BigDecimal value) {
            addCriterion("payable_obtain_amount_total >", value, "payableObtainAmountTotal");
            return (Criteria) this;
        }

        public Criteria andPayableObtainAmountTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("payable_obtain_amount_total >=", value, "payableObtainAmountTotal");
            return (Criteria) this;
        }

        public Criteria andPayableObtainAmountTotalLessThan(BigDecimal value) {
            addCriterion("payable_obtain_amount_total <", value, "payableObtainAmountTotal");
            return (Criteria) this;
        }

        public Criteria andPayableObtainAmountTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("payable_obtain_amount_total <=", value, "payableObtainAmountTotal");
            return (Criteria) this;
        }

        public Criteria andPayableObtainAmountTotalIn(List<BigDecimal> values) {
            addCriterion("payable_obtain_amount_total in", values, "payableObtainAmountTotal");
            return (Criteria) this;
        }

        public Criteria andPayableObtainAmountTotalNotIn(List<BigDecimal> values) {
            addCriterion("payable_obtain_amount_total not in", values, "payableObtainAmountTotal");
            return (Criteria) this;
        }

        public Criteria andPayableObtainAmountTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payable_obtain_amount_total between", value1, value2, "payableObtainAmountTotal");
            return (Criteria) this;
        }

        public Criteria andPayableObtainAmountTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payable_obtain_amount_total not between", value1, value2, "payableObtainAmountTotal");
            return (Criteria) this;
        }

        public Criteria andRefundBillTotalCountIsNull() {
            addCriterion("refund_bill_total_count is null");
            return (Criteria) this;
        }

        public Criteria andRefundBillTotalCountIsNotNull() {
            addCriterion("refund_bill_total_count is not null");
            return (Criteria) this;
        }

        public Criteria andRefundBillTotalCountEqualTo(BigDecimal value) {
            addCriterion("refund_bill_total_count =", value, "refundBillTotalCount");
            return (Criteria) this;
        }

        public Criteria andRefundBillTotalCountNotEqualTo(BigDecimal value) {
            addCriterion("refund_bill_total_count <>", value, "refundBillTotalCount");
            return (Criteria) this;
        }

        public Criteria andRefundBillTotalCountGreaterThan(BigDecimal value) {
            addCriterion("refund_bill_total_count >", value, "refundBillTotalCount");
            return (Criteria) this;
        }

        public Criteria andRefundBillTotalCountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_bill_total_count >=", value, "refundBillTotalCount");
            return (Criteria) this;
        }

        public Criteria andRefundBillTotalCountLessThan(BigDecimal value) {
            addCriterion("refund_bill_total_count <", value, "refundBillTotalCount");
            return (Criteria) this;
        }

        public Criteria andRefundBillTotalCountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_bill_total_count <=", value, "refundBillTotalCount");
            return (Criteria) this;
        }

        public Criteria andRefundBillTotalCountIn(List<BigDecimal> values) {
            addCriterion("refund_bill_total_count in", values, "refundBillTotalCount");
            return (Criteria) this;
        }

        public Criteria andRefundBillTotalCountNotIn(List<BigDecimal> values) {
            addCriterion("refund_bill_total_count not in", values, "refundBillTotalCount");
            return (Criteria) this;
        }

        public Criteria andRefundBillTotalCountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_bill_total_count between", value1, value2, "refundBillTotalCount");
            return (Criteria) this;
        }

        public Criteria andRefundBillTotalCountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_bill_total_count not between", value1, value2, "refundBillTotalCount");
            return (Criteria) this;
        }

        public Criteria andBusinessStartDateTimeIsNull() {
            addCriterion("business_start_date_time is null");
            return (Criteria) this;
        }

        public Criteria andBusinessStartDateTimeIsNotNull() {
            addCriterion("business_start_date_time is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessStartDateTimeEqualTo(Date value) {
            addCriterion("business_start_date_time =", value, "businessStartDateTime");
            return (Criteria) this;
        }

        public Criteria andBusinessStartDateTimeNotEqualTo(Date value) {
            addCriterion("business_start_date_time <>", value, "businessStartDateTime");
            return (Criteria) this;
        }

        public Criteria andBusinessStartDateTimeGreaterThan(Date value) {
            addCriterion("business_start_date_time >", value, "businessStartDateTime");
            return (Criteria) this;
        }

        public Criteria andBusinessStartDateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("business_start_date_time >=", value, "businessStartDateTime");
            return (Criteria) this;
        }

        public Criteria andBusinessStartDateTimeLessThan(Date value) {
            addCriterion("business_start_date_time <", value, "businessStartDateTime");
            return (Criteria) this;
        }

        public Criteria andBusinessStartDateTimeLessThanOrEqualTo(Date value) {
            addCriterion("business_start_date_time <=", value, "businessStartDateTime");
            return (Criteria) this;
        }

        public Criteria andBusinessStartDateTimeIn(List<Date> values) {
            addCriterion("business_start_date_time in", values, "businessStartDateTime");
            return (Criteria) this;
        }

        public Criteria andBusinessStartDateTimeNotIn(List<Date> values) {
            addCriterion("business_start_date_time not in", values, "businessStartDateTime");
            return (Criteria) this;
        }

        public Criteria andBusinessStartDateTimeBetween(Date value1, Date value2) {
            addCriterion("business_start_date_time between", value1, value2, "businessStartDateTime");
            return (Criteria) this;
        }

        public Criteria andBusinessStartDateTimeNotBetween(Date value1, Date value2) {
            addCriterion("business_start_date_time not between", value1, value2, "businessStartDateTime");
            return (Criteria) this;
        }

        public Criteria andBusinessEndDateTimeIsNull() {
            addCriterion("business_end_date_time is null");
            return (Criteria) this;
        }

        public Criteria andBusinessEndDateTimeIsNotNull() {
            addCriterion("business_end_date_time is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessEndDateTimeEqualTo(Date value) {
            addCriterion("business_end_date_time =", value, "businessEndDateTime");
            return (Criteria) this;
        }

        public Criteria andBusinessEndDateTimeNotEqualTo(Date value) {
            addCriterion("business_end_date_time <>", value, "businessEndDateTime");
            return (Criteria) this;
        }

        public Criteria andBusinessEndDateTimeGreaterThan(Date value) {
            addCriterion("business_end_date_time >", value, "businessEndDateTime");
            return (Criteria) this;
        }

        public Criteria andBusinessEndDateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("business_end_date_time >=", value, "businessEndDateTime");
            return (Criteria) this;
        }

        public Criteria andBusinessEndDateTimeLessThan(Date value) {
            addCriterion("business_end_date_time <", value, "businessEndDateTime");
            return (Criteria) this;
        }

        public Criteria andBusinessEndDateTimeLessThanOrEqualTo(Date value) {
            addCriterion("business_end_date_time <=", value, "businessEndDateTime");
            return (Criteria) this;
        }

        public Criteria andBusinessEndDateTimeIn(List<Date> values) {
            addCriterion("business_end_date_time in", values, "businessEndDateTime");
            return (Criteria) this;
        }

        public Criteria andBusinessEndDateTimeNotIn(List<Date> values) {
            addCriterion("business_end_date_time not in", values, "businessEndDateTime");
            return (Criteria) this;
        }

        public Criteria andBusinessEndDateTimeBetween(Date value1, Date value2) {
            addCriterion("business_end_date_time between", value1, value2, "businessEndDateTime");
            return (Criteria) this;
        }

        public Criteria andBusinessEndDateTimeNotBetween(Date value1, Date value2) {
            addCriterion("business_end_date_time not between", value1, value2, "businessEndDateTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("audit_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterion("audit_time =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterion("audit_time <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterion("audit_time >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("audit_time >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Date value) {
            addCriterion("audit_time <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("audit_time <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterion("audit_time in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterion("audit_time not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterion("audit_time between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("audit_time not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNull() {
            addCriterion("auditor is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNotNull() {
            addCriterion("auditor is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorEqualTo(String value) {
            addCriterion("auditor =", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotEqualTo(String value) {
            addCriterion("auditor <>", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThan(String value) {
            addCriterion("auditor >", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("auditor >=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThan(String value) {
            addCriterion("auditor <", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThanOrEqualTo(String value) {
            addCriterion("auditor <=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLike(String value) {
            addCriterion("auditor like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotLike(String value) {
            addCriterion("auditor not like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorIn(List<String> values) {
            addCriterion("auditor in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotIn(List<String> values) {
            addCriterion("auditor not in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorBetween(String value1, String value2) {
            addCriterion("auditor between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotBetween(String value1, String value2) {
            addCriterion("auditor not between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorIdIsNull() {
            addCriterion("auditor_id is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIdIsNotNull() {
            addCriterion("auditor_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorIdEqualTo(String value) {
            addCriterion("auditor_id =", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdNotEqualTo(String value) {
            addCriterion("auditor_id <>", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdGreaterThan(String value) {
            addCriterion("auditor_id >", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdGreaterThanOrEqualTo(String value) {
            addCriterion("auditor_id >=", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdLessThan(String value) {
            addCriterion("auditor_id <", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdLessThanOrEqualTo(String value) {
            addCriterion("auditor_id <=", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdLike(String value) {
            addCriterion("auditor_id like", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdNotLike(String value) {
            addCriterion("auditor_id not like", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdIn(List<String> values) {
            addCriterion("auditor_id in", values, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdNotIn(List<String> values) {
            addCriterion("auditor_id not in", values, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdBetween(String value1, String value2) {
            addCriterion("auditor_id between", value1, value2, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdNotBetween(String value1, String value2) {
            addCriterion("auditor_id not between", value1, value2, "auditorId");
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
    }
}