package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.antforest.tree.sync response.
 *
 * @author auto create
 * @since 1.0, 2020-09-14 10:57:26
 */
public class AlipaySocialAntforestTreeSyncResponse extends AlipayResponse {

    private static final long serialVersionUID = 5564958479116324581L;

    /**
     * 同步是否成功
     */
    @ApiField("synced")
    private Boolean synced;

    public void setSynced(Boolean synced) {
        this.synced = synced;
    }

    public Boolean getSynced() {
        return this.synced;
    }

}
