package com.bridgelabz.employeewagecomputation;

public class DailyEmployeeWage {
    public static void main(String args[]) {
        int FULL_TIME = 1;
        int WAGE_PER_HR = 20;
        int empCheck = (int) (Math.random() * 10) % 2;
        int workingHours = 0;
        if (empCheck == FULL_TIME) {
            System.out.println("Employee is Present");
            workingHours = 8;
        } else {
            System.out.println("Employee is Absent");
        }
        int wage = workingHours * WAGE_PER_HR;
        System.out.println("Employee Daily Wage is " + wage);
    }
}