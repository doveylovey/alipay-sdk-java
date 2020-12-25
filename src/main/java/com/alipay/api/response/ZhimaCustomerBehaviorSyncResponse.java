package com.alipay.api.response;

import java.util.List;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.behavior.sync response.
 *
 * @author auto create
 * @since 1.0, 2020-09-07 20:10:11
 */
public class ZhimaCustomerBehaviorSyncResponse extends AlipayResponse {

    private static final long serialVersionUID = 4734313557948392278L;

    /**
     * 行为合约号
     */
    @ApiField("contract_no")
    private String contractNo;

    /**
     * 行为所触发的合约号
     */
    @ApiListField("contract_nos")
    @ApiField("string")
    private List<String> contractNos;

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getContractNo() {
        return this.contractNo;
    }

    public void setContractNos(List<String> contractNos) {
        this.contractNos = contractNos;
    }

    public List<String> getContractNos() {
        return this.contractNos;
    }

}
