package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AlipayOrderDataOpenapiResultInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.order.securitydetail.consumer.query response.
 *
 * @author auto create
 * @since 1.0, 2020-06-20 10:59:45
 */
public class AlipayMerchantOrderSecuritydetailConsumerQueryResponse extends AlipayResponse {

    private static final long serialVersionUID = 5593754233364473854L;

    /**
     * 订单信息
     * 若订单号或业务号存在，则返回
     */
    @ApiField("order_info")
    private AlipayOrderDataOpenapiResultInfo orderInfo;

    public void setOrderInfo(AlipayOrderDataOpenapiResultInfo orderInfo) {
        this.orderInfo = orderInfo;
    }

    public AlipayOrderDataOpenapiResultInfo getOrderInfo() {
        return this.orderInfo;
    }

}
