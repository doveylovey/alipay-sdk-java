package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * isv服务初始化接口
 *
 * @author auto create
 * @since 1.0, 2020-10-19 16:44:57
 */
public class AlipayIserviceCcmServiceInitializeModel extends AlipayObject {

    private static final long serialVersionUID = 1123173821844519281L;

    /**
     * 服务描述
     */
    @ApiField("description")
    private String description;

    /**
     * 服务图标url
     */
    @ApiField("icon")
    private String icon;

    /**
     * 服务编码
     */
    @ApiField("service_code")
    private String serviceCode;

    /**
     * 服务名称
     */
    @ApiField("service_name")
    private String serviceName;

    /**
     * 服务订购二维码链接
     */
    @ApiField("service_order_url")
    private String serviceOrderUrl;

    /**
     * spi定义列表
     */
    @ApiListField("spis")
    @ApiField("isv_spi_definition")
    private List<IsvSpiDefinition> spis;

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getServiceCode() {
        return this.serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceOrderUrl() {
        return this.serviceOrderUrl;
    }

    public void setServiceOrderUrl(String serviceOrderUrl) {
        this.serviceOrderUrl = serviceOrderUrl;
    }

    public List<IsvSpiDefinition> getSpis() {
        return this.spis;
    }

    public void setSpis(List<IsvSpiDefinition> spis) {
        this.spis = spis;
    }

}
