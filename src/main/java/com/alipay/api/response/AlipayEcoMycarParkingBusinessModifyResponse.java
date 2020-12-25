package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.parking.business.modify response.
 *
 * @author auto create
 * @since 1.0, 2020-08-26 15:53:37
 */
public class AlipayEcoMycarParkingBusinessModifyResponse extends AlipayResponse {

    private static final long serialVersionUID = 6869899173612595264L;

    /**
     * 接口调用结果:0成功，1失败
     */
    @ApiField("result_code")
    private String resultCode;

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultCode() {
        return this.resultCode;
    }

}
