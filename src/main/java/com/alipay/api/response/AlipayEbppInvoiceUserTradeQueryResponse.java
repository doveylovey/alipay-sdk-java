package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InvoiceTradeInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.user.trade.query response.
 *
 * @author auto create
 * @since 1.0, 2020-05-20 15:52:22
 */
public class AlipayEbppInvoiceUserTradeQueryResponse extends AlipayResponse {

    private static final long serialVersionUID = 5565533333544698493L;

    /**
     * 发票管家发票交易信息
     */
    @ApiField("trade_info")
    private InvoiceTradeInfo tradeInfo;

    public void setTradeInfo(InvoiceTradeInfo tradeInfo) {
        this.tradeInfo = tradeInfo;
    }

    public InvoiceTradeInfo getTradeInfo() {
        return this.tradeInfo;
    }

}
