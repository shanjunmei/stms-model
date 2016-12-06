package com.ffzx.stms.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "settle_payment_log")
public class SettlePaymentLog {
    @Id
    private String id;

    /**
     * 结款单号
     */
    @Column(name = "settle_no")
    private String settleNo;

    /**
     * 付款时间
     */
    @Column(name = "pay_time")
    private Date payTime;

    /**
     * 付款人id
     */
    @Column(name = "pay_user_id")
    private String payUserId;

    /**
     * 付款人名字
     */
    @Column(name = "pay_user_name")
    private String payUserName;

    /**
     * 付款金额
     */
    @Column(name = "pay_amount")
    private BigDecimal payAmount;

    /**
     * 当期累计付款金额
     */
    @Column(name = "cumulative_pay_amount")
    private BigDecimal cumulativePayAmount;

    /**
     * 当期剩余付款金额
     */
    @Column(name = "remain_amount")
    private BigDecimal remainAmount;

    /**
     * 创建人
     */
    @Column(name = "create_by")
    private String createBy;

    /**
     * 创建时间
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 最后修改人
     */
    @Column(name = "last_update_by")
    private String lastUpdateBy;

    /**
     * 最后修改时间
     */
    @Column(name = "last_update_date")
    private Date lastUpdateDate;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取结款单号
     *
     * @return settle_no - 结款单号
     */
    public String getSettleNo() {
        return settleNo;
    }

    /**
     * 设置结款单号
     *
     * @param settleNo 结款单号
     */
    public void setSettleNo(String settleNo) {
        this.settleNo = settleNo == null ? null : settleNo.trim();
    }

    /**
     * 获取付款时间
     *
     * @return pay_time - 付款时间
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 设置付款时间
     *
     * @param payTime 付款时间
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * 获取付款人id
     *
     * @return pay_user_id - 付款人id
     */
    public String getPayUserId() {
        return payUserId;
    }

    /**
     * 设置付款人id
     *
     * @param payUserId 付款人id
     */
    public void setPayUserId(String payUserId) {
        this.payUserId = payUserId == null ? null : payUserId.trim();
    }

    /**
     * 获取付款人名字
     *
     * @return pay_user_name - 付款人名字
     */
    public String getPayUserName() {
        return payUserName;
    }

    /**
     * 设置付款人名字
     *
     * @param payUserName 付款人名字
     */
    public void setPayUserName(String payUserName) {
        this.payUserName = payUserName == null ? null : payUserName.trim();
    }

    /**
     * 获取付款金额
     *
     * @return pay_amount - 付款金额
     */
    public BigDecimal getPayAmount() {
        return payAmount;
    }

    /**
     * 设置付款金额
     *
     * @param payAmount 付款金额
     */
    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    /**
     * 获取当期累计付款金额
     *
     * @return cumulative_pay_amount - 当期累计付款金额
     */
    public BigDecimal getCumulativePayAmount() {
        return cumulativePayAmount;
    }

    /**
     * 设置当期累计付款金额
     *
     * @param cumulativePayAmount 当期累计付款金额
     */
    public void setCumulativePayAmount(BigDecimal cumulativePayAmount) {
        this.cumulativePayAmount = cumulativePayAmount;
    }

    /**
     * 获取当期剩余付款金额
     *
     * @return remain_amount - 当期剩余付款金额
     */
    public BigDecimal getRemainAmount() {
        return remainAmount;
    }

    /**
     * 设置当期剩余付款金额
     *
     * @param remainAmount 当期剩余付款金额
     */
    public void setRemainAmount(BigDecimal remainAmount) {
        this.remainAmount = remainAmount;
    }

    /**
     * 获取创建人
     *
     * @return create_by - 创建人
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建人
     *
     * @param createBy 创建人
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * 获取创建时间
     *
     * @return create_date - 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建时间
     *
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取最后修改人
     *
     * @return last_update_by - 最后修改人
     */
    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    /**
     * 设置最后修改人
     *
     * @param lastUpdateBy 最后修改人
     */
    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy == null ? null : lastUpdateBy.trim();
    }

    /**
     * 获取最后修改时间
     *
     * @return last_update_date - 最后修改时间
     */
    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * 设置最后修改时间
     *
     * @param lastUpdateDate 最后修改时间
     */
    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }
}