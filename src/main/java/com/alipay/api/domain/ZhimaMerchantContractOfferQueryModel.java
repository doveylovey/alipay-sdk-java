package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻约定查询发约单详情接口
 *
 * @author auto create
 * @since 1.0, 2020-08-20 10:18:27
 */
public class ZhimaMerchantContractOfferQueryModel extends AlipayObject {

    private static final long serialVersionUID = 3127665453589675243L;

    /**
     * 发约单单号
     */
    @ApiField("offer_no")
    private String offerNo;

    public String getOfferNo() {
        return this.offerNo;
    }

    public void setOfferNo(String offerNo) {
        this.offerNo = offerNo;
    }

}
