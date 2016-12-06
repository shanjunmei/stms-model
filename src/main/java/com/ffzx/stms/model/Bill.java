package com.ffzx.stms.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "bill")
public class Bill {
    /**
     * 主键
     */
    @Id
    private String id;

    /**
     * 账单号
     */
    @Column(name = "bill_no")
    private String billNo;

    /**
     * 结款单号
     */
    @Column(name = "invoice_num")
    private String invoiceNum;

    /**
     * 结款状态 0:未结，1:已结
     */
    @Column(name = "invoice_status")
    private String invoiceStatus;

    /**
     * 账单状态(0:待审核,1:已审核,2:已付款,3:已退款)
     */
    @Column(name = "bill_status")
    private String billStatus;

    /**
     * 单据类型 0:应付,1:退款
     */
    private String type;

    /**
     * 供应商编码
     */
    @Column(name = "vendor_code")
    private String vendorCode;

    /**
     * 供应商名称
     */
    @Column(name = "vendor_name")
    private String vendorName;

    /**
     * 商品总价合计
     */
    @Column(name = "goods_total_count")
    private BigDecimal goodsTotalCount;

    /**
     * 供货价合计
     */
    @Column(name = "supply_total")
    private BigDecimal supplyTotal;

    /**
     * 扣点金额合计
     */
    @Column(name = "points_amount_total")
    private BigDecimal pointsAmountTotal;

    /**
     * 应付金额合计
     */
    @Column(name = "payable_amount_total")
    private BigDecimal payableAmountTotal;

    /**
     * 应付所得金额合计
     */
    @Column(name = "payable_obtain_amount_total")
    private BigDecimal payableObtainAmountTotal;

    /**
     * 退款账单金额合计
     */
    @Column(name = "refund_bill_total_count")
    private BigDecimal refundBillTotalCount;

    /**
     * 业务开始时间
     */
    @Column(name = "business_start_date_time")
    private Date businessStartDateTime;

    /**
     * 业务结束时间
     */
    @Column(name = "business_end_date_time")
    private Date businessEndDateTime;

    /**
     * 审核时间
     */
    @Column(name = "audit_time")
    private Date auditTime;

    /**
     * 审核人
     */
    private String auditor;

    /**
     * 审核人id
     */
    @Column(name = "auditor_id")
    private String auditorId;

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
     * 获取结款单号
     *
     * @return invoice_num - 结款单号
     */
    public String getInvoiceNum() {
        return invoiceNum;
    }

    /**
     * 设置结款单号
     *
     * @param invoiceNum 结款单号
     */
    public void setInvoiceNum(String invoiceNum) {
        this.invoiceNum = invoiceNum == null ? null : invoiceNum.trim();
    }

    /**
     * 获取结款状态 0:未结，1:已结
     *
     * @return invoice_status - 结款状态 0:未结，1:已结
     */
    public String getInvoiceStatus() {
        return invoiceStatus;
    }

    /**
     * 设置结款状态 0:未结，1:已结
     *
     * @param invoiceStatus 结款状态 0:未结，1:已结
     */
    public void setInvoiceStatus(String invoiceStatus) {
        this.invoiceStatus = invoiceStatus == null ? null : invoiceStatus.trim();
    }

    /**
     * 获取账单状态(0:待审核,1:已审核,2:已付款,3:已退款)
     *
     * @return bill_status - 账单状态(0:待审核,1:已审核,2:已付款,3:已退款)
     */
    public String getBillStatus() {
        return billStatus;
    }

    /**
     * 设置账单状态(0:待审核,1:已审核,2:已付款,3:已退款)
     *
     * @param billStatus 账单状态(0:待审核,1:已审核,2:已付款,3:已退款)
     */
    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus == null ? null : billStatus.trim();
    }

    /**
     * 获取单据类型 0:应付,1:退款
     *
     * @return type - 单据类型 0:应付,1:退款
     */
    public String getType() {
        return type;
    }

    /**
     * 设置单据类型 0:应付,1:退款
     *
     * @param type 单据类型 0:应付,1:退款
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 获取供应商编码
     *
     * @return vendor_code - 供应商编码
     */
    public String getVendorCode() {
        return vendorCode;
    }

    /**
     * 设置供应商编码
     *
     * @param vendorCode 供应商编码
     */
    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode == null ? null : vendorCode.trim();
    }

    /**
     * 获取供应商名称
     *
     * @return vendor_name - 供应商名称
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * 设置供应商名称
     *
     * @param vendorName 供应商名称
     */
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName == null ? null : vendorName.trim();
    }

    /**
     * 获取商品总价合计
     *
     * @return goods_total_count - 商品总价合计
     */
    public BigDecimal getGoodsTotalCount() {
        return goodsTotalCount;
    }

    /**
     * 设置商品总价合计
     *
     * @param goodsTotalCount 商品总价合计
     */
    public void setGoodsTotalCount(BigDecimal goodsTotalCount) {
        this.goodsTotalCount = goodsTotalCount;
    }

    /**
     * 获取供货价合计
     *
     * @return supply_total - 供货价合计
     */
    public BigDecimal getSupplyTotal() {
        return supplyTotal;
    }

    /**
     * 设置供货价合计
     *
     * @param supplyTotal 供货价合计
     */
    public void setSupplyTotal(BigDecimal supplyTotal) {
        this.supplyTotal = supplyTotal;
    }

    /**
     * 获取扣点金额合计
     *
     * @return points_amount_total - 扣点金额合计
     */
    public BigDecimal getPointsAmountTotal() {
        return pointsAmountTotal;
    }

    /**
     * 设置扣点金额合计
     *
     * @param pointsAmountTotal 扣点金额合计
     */
    public void setPointsAmountTotal(BigDecimal pointsAmountTotal) {
        this.pointsAmountTotal = pointsAmountTotal;
    }

    /**
     * 获取应付金额合计
     *
     * @return payable_amount_total - 应付金额合计
     */
    public BigDecimal getPayableAmountTotal() {
        return payableAmountTotal;
    }

    /**
     * 设置应付金额合计
     *
     * @param payableAmountTotal 应付金额合计
     */
    public void setPayableAmountTotal(BigDecimal payableAmountTotal) {
        this.payableAmountTotal = payableAmountTotal;
    }

    /**
     * 获取应付所得金额合计
     *
     * @return payable_obtain_amount_total - 应付所得金额合计
     */
    public BigDecimal getPayableObtainAmountTotal() {
        return payableObtainAmountTotal;
    }

    /**
     * 设置应付所得金额合计
     *
     * @param payableObtainAmountTotal 应付所得金额合计
     */
    public void setPayableObtainAmountTotal(BigDecimal payableObtainAmountTotal) {
        this.payableObtainAmountTotal = payableObtainAmountTotal;
    }

    /**
     * 获取退款账单金额合计
     *
     * @return refund_bill_total_count - 退款账单金额合计
     */
    public BigDecimal getRefundBillTotalCount() {
        return refundBillTotalCount;
    }

    /**
     * 设置退款账单金额合计
     *
     * @param refundBillTotalCount 退款账单金额合计
     */
    public void setRefundBillTotalCount(BigDecimal refundBillTotalCount) {
        this.refundBillTotalCount = refundBillTotalCount;
    }

    /**
     * 获取业务开始时间
     *
     * @return business_start_date_time - 业务开始时间
     */
    public Date getBusinessStartDateTime() {
        return businessStartDateTime;
    }

    /**
     * 设置业务开始时间
     *
     * @param businessStartDateTime 业务开始时间
     */
    public void setBusinessStartDateTime(Date businessStartDateTime) {
        this.businessStartDateTime = businessStartDateTime;
    }

    /**
     * 获取业务结束时间
     *
     * @return business_end_date_time - 业务结束时间
     */
    public Date getBusinessEndDateTime() {
        return businessEndDateTime;
    }

    /**
     * 设置业务结束时间
     *
     * @param businessEndDateTime 业务结束时间
     */
    public void setBusinessEndDateTime(Date businessEndDateTime) {
        this.businessEndDateTime = businessEndDateTime;
    }

    /**
     * 获取审核时间
     *
     * @return audit_time - 审核时间
     */
    public Date getAuditTime() {
        return auditTime;
    }

    /**
     * 设置审核时间
     *
     * @param auditTime 审核时间
     */
    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    /**
     * 获取审核人
     *
     * @return auditor - 审核人
     */
    public String getAuditor() {
        return auditor;
    }

    /**
     * 设置审核人
     *
     * @param auditor 审核人
     */
    public void setAuditor(String auditor) {
        this.auditor = auditor == null ? null : auditor.trim();
    }

    /**
     * 获取审核人id
     *
     * @return auditor_id - 审核人id
     */
    public String getAuditorId() {
        return auditorId;
    }

    /**
     * 设置审核人id
     *
     * @param auditorId 审核人id
     */
    public void setAuditorId(String auditorId) {
        this.auditorId = auditorId == null ? null : auditorId.trim();
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