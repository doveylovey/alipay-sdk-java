package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取报销发票详细信息
 *
 * @author auto create
 * @since 1.0, 2020-09-04 15:20:23
 */
public class AlipayEbppInvoiceDetailOutputQueryModel extends AlipayObject {

    private static final long serialVersionUID = 5375791746275745696L;

    /**
     * 发票代码
     * 长度限制（10-12位）
     */
    @ApiField("invoice_code")
    private String invoiceCode;

    /**
     * 发票号码
     * 长度限制（8-10位）
     */
    @ApiField("invoice_no")
    private String invoiceNo;

    /**
     * 获取发票明细应用场景
     * 固定值：INVOICE_EXPENSE-发票报销
     */
    @ApiField("scene")
    private String scene;

    /**
     * 是否跳过发票报销状态同步；当为true时，跳过报销状态同步校验。默认为false，需要先做报销状态同步
     */
    @ApiField("skip_expense_progress_sync")
    private Boolean skipExpenseProgressSync;

    /**
     * 支付宝用户id
     */
    @ApiField("user_id")
    private String userId;

    public String getInvoiceCode() {
        return this.invoiceCode;
    }

    public void setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
    }

    public String getInvoiceNo() {
        return this.invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getScene() {
        return this.scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    public Boolean getSkipExpenseProgressSync() {
        return this.skipExpenseProgressSync;
    }

    public void setSkipExpenseProgressSync(Boolean skipExpenseProgressSync) {
        this.skipExpenseProgressSync = skipExpenseProgressSync;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
