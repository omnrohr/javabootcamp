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
            case "a": {
                System.out.println("\nWhat is your budjet?");
                int budget = scanner.nextInt();
                scanner.nextLine();
                if (budget >= 10000) {
                    System.out.println("\n\tGreat A Nisan altima is available");
                    System.out.println("\nDo you have insurance?, type 'yes' or 'no'.");
                    String insurance = scanner.nextLine();
                    System.out.println("\nDo you have a Licenses?, type 'yes' or 'no'.");
                    String licenses = scanner.nextLine();
                    System.out.println("\nWhat is your credit score?, type 'yes' or 'no'.");
                    int creditScore = scanner.nextInt();
                    scanner.nextLine();
                    if (insurance.equals("yes") && licenses.equals("yes") && creditScore > 660) {
                        System.out.println("\nSold Pleasure doing business with you");
                    } else {
                        System.out.println("\nSorry, you are not eligible");
                    }

                } else {
                    System.out.println("\tSorry we don't sell cars under $10,000");
                }
                break;
            }
            case "b":
                System.out.println("\nWhat is your car value at? ");
                int value = scanner.nextInt();
                System.out.println("\nWhat is your selling price?");
                int selling = scanner.nextInt();
                if (value > selling && selling < 30000) {
                    System.out.println("\nWe will buy your car. Pleasure to do business with you!");
                } else {
                    System.out.println("\nSorry we're not interested.");
                }
                break;
            default:
                System.out.println("\nInvalid choice.");
        }
        scanner.close();
    }

}
