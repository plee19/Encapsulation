package lab4;

/**
 * Class to simulate an HR representative, with responsibilities of hiring Employees, running orientation,
 * and operating the print service for reports.
 * @author plee19
 * @version 1
 */

import lab4.solution.Employee;

import java.util.ArrayList;
import java.util.List;

public class HrRepresentative {
    private List<Employee> employees;

    public HrRepresentative() {
        employees = new ArrayList();
    }

    public void hireEmployee(String firstName, String lastName, String ssn) {
        Employee emp = new Employee(firstName,lastName,ssn);
        employees.add(emp);
        orientEmployee(emp);
    }

    public void orientEmployee(Employee emp) {
        emp.doFirstTimeOrientation("12");
    }

    public void outputReport(String ssn) {
        Employee e = null;

        for(Employee emp : employees) {
            if(emp.getSsn().equals(ssn)) {
                e = emp;
                break;
            } else {
                return;
            }
        }

        if(e.isMetWithHr() && e.isMetDeptStaff() && e.isReviewedDeptPolicies() && e.isMovedIn()) {
            e.getReportService().outputReport();
        }
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public static void main(String[] args) {
        HrRepresentative hr = new HrRepresentative();
        hr.hireEmployee("Paul", "Lee", "123-45-6789");
        System.out.println(hr.getEmployees());
    }
}
