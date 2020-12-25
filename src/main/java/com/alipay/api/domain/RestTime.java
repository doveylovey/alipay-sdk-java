package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 大出行智能平台-排班任务-休息时间段
 *
 * @author auto create
 * @since 1.0, 2020-08-18 21:32:56
 */
public class RestTime extends AlipayObject {

    private static final long serialVersionUID = 4585137474543839715L;

    /**
     * 扩展参数，json格式，由双方约定取值
     */
    @ApiField("ext_param")
    private String extParam;

    /**
     * 休息时间段结束时刻（hh24:mi:ss）
     */
    @ApiField("rest_end_time")
    private String restEndTime;

    /**
     * 休息时间段开始时刻（hh24:mi:ss）
     */
    @ApiField("rest_start_time")
    private String restStartTime;

    /**
     * 该时间段内的休息时长，单位：分钟
     */
    @ApiField("rest_time")
    private Long restTime;

    public String getExtParam() {
        return this.extParam;
    }

    public void setExtParam(String extParam) {
        this.extParam = extParam;
    }

    public String getRestEndTime() {
        return this.restEndTime;
    }

    public void setRestEndTime(String restEndTime) {
        this.restEndTime = restEndTime;
    }

    public String getRestStartTime() {
        return this.restStartTime;
    }

    public void setRestStartTime(String restStartTime) {
        this.restStartTime = restStartTime;
    }

    public Long getRestTime() {
        return this.restTime;
    }

    public void setRestTime(Long restTime) {
        this.restTime = restTime;
    }

}
