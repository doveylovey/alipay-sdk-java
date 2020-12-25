package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账户验证
 *
 * @author auto create
 * @since 1.0, 2020-05-26 16:12:25
 */
public class AlipayOverseasOpenAccountConsultModel extends AlipayObject {

    private static final long serialVersionUID = 7224951286472524338L;

    /**
     * 账户名称
     */
    @ApiField("account_name")
    private String accountName;

    /**
     * 账户号
     */
    @ApiField("account_no")
    private String accountNo;

    /**
     * 银行代码包括：
     * <p>
     * 美国银行abafw号
     * <p>
     * （aba/fw）
     * <p>
     * 英国收款银行清算号(sort_code)
     * <p>
     * 澳大利亚收款银行清算号(bsb_code)
     * <p>
     * 加拿大收款银行清算号(cc_code)
     */
    @ApiField("bank_code")
    private String bankCode;

    /**
     * 国家
     */
    @ApiField("country")
    private String country;

    /**
     * 学校id
     */
    @ApiField("school_id")
    private String schoolId;

    /**
     * swift code
     */
    @ApiField("swift_code")
    private String swiftCode;

    public String getAccountName() {
        return this.accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNo() {
        return this.accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getBankCode() {
        return this.bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSchoolId() {
        return this.schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public String getSwiftCode() {
        return this.swiftCode;
    }

    public void setSwiftCode(String swiftCode) {
        this.swiftCode = swiftCode;
    }

}
