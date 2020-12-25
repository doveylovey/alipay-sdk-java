package com.alipay.api.response;

import java.util.List;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DataDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.data.query response.
 *
 * @author auto create
 * @since 1.0, 2020-10-22 19:16:17
 */
public class AlipayDataDataserviceAdDataQueryResponse extends AlipayResponse {

    private static final long serialVersionUID = 8617141259747475888L;

    /**
     * 汇总结果数据列表
     */
    @ApiListField("data_list")
    @ApiField("data_detail")
    private List<DataDetail> dataList;

    public void setDataList(List<DataDetail> dataList) {
        this.dataList = dataList;
    }

    public List<DataDetail> getDataList() {
        return this.dataList;
    }

}
