package com.bridgelabz.employeewagecomputation;

public class AddparttimeEmployeeandWage {

    public static void main(String args[]) {
        int PART_TIME = 1;
        int FULL_TIME = 2;
        int WAGE_PER_HR = 20;
        int empType = (int) (Math.random() * 10) % 3;
        int workingHours = 0;
        if (empType == FULL_TIME) {
            System.out.println("Employee is Present Full time");
            workingHours = 8;
        } else if (empType == PART_TIME) {
            System.out.println("Employee is Present Part time");
            workingHours = 4;
        } else {
            System.out.println("Employee is Absent");
        }
        int wage = workingHours * WAGE_PER_HR;
        System.out.println("Employee Daily Wage is " + wage);
    }
}
