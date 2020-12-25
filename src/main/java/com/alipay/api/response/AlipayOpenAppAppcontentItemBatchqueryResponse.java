package com.alipay.api.response;

import java.util.List;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AppContentItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.appcontent.item.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2020-07-27 09:40:13
 */
public class AlipayOpenAppAppcontentItemBatchqueryResponse extends AlipayResponse {

    private static final long serialVersionUID = 4747281354475154129L;

    /**
     * 商品信息
     */
    @ApiListField("items")
    @ApiField("app_content_item")
    private List<AppContentItem> items;

    public void setItems(List<AppContentItem> items) {
        this.items = items;
    }

    public List<AppContentItem> getItems() {
        return this.items;
    }

}
