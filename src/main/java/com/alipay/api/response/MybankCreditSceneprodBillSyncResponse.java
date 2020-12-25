package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.sceneprod.bill.sync response.
 *
 * @author auto create
 * @since 1.0, 2019-04-01 09:48:57
 */
public class MybankCreditSceneprodBillSyncResponse extends AlipayResponse {

    private static final long serialVersionUID = 2367383459941285918L;

    /**
     * 网商traceId，便于查询日志内容
     */
    @ApiField("trace_id")
    private String traceId;

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public String getTraceId() {
        return this.traceId;
    }

}
