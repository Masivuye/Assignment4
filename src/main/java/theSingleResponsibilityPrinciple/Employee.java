package theSingleResponsibilityPrinciple;

import java.util.Date;

public class Employee{
    private String employeeId;
    private String name;
    private String address;
    private Date dateOfJoining;
    public boolean isPromotionDueThisYear(){
        return true;
    }
    public Double calcIncomeTaxForCurrentYear(){
        return 0.0;
    }

}
