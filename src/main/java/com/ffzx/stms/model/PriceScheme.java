package com.ffzx.stms.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "price_scheme")
public class PriceScheme {
    /**
     * 主键ID
     */
    @Id
    private String id;

    /**
     * 商品code
     */
    @Column(name = "commodity_code")
    private String commodityCode;

    /**
     * 供应商编码
     */
    @Column(name = "vendor_code")
    private String vendorCode;

    /**
     * 采购模式
     */
    @Column(name = "purchase_type")
    private String purchaseType;

    /**
     * 结算模式
     */
    @Column(name = "settlement_pattern")
    private String settlementPattern;

    /**
     * 方案类型
     */
    private String type;

    /**
     * 方案编号
     */
    private String code;

    /**
     * 方案名称
     */
    private String name;

    /**
     * 方案状态
     */
    private String status;

    /**
     * 生效时间
     */
    @Column(name = "effective_time")
    private Date effectiveTime;

    /**
     * 失效时间
     */
    @Column(name = "invalid_time")
    private Date invalidTime;

    /**
     * 创建人
     */
    @Column(name = "create_by")
    private String createBy;

    /**
     * 创建人名称
     */
    @Column(name = "create_by_name")
    private String createByName;

    /**
     * 创建时间
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 修改人
     */
    @Column(name = "last_update_by")
    private String lastUpdateBy;

    /**
     * 修改人名称
     */
    @Column(name = "last_update_by_name")
    private String lastUpdateByName;

    /**
     * 最后更新时间
     */
    @Column(name = "last_update_date")
    private Date lastUpdateDate;

    /**
     * 取消人
     */
    @Column(name = "cancel_by")
    private String cancelBy;

    /**
     * 取消人名字
     */
    @Column(name = "cancel_by_name")
    private String cancelByName;

    /**
     * 取消时间
     */
    @Column(name = "cancel_date")
    private Date cancelDate;

    /**
     * 启禁用状态(0:启用,1:禁用)
     */
    @Column(name = "act_flag")
    private String actFlag;

    /**
     * 删除状态(0:删除;1:未删除)
     */
    @Column(name = "del_flag")
    private String delFlag;

    /**
     * 获取主键ID
     *
     * @return id - 主键ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键ID
     *
     * @param id 主键ID
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取商品code
     *
     * @return commodity_code - 商品code
     */
    public String getCommodityCode() {
        return commodityCode;
    }

    /**
     * 设置商品code
     *
     * @param commodityCode 商品code
     */
    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode == null ? null : commodityCode.trim();
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
     * 获取采购模式
     *
     * @return purchase_type - 采购模式
     */
    public String getPurchaseType() {
        return purchaseType;
    }

    /**
     * 设置采购模式
     *
     * @param purchaseType 采购模式
     */
    public void setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType == null ? null : purchaseType.trim();
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
     * 获取方案类型
     *
     * @return type - 方案类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置方案类型
     *
     * @param type 方案类型
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 获取方案编号
     *
     * @return code - 方案编号
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置方案编号
     *
     * @param code 方案编号
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 获取方案名称
     *
     * @return name - 方案名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置方案名称
     *
     * @param name 方案名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取方案状态
     *
     * @return status - 方案状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置方案状态
     *
     * @param status 方案状态
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 获取生效时间
     *
     * @return effective_time - 生效时间
     */
    public Date getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * 设置生效时间
     *
     * @param effectiveTime 生效时间
     */
    public void setEffectiveTime(Date effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    /**
     * 获取失效时间
     *
     * @return invalid_time - 失效时间
     */
    public Date getInvalidTime() {
        return invalidTime;
    }

    /**
     * 设置失效时间
     *
     * @param invalidTime 失效时间
     */
    public void setInvalidTime(Date invalidTime) {
        this.invalidTime = invalidTime;
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
     * 获取创建人名称
     *
     * @return create_by_name - 创建人名称
     */
    public String getCreateByName() {
        return createByName;
    }

    /**
     * 设置创建人名称
     *
     * @param createByName 创建人名称
     */
    public void setCreateByName(String createByName) {
        this.createByName = createByName == null ? null : createByName.trim();
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
     * 获取修改人
     *
     * @return last_update_by - 修改人
     */
    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    /**
     * 设置修改人
     *
     * @param lastUpdateBy 修改人
     */
    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy == null ? null : lastUpdateBy.trim();
    }

    /**
     * 获取修改人名称
     *
     * @return last_update_by_name - 修改人名称
     */
    public String getLastUpdateByName() {
        return lastUpdateByName;
    }

    /**
     * 设置修改人名称
     *
     * @param lastUpdateByName 修改人名称
     */
    public void setLastUpdateByName(String lastUpdateByName) {
        this.lastUpdateByName = lastUpdateByName == null ? null : lastUpdateByName.trim();
    }

    /**
     * 获取最后更新时间
     *
     * @return last_update_date - 最后更新时间
     */
    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * 设置最后更新时间
     *
     * @param lastUpdateDate 最后更新时间
     */
    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    /**
     * 获取取消人
     *
     * @return cancel_by - 取消人
     */
    public String getCancelBy() {
        return cancelBy;
    }

    /**
     * 设置取消人
     *
     * @param cancelBy 取消人
     */
    public void setCancelBy(String cancelBy) {
        this.cancelBy = cancelBy == null ? null : cancelBy.trim();
    }

    /**
     * 获取取消人名字
     *
     * @return cancel_by_name - 取消人名字
     */
    public String getCancelByName() {
        return cancelByName;
    }

    /**
     * 设置取消人名字
     *
     * @param cancelByName 取消人名字
     */
    public void setCancelByName(String cancelByName) {
        this.cancelByName = cancelByName == null ? null : cancelByName.trim();
    }

    /**
     * 获取取消时间
     *
     * @return cancel_date - 取消时间
     */
    public Date getCancelDate() {
        return cancelDate;
    }

    /**
     * 设置取消时间
     *
     * @param cancelDate 取消时间
     */
    public void setCancelDate(Date cancelDate) {
        this.cancelDate = cancelDate;
    }

    /**
     * 获取启禁用状态(0:启用,1:禁用)
     *
     * @return act_flag - 启禁用状态(0:启用,1:禁用)
     */
    public String getActFlag() {
        return actFlag;
    }

    /**
     * 设置启禁用状态(0:启用,1:禁用)
     *
     * @param actFlag 启禁用状态(0:启用,1:禁用)
     */
    public void setActFlag(String actFlag) {
        this.actFlag = actFlag == null ? null : actFlag.trim();
    }

    /**
     * 获取删除状态(0:删除;1:未删除)
     *
     * @return del_flag - 删除状态(0:删除;1:未删除)
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设置删除状态(0:删除;1:未删除)
     *
     * @param delFlag 删除状态(0:删除;1:未删除)
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }
}