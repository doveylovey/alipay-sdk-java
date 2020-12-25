package com.alipay.api.response;

import java.util.List;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpusInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.servindustry.portfolio.opus.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2020-06-18 11:56:00
 */
public class KoubeiServindustryPortfolioOpusBatchqueryResponse extends AlipayResponse {

    private static final long serialVersionUID = 2694153572981784263L;

    /**
     * 素材列表
     */
    @ApiListField("opuses")
    @ApiField("opus_info")
    private List<OpusInfo> opuses;

    /**
     * 总数
     */
    @ApiField("total_size")
    private Long totalSize;

    public void setOpuses(List<OpusInfo> opuses) {
        this.opuses = opuses;
    }

    public List<OpusInfo> getOpuses() {
        return this.opuses;
    }

    public void setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
    }

    public Long getTotalSize() {
        return this.totalSize;
    }

}
