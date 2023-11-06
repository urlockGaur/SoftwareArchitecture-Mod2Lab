package edu.wctc.part3;

public class Main {
    public static void main(String[] args) {
        Employee bob = new Employee("Bob", "Smith", "123456789");
        bob.doFirstTimeOrientation("5");
        bob.reviewDeptPolicies();
        System.out.println(bob);
    }
}
