package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 配送指令接收反馈接口
 *
 * @author auto create
 * @since 1.0, 2020-09-14 20:32:37
 */
public class AntMerchantExpandAssetdeliveryAssignSyncModel extends AlipayObject {

    private static final long serialVersionUID = 7838944716252747679L;

    /**
     * 配送指令接收反馈，最多200条
     */
    @ApiListField("delivery_results")
    @ApiField("asset_result")
    private List<AssetResult> deliveryResults;

    public List<AssetResult> getDeliveryResults() {
        return this.deliveryResults;
    }

    public void setDeliveryResults(List<AssetResult> deliveryResults) {
        this.deliveryResults = deliveryResults;
    }

}
