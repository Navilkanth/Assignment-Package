package com.tnsif.navilkanth.assignment.main;	
import com.tnsif.navilkanth.assignment.employees.*;
import com.tnsif.navilkanth.assignment.utilities.EmployeeUtilities.*;
public class AssignmentMain{
	    public static void main(String[] args) {
	        Manager mgr = new Manager("Alice", 101, 95000, 5);
	        Developer dev = new Developer("Bob", 202, 85000, "Java");

	        EmployeeUtilities.printEmployeeDetails(mgr);
	        EmployeeUtilities.printEmployeeDetails(dev);

	        EmployeeUtilities.updateSalary(dev, 88000);
	        System.out.println("Updated Salary for Developer:");
	        EmployeeUtilities.printEmployeeDetails(dev);
	    }
	}


