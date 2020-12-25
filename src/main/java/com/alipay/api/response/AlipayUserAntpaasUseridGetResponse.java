package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.antpaas.userid.get response.
 *
 * @author auto create
 * @since 1.0, 2020-05-07 20:39:54
 */
public class AlipayUserAntpaasUseridGetResponse extends AlipayResponse {

    private static final long serialVersionUID = 3636829197641745219L;

    /**
     * 支付宝用户id
     */
    @ApiField("user_id")
    private String userId;

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return this.userId;
    }

}
