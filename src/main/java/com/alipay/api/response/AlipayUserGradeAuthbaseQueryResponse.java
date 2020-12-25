package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.grade.authbase.query response.
 *
 * @author auto create
 * @since 1.0, 2020-08-17 21:15:21
 */
public class AlipayUserGradeAuthbaseQueryResponse extends AlipayResponse {

    private static final long serialVersionUID = 6375117623614668687L;

    /**
     * 用户的蚂蚁会员积分余额
     */
    @ApiField("balance")
    private Long balance;

    /**
     * 用户的蚂蚁会员等级
     */
    @ApiField("grade")
    private String grade;

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public Long getBalance() {
        return this.balance;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return this.grade;
    }

}
