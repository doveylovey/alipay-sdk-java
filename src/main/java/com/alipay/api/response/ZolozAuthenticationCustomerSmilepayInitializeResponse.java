package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.authentication.customer.smilepay.initialize response.
 *
 * @author auto create
 * @since 1.0, 2020-08-17 12:00:13
 */
public class ZolozAuthenticationCustomerSmilepayInitializeResponse extends AlipayResponse {

    private static final long serialVersionUID = 8426653227818577719L;

    /**
     * 返回值
     */
    @ApiField("result")
    private String result;

    public void setResult(String result) {
        this.result = result;
    }

    public String getResult() {
        return this.result;
    }

}
