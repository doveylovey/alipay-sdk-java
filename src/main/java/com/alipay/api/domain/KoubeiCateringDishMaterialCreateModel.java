package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑菜品库加料新增接口
 *
 * @author auto create
 * @since 1.0, 2020-09-08 17:21:07
 */
public class KoubeiCateringDishMaterialCreateModel extends AlipayObject {

    private static final long serialVersionUID = 8554923754474332132L;

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
