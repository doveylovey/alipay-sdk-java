package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISV邀约即授权页面创建
 *
 * @author auto create
 * @since 1.0, 2020-06-28 17:35:57
 */
public class AlipayOpenInviteOrderCreateModel extends AlipayObject {

    private static final long serialVersionUID = 4496414117635697915L;

    /**
     * isv业务系统的申请单id
     */
    @ApiField("isv_biz_id")
    private String isvBizId;

    /**
     * isv平台的回跳地址。商户从伙伴平台跳转过来签约提交申请后，在结果页可以回跳到合作伙伴指定的页面，
     */
    @ApiField("isv_return_url")
    private String isvReturnUrl;

    public String getIsvBizId() {
        return this.isvBizId;
    }

    public void setIsvBizId(String isvBizId) {
        this.isvBizId = isvBizId;
    }

    public String getIsvReturnUrl() {
        return this.isvReturnUrl;
    }

    public void setIsvReturnUrl(String isvReturnUrl) {
        this.isvReturnUrl = isvReturnUrl;
    }

}
