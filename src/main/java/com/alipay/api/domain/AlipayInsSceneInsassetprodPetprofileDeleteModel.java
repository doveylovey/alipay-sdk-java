package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 宠物险宠物档案删除
 *
 * @author auto create
 * @since 1.0, 2020-09-21 20:10:19
 */
public class AlipayInsSceneInsassetprodPetprofileDeleteModel extends AlipayObject {

    private static final long serialVersionUID = 3539337321482747784L;

    /**
     * 渠道
     */
    @ApiField("channel")
    private String channel;

    /**
     * 宠物ID
     */
    @ApiField("pet_id")
    private String petId;

    public String getChannel() {
        return this.channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getPetId() {
        return this.petId;
    }

    public void setPetId(String petId) {
        this.petId = petId;
    }

}
