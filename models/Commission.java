package models;

import java.util.List;

public class Commission {
    private int staffCode;
    private String staffName;
    private double baseAmount;
    private List<SaleAction> saleActions;

    public Commission(int staffCode, String staffName, double baseAmount, List<SaleAction> saleActions) {
        this.staffCode = staffCode;
        this.staffName = staffName;
        this.baseAmount = baseAmount;
        this.saleActions = saleActions;
    }

    public int getStaffCode() {
        return staffCode;
    }

    public void setStaffCode(int staffCode) {
        this.staffCode = staffCode;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public double getBaseAmount() {
        return this.baseAmount;
    }

    public void setBaseAmount(double baseAmount) {
        this.baseAmount = baseAmount;
    }

    public List<SaleAction> getSaleActions() {
        return saleActions;
    }

    public void setSaleActions(List<SaleAction> saleActions) {
        this.saleActions = saleActions;
    }
}
