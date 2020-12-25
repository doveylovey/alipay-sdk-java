package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.antlaw.smartcontractcode.modify response.
 *
 * @author auto create
 * @since 1.0, 2020-06-09 11:20:12
 */
public class AlipayBossProdAntlawSmartcontractcodeModifyResponse extends AlipayResponse {

    private static final long serialVersionUID = 8877734948257437279L;

    /**
     * 业务编号
     */
    @ApiField("biz_code")
    private String bizCode;

    /**
     * 来源系统
     */
    @ApiField("source_sys")
    private String sourceSys;

    public void setBizCode(String bizCode) {
        this.bizCode = bizCode;
    }

    public String getBizCode() {
        return this.bizCode;
    }

    public void setSourceSys(String sourceSys) {
        this.sourceSys = sourceSys;
    }

    public String getSourceSys() {
        return this.sourceSys;
    }

}
