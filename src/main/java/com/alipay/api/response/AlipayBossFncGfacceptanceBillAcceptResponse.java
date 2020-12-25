package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GFAOpenAPIAcceptanceResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.gfacceptance.bill.accept response.
 *
 * @author auto create
 * @since 1.0, 2020-08-31 21:49:43
 */
public class AlipayBossFncGfacceptanceBillAcceptResponse extends AlipayResponse {

    private static final long serialVersionUID = 7744425123516185777L;

    /**
     * 业财受理结果
     */
    @ApiField("result")
    private GFAOpenAPIAcceptanceResult result;

    public void setResult(GFAOpenAPIAcceptanceResult result) {
        this.result = result;
    }

    public GFAOpenAPIAcceptanceResult getResult() {
        return this.result;
    }

}
