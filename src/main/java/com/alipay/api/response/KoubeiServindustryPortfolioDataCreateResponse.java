package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.servindustry.portfolio.data.create response.
 *
 * @author auto create
 * @since 1.0, 2020-06-18 11:55:07
 */
public class KoubeiServindustryPortfolioDataCreateResponse extends AlipayResponse {

    private static final long serialVersionUID = 6253666258918517581L;

    /**
     * 作品集ID
     */
    @ApiField("portfolio_id")
    private String portfolioId;

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getPortfolioId() {
        return this.portfolioId;
    }

}
