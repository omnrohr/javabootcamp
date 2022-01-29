package com.company.CodeWithMosh;

public class Emploee {
    private int salary;
    private int extraHours;
    private int hourRate;

    public Emploee(int extraHours) {
        this.salary = 3000;
        this.extraHours = extraHours;
        this.hourRate = 10;
    }

    public Emploee(int salary, int extraHours, int hourRate) {
        this.salary = salary;
        this.extraHours = extraHours;
        this.hourRate = hourRate;
    }

    public Emploee(Emploee source) {
        this.salary = source.salary;
        this.extraHours = source.extraHours;
        this.hourRate = source.hourRate;
    }

    static int calculatelWage(int salary, int extraHours, int hourRate) {
        return salary + (extraHours * hourRate);
    }

}
