package com.alipay.api.response;

import java.util.List;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItemVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.item.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2020-08-17 20:22:27
 */
public class AlipayOpenMiniItemBatchqueryResponse extends AlipayResponse {

    private static final long serialVersionUID = 2861252119179846514L;

    /**
     * 小程序商品列表
     */
    @ApiListField("result_obj")
    @ApiField("item_v_o")
    private List<ItemVO> resultObj;

    public void setResultObj(List<ItemVO> resultObj) {
        this.resultObj = resultObj;
    }

    public List<ItemVO> getResultObj() {
        return this.resultObj;
    }

}
