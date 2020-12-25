package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * money
 *
 * @author auto create
 * @since 1.0, 2020-07-30 18:06:59
 */
public class Money extends AlipayObject {

    private static final long serialVersionUID = 1653116458755246269L;

    /**
     * 3-letter currency code, refer to ISO 4217 Standard currency alphabetic code
     */
    @ApiField("currency")
    private String currency;

    /**
     * amount value
     */
    @ApiField("value")
    private String value;

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
