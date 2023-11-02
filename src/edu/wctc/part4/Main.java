package edu.wctc.part4;

import edu.wctc.part4.solution.Company;

/**
 * This class is the startup class for the program. But together with the other
 * classes provided it is not a particularly good simulation of the real world.
 * Employees don't just hire themselves and them tell themselves to go through
 * orientation. There's usually a company and a HR person involved.
 *
 * Refer to the Employee class for further directions.
 */
public class Main {

    public static void main(String[] args) {
        Company company = new Company();

        // Startup delegates work to Company which then delegates work to HRManager
        company.hireEmployee("John", "Doe", "444-44-4444");

    }

}
