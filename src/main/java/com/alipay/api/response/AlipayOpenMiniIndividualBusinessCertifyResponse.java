package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.individual.business.certify response.
 *
 * @author auto create
 * @since 1.0, 2020-07-07 22:35:15
 */
public class AlipayOpenMiniIndividualBusinessCertifyResponse extends AlipayResponse {

    private static final long serialVersionUID = 6461983125792345121L;

    /**
     * 个体工商户认证结果，true代表认证成功，false代表认证失败
     */
    @ApiField("certify_result")
    private Boolean certifyResult;

    public void setCertifyResult(Boolean certifyResult) {
        this.certifyResult = certifyResult;
    }

    public Boolean getCertifyResult() {
        return this.certifyResult;
    }

}
