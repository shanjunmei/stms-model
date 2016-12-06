package com.ffzx.stms.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "price_scheme_detail")
public class PriceSchemeDetail {
    /**
     * 主键ID
     */
    @Id
    private String id;

    /**
     * 方案编号
     */
    @Column(name = "effective_programme_code")
    private String effectiveProgrammeCode;

    /**
     * 商品sku条形码
     */
    @Column(name = "sku_barcode")
    private String skuBarcode;

    /**
     * sku
     */
    @Column(name = "commodity_attribute_values")
    private String commodityAttributeValues;

    /**
     * SKU状态
     */
    @Column(name = "sku_act_flag")
    private String skuActFlag;

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
     * 启禁用状态(0:启用,1:禁用)
     */
    @Column(name = "act_flag")
    private String actFlag;

    /**
     * 扣点
     */
    private BigDecimal points;

    /**
     * 供货价
     */
    @Column(name = "supply_price")
    private BigDecimal supplyPrice;

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
     * 获取方案编号
     *
     * @return effective_programme_code - 方案编号
     */
    public String getEffectiveProgrammeCode() {
        return effectiveProgrammeCode;
    }

    /**
     * 设置方案编号
     *
     * @param effectiveProgrammeCode 方案编号
     */
    public void setEffectiveProgrammeCode(String effectiveProgrammeCode) {
        this.effectiveProgrammeCode = effectiveProgrammeCode == null ? null : effectiveProgrammeCode.trim();
    }

    /**
     * 获取商品sku条形码
     *
     * @return sku_barcode - 商品sku条形码
     */
    public String getSkuBarcode() {
        return skuBarcode;
    }

    /**
     * 设置商品sku条形码
     *
     * @param skuBarcode 商品sku条形码
     */
    public void setSkuBarcode(String skuBarcode) {
        this.skuBarcode = skuBarcode == null ? null : skuBarcode.trim();
    }

    /**
     * 获取sku
     *
     * @return commodity_attribute_values - sku
     */
    public String getCommodityAttributeValues() {
        return commodityAttributeValues;
    }

    /**
     * 设置sku
     *
     * @param commodityAttributeValues sku
     */
    public void setCommodityAttributeValues(String commodityAttributeValues) {
        this.commodityAttributeValues = commodityAttributeValues == null ? null : commodityAttributeValues.trim();
    }

    /**
     * 获取SKU状态
     *
     * @return sku_act_flag - SKU状态
     */
    public String getSkuActFlag() {
        return skuActFlag;
    }

    /**
     * 设置SKU状态
     *
     * @param skuActFlag SKU状态
     */
    public void setSkuActFlag(String skuActFlag) {
        this.skuActFlag = skuActFlag == null ? null : skuActFlag.trim();
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
     * 获取供货价
     *
     * @return supply_price - 供货价
     */
    public BigDecimal getSupplyPrice() {
        return supplyPrice;
    }

    /**
     * 设置供货价
     *
     * @param supplyPrice 供货价
     */
    public void setSupplyPrice(BigDecimal supplyPrice) {
        this.supplyPrice = supplyPrice;
    }
}