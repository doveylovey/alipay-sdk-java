package com.alipay.api.response;

import java.util.List;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IotDeviceBindInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.device.bind.query response.
 *
 * @author auto create
 * @since 1.0, 2020-09-30 15:47:26
 */
public class AlipayCommerceIotDeviceBindQueryResponse extends AlipayResponse {

    private static final long serialVersionUID = 6186317524555759324L;

    /**
     * 设备绑定关系
     */
    @ApiListField("bind_info_list")
    @ApiField("iot_device_bind_info")
    private List<IotDeviceBindInfo> bindInfoList;

    public void setBindInfoList(List<IotDeviceBindInfo> bindInfoList) {
        this.bindInfoList = bindInfoList;
    }

    public List<IotDeviceBindInfo> getBindInfoList() {
        return this.bindInfoList;
    }

}
