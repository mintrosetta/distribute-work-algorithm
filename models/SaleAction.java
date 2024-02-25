package models;

import java.util.Date;

public class SaleAction {
    private Date subitDate;
    private int saleId;
    private String actionCode;
    private String remark;
    private double baseDeductAmount;
    private int sequence;

    

    public SaleAction(Date subitDate, int saleId, String actionCode, String remark, double baseDeductAmount,
            int sequence) {
        this.subitDate = subitDate;
        this.saleId = saleId;
        this.actionCode = actionCode;
        this.remark = remark;
        this.baseDeductAmount = baseDeductAmount;
        this.sequence = sequence;
    }

    public Date getSubitDate() {
        return subitDate;
    }

    public void setSubitDate(Date subitDate) {
        this.subitDate = subitDate;
    }

    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    public String getActionCode() {
        return actionCode;
    }

    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public double getBaseDeductAmount() {
        return baseDeductAmount;
    }

    public void setBaseDeductAmount(double baseDeductAmount) {
        this.baseDeductAmount = baseDeductAmount;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }
}
