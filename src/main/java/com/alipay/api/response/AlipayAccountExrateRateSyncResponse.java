package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.account.exrate.rate.sync response.
 *
 * @author auto create
 * @since 1.0, 2020-06-22 21:19:43
 */
public class AlipayAccountExrateRateSyncResponse extends AlipayResponse {

    private static final long serialVersionUID = 2641918648364287262L;

    /**
     * 主站openapi通用接口操作返回结果
     */
    @ApiField("result_context")
    private String resultContext;

    public void setResultContext(String resultContext) {
        this.resultContext = resultContext;
    }

    public String getResultContext() {
        return this.resultContext;
    }

}
