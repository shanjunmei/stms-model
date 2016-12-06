package com.ffzx.stms.model;

import com.ffzx.orm.common.GenericExample.GeneratedCriteria;
import com.ffzx.orm.common.GenericExample;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SettlePaymentLogExample extends GenericExample<SettlePaymentLogExample.Criteria> {

    public SettlePaymentLogExample() {
        oredCriteria = new ArrayList<SettlePaymentLogExample.Criteria>();
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

        public Criteria andSettleNoIsNull() {
            addCriterion("settle_no is null");
            return (Criteria) this;
        }

        public Criteria andSettleNoIsNotNull() {
            addCriterion("settle_no is not null");
            return (Criteria) this;
        }

        public Criteria andSettleNoEqualTo(String value) {
            addCriterion("settle_no =", value, "settleNo");
            return (Criteria) this;
        }

        public Criteria andSettleNoNotEqualTo(String value) {
            addCriterion("settle_no <>", value, "settleNo");
            return (Criteria) this;
        }

        public Criteria andSettleNoGreaterThan(String value) {
            addCriterion("settle_no >", value, "settleNo");
            return (Criteria) this;
        }

        public Criteria andSettleNoGreaterThanOrEqualTo(String value) {
            addCriterion("settle_no >=", value, "settleNo");
            return (Criteria) this;
        }

        public Criteria andSettleNoLessThan(String value) {
            addCriterion("settle_no <", value, "settleNo");
            return (Criteria) this;
        }

        public Criteria andSettleNoLessThanOrEqualTo(String value) {
            addCriterion("settle_no <=", value, "settleNo");
            return (Criteria) this;
        }

        public Criteria andSettleNoLike(String value) {
            addCriterion("settle_no like", value, "settleNo");
            return (Criteria) this;
        }

        public Criteria andSettleNoNotLike(String value) {
            addCriterion("settle_no not like", value, "settleNo");
            return (Criteria) this;
        }

        public Criteria andSettleNoIn(List<String> values) {
            addCriterion("settle_no in", values, "settleNo");
            return (Criteria) this;
        }

        public Criteria andSettleNoNotIn(List<String> values) {
            addCriterion("settle_no not in", values, "settleNo");
            return (Criteria) this;
        }

        public Criteria andSettleNoBetween(String value1, String value2) {
            addCriterion("settle_no between", value1, value2, "settleNo");
            return (Criteria) this;
        }

        public Criteria andSettleNoNotBetween(String value1, String value2) {
            addCriterion("settle_no not between", value1, value2, "settleNo");
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

        public Criteria andPayUserIdIsNull() {
            addCriterion("pay_user_id is null");
            return (Criteria) this;
        }

        public Criteria andPayUserIdIsNotNull() {
            addCriterion("pay_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayUserIdEqualTo(String value) {
            addCriterion("pay_user_id =", value, "payUserId");
            return (Criteria) this;
        }

        public Criteria andPayUserIdNotEqualTo(String value) {
            addCriterion("pay_user_id <>", value, "payUserId");
            return (Criteria) this;
        }

        public Criteria andPayUserIdGreaterThan(String value) {
            addCriterion("pay_user_id >", value, "payUserId");
            return (Criteria) this;
        }

        public Criteria andPayUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("pay_user_id >=", value, "payUserId");
            return (Criteria) this;
        }

        public Criteria andPayUserIdLessThan(String value) {
            addCriterion("pay_user_id <", value, "payUserId");
            return (Criteria) this;
        }

        public Criteria andPayUserIdLessThanOrEqualTo(String value) {
            addCriterion("pay_user_id <=", value, "payUserId");
            return (Criteria) this;
        }

        public Criteria andPayUserIdLike(String value) {
            addCriterion("pay_user_id like", value, "payUserId");
            return (Criteria) this;
        }

        public Criteria andPayUserIdNotLike(String value) {
            addCriterion("pay_user_id not like", value, "payUserId");
            return (Criteria) this;
        }

        public Criteria andPayUserIdIn(List<String> values) {
            addCriterion("pay_user_id in", values, "payUserId");
            return (Criteria) this;
        }

        public Criteria andPayUserIdNotIn(List<String> values) {
            addCriterion("pay_user_id not in", values, "payUserId");
            return (Criteria) this;
        }

        public Criteria andPayUserIdBetween(String value1, String value2) {
            addCriterion("pay_user_id between", value1, value2, "payUserId");
            return (Criteria) this;
        }

        public Criteria andPayUserIdNotBetween(String value1, String value2) {
            addCriterion("pay_user_id not between", value1, value2, "payUserId");
            return (Criteria) this;
        }

        public Criteria andPayUserNameIsNull() {
            addCriterion("pay_user_name is null");
            return (Criteria) this;
        }

        public Criteria andPayUserNameIsNotNull() {
            addCriterion("pay_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andPayUserNameEqualTo(String value) {
            addCriterion("pay_user_name =", value, "payUserName");
            return (Criteria) this;
        }

        public Criteria andPayUserNameNotEqualTo(String value) {
            addCriterion("pay_user_name <>", value, "payUserName");
            return (Criteria) this;
        }

        public Criteria andPayUserNameGreaterThan(String value) {
            addCriterion("pay_user_name >", value, "payUserName");
            return (Criteria) this;
        }

        public Criteria andPayUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("pay_user_name >=", value, "payUserName");
            return (Criteria) this;
        }

        public Criteria andPayUserNameLessThan(String value) {
            addCriterion("pay_user_name <", value, "payUserName");
            return (Criteria) this;
        }

        public Criteria andPayUserNameLessThanOrEqualTo(String value) {
            addCriterion("pay_user_name <=", value, "payUserName");
            return (Criteria) this;
        }

        public Criteria andPayUserNameLike(String value) {
            addCriterion("pay_user_name like", value, "payUserName");
            return (Criteria) this;
        }

        public Criteria andPayUserNameNotLike(String value) {
            addCriterion("pay_user_name not like", value, "payUserName");
            return (Criteria) this;
        }

        public Criteria andPayUserNameIn(List<String> values) {
            addCriterion("pay_user_name in", values, "payUserName");
            return (Criteria) this;
        }

        public Criteria andPayUserNameNotIn(List<String> values) {
            addCriterion("pay_user_name not in", values, "payUserName");
            return (Criteria) this;
        }

        public Criteria andPayUserNameBetween(String value1, String value2) {
            addCriterion("pay_user_name between", value1, value2, "payUserName");
            return (Criteria) this;
        }

        public Criteria andPayUserNameNotBetween(String value1, String value2) {
            addCriterion("pay_user_name not between", value1, value2, "payUserName");
            return (Criteria) this;
        }

        public Criteria andPayAmountIsNull() {
            addCriterion("pay_amount is null");
            return (Criteria) this;
        }

        public Criteria andPayAmountIsNotNull() {
            addCriterion("pay_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPayAmountEqualTo(BigDecimal value) {
            addCriterion("pay_amount =", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotEqualTo(BigDecimal value) {
            addCriterion("pay_amount <>", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThan(BigDecimal value) {
            addCriterion("pay_amount >", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_amount >=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThan(BigDecimal value) {
            addCriterion("pay_amount <", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_amount <=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountIn(List<BigDecimal> values) {
            addCriterion("pay_amount in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotIn(List<BigDecimal> values) {
            addCriterion("pay_amount not in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_amount between", value1, value2, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_amount not between", value1, value2, "payAmount");
            return (Criteria) this;
        }

        public Criteria andCumulativePayAmountIsNull() {
            addCriterion("cumulative_pay_amount is null");
            return (Criteria) this;
        }

        public Criteria andCumulativePayAmountIsNotNull() {
            addCriterion("cumulative_pay_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCumulativePayAmountEqualTo(BigDecimal value) {
            addCriterion("cumulative_pay_amount =", value, "cumulativePayAmount");
            return (Criteria) this;
        }

        public Criteria andCumulativePayAmountNotEqualTo(BigDecimal value) {
            addCriterion("cumulative_pay_amount <>", value, "cumulativePayAmount");
            return (Criteria) this;
        }

        public Criteria andCumulativePayAmountGreaterThan(BigDecimal value) {
            addCriterion("cumulative_pay_amount >", value, "cumulativePayAmount");
            return (Criteria) this;
        }

        public Criteria andCumulativePayAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cumulative_pay_amount >=", value, "cumulativePayAmount");
            return (Criteria) this;
        }

        public Criteria andCumulativePayAmountLessThan(BigDecimal value) {
            addCriterion("cumulative_pay_amount <", value, "cumulativePayAmount");
            return (Criteria) this;
        }

        public Criteria andCumulativePayAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cumulative_pay_amount <=", value, "cumulativePayAmount");
            return (Criteria) this;
        }

        public Criteria andCumulativePayAmountIn(List<BigDecimal> values) {
            addCriterion("cumulative_pay_amount in", values, "cumulativePayAmount");
            return (Criteria) this;
        }

        public Criteria andCumulativePayAmountNotIn(List<BigDecimal> values) {
            addCriterion("cumulative_pay_amount not in", values, "cumulativePayAmount");
            return (Criteria) this;
        }

        public Criteria andCumulativePayAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cumulative_pay_amount between", value1, value2, "cumulativePayAmount");
            return (Criteria) this;
        }

        public Criteria andCumulativePayAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cumulative_pay_amount not between", value1, value2, "cumulativePayAmount");
            return (Criteria) this;
        }

        public Criteria andRemainAmountIsNull() {
            addCriterion("remain_amount is null");
            return (Criteria) this;
        }

        public Criteria andRemainAmountIsNotNull() {
            addCriterion("remain_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRemainAmountEqualTo(BigDecimal value) {
            addCriterion("remain_amount =", value, "remainAmount");
            return (Criteria) this;
        }

        public Criteria andRemainAmountNotEqualTo(BigDecimal value) {
            addCriterion("remain_amount <>", value, "remainAmount");
            return (Criteria) this;
        }

        public Criteria andRemainAmountGreaterThan(BigDecimal value) {
            addCriterion("remain_amount >", value, "remainAmount");
            return (Criteria) this;
        }

        public Criteria andRemainAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("remain_amount >=", value, "remainAmount");
            return (Criteria) this;
        }

        public Criteria andRemainAmountLessThan(BigDecimal value) {
            addCriterion("remain_amount <", value, "remainAmount");
            return (Criteria) this;
        }

        public Criteria andRemainAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("remain_amount <=", value, "remainAmount");
            return (Criteria) this;
        }

        public Criteria andRemainAmountIn(List<BigDecimal> values) {
            addCriterion("remain_amount in", values, "remainAmount");
            return (Criteria) this;
        }

        public Criteria andRemainAmountNotIn(List<BigDecimal> values) {
            addCriterion("remain_amount not in", values, "remainAmount");
            return (Criteria) this;
        }

        public Criteria andRemainAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("remain_amount between", value1, value2, "remainAmount");
            return (Criteria) this;
        }

        public Criteria andRemainAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("remain_amount not between", value1, value2, "remainAmount");
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