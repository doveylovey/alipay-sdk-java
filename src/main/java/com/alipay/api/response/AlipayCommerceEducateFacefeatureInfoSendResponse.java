package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.facefeature.info.send response.
 *
 * @author auto create
 * @since 1.0, 2020-10-14 14:06:57
 */
public class AlipayCommerceEducateFacefeatureInfoSendResponse extends AlipayResponse {

    private static final long serialVersionUID = 3438353253175432462L;

    /**
     * 返回更新失败的userId集合
     */
    @ApiField("error_uids")
    private String errorUids;

    public void setErrorUids(String errorUids) {
        this.errorUids = errorUids;
    }

    public String getErrorUids() {
        return this.errorUids;
    }

}
