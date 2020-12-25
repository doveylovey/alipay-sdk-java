package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.drawcamp.update response.
 *
 * @author auto create
 * @since 1.0, 2020-08-20 13:53:40
 */
public class AlipayMarketingCampaignDrawcampUpdateResponse extends AlipayResponse {

    private static final long serialVersionUID = 6481685966654768453L;

    /**
     * 操作结果状态，true表示修改成功立即生效，false表示修改失败
     */
    @ApiField("camp_result")
    private Boolean campResult;

    public void setCampResult(Boolean campResult) {
        this.campResult = campResult;
    }

    public Boolean getCampResult() {
        return this.campResult;
    }

}
