package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.KbdishAreaInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.area.sync response.
 *
 * @author auto create
 * @since 1.0, 2020-09-08 17:21:16
 */
public class KoubeiCateringDishAreaSyncResponse extends AlipayResponse {

    private static final long serialVersionUID = 1347352247295283512L;

    /**
     * 餐区餐台模型
     */
    @ApiField("kb_dish_area")
    private KbdishAreaInfo kbDishArea;

    public void setKbDishArea(KbdishAreaInfo kbDishArea) {
        this.kbDishArea = kbDishArea;
    }

    public KbdishAreaInfo getKbDishArea() {
        return this.kbDishArea;
    }

}
