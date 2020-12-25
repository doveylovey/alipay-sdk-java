package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.auth.app.aes.set response.
 *
 * @author auto create
 * @since 1.0, 2020-10-13 18:00:01
 */
public class AlipayOpenAuthAppAesSetResponse extends AlipayResponse {

    private static final long serialVersionUID = 2276461261189174674L;

    /**
     * 商家应用AES KEY密文，需要ISV使用三方应用配置的AES密钥内容进行解密。通过SDK解密获取明文可参考接口说明中的文档操作。
     */
    @ApiField("aes_key")
    private String aesKey;

    public void setAesKey(String aesKey) {
        this.aesKey = aesKey;
    }

    public String getAesKey() {
        return this.aesKey;
    }

}
