package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.close response.
 *
 * @author auto create
 * @since 1.0, 2020-07-03 18:50:11
 */
public class AlipayTradeCloseResponse extends AlipayResponse {

    private static final long serialVersionUID = 7681157478493866277L;

    /**
     * 创建交易传入的商户订单号
     */
    @ApiField("out_trade_no")
    private String outTradeNo;

    /**
     * 支付宝交易号
     */
    @ApiField("trade_no")
    private String tradeNo;

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getOutTradeNo() {
        return this.outTradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getTradeNo() {
        return this.tradeNo;
    }

}
