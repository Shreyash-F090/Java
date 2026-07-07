package com.mycompany.conceptofinterfaces;

// Interface
interface Employee {
    double calculateSalary();
}

// Full-Time Employee
class FullTimeEmployee implements Employee {
    double salary = 50000;

    @Override
    public double calculateSalary() {
        return salary;
    }
}

// Part-Time Employee
class PartTimeEmployee implements Employee {
    int hours = 80;
    double rate = 300;

    @Override
    public double calculateSalary() {
        return hours * rate;
    }
}

// Contract Employee
class ContractEmployee implements Employee {
    double salary = 18000;

    @Override
    public double calculateSalary() {
        return salary;
    }
}

// Main Class
public class Conceptofinterfaces {

    public static void main(String[] args) {

        System.out.println("Shreyash Kadam");

        Employee fullTime = new FullTimeEmployee();
        Employee partTime = new PartTimeEmployee();
        Employee contract = new ContractEmployee();

        System.out.println("Full-Time Employee Salary: Rs." + fullTime.calculateSalary());
        System.out.println("Part-Time Employee Salary: Rs." + partTime.calculateSalary());
        System.out.println("Contract Employee Salary: Rs." + contract.calculateSalary());
    }
}