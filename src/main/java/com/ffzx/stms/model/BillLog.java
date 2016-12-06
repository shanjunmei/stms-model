package com.ffzx.stms.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "bill_log")
public class BillLog {
    /**
     * 主键
     */
    @Id
    private String id;

    /**
     * 账单明细id
     */
    @Column(name = "bill_detail_id")
    private String billDetailId;

    /**
     * 账单号
     */
    @Column(name = "bill_no")
    private String billNo;

    /**
     * 商品总价
     */
    @Column(name = "commodity_price_total")
    private BigDecimal commodityPriceTotal;

    /**
     * 原应付金额
     */
    @Column(name = "payable_amount_before")
    private BigDecimal payableAmountBefore;

    /**
     * 修改后应付金额
     */
    @Column(name = "payable_amount_after")
    private BigDecimal payableAmountAfter;

    /**
     * 原供货价
     */
    @Column(name = "supply_before")
    private BigDecimal supplyBefore;

    /**
     * 修改后供货价
     */
    @Column(name = "supply_after")
    private BigDecimal supplyAfter;

    /**
     * 原扣点
     */
    @Column(name = "points_before")
    private BigDecimal pointsBefore;

    /**
     * 修改后扣点
     */
    @Column(name = "points_after")
    private BigDecimal pointsAfter;

    /**
     * 原退款金额
     */
    @Column(name = "refundable_amount_before")
    private BigDecimal refundableAmountBefore;

    /**
     * 修改后退款金额
     */
    @Column(name = "refundable_amount_after")
    private BigDecimal refundableAmountAfter;

    /**
     * 创建者
     */
    @Column(name = "create_by")
    private String createBy;

    /**
     * 创建日期
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 更新者
     */
    @Column(name = "last_update_by")
    private String lastUpdateBy;

    /**
     * 更新日期
     */
    @Column(name = "last_update_date")
    private Date lastUpdateDate;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取账单明细id
     *
     * @return bill_detail_id - 账单明细id
     */
    public String getBillDetailId() {
        return billDetailId;
    }

    /**
     * 设置账单明细id
     *
     * @param billDetailId 账单明细id
     */
    public void setBillDetailId(String billDetailId) {
        this.billDetailId = billDetailId == null ? null : billDetailId.trim();
    }

    /**
     * 获取账单号
     *
     * @return bill_no - 账单号
     */
    public String getBillNo() {
        return billNo;
    }

    /**
     * 设置账单号
     *
     * @param billNo 账单号
     */
    public void setBillNo(String billNo) {
        this.billNo = billNo == null ? null : billNo.trim();
    }

    /**
     * 获取商品总价
     *
     * @return commodity_price_total - 商品总价
     */
    public BigDecimal getCommodityPriceTotal() {
        return commodityPriceTotal;
    }

    /**
     * 设置商品总价
     *
     * @param commodityPriceTotal 商品总价
     */
    public void setCommodityPriceTotal(BigDecimal commodityPriceTotal) {
        this.commodityPriceTotal = commodityPriceTotal;
    }

    /**
     * 获取原应付金额
     *
     * @return payable_amount_before - 原应付金额
     */
    public BigDecimal getPayableAmountBefore() {
        return payableAmountBefore;
    }

    /**
     * 设置原应付金额
     *
     * @param payableAmountBefore 原应付金额
     */
    public void setPayableAmountBefore(BigDecimal payableAmountBefore) {
        this.payableAmountBefore = payableAmountBefore;
    }

    /**
     * 获取修改后应付金额
     *
     * @return payable_amount_after - 修改后应付金额
     */
    public BigDecimal getPayableAmountAfter() {
        return payableAmountAfter;
    }

    /**
     * 设置修改后应付金额
     *
     * @param payableAmountAfter 修改后应付金额
     */
    public void setPayableAmountAfter(BigDecimal payableAmountAfter) {
        this.payableAmountAfter = payableAmountAfter;
    }

    /**
     * 获取原供货价
     *
     * @return supply_before - 原供货价
     */
    public BigDecimal getSupplyBefore() {
        return supplyBefore;
    }

    /**
     * 设置原供货价
     *
     * @param supplyBefore 原供货价
     */
    public void setSupplyBefore(BigDecimal supplyBefore) {
        this.supplyBefore = supplyBefore;
    }

    /**
     * 获取修改后供货价
     *
     * @return supply_after - 修改后供货价
     */
    public BigDecimal getSupplyAfter() {
        return supplyAfter;
    }

    /**
     * 设置修改后供货价
     *
     * @param supplyAfter 修改后供货价
     */
    public void setSupplyAfter(BigDecimal supplyAfter) {
        this.supplyAfter = supplyAfter;
    }

    /**
     * 获取原扣点
     *
     * @return points_before - 原扣点
     */
    public BigDecimal getPointsBefore() {
        return pointsBefore;
    }

    /**
     * 设置原扣点
     *
     * @param pointsBefore 原扣点
     */
    public void setPointsBefore(BigDecimal pointsBefore) {
        this.pointsBefore = pointsBefore;
    }

    /**
     * 获取修改后扣点
     *
     * @return points_after - 修改后扣点
     */
    public BigDecimal getPointsAfter() {
        return pointsAfter;
    }

    /**
     * 设置修改后扣点
     *
     * @param pointsAfter 修改后扣点
     */
    public void setPointsAfter(BigDecimal pointsAfter) {
        this.pointsAfter = pointsAfter;
    }

    /**
     * 获取原退款金额
     *
     * @return refundable_amount_before - 原退款金额
     */
    public BigDecimal getRefundableAmountBefore() {
        return refundableAmountBefore;
    }

    /**
     * 设置原退款金额
     *
     * @param refundableAmountBefore 原退款金额
     */
    public void setRefundableAmountBefore(BigDecimal refundableAmountBefore) {
        this.refundableAmountBefore = refundableAmountBefore;
    }

    /**
     * 获取修改后退款金额
     *
     * @return refundable_amount_after - 修改后退款金额
     */
    public BigDecimal getRefundableAmountAfter() {
        return refundableAmountAfter;
    }

    /**
     * 设置修改后退款金额
     *
     * @param refundableAmountAfter 修改后退款金额
     */
    public void setRefundableAmountAfter(BigDecimal refundableAmountAfter) {
        this.refundableAmountAfter = refundableAmountAfter;
    }

    /**
     * 获取创建者
     *
     * @return create_by - 创建者
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建者
     *
     * @param createBy 创建者
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * 获取创建日期
     *
     * @return create_date - 创建日期
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建日期
     *
     * @param createDate 创建日期
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取更新者
     *
     * @return last_update_by - 更新者
     */
    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    /**
     * 设置更新者
     *
     * @param lastUpdateBy 更新者
     */
    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy == null ? null : lastUpdateBy.trim();
    }

    /**
     * 获取更新日期
     *
     * @return last_update_date - 更新日期
     */
    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * 设置更新日期
     *
     * @param lastUpdateDate 更新日期
     */
    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }
}