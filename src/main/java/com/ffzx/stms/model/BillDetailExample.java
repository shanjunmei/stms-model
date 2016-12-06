package com.ffzx.stms.model;

import com.ffzx.orm.common.GenericExample.GeneratedCriteria;
import com.ffzx.orm.common.GenericExample;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BillDetailExample extends GenericExample<BillDetailExample.Criteria> {

    public BillDetailExample() {
        oredCriteria = new ArrayList<BillDetailExample.Criteria>();
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

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOutboundNoIsNull() {
            addCriterion("outbound_no is null");
            return (Criteria) this;
        }

        public Criteria andOutboundNoIsNotNull() {
            addCriterion("outbound_no is not null");
            return (Criteria) this;
        }

        public Criteria andOutboundNoEqualTo(String value) {
            addCriterion("outbound_no =", value, "outboundNo");
            return (Criteria) this;
        }

        public Criteria andOutboundNoNotEqualTo(String value) {
            addCriterion("outbound_no <>", value, "outboundNo");
            return (Criteria) this;
        }

        public Criteria andOutboundNoGreaterThan(String value) {
            addCriterion("outbound_no >", value, "outboundNo");
            return (Criteria) this;
        }

        public Criteria andOutboundNoGreaterThanOrEqualTo(String value) {
            addCriterion("outbound_no >=", value, "outboundNo");
            return (Criteria) this;
        }

        public Criteria andOutboundNoLessThan(String value) {
            addCriterion("outbound_no <", value, "outboundNo");
            return (Criteria) this;
        }

        public Criteria andOutboundNoLessThanOrEqualTo(String value) {
            addCriterion("outbound_no <=", value, "outboundNo");
            return (Criteria) this;
        }

        public Criteria andOutboundNoLike(String value) {
            addCriterion("outbound_no like", value, "outboundNo");
            return (Criteria) this;
        }

        public Criteria andOutboundNoNotLike(String value) {
            addCriterion("outbound_no not like", value, "outboundNo");
            return (Criteria) this;
        }

        public Criteria andOutboundNoIn(List<String> values) {
            addCriterion("outbound_no in", values, "outboundNo");
            return (Criteria) this;
        }

        public Criteria andOutboundNoNotIn(List<String> values) {
            addCriterion("outbound_no not in", values, "outboundNo");
            return (Criteria) this;
        }

        public Criteria andOutboundNoBetween(String value1, String value2) {
            addCriterion("outbound_no between", value1, value2, "outboundNo");
            return (Criteria) this;
        }

        public Criteria andOutboundNoNotBetween(String value1, String value2) {
            addCriterion("outbound_no not between", value1, value2, "outboundNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoIsNull() {
            addCriterion("refund_no is null");
            return (Criteria) this;
        }

        public Criteria andRefundNoIsNotNull() {
            addCriterion("refund_no is not null");
            return (Criteria) this;
        }

        public Criteria andRefundNoEqualTo(String value) {
            addCriterion("refund_no =", value, "refundNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoNotEqualTo(String value) {
            addCriterion("refund_no <>", value, "refundNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoGreaterThan(String value) {
            addCriterion("refund_no >", value, "refundNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoGreaterThanOrEqualTo(String value) {
            addCriterion("refund_no >=", value, "refundNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoLessThan(String value) {
            addCriterion("refund_no <", value, "refundNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoLessThanOrEqualTo(String value) {
            addCriterion("refund_no <=", value, "refundNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoLike(String value) {
            addCriterion("refund_no like", value, "refundNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoNotLike(String value) {
            addCriterion("refund_no not like", value, "refundNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoIn(List<String> values) {
            addCriterion("refund_no in", values, "refundNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoNotIn(List<String> values) {
            addCriterion("refund_no not in", values, "refundNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoBetween(String value1, String value2) {
            addCriterion("refund_no between", value1, value2, "refundNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoNotBetween(String value1, String value2) {
            addCriterion("refund_no not between", value1, value2, "refundNo");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateIsNull() {
            addCriterion("order_create_date is null");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateIsNotNull() {
            addCriterion("order_create_date is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateEqualTo(Date value) {
            addCriterion("order_create_date =", value, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateNotEqualTo(Date value) {
            addCriterion("order_create_date <>", value, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateGreaterThan(Date value) {
            addCriterion("order_create_date >", value, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("order_create_date >=", value, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateLessThan(Date value) {
            addCriterion("order_create_date <", value, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("order_create_date <=", value, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateIn(List<Date> values) {
            addCriterion("order_create_date in", values, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateNotIn(List<Date> values) {
            addCriterion("order_create_date not in", values, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateBetween(Date value1, Date value2) {
            addCriterion("order_create_date between", value1, value2, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("order_create_date not between", value1, value2, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Date value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Date value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Date value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Date value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Date> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Date> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Date value1, Date value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andOutboundTimeIsNull() {
            addCriterion("outbound_time is null");
            return (Criteria) this;
        }

        public Criteria andOutboundTimeIsNotNull() {
            addCriterion("outbound_time is not null");
            return (Criteria) this;
        }

        public Criteria andOutboundTimeEqualTo(Date value) {
            addCriterion("outbound_time =", value, "outboundTime");
            return (Criteria) this;
        }

        public Criteria andOutboundTimeNotEqualTo(Date value) {
            addCriterion("outbound_time <>", value, "outboundTime");
            return (Criteria) this;
        }

        public Criteria andOutboundTimeGreaterThan(Date value) {
            addCriterion("outbound_time >", value, "outboundTime");
            return (Criteria) this;
        }

        public Criteria andOutboundTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("outbound_time >=", value, "outboundTime");
            return (Criteria) this;
        }

        public Criteria andOutboundTimeLessThan(Date value) {
            addCriterion("outbound_time <", value, "outboundTime");
            return (Criteria) this;
        }

        public Criteria andOutboundTimeLessThanOrEqualTo(Date value) {
            addCriterion("outbound_time <=", value, "outboundTime");
            return (Criteria) this;
        }

        public Criteria andOutboundTimeIn(List<Date> values) {
            addCriterion("outbound_time in", values, "outboundTime");
            return (Criteria) this;
        }

        public Criteria andOutboundTimeNotIn(List<Date> values) {
            addCriterion("outbound_time not in", values, "outboundTime");
            return (Criteria) this;
        }

        public Criteria andOutboundTimeBetween(Date value1, Date value2) {
            addCriterion("outbound_time between", value1, value2, "outboundTime");
            return (Criteria) this;
        }

        public Criteria andOutboundTimeNotBetween(Date value1, Date value2) {
            addCriterion("outbound_time not between", value1, value2, "outboundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIsNull() {
            addCriterion("refund_time is null");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIsNotNull() {
            addCriterion("refund_time is not null");
            return (Criteria) this;
        }

        public Criteria andRefundTimeEqualTo(Date value) {
            addCriterion("refund_time =", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotEqualTo(Date value) {
            addCriterion("refund_time <>", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeGreaterThan(Date value) {
            addCriterion("refund_time >", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("refund_time >=", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeLessThan(Date value) {
            addCriterion("refund_time <", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeLessThanOrEqualTo(Date value) {
            addCriterion("refund_time <=", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIn(List<Date> values) {
            addCriterion("refund_time in", values, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotIn(List<Date> values) {
            addCriterion("refund_time not in", values, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeBetween(Date value1, Date value2) {
            addCriterion("refund_time between", value1, value2, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotBetween(Date value1, Date value2) {
            addCriterion("refund_time not between", value1, value2, "refundTime");
            return (Criteria) this;
        }

        public Criteria andPayableStatusIsNull() {
            addCriterion("payable_status is null");
            return (Criteria) this;
        }

        public Criteria andPayableStatusIsNotNull() {
            addCriterion("payable_status is not null");
            return (Criteria) this;
        }

        public Criteria andPayableStatusEqualTo(String value) {
            addCriterion("payable_status =", value, "payableStatus");
            return (Criteria) this;
        }

        public Criteria andPayableStatusNotEqualTo(String value) {
            addCriterion("payable_status <>", value, "payableStatus");
            return (Criteria) this;
        }

        public Criteria andPayableStatusGreaterThan(String value) {
            addCriterion("payable_status >", value, "payableStatus");
            return (Criteria) this;
        }

        public Criteria andPayableStatusGreaterThanOrEqualTo(String value) {
            addCriterion("payable_status >=", value, "payableStatus");
            return (Criteria) this;
        }

        public Criteria andPayableStatusLessThan(String value) {
            addCriterion("payable_status <", value, "payableStatus");
            return (Criteria) this;
        }

        public Criteria andPayableStatusLessThanOrEqualTo(String value) {
            addCriterion("payable_status <=", value, "payableStatus");
            return (Criteria) this;
        }

        public Criteria andPayableStatusLike(String value) {
            addCriterion("payable_status like", value, "payableStatus");
            return (Criteria) this;
        }

        public Criteria andPayableStatusNotLike(String value) {
            addCriterion("payable_status not like", value, "payableStatus");
            return (Criteria) this;
        }

        public Criteria andPayableStatusIn(List<String> values) {
            addCriterion("payable_status in", values, "payableStatus");
            return (Criteria) this;
        }

        public Criteria andPayableStatusNotIn(List<String> values) {
            addCriterion("payable_status not in", values, "payableStatus");
            return (Criteria) this;
        }

        public Criteria andPayableStatusBetween(String value1, String value2) {
            addCriterion("payable_status between", value1, value2, "payableStatus");
            return (Criteria) this;
        }

        public Criteria andPayableStatusNotBetween(String value1, String value2) {
            addCriterion("payable_status not between", value1, value2, "payableStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIsNull() {
            addCriterion("refund_status is null");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIsNotNull() {
            addCriterion("refund_status is not null");
            return (Criteria) this;
        }

        public Criteria andRefundStatusEqualTo(String value) {
            addCriterion("refund_status =", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotEqualTo(String value) {
            addCriterion("refund_status <>", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThan(String value) {
            addCriterion("refund_status >", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThanOrEqualTo(String value) {
            addCriterion("refund_status >=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThan(String value) {
            addCriterion("refund_status <", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThanOrEqualTo(String value) {
            addCriterion("refund_status <=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLike(String value) {
            addCriterion("refund_status like", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotLike(String value) {
            addCriterion("refund_status not like", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIn(List<String> values) {
            addCriterion("refund_status in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotIn(List<String> values) {
            addCriterion("refund_status not in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusBetween(String value1, String value2) {
            addCriterion("refund_status between", value1, value2, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotBetween(String value1, String value2) {
            addCriterion("refund_status not between", value1, value2, "refundStatus");
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

        public Criteria andSkuBarCodeIsNull() {
            addCriterion("sku_bar_code is null");
            return (Criteria) this;
        }

        public Criteria andSkuBarCodeIsNotNull() {
            addCriterion("sku_bar_code is not null");
            return (Criteria) this;
        }

        public Criteria andSkuBarCodeEqualTo(String value) {
            addCriterion("sku_bar_code =", value, "skuBarCode");
            return (Criteria) this;
        }

        public Criteria andSkuBarCodeNotEqualTo(String value) {
            addCriterion("sku_bar_code <>", value, "skuBarCode");
            return (Criteria) this;
        }

        public Criteria andSkuBarCodeGreaterThan(String value) {
            addCriterion("sku_bar_code >", value, "skuBarCode");
            return (Criteria) this;
        }

        public Criteria andSkuBarCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sku_bar_code >=", value, "skuBarCode");
            return (Criteria) this;
        }

        public Criteria andSkuBarCodeLessThan(String value) {
            addCriterion("sku_bar_code <", value, "skuBarCode");
            return (Criteria) this;
        }

        public Criteria andSkuBarCodeLessThanOrEqualTo(String value) {
            addCriterion("sku_bar_code <=", value, "skuBarCode");
            return (Criteria) this;
        }

        public Criteria andSkuBarCodeLike(String value) {
            addCriterion("sku_bar_code like", value, "skuBarCode");
            return (Criteria) this;
        }

        public Criteria andSkuBarCodeNotLike(String value) {
            addCriterion("sku_bar_code not like", value, "skuBarCode");
            return (Criteria) this;
        }

        public Criteria andSkuBarCodeIn(List<String> values) {
            addCriterion("sku_bar_code in", values, "skuBarCode");
            return (Criteria) this;
        }

        public Criteria andSkuBarCodeNotIn(List<String> values) {
            addCriterion("sku_bar_code not in", values, "skuBarCode");
            return (Criteria) this;
        }

        public Criteria andSkuBarCodeBetween(String value1, String value2) {
            addCriterion("sku_bar_code between", value1, value2, "skuBarCode");
            return (Criteria) this;
        }

        public Criteria andSkuBarCodeNotBetween(String value1, String value2) {
            addCriterion("sku_bar_code not between", value1, value2, "skuBarCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeIsNull() {
            addCriterion("sku_code is null");
            return (Criteria) this;
        }

        public Criteria andSkuCodeIsNotNull() {
            addCriterion("sku_code is not null");
            return (Criteria) this;
        }

        public Criteria andSkuCodeEqualTo(String value) {
            addCriterion("sku_code =", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeNotEqualTo(String value) {
            addCriterion("sku_code <>", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeGreaterThan(String value) {
            addCriterion("sku_code >", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sku_code >=", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeLessThan(String value) {
            addCriterion("sku_code <", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeLessThanOrEqualTo(String value) {
            addCriterion("sku_code <=", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeLike(String value) {
            addCriterion("sku_code like", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeNotLike(String value) {
            addCriterion("sku_code not like", value, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeIn(List<String> values) {
            addCriterion("sku_code in", values, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeNotIn(List<String> values) {
            addCriterion("sku_code not in", values, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeBetween(String value1, String value2) {
            addCriterion("sku_code between", value1, value2, "skuCode");
            return (Criteria) this;
        }

        public Criteria andSkuCodeNotBetween(String value1, String value2) {
            addCriterion("sku_code not between", value1, value2, "skuCode");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIsNull() {
            addCriterion("commodity_name is null");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIsNotNull() {
            addCriterion("commodity_name is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityNameEqualTo(String value) {
            addCriterion("commodity_name =", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotEqualTo(String value) {
            addCriterion("commodity_name <>", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameGreaterThan(String value) {
            addCriterion("commodity_name >", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_name >=", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLessThan(String value) {
            addCriterion("commodity_name <", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLessThanOrEqualTo(String value) {
            addCriterion("commodity_name <=", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLike(String value) {
            addCriterion("commodity_name like", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotLike(String value) {
            addCriterion("commodity_name not like", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIn(List<String> values) {
            addCriterion("commodity_name in", values, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotIn(List<String> values) {
            addCriterion("commodity_name not in", values, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameBetween(String value1, String value2) {
            addCriterion("commodity_name between", value1, value2, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotBetween(String value1, String value2) {
            addCriterion("commodity_name not between", value1, value2, "commodityName");
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

        public Criteria andBuyNumIsNull() {
            addCriterion("buy_num is null");
            return (Criteria) this;
        }

        public Criteria andBuyNumIsNotNull() {
            addCriterion("buy_num is not null");
            return (Criteria) this;
        }

        public Criteria andBuyNumEqualTo(Integer value) {
            addCriterion("buy_num =", value, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumNotEqualTo(Integer value) {
            addCriterion("buy_num <>", value, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumGreaterThan(Integer value) {
            addCriterion("buy_num >", value, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("buy_num >=", value, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumLessThan(Integer value) {
            addCriterion("buy_num <", value, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumLessThanOrEqualTo(Integer value) {
            addCriterion("buy_num <=", value, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumIn(List<Integer> values) {
            addCriterion("buy_num in", values, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumNotIn(List<Integer> values) {
            addCriterion("buy_num not in", values, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumBetween(Integer value1, Integer value2) {
            addCriterion("buy_num between", value1, value2, "buyNum");
            return (Criteria) this;
        }

        public Criteria andBuyNumNotBetween(Integer value1, Integer value2) {
            addCriterion("buy_num not between", value1, value2, "buyNum");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceIsNull() {
            addCriterion("commodity_price is null");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceIsNotNull() {
            addCriterion("commodity_price is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceEqualTo(BigDecimal value) {
            addCriterion("commodity_price =", value, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceNotEqualTo(BigDecimal value) {
            addCriterion("commodity_price <>", value, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceGreaterThan(BigDecimal value) {
            addCriterion("commodity_price >", value, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("commodity_price >=", value, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceLessThan(BigDecimal value) {
            addCriterion("commodity_price <", value, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("commodity_price <=", value, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceIn(List<BigDecimal> values) {
            addCriterion("commodity_price in", values, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceNotIn(List<BigDecimal> values) {
            addCriterion("commodity_price not in", values, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commodity_price between", value1, value2, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commodity_price not between", value1, value2, "commodityPrice");
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

        public Criteria andSupplyIsNull() {
            addCriterion("supply is null");
            return (Criteria) this;
        }

        public Criteria andSupplyIsNotNull() {
            addCriterion("supply is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyEqualTo(BigDecimal value) {
            addCriterion("supply =", value, "supply");
            return (Criteria) this;
        }

        public Criteria andSupplyNotEqualTo(BigDecimal value) {
            addCriterion("supply <>", value, "supply");
            return (Criteria) this;
        }

        public Criteria andSupplyGreaterThan(BigDecimal value) {
            addCriterion("supply >", value, "supply");
            return (Criteria) this;
        }

        public Criteria andSupplyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("supply >=", value, "supply");
            return (Criteria) this;
        }

        public Criteria andSupplyLessThan(BigDecimal value) {
            addCriterion("supply <", value, "supply");
            return (Criteria) this;
        }

        public Criteria andSupplyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("supply <=", value, "supply");
            return (Criteria) this;
        }

        public Criteria andSupplyIn(List<BigDecimal> values) {
            addCriterion("supply in", values, "supply");
            return (Criteria) this;
        }

        public Criteria andSupplyNotIn(List<BigDecimal> values) {
            addCriterion("supply not in", values, "supply");
            return (Criteria) this;
        }

        public Criteria andSupplyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("supply between", value1, value2, "supply");
            return (Criteria) this;
        }

        public Criteria andSupplyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("supply not between", value1, value2, "supply");
            return (Criteria) this;
        }

        public Criteria andSupplyAmountIsNull() {
            addCriterion("supply_amount is null");
            return (Criteria) this;
        }

        public Criteria andSupplyAmountIsNotNull() {
            addCriterion("supply_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyAmountEqualTo(BigDecimal value) {
            addCriterion("supply_amount =", value, "supplyAmount");
            return (Criteria) this;
        }

        public Criteria andSupplyAmountNotEqualTo(BigDecimal value) {
            addCriterion("supply_amount <>", value, "supplyAmount");
            return (Criteria) this;
        }

        public Criteria andSupplyAmountGreaterThan(BigDecimal value) {
            addCriterion("supply_amount >", value, "supplyAmount");
            return (Criteria) this;
        }

        public Criteria andSupplyAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("supply_amount >=", value, "supplyAmount");
            return (Criteria) this;
        }

        public Criteria andSupplyAmountLessThan(BigDecimal value) {
            addCriterion("supply_amount <", value, "supplyAmount");
            return (Criteria) this;
        }

        public Criteria andSupplyAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("supply_amount <=", value, "supplyAmount");
            return (Criteria) this;
        }

        public Criteria andSupplyAmountIn(List<BigDecimal> values) {
            addCriterion("supply_amount in", values, "supplyAmount");
            return (Criteria) this;
        }

        public Criteria andSupplyAmountNotIn(List<BigDecimal> values) {
            addCriterion("supply_amount not in", values, "supplyAmount");
            return (Criteria) this;
        }

        public Criteria andSupplyAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("supply_amount between", value1, value2, "supplyAmount");
            return (Criteria) this;
        }

        public Criteria andSupplyAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("supply_amount not between", value1, value2, "supplyAmount");
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

        public Criteria andPointsAmountIsNull() {
            addCriterion("points_amount is null");
            return (Criteria) this;
        }

        public Criteria andPointsAmountIsNotNull() {
            addCriterion("points_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPointsAmountEqualTo(BigDecimal value) {
            addCriterion("points_amount =", value, "pointsAmount");
            return (Criteria) this;
        }

        public Criteria andPointsAmountNotEqualTo(BigDecimal value) {
            addCriterion("points_amount <>", value, "pointsAmount");
            return (Criteria) this;
        }

        public Criteria andPointsAmountGreaterThan(BigDecimal value) {
            addCriterion("points_amount >", value, "pointsAmount");
            return (Criteria) this;
        }

        public Criteria andPointsAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("points_amount >=", value, "pointsAmount");
            return (Criteria) this;
        }

        public Criteria andPointsAmountLessThan(BigDecimal value) {
            addCriterion("points_amount <", value, "pointsAmount");
            return (Criteria) this;
        }

        public Criteria andPointsAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("points_amount <=", value, "pointsAmount");
            return (Criteria) this;
        }

        public Criteria andPointsAmountIn(List<BigDecimal> values) {
            addCriterion("points_amount in", values, "pointsAmount");
            return (Criteria) this;
        }

        public Criteria andPointsAmountNotIn(List<BigDecimal> values) {
            addCriterion("points_amount not in", values, "pointsAmount");
            return (Criteria) this;
        }

        public Criteria andPointsAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("points_amount between", value1, value2, "pointsAmount");
            return (Criteria) this;
        }

        public Criteria andPointsAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("points_amount not between", value1, value2, "pointsAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountIsNull() {
            addCriterion("payable_amount is null");
            return (Criteria) this;
        }

        public Criteria andPayableAmountIsNotNull() {
            addCriterion("payable_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPayableAmountEqualTo(BigDecimal value) {
            addCriterion("payable_amount =", value, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountNotEqualTo(BigDecimal value) {
            addCriterion("payable_amount <>", value, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountGreaterThan(BigDecimal value) {
            addCriterion("payable_amount >", value, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("payable_amount >=", value, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountLessThan(BigDecimal value) {
            addCriterion("payable_amount <", value, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("payable_amount <=", value, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountIn(List<BigDecimal> values) {
            addCriterion("payable_amount in", values, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountNotIn(List<BigDecimal> values) {
            addCriterion("payable_amount not in", values, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payable_amount between", value1, value2, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payable_amount not between", value1, value2, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableObtainAmountIsNull() {
            addCriterion("payable_obtain_amount is null");
            return (Criteria) this;
        }

        public Criteria andPayableObtainAmountIsNotNull() {
            addCriterion("payable_obtain_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPayableObtainAmountEqualTo(BigDecimal value) {
            addCriterion("payable_obtain_amount =", value, "payableObtainAmount");
            return (Criteria) this;
        }

        public Criteria andPayableObtainAmountNotEqualTo(BigDecimal value) {
            addCriterion("payable_obtain_amount <>", value, "payableObtainAmount");
            return (Criteria) this;
        }

        public Criteria andPayableObtainAmountGreaterThan(BigDecimal value) {
            addCriterion("payable_obtain_amount >", value, "payableObtainAmount");
            return (Criteria) this;
        }

        public Criteria andPayableObtainAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("payable_obtain_amount >=", value, "payableObtainAmount");
            return (Criteria) this;
        }

        public Criteria andPayableObtainAmountLessThan(BigDecimal value) {
            addCriterion("payable_obtain_amount <", value, "payableObtainAmount");
            return (Criteria) this;
        }

        public Criteria andPayableObtainAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("payable_obtain_amount <=", value, "payableObtainAmount");
            return (Criteria) this;
        }

        public Criteria andPayableObtainAmountIn(List<BigDecimal> values) {
            addCriterion("payable_obtain_amount in", values, "payableObtainAmount");
            return (Criteria) this;
        }

        public Criteria andPayableObtainAmountNotIn(List<BigDecimal> values) {
            addCriterion("payable_obtain_amount not in", values, "payableObtainAmount");
            return (Criteria) this;
        }

        public Criteria andPayableObtainAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payable_obtain_amount between", value1, value2, "payableObtainAmount");
            return (Criteria) this;
        }

        public Criteria andPayableObtainAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payable_obtain_amount not between", value1, value2, "payableObtainAmount");
            return (Criteria) this;
        }

        public Criteria andRefundableAmountIsNull() {
            addCriterion("refundable_amount is null");
            return (Criteria) this;
        }

        public Criteria andRefundableAmountIsNotNull() {
            addCriterion("refundable_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRefundableAmountEqualTo(BigDecimal value) {
            addCriterion("refundable_amount =", value, "refundableAmount");
            return (Criteria) this;
        }

        public Criteria andRefundableAmountNotEqualTo(BigDecimal value) {
            addCriterion("refundable_amount <>", value, "refundableAmount");
            return (Criteria) this;
        }

        public Criteria andRefundableAmountGreaterThan(BigDecimal value) {
            addCriterion("refundable_amount >", value, "refundableAmount");
            return (Criteria) this;
        }

        public Criteria andRefundableAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("refundable_amount >=", value, "refundableAmount");
            return (Criteria) this;
        }

        public Criteria andRefundableAmountLessThan(BigDecimal value) {
            addCriterion("refundable_amount <", value, "refundableAmount");
            return (Criteria) this;
        }

        public Criteria andRefundableAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("refundable_amount <=", value, "refundableAmount");
            return (Criteria) this;
        }

        public Criteria andRefundableAmountIn(List<BigDecimal> values) {
            addCriterion("refundable_amount in", values, "refundableAmount");
            return (Criteria) this;
        }

        public Criteria andRefundableAmountNotIn(List<BigDecimal> values) {
            addCriterion("refundable_amount not in", values, "refundableAmount");
            return (Criteria) this;
        }

        public Criteria andRefundableAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refundable_amount between", value1, value2, "refundableAmount");
            return (Criteria) this;
        }

        public Criteria andRefundableAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refundable_amount not between", value1, value2, "refundableAmount");
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

        public Criteria andVendorEffectDateIsNull() {
            addCriterion("vendor_effect_date is null");
            return (Criteria) this;
        }

        public Criteria andVendorEffectDateIsNotNull() {
            addCriterion("vendor_effect_date is not null");
            return (Criteria) this;
        }

        public Criteria andVendorEffectDateEqualTo(Date value) {
            addCriterion("vendor_effect_date =", value, "vendorEffectDate");
            return (Criteria) this;
        }

        public Criteria andVendorEffectDateNotEqualTo(Date value) {
            addCriterion("vendor_effect_date <>", value, "vendorEffectDate");
            return (Criteria) this;
        }

        public Criteria andVendorEffectDateGreaterThan(Date value) {
            addCriterion("vendor_effect_date >", value, "vendorEffectDate");
            return (Criteria) this;
        }

        public Criteria andVendorEffectDateGreaterThanOrEqualTo(Date value) {
            addCriterion("vendor_effect_date >=", value, "vendorEffectDate");
            return (Criteria) this;
        }

        public Criteria andVendorEffectDateLessThan(Date value) {
            addCriterion("vendor_effect_date <", value, "vendorEffectDate");
            return (Criteria) this;
        }

        public Criteria andVendorEffectDateLessThanOrEqualTo(Date value) {
            addCriterion("vendor_effect_date <=", value, "vendorEffectDate");
            return (Criteria) this;
        }

        public Criteria andVendorEffectDateIn(List<Date> values) {
            addCriterion("vendor_effect_date in", values, "vendorEffectDate");
            return (Criteria) this;
        }

        public Criteria andVendorEffectDateNotIn(List<Date> values) {
            addCriterion("vendor_effect_date not in", values, "vendorEffectDate");
            return (Criteria) this;
        }

        public Criteria andVendorEffectDateBetween(Date value1, Date value2) {
            addCriterion("vendor_effect_date between", value1, value2, "vendorEffectDate");
            return (Criteria) this;
        }

        public Criteria andVendorEffectDateNotBetween(Date value1, Date value2) {
            addCriterion("vendor_effect_date not between", value1, value2, "vendorEffectDate");
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

        public Criteria andPurchaseTypeEffectDateIsNull() {
            addCriterion("purchase_type_effect_date is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeEffectDateIsNotNull() {
            addCriterion("purchase_type_effect_date is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeEffectDateEqualTo(Date value) {
            addCriterion("purchase_type_effect_date =", value, "purchaseTypeEffectDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeEffectDateNotEqualTo(Date value) {
            addCriterion("purchase_type_effect_date <>", value, "purchaseTypeEffectDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeEffectDateGreaterThan(Date value) {
            addCriterion("purchase_type_effect_date >", value, "purchaseTypeEffectDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeEffectDateGreaterThanOrEqualTo(Date value) {
            addCriterion("purchase_type_effect_date >=", value, "purchaseTypeEffectDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeEffectDateLessThan(Date value) {
            addCriterion("purchase_type_effect_date <", value, "purchaseTypeEffectDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeEffectDateLessThanOrEqualTo(Date value) {
            addCriterion("purchase_type_effect_date <=", value, "purchaseTypeEffectDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeEffectDateIn(List<Date> values) {
            addCriterion("purchase_type_effect_date in", values, "purchaseTypeEffectDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeEffectDateNotIn(List<Date> values) {
            addCriterion("purchase_type_effect_date not in", values, "purchaseTypeEffectDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeEffectDateBetween(Date value1, Date value2) {
            addCriterion("purchase_type_effect_date between", value1, value2, "purchaseTypeEffectDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeEffectDateNotBetween(Date value1, Date value2) {
            addCriterion("purchase_type_effect_date not between", value1, value2, "purchaseTypeEffectDate");
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

        public Criteria andSettlementPatternEffectDateIsNull() {
            addCriterion("settlement_pattern_effect_date is null");
            return (Criteria) this;
        }

        public Criteria andSettlementPatternEffectDateIsNotNull() {
            addCriterion("settlement_pattern_effect_date is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementPatternEffectDateEqualTo(Date value) {
            addCriterion("settlement_pattern_effect_date =", value, "settlementPatternEffectDate");
            return (Criteria) this;
        }

        public Criteria andSettlementPatternEffectDateNotEqualTo(Date value) {
            addCriterion("settlement_pattern_effect_date <>", value, "settlementPatternEffectDate");
            return (Criteria) this;
        }

        public Criteria andSettlementPatternEffectDateGreaterThan(Date value) {
            addCriterion("settlement_pattern_effect_date >", value, "settlementPatternEffectDate");
            return (Criteria) this;
        }

        public Criteria andSettlementPatternEffectDateGreaterThanOrEqualTo(Date value) {
            addCriterion("settlement_pattern_effect_date >=", value, "settlementPatternEffectDate");
            return (Criteria) this;
        }

        public Criteria andSettlementPatternEffectDateLessThan(Date value) {
            addCriterion("settlement_pattern_effect_date <", value, "settlementPatternEffectDate");
            return (Criteria) this;
        }

        public Criteria andSettlementPatternEffectDateLessThanOrEqualTo(Date value) {
            addCriterion("settlement_pattern_effect_date <=", value, "settlementPatternEffectDate");
            return (Criteria) this;
        }

        public Criteria andSettlementPatternEffectDateIn(List<Date> values) {
            addCriterion("settlement_pattern_effect_date in", values, "settlementPatternEffectDate");
            return (Criteria) this;
        }

        public Criteria andSettlementPatternEffectDateNotIn(List<Date> values) {
            addCriterion("settlement_pattern_effect_date not in", values, "settlementPatternEffectDate");
            return (Criteria) this;
        }

        public Criteria andSettlementPatternEffectDateBetween(Date value1, Date value2) {
            addCriterion("settlement_pattern_effect_date between", value1, value2, "settlementPatternEffectDate");
            return (Criteria) this;
        }

        public Criteria andSettlementPatternEffectDateNotBetween(Date value1, Date value2) {
            addCriterion("settlement_pattern_effect_date not between", value1, value2, "settlementPatternEffectDate");
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