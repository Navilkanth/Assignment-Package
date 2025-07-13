package com.tnsif.constructors;
import com.tnsif.constructors.Commision;
import com.tnsif.constructors.Commision.*;
import com.tnsif.constructors.Student;

;
public class Main {
    public static void main(String[] args) {
        // Create Student object
        Student student = new Student();

        // Create Commission object
        Commision employee = new Commision();
        employee.acceptDetails();
        employee.calculateCommission();
    }
}