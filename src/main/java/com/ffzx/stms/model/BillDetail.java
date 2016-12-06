package com.ffzx.stms.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "bill_detail")
public class BillDetail {
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
     * 销售订单号
     */
    @Column(name = "order_no")
    private String orderNo;

    /**
     * 出库单号
     */
    @Column(name = "outbound_no")
    private String outboundNo;

    /**
     * 退款单号
     */
    @Column(name = "refund_no")
    private String refundNo;

    /**
     * 下单时间
     */
    @Column(name = "order_create_date")
    private Date orderCreateDate;

    /**
     * 支付时间
     */
    @Column(name = "pay_time")
    private Date payTime;

    /**
     * 出库时间
     */
    @Column(name = "outbound_time")
    private Date outboundTime;

    /**
     * 退款时间
     */
    @Column(name = "refund_time")
    private Date refundTime;

    /**
     * 应付状态 0:待处理，1待付款，2待审核，3已审核
     */
    @Column(name = "payable_status")
    private String payableStatus;

    /**
     * 退款状态 0: 待处理，1待退款，2待审核，3已审核
     */
    @Column(name = "refund_status")
    private String refundStatus;

    /**
     * 类型 0:应付,1:退款
     */
    private String type;

    /**
     * 商品编码
     */
    @Column(name = "commodity_code")
    private String commodityCode;

    /**
     * sku条形码
     */
    @Column(name = "sku_bar_code")
    private String skuBarCode;

    /**
     * sku编码
     */
    @Column(name = "sku_code")
    private String skuCode;

    /**
     * 商品名称
     */
    @Column(name = "commodity_name")
    private String commodityName;

    /**
     * 商品属性值组合
     */
    @Column(name = "commodity_attribute_values")
    private String commodityAttributeValues;

    /**
     * 购买数量
     */
    @Column(name = "buy_num")
    private Integer buyNum;

    /**
     * 商品单价
     */
    @Column(name = "commodity_price")
    private BigDecimal commodityPrice;

    /**
     * 商品单价总价
     */
    @Column(name = "commodity_price_total")
    private BigDecimal commodityPriceTotal;

    /**
     * 供货价
     */
    private BigDecimal supply;

    /**
     * 供货价金额
     */
    @Column(name = "supply_amount")
    private BigDecimal supplyAmount;

    /**
     * 扣点
     */
    private BigDecimal points;

    /**
     * 扣点金额
     */
    @Column(name = "points_amount")
    private BigDecimal pointsAmount;

    /**
     * 应付金额(退款使用)
     */
    @Column(name = "payable_amount")
    private BigDecimal payableAmount;

    /**
     * 应付所得金额
     */
    @Column(name = "payable_obtain_amount")
    private BigDecimal payableObtainAmount;

    /**
     * 应退金额
     */
    @Column(name = "refundable_amount")
    private BigDecimal refundableAmount;

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
     * 供应商生效时间
     */
    @Column(name = "vendor_effect_date")
    private Date vendorEffectDate;

    /**
     * 供应商采购模式
     */
    @Column(name = "purchase_type")
    private String purchaseType;

    /**
     * 采购模式生效时间
     */
    @Column(name = "purchase_type_effect_date")
    private Date purchaseTypeEffectDate;

    /**
     * 结算模式
     */
    @Column(name = "settlement_pattern")
    private String settlementPattern;

    /**
     * 结算模式生效时间
     */
    @Column(name = "settlement_pattern_effect_date")
    private Date settlementPatternEffectDate;

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
     * 获取销售订单号
     *
     * @return order_no - 销售订单号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置销售订单号
     *
     * @param orderNo 销售订单号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    /**
     * 获取出库单号
     *
     * @return outbound_no - 出库单号
     */
    public String getOutboundNo() {
        return outboundNo;
    }

    /**
     * 设置出库单号
     *
     * @param outboundNo 出库单号
     */
    public void setOutboundNo(String outboundNo) {
        this.outboundNo = outboundNo == null ? null : outboundNo.trim();
    }

    /**
     * 获取退款单号
     *
     * @return refund_no - 退款单号
     */
    public String getRefundNo() {
        return refundNo;
    }

    /**
     * 设置退款单号
     *
     * @param refundNo 退款单号
     */
    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo == null ? null : refundNo.trim();
    }

    /**
     * 获取下单时间
     *
     * @return order_create_date - 下单时间
     */
    public Date getOrderCreateDate() {
        return orderCreateDate;
    }

    /**
     * 设置下单时间
     *
     * @param orderCreateDate 下单时间
     */
    public void setOrderCreateDate(Date orderCreateDate) {
        this.orderCreateDate = orderCreateDate;
    }

    /**
     * 获取支付时间
     *
     * @return pay_time - 支付时间
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 设置支付时间
     *
     * @param payTime 支付时间
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * 获取出库时间
     *
     * @return outbound_time - 出库时间
     */
    public Date getOutboundTime() {
        return outboundTime;
    }

    /**
     * 设置出库时间
     *
     * @param outboundTime 出库时间
     */
    public void setOutboundTime(Date outboundTime) {
        this.outboundTime = outboundTime;
    }

    /**
     * 获取退款时间
     *
     * @return refund_time - 退款时间
     */
    public Date getRefundTime() {
        return refundTime;
    }

    /**
     * 设置退款时间
     *
     * @param refundTime 退款时间
     */
    public void setRefundTime(Date refundTime) {
        this.refundTime = refundTime;
    }

    /**
     * 获取应付状态 0:待处理，1待付款，2待审核，3已审核
     *
     * @return payable_status - 应付状态 0:待处理，1待付款，2待审核，3已审核
     */
    public String getPayableStatus() {
        return payableStatus;
    }

    /**
     * 设置应付状态 0:待处理，1待付款，2待审核，3已审核
     *
     * @param payableStatus 应付状态 0:待处理，1待付款，2待审核，3已审核
     */
    public void setPayableStatus(String payableStatus) {
        this.payableStatus = payableStatus == null ? null : payableStatus.trim();
    }

    /**
     * 获取退款状态 0: 待处理，1待退款，2待审核，3已审核
     *
     * @return refund_status - 退款状态 0: 待处理，1待退款，2待审核，3已审核
     */
    public String getRefundStatus() {
        return refundStatus;
    }

    /**
     * 设置退款状态 0: 待处理，1待退款，2待审核，3已审核
     *
     * @param refundStatus 退款状态 0: 待处理，1待退款，2待审核，3已审核
     */
    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus == null ? null : refundStatus.trim();
    }

    /**
     * 获取类型 0:应付,1:退款
     *
     * @return type - 类型 0:应付,1:退款
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型 0:应付,1:退款
     *
     * @param type 类型 0:应付,1:退款
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 获取商品编码
     *
     * @return commodity_code - 商品编码
     */
    public String getCommodityCode() {
        return commodityCode;
    }

    /**
     * 设置商品编码
     *
     * @param commodityCode 商品编码
     */
    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode == null ? null : commodityCode.trim();
    }

    /**
     * 获取sku条形码
     *
     * @return sku_bar_code - sku条形码
     */
    public String getSkuBarCode() {
        return skuBarCode;
    }

    /**
     * 设置sku条形码
     *
     * @param skuBarCode sku条形码
     */
    public void setSkuBarCode(String skuBarCode) {
        this.skuBarCode = skuBarCode == null ? null : skuBarCode.trim();
    }

    /**
     * 获取sku编码
     *
     * @return sku_code - sku编码
     */
    public String getSkuCode() {
        return skuCode;
    }

    /**
     * 设置sku编码
     *
     * @param skuCode sku编码
     */
    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode == null ? null : skuCode.trim();
    }

    /**
     * 获取商品名称
     *
     * @return commodity_name - 商品名称
     */
    public String getCommodityName() {
        return commodityName;
    }

    /**
     * 设置商品名称
     *
     * @param commodityName 商品名称
     */
    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName == null ? null : commodityName.trim();
    }

    /**
     * 获取商品属性值组合
     *
     * @return commodity_attribute_values - 商品属性值组合
     */
    public String getCommodityAttributeValues() {
        return commodityAttributeValues;
    }

    /**
     * 设置商品属性值组合
     *
     * @param commodityAttributeValues 商品属性值组合
     */
    public void setCommodityAttributeValues(String commodityAttributeValues) {
        this.commodityAttributeValues = commodityAttributeValues == null ? null : commodityAttributeValues.trim();
    }

    /**
     * 获取购买数量
     *
     * @return buy_num - 购买数量
     */
    public Integer getBuyNum() {
        return buyNum;
    }

    /**
     * 设置购买数量
     *
     * @param buyNum 购买数量
     */
    public void setBuyNum(Integer buyNum) {
        this.buyNum = buyNum;
    }

    /**
     * 获取商品单价
     *
     * @return commodity_price - 商品单价
     */
    public BigDecimal getCommodityPrice() {
        return commodityPrice;
    }

    /**
     * 设置商品单价
     *
     * @param commodityPrice 商品单价
     */
    public void setCommodityPrice(BigDecimal commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    /**
     * 获取商品单价总价
     *
     * @return commodity_price_total - 商品单价总价
     */
    public BigDecimal getCommodityPriceTotal() {
        return commodityPriceTotal;
    }

    /**
     * 设置商品单价总价
     *
     * @param commodityPriceTotal 商品单价总价
     */
    public void setCommodityPriceTotal(BigDecimal commodityPriceTotal) {
        this.commodityPriceTotal = commodityPriceTotal;
    }

    /**
     * 获取供货价
     *
     * @return supply - 供货价
     */
    public BigDecimal getSupply() {
        return supply;
    }

    /**
     * 设置供货价
     *
     * @param supply 供货价
     */
    public void setSupply(BigDecimal supply) {
        this.supply = supply;
    }

    /**
     * 获取供货价金额
     *
     * @return supply_amount - 供货价金额
     */
    public BigDecimal getSupplyAmount() {
        return supplyAmount;
    }

    /**
     * 设置供货价金额
     *
     * @param supplyAmount 供货价金额
     */
    public void setSupplyAmount(BigDecimal supplyAmount) {
        this.supplyAmount = supplyAmount;
    }

    /**
     * 获取扣点
     *
     * @return points - 扣点
     */
    public BigDecimal getPoints() {
        return points;
    }

    /**
     * 设置扣点
     *
     * @param points 扣点
     */
    public void setPoints(BigDecimal points) {
        this.points = points;
    }

    /**
     * 获取扣点金额
     *
     * @return points_amount - 扣点金额
     */
    public BigDecimal getPointsAmount() {
        return pointsAmount;
    }

    /**
     * 设置扣点金额
     *
     * @param pointsAmount 扣点金额
     */
    public void setPointsAmount(BigDecimal pointsAmount) {
        this.pointsAmount = pointsAmount;
    }

    /**
     * 获取应付金额(退款使用)
     *
     * @return payable_amount - 应付金额(退款使用)
     */
    public BigDecimal getPayableAmount() {
        return payableAmount;
    }

    /**
     * 设置应付金额(退款使用)
     *
     * @param payableAmount 应付金额(退款使用)
     */
    public void setPayableAmount(BigDecimal payableAmount) {
        this.payableAmount = payableAmount;
    }

    /**
     * 获取应付所得金额
     *
     * @return payable_obtain_amount - 应付所得金额
     */
    public BigDecimal getPayableObtainAmount() {
        return payableObtainAmount;
    }

    /**
     * 设置应付所得金额
     *
     * @param payableObtainAmount 应付所得金额
     */
    public void setPayableObtainAmount(BigDecimal payableObtainAmount) {
        this.payableObtainAmount = payableObtainAmount;
    }

    /**
     * 获取应退金额
     *
     * @return refundable_amount - 应退金额
     */
    public BigDecimal getRefundableAmount() {
        return refundableAmount;
    }

    /**
     * 设置应退金额
     *
     * @param refundableAmount 应退金额
     */
    public void setRefundableAmount(BigDecimal refundableAmount) {
        this.refundableAmount = refundableAmount;
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
     * 获取供应商生效时间
     *
     * @return vendor_effect_date - 供应商生效时间
     */
    public Date getVendorEffectDate() {
        return vendorEffectDate;
    }

    /**
     * 设置供应商生效时间
     *
     * @param vendorEffectDate 供应商生效时间
     */
    public void setVendorEffectDate(Date vendorEffectDate) {
        this.vendorEffectDate = vendorEffectDate;
    }

    /**
     * 获取供应商采购模式
     *
     * @return purchase_type - 供应商采购模式
     */
    public String getPurchaseType() {
        return purchaseType;
    }

    /**
     * 设置供应商采购模式
     *
     * @param purchaseType 供应商采购模式
     */
    public void setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType == null ? null : purchaseType.trim();
    }

    /**
     * 获取采购模式生效时间
     *
     * @return purchase_type_effect_date - 采购模式生效时间
     */
    public Date getPurchaseTypeEffectDate() {
        return purchaseTypeEffectDate;
    }

    /**
     * 设置采购模式生效时间
     *
     * @param purchaseTypeEffectDate 采购模式生效时间
     */
    public void setPurchaseTypeEffectDate(Date purchaseTypeEffectDate) {
        this.purchaseTypeEffectDate = purchaseTypeEffectDate;
    }

    /**
     * 获取结算模式
     *
     * @return settlement_pattern - 结算模式
     */
    public String getSettlementPattern() {
        return settlementPattern;
    }

    /**
     * 设置结算模式
     *
     * @param settlementPattern 结算模式
     */
    public void setSettlementPattern(String settlementPattern) {
        this.settlementPattern = settlementPattern == null ? null : settlementPattern.trim();
    }

    /**
     * 获取结算模式生效时间
     *
     * @return settlement_pattern_effect_date - 结算模式生效时间
     */
    public Date getSettlementPatternEffectDate() {
        return settlementPatternEffectDate;
    }

    /**
     * 设置结算模式生效时间
     *
     * @param settlementPatternEffectDate 结算模式生效时间
     */
    public void setSettlementPatternEffectDate(Date settlementPatternEffectDate) {
        this.settlementPatternEffectDate = settlementPatternEffectDate;
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