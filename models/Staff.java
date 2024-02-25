package models;

public class Staff {
    private int staffCode;
    private String staffName;
    public Staff(int staffCode, String staffName) {
        this.staffCode = staffCode;
        this.staffName = staffName;
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

    @Override
    public String toString() {
        return "Staff [staffCode=" + staffCode + ", staffName=" + staffName + "]";
    }
}
