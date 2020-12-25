package com.alipay.api.response;

import java.util.List;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CmItemInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.item.open.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2019-09-18 15:45:54
 */
public class AntMerchantExpandItemOpenBatchqueryResponse extends AlipayResponse {

    private static final long serialVersionUID = 3456147619733443415L;

    /**
     * 商品列表
     */
    @ApiListField("item_list")
    @ApiField("cm_item_info")
    private List<CmItemInfo> itemList;

    public void setItemList(List<CmItemInfo> itemList) {
        this.itemList = itemList;
    }

    public List<CmItemInfo> getItemList() {
        return this.itemList;
    }

}
