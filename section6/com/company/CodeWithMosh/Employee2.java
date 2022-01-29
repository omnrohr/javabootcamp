package com.company.CodeWithMosh;

public class Employee2 {
    public int baseSalary;
    public int hourlyRate;

    public int calculatelWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }
}
