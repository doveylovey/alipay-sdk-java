package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PaginationCommGroup;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.commgroup.query response.
 *
 * @author auto create
 * @since 1.0, 2020-09-02 11:49:20
 */
public class KoubeiCateringDishCommgroupQueryResponse extends AlipayResponse {

    private static final long serialVersionUID = 3857659244529555899L;

    /**
     * 客制化组分页信息
     */
    @ApiField("kb_dish_group_page_info")
    private PaginationCommGroup kbDishGroupPageInfo;

    public void setKbDishGroupPageInfo(PaginationCommGroup kbDishGroupPageInfo) {
        this.kbDishGroupPageInfo = kbDishGroupPageInfo;
    }

    public PaginationCommGroup getKbDishGroupPageInfo() {
        return this.kbDishGroupPageInfo;
    }

}
