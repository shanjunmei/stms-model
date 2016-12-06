package com.ffzx.stms.model;

import com.ffzx.orm.common.GenericExample.GeneratedCriteria;
import com.ffzx.orm.common.GenericExample;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BillLogExample extends GenericExample<BillLogExample.Criteria> {

    public BillLogExample() {
        oredCriteria = new ArrayList<BillLogExample.Criteria>();
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

        public Criteria andBillDetailIdIsNull() {
            addCriterion("bill_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andBillDetailIdIsNotNull() {
            addCriterion("bill_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andBillDetailIdEqualTo(String value) {
            addCriterion("bill_detail_id =", value, "billDetailId");
            return (Criteria) this;
        }

        public Criteria andBillDetailIdNotEqualTo(String value) {
            addCriterion("bill_detail_id <>", value, "billDetailId");
            return (Criteria) this;
        }

        public Criteria andBillDetailIdGreaterThan(String value) {
            addCriterion("bill_detail_id >", value, "billDetailId");
            return (Criteria) this;
        }

        public Criteria andBillDetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("bill_detail_id >=", value, "billDetailId");
            return (Criteria) this;
        }

        public Criteria andBillDetailIdLessThan(String value) {
            addCriterion("bill_detail_id <", value, "billDetailId");
            return (Criteria) this;
        }

        public Criteria andBillDetailIdLessThanOrEqualTo(String value) {
            addCriterion("bill_detail_id <=", value, "billDetailId");
            return (Criteria) this;
        }

        public Criteria andBillDetailIdLike(String value) {
            addCriterion("bill_detail_id like", value, "billDetailId");
            return (Criteria) this;
        }

        public Criteria andBillDetailIdNotLike(String value) {
            addCriterion("bill_detail_id not like", value, "billDetailId");
            return (Criteria) this;
        }

        public Criteria andBillDetailIdIn(List<String> values) {
            addCriterion("bill_detail_id in", values, "billDetailId");
            return (Criteria) this;
        }

        public Criteria andBillDetailIdNotIn(List<String> values) {
            addCriterion("bill_detail_id not in", values, "billDetailId");
            return (Criteria) this;
        }

        public Criteria andBillDetailIdBetween(String value1, String value2) {
            addCriterion("bill_detail_id between", value1, value2, "billDetailId");
            return (Criteria) this;
        }

        public Criteria andBillDetailIdNotBetween(String value1, String value2) {
            addCriterion("bill_detail_id not between", value1, value2, "billDetailId");
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

        public Criteria andCommodityPriceTotalIsNull() {
            addCriterion("commodity_price_total is null");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceTotalIsNotNull() {
            addCriterion("commodity_price_total is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceTotalEqualTo(BigDecimal value) {
            addCriterion("commodity_price_total =", value, "commodityPriceTotal");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceTotalNotEqualTo(BigDecimal value) {
            addCriterion("commodity_price_total <>", value, "commodityPriceTotal");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceTotalGreaterThan(BigDecimal value) {
            addCriterion("commodity_price_total >", value, "commodityPriceTotal");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("commodity_price_total >=", value, "commodityPriceTotal");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceTotalLessThan(BigDecimal value) {
            addCriterion("commodity_price_total <", value, "commodityPriceTotal");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("commodity_price_total <=", value, "commodityPriceTotal");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceTotalIn(List<BigDecimal> values) {
            addCriterion("commodity_price_total in", values, "commodityPriceTotal");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceTotalNotIn(List<BigDecimal> values) {
            addCriterion("commodity_price_total not in", values, "commodityPriceTotal");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commodity_price_total between", value1, value2, "commodityPriceTotal");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commodity_price_total not between", value1, value2, "commodityPriceTotal");
            return (Criteria) this;
        }

        public Criteria andPayableAmountBeforeIsNull() {
            addCriterion("payable_amount_before is null");
            return (Criteria) this;
        }

        public Criteria andPayableAmountBeforeIsNotNull() {
            addCriterion("payable_amount_before is not null");
            return (Criteria) this;
        }

        public Criteria andPayableAmountBeforeEqualTo(BigDecimal value) {
            addCriterion("payable_amount_before =", value, "payableAmountBefore");
            return (Criteria) this;
        }

        public Criteria andPayableAmountBeforeNotEqualTo(BigDecimal value) {
            addCriterion("payable_amount_before <>", value, "payableAmountBefore");
            return (Criteria) this;
        }

        public Criteria andPayableAmountBeforeGreaterThan(BigDecimal value) {
            addCriterion("payable_amount_before >", value, "payableAmountBefore");
            return (Criteria) this;
        }

        public Criteria andPayableAmountBeforeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("payable_amount_before >=", value, "payableAmountBefore");
            return (Criteria) this;
        }

        public Criteria andPayableAmountBeforeLessThan(BigDecimal value) {
            addCriterion("payable_amount_before <", value, "payableAmountBefore");
            return (Criteria) this;
        }

        public Criteria andPayableAmountBeforeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("payable_amount_before <=", value, "payableAmountBefore");
            return (Criteria) this;
        }

        public Criteria andPayableAmountBeforeIn(List<BigDecimal> values) {
            addCriterion("payable_amount_before in", values, "payableAmountBefore");
            return (Criteria) this;
        }

        public Criteria andPayableAmountBeforeNotIn(List<BigDecimal> values) {
            addCriterion("payable_amount_before not in", values, "payableAmountBefore");
            return (Criteria) this;
        }

        public Criteria andPayableAmountBeforeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payable_amount_before between", value1, value2, "payableAmountBefore");
            return (Criteria) this;
        }

        public Criteria andPayableAmountBeforeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payable_amount_before not between", value1, value2, "payableAmountBefore");
            return (Criteria) this;
        }

        public Criteria andPayableAmountAfterIsNull() {
            addCriterion("payable_amount_after is null");
            return (Criteria) this;
        }

        public Criteria andPayableAmountAfterIsNotNull() {
            addCriterion("payable_amount_after is not null");
            return (Criteria) this;
        }

        public Criteria andPayableAmountAfterEqualTo(BigDecimal value) {
            addCriterion("payable_amount_after =", value, "payableAmountAfter");
            return (Criteria) this;
        }

        public Criteria andPayableAmountAfterNotEqualTo(BigDecimal value) {
            addCriterion("payable_amount_after <>", value, "payableAmountAfter");
            return (Criteria) this;
        }

        public Criteria andPayableAmountAfterGreaterThan(BigDecimal value) {
            addCriterion("payable_amount_after >", value, "payableAmountAfter");
            return (Criteria) this;
        }

        public Criteria andPayableAmountAfterGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("payable_amount_after >=", value, "payableAmountAfter");
            return (Criteria) this;
        }

        public Criteria andPayableAmountAfterLessThan(BigDecimal value) {
            addCriterion("payable_amount_after <", value, "payableAmountAfter");
            return (Criteria) this;
        }

        public Criteria andPayableAmountAfterLessThanOrEqualTo(BigDecimal value) {
            addCriterion("payable_amount_after <=", value, "payableAmountAfter");
            return (Criteria) this;
        }

        public Criteria andPayableAmountAfterIn(List<BigDecimal> values) {
            addCriterion("payable_amount_after in", values, "payableAmountAfter");
            return (Criteria) this;
        }

        public Criteria andPayableAmountAfterNotIn(List<BigDecimal> values) {
            addCriterion("payable_amount_after not in", values, "payableAmountAfter");
            return (Criteria) this;
        }

        public Criteria andPayableAmountAfterBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payable_amount_after between", value1, value2, "payableAmountAfter");
            return (Criteria) this;
        }

        public Criteria andPayableAmountAfterNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payable_amount_after not between", value1, value2, "payableAmountAfter");
            return (Criteria) this;
        }

        public Criteria andSupplyBeforeIsNull() {
            addCriterion("supply_before is null");
            return (Criteria) this;
        }

        public Criteria andSupplyBeforeIsNotNull() {
            addCriterion("supply_before is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyBeforeEqualTo(BigDecimal value) {
            addCriterion("supply_before =", value, "supplyBefore");
            return (Criteria) this;
        }

        public Criteria andSupplyBeforeNotEqualTo(BigDecimal value) {
            addCriterion("supply_before <>", value, "supplyBefore");
            return (Criteria) this;
        }

        public Criteria andSupplyBeforeGreaterThan(BigDecimal value) {
            addCriterion("supply_before >", value, "supplyBefore");
            return (Criteria) this;
        }

        public Criteria andSupplyBeforeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("supply_before >=", value, "supplyBefore");
            return (Criteria) this;
        }

        public Criteria andSupplyBeforeLessThan(BigDecimal value) {
            addCriterion("supply_before <", value, "supplyBefore");
            return (Criteria) this;
        }

        public Criteria andSupplyBeforeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("supply_before <=", value, "supplyBefore");
            return (Criteria) this;
        }

        public Criteria andSupplyBeforeIn(List<BigDecimal> values) {
            addCriterion("supply_before in", values, "supplyBefore");
            return (Criteria) this;
        }

        public Criteria andSupplyBeforeNotIn(List<BigDecimal> values) {
            addCriterion("supply_before not in", values, "supplyBefore");
            return (Criteria) this;
        }

        public Criteria andSupplyBeforeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("supply_before between", value1, value2, "supplyBefore");
            return (Criteria) this;
        }

        public Criteria andSupplyBeforeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("supply_before not between", value1, value2, "supplyBefore");
            return (Criteria) this;
        }

        public Criteria andSupplyAfterIsNull() {
            addCriterion("supply_after is null");
            return (Criteria) this;
        }

        public Criteria andSupplyAfterIsNotNull() {
            addCriterion("supply_after is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyAfterEqualTo(BigDecimal value) {
            addCriterion("supply_after =", value, "supplyAfter");
            return (Criteria) this;
        }

        public Criteria andSupplyAfterNotEqualTo(BigDecimal value) {
            addCriterion("supply_after <>", value, "supplyAfter");
            return (Criteria) this;
        }

        public Criteria andSupplyAfterGreaterThan(BigDecimal value) {
            addCriterion("supply_after >", value, "supplyAfter");
            return (Criteria) this;
        }

        public Criteria andSupplyAfterGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("supply_after >=", value, "supplyAfter");
            return (Criteria) this;
        }

        public Criteria andSupplyAfterLessThan(BigDecimal value) {
            addCriterion("supply_after <", value, "supplyAfter");
            return (Criteria) this;
        }

        public Criteria andSupplyAfterLessThanOrEqualTo(BigDecimal value) {
            addCriterion("supply_after <=", value, "supplyAfter");
            return (Criteria) this;
        }

        public Criteria andSupplyAfterIn(List<BigDecimal> values) {
            addCriterion("supply_after in", values, "supplyAfter");
            return (Criteria) this;
        }

        public Criteria andSupplyAfterNotIn(List<BigDecimal> values) {
            addCriterion("supply_after not in", values, "supplyAfter");
            return (Criteria) this;
        }

        public Criteria andSupplyAfterBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("supply_after between", value1, value2, "supplyAfter");
            return (Criteria) this;
        }

        public Criteria andSupplyAfterNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("supply_after not between", value1, value2, "supplyAfter");
            return (Criteria) this;
        }

        public Criteria andPointsBeforeIsNull() {
            addCriterion("points_before is null");
            return (Criteria) this;
        }

        public Criteria andPointsBeforeIsNotNull() {
            addCriterion("points_before is not null");
            return (Criteria) this;
        }

        public Criteria andPointsBeforeEqualTo(BigDecimal value) {
            addCriterion("points_before =", value, "pointsBefore");
            return (Criteria) this;
        }

        public Criteria andPointsBeforeNotEqualTo(BigDecimal value) {
            addCriterion("points_before <>", value, "pointsBefore");
            return (Criteria) this;
        }

        public Criteria andPointsBeforeGreaterThan(BigDecimal value) {
            addCriterion("points_before >", value, "pointsBefore");
            return (Criteria) this;
        }

        public Criteria andPointsBeforeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("points_before >=", value, "pointsBefore");
            return (Criteria) this;
        }

        public Criteria andPointsBeforeLessThan(BigDecimal value) {
            addCriterion("points_before <", value, "pointsBefore");
            return (Criteria) this;
        }

        public Criteria andPointsBeforeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("points_before <=", value, "pointsBefore");
            return (Criteria) this;
        }

        public Criteria andPointsBeforeIn(List<BigDecimal> values) {
            addCriterion("points_before in", values, "pointsBefore");
            return (Criteria) this;
        }

        public Criteria andPointsBeforeNotIn(List<BigDecimal> values) {
            addCriterion("points_before not in", values, "pointsBefore");
            return (Criteria) this;
        }

        public Criteria andPointsBeforeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("points_before between", value1, value2, "pointsBefore");
            return (Criteria) this;
        }

        public Criteria andPointsBeforeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("points_before not between", value1, value2, "pointsBefore");
            return (Criteria) this;
        }

        public Criteria andPointsAfterIsNull() {
            addCriterion("points_after is null");
            return (Criteria) this;
        }

        public Criteria andPointsAfterIsNotNull() {
            addCriterion("points_after is not null");
            return (Criteria) this;
        }

        public Criteria andPointsAfterEqualTo(BigDecimal value) {
            addCriterion("points_after =", value, "pointsAfter");
            return (Criteria) this;
        }

        public Criteria andPointsAfterNotEqualTo(BigDecimal value) {
            addCriterion("points_after <>", value, "pointsAfter");
            return (Criteria) this;
        }

        public Criteria andPointsAfterGreaterThan(BigDecimal value) {
            addCriterion("points_after >", value, "pointsAfter");
            return (Criteria) this;
        }

        public Criteria andPointsAfterGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("points_after >=", value, "pointsAfter");
            return (Criteria) this;
        }

        public Criteria andPointsAfterLessThan(BigDecimal value) {
            addCriterion("points_after <", value, "pointsAfter");
            return (Criteria) this;
        }

        public Criteria andPointsAfterLessThanOrEqualTo(BigDecimal value) {
            addCriterion("points_after <=", value, "pointsAfter");
            return (Criteria) this;
        }

        public Criteria andPointsAfterIn(List<BigDecimal> values) {
            addCriterion("points_after in", values, "pointsAfter");
            return (Criteria) this;
        }

        public Criteria andPointsAfterNotIn(List<BigDecimal> values) {
            addCriterion("points_after not in", values, "pointsAfter");
            return (Criteria) this;
        }

        public Criteria andPointsAfterBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("points_after between", value1, value2, "pointsAfter");
            return (Criteria) this;
        }

        public Criteria andPointsAfterNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("points_after not between", value1, value2, "pointsAfter");
            return (Criteria) this;
        }

        public Criteria andRefundableAmountBeforeIsNull() {
            addCriterion("refundable_amount_before is null");
            return (Criteria) this;
        }

        public Criteria andRefundableAmountBeforeIsNotNull() {
            addCriterion("refundable_amount_before is not null");
            return (Criteria) this;
        }

        public Criteria andRefundableAmountBeforeEqualTo(BigDecimal value) {
            addCriterion("refundable_amount_before =", value, "refundableAmountBefore");
            return (Criteria) this;
        }

        public Criteria andRefundableAmountBeforeNotEqualTo(BigDecimal value) {
            addCriterion("refundable_amount_before <>", value, "refundableAmountBefore");
            return (Criteria) this;
        }

        public Criteria andRefundableAmountBeforeGreaterThan(BigDecimal value) {
            addCriterion("refundable_amount_before >", value, "refundableAmountBefore");
            return (Criteria) this;
        }

        public Criteria andRefundableAmountBeforeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("refundable_amount_before >=", value, "refundableAmountBefore");
            return (Criteria) this;
        }

        public Criteria andRefundableAmountBeforeLessThan(BigDecimal value) {
            addCriterion("refundable_amount_before <", value, "refundableAmountBefore");
            return (Criteria) this;
        }

        public Criteria andRefundableAmountBeforeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("refundable_amount_before <=", value, "refundableAmountBefore");
            return (Criteria) this;
        }

        public Criteria andRefundableAmountBeforeIn(List<BigDecimal> values) {
            addCriterion("refundable_amount_before in", values, "refundableAmountBefore");
            return (Criteria) this;
        }

        public Criteria andRefundableAmountBeforeNotIn(List<BigDecimal> values) {
            addCriterion("refundable_amount_before not in", values, "refundableAmountBefore");
            return (Criteria) this;
        }

        public Criteria andRefundableAmountBeforeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refundable_amount_before between", value1, value2, "refundableAmountBefore");
            return (Criteria) this;
        }

        public Criteria andRefundableAmountBeforeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refundable_amount_before not between", value1, value2, "refundableAmountBefore");
            return (Criteria) this;
        }

        public Criteria andRefundableAmountAfterIsNull() {
            addCriterion("refundable_amount_after is null");
            return (Criteria) this;
        }

        public Criteria andRefundableAmountAfterIsNotNull() {
            addCriterion("refundable_amount_after is not null");
            return (Criteria) this;
        }

        public Criteria andRefundableAmountAfterEqualTo(BigDecimal value) {
            addCriterion("refundable_amount_after =", value, "refundableAmountAfter");
            return (Criteria) this;
        }

        public Criteria andRefundableAmountAfterNotEqualTo(BigDecimal value) {
            addCriterion("refundable_amount_after <>", value, "refundableAmountAfter");
            return (Criteria) this;
        }

        public Criteria andRefundableAmountAfterGreaterThan(BigDecimal value) {
            addCriterion("refundable_amount_after >", value, "refundableAmountAfter");
            return (Criteria) this;
        }

        public Criteria andRefundableAmountAfterGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("refundable_amount_after >=", value, "refundableAmountAfter");
            return (Criteria) this;
        }

        public Criteria andRefundableAmountAfterLessThan(BigDecimal value) {
            addCriterion("refundable_amount_after <", value, "refundableAmountAfter");
            return (Criteria) this;
        }

        public Criteria andRefundableAmountAfterLessThanOrEqualTo(BigDecimal value) {
            addCriterion("refundable_amount_after <=", value, "refundableAmountAfter");
            return (Criteria) this;
        }

        public Criteria andRefundableAmountAfterIn(List<BigDecimal> values) {
            addCriterion("refundable_amount_after in", values, "refundableAmountAfter");
            return (Criteria) this;
        }

        public Criteria andRefundableAmountAfterNotIn(List<BigDecimal> values) {
            addCriterion("refundable_amount_after not in", values, "refundableAmountAfter");
            return (Criteria) this;
        }

        public Criteria andRefundableAmountAfterBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refundable_amount_after between", value1, value2, "refundableAmountAfter");
            return (Criteria) this;
        }

        public Criteria andRefundableAmountAfterNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refundable_amount_after not between", value1, value2, "refundableAmountAfter");
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