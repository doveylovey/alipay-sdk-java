package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.contract.signflows.create response.
 *
 * @author auto create
 * @since 1.0, 2020-08-31 23:10:11
 */
public class AlipayEcoContractSignflowsCreateResponse extends AlipayResponse {

    private static final long serialVersionUID = 2768766373697575648L;

    /**
     * 电子合同流程id（需记录到业务系统中，后续相关服务调用都基于此ID）
     */
    @ApiField("flow_id")
    private String flowId;

    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    public String getFlowId() {
        return this.flowId;
    }

}
