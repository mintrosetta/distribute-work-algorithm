import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import models.Commission;
import models.DistributeCommission;
import models.SaleAction;
import models.Staff;

public class Main {
    public static void main(String[] args) {
        // initial staffs data
        List<Staff> staffs = new ArrayList<Staff>();
        staffs.add(new Staff(490010, "Mint Rosetta"));
        staffs.add(new Staff(490011, "Nine Colorfuls"));
        staffs.add(new Staff(490012, "Asukamaru hiroshi"));

        // initial commission data
        List<Commission> commissions = new ArrayList<Commission>();

        List<SaleAction> saleActions = new ArrayList<>();
        saleActions.add(new SaleAction(new Date(), 1, "ZAC01", "Testing sale 10000", 1500.0D, 0));
        saleActions.add(new SaleAction(new Date(), 2, "ZAC01", "Testing sale 200", 1500.0D, 0));
        saleActions.add(new SaleAction(new Date(), 3, "ZAC01", "Testing sale 3506", 1500.0D, 0));
        saleActions.add(new SaleAction(new Date(), 4, "ZAC01", "Testing sale 700", 1500.0D, 0));

        commissions.add(new Commission(300001, "Testing A", 10000, saleActions));
        commissions.add(new Commission(300002, "Testing B", 7000, saleActions));
        commissions.add(new Commission(300003, "Testing C", 12500, saleActions));
        commissions.add(new Commission(300004, "Testing D", 7500, saleActions));
        commissions.add(new Commission(300005, "Testing E", 200, saleActions));

        // employee request distribute work should be admin role
        String role = "admin";
        if (!role.equals("admin"))
            throw new Error("Employee request distribute work should be admin");

        // create lisf of object for store distribute work
        List<DistributeCommission> distributeCommissions = new ArrayList<DistributeCommission>();

        int currentStaffIndex = 0;
        for (int comIndex = 0; comIndex < commissions.size(); comIndex++) {
            Commission commission = commissions.get(comIndex);

            // validate commission has old inspector
            boolean hasOldInspector = (comIndex == 1);
            if (hasOldInspector) {
                // have old inspector

                // get old inspector
                Staff staff = new Staff(620107, "Chanokchon Wongjampa");

                DistributeCommission distributeCommission = new DistributeCommission(
                        commission.getStaffCode(),
                        commission.getStaffName(),
                        commission.getBaseAmount(),
                        commission.getSaleActions(),
                        staff.getStaffCode(),
                        staff.getStaffName());

                distributeCommissions.add(distributeCommission);
            } else {
                // no have old inspector

                // get staff from input by index
                Staff staff = staffs.get(currentStaffIndex++);

                DistributeCommission distributeCommission = new DistributeCommission(
                        commission.getStaffCode(),
                        commission.getStaffName(),
                        commission.getBaseAmount(),
                        commission.getSaleActions(),
                        staff.getStaffCode(),
                        staff.getStaffName());

                distributeCommissions.add(distributeCommission);
            }

            // validate staffIndex is equals to staffs.size(), set index to 0
            if (currentStaffIndex == staffs.size()) currentStaffIndex = 0;
        }

        // display result
        for (DistributeCommission distributeCommission : distributeCommissions) {
            System.out.println(
                distributeCommission.getStaffCode() + " | " + 
                distributeCommission.getStaffName() + " | " + 
                distributeCommission.getInspectorName());
        }

        System.out.println("Successful");
    }
}