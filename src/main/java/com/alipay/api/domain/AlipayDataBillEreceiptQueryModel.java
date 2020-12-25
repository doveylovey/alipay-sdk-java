package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询电子回单状态
 *
 * @author auto create
 * @since 1.0, 2020-08-04 16:50:38
 */
public class AlipayDataBillEreceiptQueryModel extends AlipayObject {

    private static final long serialVersionUID = 5153776814454719237L;

    /**
     * 根据申请id查询状态
     */
    @ApiField("file_id")
    private String fileId;

    public String getFileId() {
        return this.fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

}
