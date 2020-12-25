package com.alipay.api.request;

import com.alipay.api.domain.AlipayOpenMiniInnerversionOfflineModel;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayOpenMiniInnerversionOfflineResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.open.mini.innerversion.offline request
 *
 * @author auto create
 * @since 1.0, 2019-05-06 10:38:32
 */
public class AlipayOpenMiniInnerversionOfflineRequest implements AlipayRequest<AlipayOpenMiniInnerversionOfflineResponse> {

    private AlipayHashMap udfParams; // add user-defined text parameters
    private String apiVersion = "1.0";

    /**
     * 内部小程序 - 下架
     */
    private String bizContent;

    public void setBizContent(String bizContent) {
        this.bizContent = bizContent;
    }

    public String getBizContent() {
        return this.bizContent;
    }

    private String terminalType;
    private String terminalInfo;
    private String prodCode;
    private String notifyUrl;
    private String returnUrl;
    private boolean needEncrypt = false;
    private AlipayObject bizModel = null;

    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getReturnUrl() {
        return this.returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public String getApiVersion() {
        return this.apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType;
    }

    public String getTerminalType() {
        return this.terminalType;
    }

    public void setTerminalInfo(String terminalInfo) {
        this.terminalInfo = terminalInfo;
    }

    public String getTerminalInfo() {
        return this.terminalInfo;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode;
    }

    public String getProdCode() {
        return this.prodCode;
    }

    public String getApiMethodName() {
        return "alipay.open.mini.innerversion.offline";
    }

    public Map<String, String> getTextParams() {
        AlipayHashMap txtParams = new AlipayHashMap();
        txtParams.put("biz_content", this.bizContent);
        if (udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new AlipayHashMap();
        }
        this.udfParams.put(key, value);
    }

    public Class<AlipayOpenMiniInnerversionOfflineResponse> getResponseClass() {
        return AlipayOpenMiniInnerversionOfflineResponse.class;
    }


    public boolean isNeedEncrypt() {

        return this.needEncrypt;
    }


    public void setNeedEncrypt(boolean needEncrypt) {

        this.needEncrypt = needEncrypt;
    }

    public AlipayObject getBizModel() {

        return this.bizModel;
    }


    public void setBizModel(AlipayObject bizModel) {

        this.bizModel = bizModel;
    }


}
