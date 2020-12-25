package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑菜品库加料修改接口
 *
 * @author auto create
 * @since 1.0, 2020-09-08 17:20:54
 */
public class KoubeiCateringDishMaterialModifyModel extends AlipayObject {

    private static final long serialVersionUID = 4585131333633726483L;

    /**
     * 菜品加料入参
     */
    @ApiField("kb_dish_material_info")
    private KbdishMaterialInfo kbDishMaterialInfo;

    public KbdishMaterialInfo getKbDishMaterialInfo() {
        return this.kbDishMaterialInfo;
    }

    public void setKbDishMaterialInfo(KbdishMaterialInfo kbDishMaterialInfo) {
        this.kbDishMaterialInfo = kbDishMaterialInfo;
    }

}
