package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.facetoface.decode.use response.
 *
 * @author auto create
 * @since 1.0, 2020-08-20 11:39:36
 */
public class AlipayMarketingFacetofaceDecodeUseResponse extends AlipayResponse {

    private static final long serialVersionUID = 8433446931591733448L;

    /**
     * 用户userId
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
