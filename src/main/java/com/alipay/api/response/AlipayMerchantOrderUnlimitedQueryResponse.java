package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AlipayOrderDataOpenapiResultInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.order.unlimited.query response.
 *
 * @author auto create
 * @since 1.0, 2020-06-20 10:58:53
 */
public class AlipayMerchantOrderUnlimitedQueryResponse extends AlipayResponse {

    private static final long serialVersionUID = 4246175516967747768L;

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
