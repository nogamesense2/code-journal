package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        final int SALARY_CEILING = 6000;
        final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
        final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
        final double EMPLOYEE_RATE_55_TO_60 = 0.13;
        final double EMPLOYER_RATE_55_TO_60 = 0.13;
        final double EMPLOYEE_RATE_60_TO_65 = 0.075;
        final double EMPLOYER_RATE_60_TO_65 = 0.09;
        final double EMPLOYEE_RATE_65_ABOVE = 0.05;
        final double EMPLOYER_RATE_65_ABOVE = 0.075;
        final double SENTINEL = -1;
        double contributableSalary, age = 0;
        double employeeContribution = 0, employerContribution = 0 , totalContribution = 0;
        Scanner in = new Scanner(System.in);
        int salary = 0;
        while(salary != SENTINEL){
            System.out.println("Enter the monthly salary (or -1 to end): to end");
             salary = in.nextInt();
            System.out.println("Enter your age : ");
            age = in.nextDouble();
            contributableSalary = employeeContribution * salary;
            if (age <= 55) {
                totalContribution = EMPLOYEE_RATE_55_AND_BELOW * salary + EMPLOYER_RATE_55_AND_BELOW * salary;
                employeeContribution = EMPLOYEE_RATE_55_AND_BELOW * salary;
                employerContribution = EMPLOYER_RATE_55_AND_BELOW * salary;
            } else if (age <= 60) {
                totalContribution = EMPLOYEE_RATE_55_TO_60 * salary + EMPLOYER_RATE_55_TO_60 * salary;
                employeeContribution = EMPLOYEE_RATE_55_TO_60 * salary;
                employerContribution = EMPLOYER_RATE_55_TO_60 * salary;
            } else if (age <= 65) {
                totalContribution = EMPLOYEE_RATE_60_TO_65 * salary + EMPLOYER_RATE_60_TO_65 * salary;
                employeeContribution = EMPLOYEE_RATE_60_TO_65 * salary;
                employerContribution = EMPLOYER_RATE_60_TO_65 * salary;

            } else if (age <= 70) {
                totalContribution = EMPLOYEE_RATE_65_ABOVE * salary + EMPLOYER_RATE_65_ABOVE * salary;
                employeeContribution = EMPLOYEE_RATE_65_ABOVE * salary;
                employerContribution = EMPLOYEE_RATE_65_ABOVE * salary;
            }
            System.out.println("\nThe employee's contribution is : " + employeeContribution);
            System.out.println("The employer's contribution is : " + employerContribution);
            System.out.println("The total contribution is : " + totalContribution);
            // Read the next input and repeat
            System.out.print("Enter the monthly salary (or -1 to end): $");
            salary = in.nextInt();
        }

    }
}
