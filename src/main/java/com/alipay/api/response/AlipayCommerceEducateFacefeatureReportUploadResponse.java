package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.facefeature.report.upload response.
 *
 * @author auto create
 * @since 1.0, 2020-10-14 14:07:37
 */
public class AlipayCommerceEducateFacefeatureReportUploadResponse extends AlipayResponse {

    private static final long serialVersionUID = 3457233388399786481L;

    /**
     * 上报成功失败
     */
    @ApiField("success")
    private Boolean success;

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Boolean getSuccess() {
        return this.success;
    }

}
