package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.account.order.consult response.
 *
 * @author auto create
 * @since 1.0, 2020-08-25 20:45:12
 */
public class AlipayUserAccountOrderConsultResponse extends AlipayResponse {

    private static final long serialVersionUID = 1717845427225454661L;

    /**
     * 结果码
     */
    @ApiField("result_code")
    private String resultCode;

    /**
     * 结果信息
     */
    @ApiField("result_message")
    private String resultMessage;

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultCode() {
        return this.resultCode;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public String getResultMessage() {
        return this.resultMessage;
    }

}
