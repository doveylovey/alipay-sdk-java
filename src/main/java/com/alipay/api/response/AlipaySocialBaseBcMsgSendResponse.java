package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.bc.msg.send response.
 *
 * @author auto create
 * @since 1.0, 2020-06-09 19:14:47
 */
public class AlipaySocialBaseBcMsgSendResponse extends AlipayResponse {

    private static final long serialVersionUID = 7534784588423697917L;

    /**
     * 业务错误码，在业务失败的情况下返回
     */
    @ApiField("sub_code")
    private String subCode;

    /**
     * 业务错误描述，在业务失败的情况下返回
     */
    @ApiField("sub_msg")
    private String subMsg;

    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }

    public String getSubCode() {
        return this.subCode;
    }

    public void setSubMsg(String subMsg) {
        this.subMsg = subMsg;
    }

    public String getSubMsg() {
        return this.subMsg;
    }

}
