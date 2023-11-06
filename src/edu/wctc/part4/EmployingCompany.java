package edu.wctc.part4;

public class EmployingCompany {

    private HumanResourceOnboardingSpecialist humanResourceOnboardingSpecialist;

    public EmployingCompany() {
        humanResourceOnboardingSpecialist = new HumanResourceOnboardingSpecialist();
    }


    public void hireEmployee(String firstName, String lastName, String ssn) {
        humanResourceOnboardingSpecialist.hireNewEmployee(firstName, lastName, ssn);
        humanResourceOnboardingSpecialist.createReport(ssn);
    }
}
