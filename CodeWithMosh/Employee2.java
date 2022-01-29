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
            System.out.println("Invalid input");
    }
}
