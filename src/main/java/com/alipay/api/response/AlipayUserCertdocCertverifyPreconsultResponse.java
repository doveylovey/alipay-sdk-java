package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.certdoc.certverify.preconsult response.
 *
 * @author auto create
 * @since 1.0, 2020-09-24 14:35:02
 */
public class AlipayUserCertdocCertverifyPreconsultResponse extends AlipayResponse {

    private static final long serialVersionUID = 3465786659446952925L;

    /**
     * 申请验证ID
     */
    @ApiField("verify_id")
    private String verifyId;

    public void setVerifyId(String verifyId) {
        this.verifyId = verifyId;
    }

    public String getVerifyId() {
        return this.verifyId;
    }

}
