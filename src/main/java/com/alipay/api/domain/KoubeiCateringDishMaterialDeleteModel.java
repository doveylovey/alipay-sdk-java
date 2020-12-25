package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑菜品库加料删除接口
 *
 * @author auto create
 * @since 1.0, 2020-09-08 17:20:32
 */
public class KoubeiCateringDishMaterialDeleteModel extends AlipayObject {

    private static final long serialVersionUID = 2431717921992948646L;

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
