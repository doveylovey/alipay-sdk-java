package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生活号用户关注查询接口
 *
 * @author auto create
 * @since 1.0, 2020-09-01 09:56:03
 */
public class AlipayOpenPublicUserFollowQueryModel extends AlipayObject {

    private static final long serialVersionUID = 7473121359581134517L;

    /**
     * 支付宝用户id，2088开头的16位长度字符串
     */
    @ApiField("user_id")
    private String userId;

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
