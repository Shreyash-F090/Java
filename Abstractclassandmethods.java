/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author Shreyash
 */
// Abstract class
abstract class Employee {

    // Abstract method
    abstract double calculateSalary();

    // Concrete method
    void displaySalary(String employeeType, double salary) {
        System.out.println(employeeType + " Salary: Rs." + salary);
    }
}

// Full-time Employee
class FullTimeEmployee extends Employee {
    double monthlySalary = 91000;

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

// Part-time Employee
class PartTimeEmployee extends Employee {
    int hoursWorked = 91;
    double hourlyRate = 910;

    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

// Intern
class Intern extends Employee {
    double stipend = 12910;

    @Override
    double calculateSalary() {
        return stipend;
    }
}

// Main class
public class Abstractclassandmethods {

    public static void main(String[] args) {

        System.out.println("Shreyash Kadam");

        Employee fullTime = new FullTimeEmployee();
        Employee partTime = new PartTimeEmployee();
        Employee intern = new Intern();

        fullTime.displaySalary("Full-Time Employee", fullTime.calculateSalary());
        partTime.displaySalary("Part-Time Employee", partTime.calculateSalary());
        intern.displaySalary("Intern", intern.calculateSalary());
    }
}