package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑订单预下单
 *
 * @author auto create
 * @since 1.0, 2020-06-04 14:54:15
 */
public class KoubeiTradeOrderPrecreateModel extends AlipayObject {

    private static final long serialVersionUID = 3287157236964293597L;

    /**
     * 业务类型，当前支持：POST_ORDER_PAY 点餐后付订单支付码生成
     */
    @ApiField("biz_type")
    private String bizType;

    /**
     * 外部订单号，即请求方订单的唯一标识。
     * 当biz_type传入POST_ORDER_PAY时，该字段为必选
     */
    @ApiField("out_order_no")
    private String outOrderNo;

    /**
     * 请求id，唯一标识一次请求，根据该字段请求幂等
     */
    @ApiField("request_id")
    private String requestId;

    /**
     * 口碑侧的门店id。
     * 当biz_type传入POST_ORDER_PAY时，该字段为必选
     */
    @ApiField("shop_id")
    private String shopId;

    public String getBizType() {
        return this.bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public String getOutOrderNo() {
        return this.outOrderNo;
    }

    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getShopId() {
        return this.shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

}
