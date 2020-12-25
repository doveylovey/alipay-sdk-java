package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁电子发票平台用户发票抬头列表获取
 *
 * @author auto create
 * @since 1.0, 2020-05-20 15:51:36
 */
public class AlipayEbppInvoiceTitleListGetModel extends AlipayObject {

    private static final long serialVersionUID = 6339463925594498963L;

    /**
     * 支付宝用户id
     */
    @ApiField("user_id")
    private String userId;

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
