package theSingleResponsibilityPrinciple;

import java.util.Date;

public class EmployeeObeys {
     class HRPromotions{
        public boolean isPromotionDueThisYear(Employee emp){
            return true;
        }
    }
    public class FinITCalculations{
        public Double calcIncomeTaxForCurrentYear(Employee emp){
            return 0.0;
        }
    }
    class Employee{
        private String employeeId;
        private String name;
        private String address;
        private Date dateOfJoining;
    }

}
