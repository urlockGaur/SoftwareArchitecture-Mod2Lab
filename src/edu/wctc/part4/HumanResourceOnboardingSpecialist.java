package edu.wctc.part4;

import edu.wctc.part4.solution.Employee;

import java.util.ArrayList;
import java.util.List;

public class HumanResourceOnboardingSpecialist {

    private List<Employee> employees = new ArrayList<>();
    public HumanResourceOnboardingSpecialist() {

    }

    public void hireNewEmployee(String firstName, String lastName, String ssn)
    {
        Employee e = new Employee(firstName, lastName, ssn);
        employees.add(e);
        orientEmployee(e);
    }

    private void orientEmployee(Employee e)
    {

    }

    public void createReport(String ssn)
    {
        // find employee in list
        for (Employee emp : employees) {
            if (emp.getSsn().equals(ssn)) {
                // if found run report
                if (emp.hasMetWithHr() && emp.hasMetDeptStaff()
                        && emp.hasReviewedDeptPolicies() && emp.hasMovedIn()) {
                    emp.printReport();
                }
                break;
            }
        }
    }
}
