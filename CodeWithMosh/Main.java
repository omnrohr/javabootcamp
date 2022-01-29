public class Main {
    public static void main(String[] args) {
        Employee2 emad = new Employee2();
        emad.baseSalary = 3000;
        emad.hourlyRate = 100;
        int emadWage = emad.calculatelWage(10);
        System.out.println(emadWage);
    }
}
