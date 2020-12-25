package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GFAOpenAPIDetailQueryResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.gfacceptance.detail.query response.
 *
 * @author auto create
 * @since 1.0, 2020-08-31 21:50:13
 */
public class AlipayBossFncGfacceptanceDetailQueryResponse extends AlipayResponse {

    private static final long serialVersionUID = 4325227812668412222L;

    /**
     * 业财受理详情查询结果
     */
    @ApiField("result")
    private GFAOpenAPIDetailQueryResult result;

    public void setResult(GFAOpenAPIDetailQueryResult result) {
        this.result = result;
    }

    public GFAOpenAPIDetailQueryResult getResult() {
        return this.result;
    }

}
