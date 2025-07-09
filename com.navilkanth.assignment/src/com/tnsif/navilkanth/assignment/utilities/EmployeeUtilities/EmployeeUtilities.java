package com.tnsif.navilkanth.assignment.utilities.EmployeeUtilities;

import com.tnsif.navilkanth.assignment.employees.*;

/**
 * Provides utility methods for Employee objects.
 * Demonstrates usage of access modifiers across packages.
 */
public class EmployeeUtilities {

    public static void printEmployeeDetails(Employee emp) {
        System.out.println("Name: " + emp.getName());
        System.out.println("ID: " + emp.getEmployeeId());
        System.out.println("Salary: " + emp.getSalary());
    }

    public static void updateSalary(Employee emp, double newSalary) {
        emp.setSalary(newSalary); // Accessing protected method
    }
}