package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询商品的返利集分宝信息
 *
 * @author auto create
 * @since 1.0, 2020-08-11 15:38:48
 */
public class AlipayEcoRebateBalanceQueryModel extends AlipayObject {

    private static final long serialVersionUID = 5748913184151423759L;

    /**
     * 商户侧唯一商品id，查询商品的返利信息
     */
    @ApiField("item_id")
    private String itemId;

    /**
     * 蚂蚁统一会员ID
     */
    @ApiField("user_id")
    private String userId;

    public String getItemId() {
        return this.itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
