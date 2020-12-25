package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.sssssss.query response.
 *
 * @author auto create
 * @since 1.0, 2020-02-11 17:25:00
 */
public class AlipaySecuritySssssssQueryResponse extends AlipayResponse {

    private static final long serialVersionUID = 6623178832977583845L;

    /**
     * af
     */
    @ApiField("adfad")
    private String adfad;

    public void setAdfad(String adfad) {
        this.adfad = adfad;
    }

    public String getAdfad() {
        return this.adfad;
    }

}
