package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.entity.monitor.set response.
 *
 * @author auto create
 * @since 1.0, 2020-07-17 16:36:56
 */
public class ZhimaCreditEpEntityMonitorSetResponse extends AlipayResponse {

    private static final long serialVersionUID = 3735179326957327236L;

    /**
     * 添加成功返回true, 失败返回false
     */
    @ApiField("biz_success")
    private Boolean bizSuccess;

    public void setBizSuccess(Boolean bizSuccess) {
        this.bizSuccess = bizSuccess;
    }

    public Boolean getBizSuccess() {
        return this.bizSuccess;
    }

}
