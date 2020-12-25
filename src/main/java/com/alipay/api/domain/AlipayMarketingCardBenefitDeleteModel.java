package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员卡模板外部权益删除
 *
 * @author auto create
 * @since 1.0, 2020-05-15 15:49:55
 */
public class AlipayMarketingCardBenefitDeleteModel extends AlipayObject {

    private static final long serialVersionUID = 1614359913335396342L;

    /**
     * 权益ID
     */
    @ApiField("benefit_id")
    private String benefitId;

    /**
     * 会员卡模板ID
     */
    @ApiField("template_id")
    private String templateId;

    public String getBenefitId() {
        return this.benefitId;
    }

    public void setBenefitId(String benefitId) {
        this.benefitId = benefitId;
    }

    public String getTemplateId() {
        return this.templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

}
