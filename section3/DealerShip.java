import java.util.Scanner;

public class DealerShip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Java DealerShip.");
        System.out.println(" # Select ption 'a' to buy a car.");
        System.out.println(" # Select ption 'b' to sel a car.");
        System.out.println();

        String option = scanner.nextLine();

        switch (option) {
            case "a":
                System.out.println("\nYour choice is option " + option);
                break;
            case "b":
                System.out.println("\nYour choice is option " + option);
                break;
            default:
                System.out.println("\nInvalid choice.");
        }
        scanner.close();
    }

}
