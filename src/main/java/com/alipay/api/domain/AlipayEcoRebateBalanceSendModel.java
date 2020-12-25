package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 更新可领取的集分宝余额
 *
 * @author auto create
 * @since 1.0, 2020-08-11 15:38:26
 */
public class AlipayEcoRebateBalanceSendModel extends AlipayObject {

    private static final long serialVersionUID = 8848964852966486414L;

    /**
     * 用户订单明细
     */
    @ApiListField("items")
    @ApiField("rebate_good")
    private List<RebateGood> items;

    /**
     * 商户侧的用户订单id
     */
    @ApiField("order_id")
    private String orderId;

    /**
     * 蚂蚁统一会员ID
     */
    @ApiField("user_id")
    private String userId;

    public List<RebateGood> getItems() {
        return this.items;
    }

    public void setItems(List<RebateGood> items) {
        this.items = items;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
