package com.tnsif.navilkanth.assignment.employees;




public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int employeeId, double salary, String language) {
        super(name, employeeId, salary);
        this.programmingLanguage = language;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
}
