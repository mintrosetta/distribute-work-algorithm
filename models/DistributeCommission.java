package models;

import java.util.List;

public class DistributeCommission extends Commission {
    private int inspectorCode;
    private String inspectorName;

    public DistributeCommission(
        int staffCode, 
        String staffName, 
        double baseAmount, 
        List<SaleAction> saleActions,
        int inspectorCode,
        String inspectorName) {
        super(staffCode, staffName, baseAmount, saleActions);
        this.inspectorCode = inspectorCode;
        this.inspectorName = inspectorName;
    }

    public int getInspectorCode() {
        return inspectorCode;
    }

    public void setInspectorCode(int inspectorCode) {
        this.inspectorCode = inspectorCode;
    }

    public String getInspectorName() {
        return inspectorName;
    }

    public void setInspectorName(String inspectorName) {
        this.inspectorName = inspectorName;
    }
}