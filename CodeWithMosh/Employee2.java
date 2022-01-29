public class Employee2 {
    public int baseSalary;
    public int hourlyRate;

    public int calculatelWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    public void setBaseSalary(int baseSalary) {
        if (baseSalary > 0)
            this.baseSalary = baseSalary;
        else
            throw new IllegalArgumentException("baseSalary must be greater than 0");
    }

    public int getBaseSalary() {
        return baseSalary;
    }
}
