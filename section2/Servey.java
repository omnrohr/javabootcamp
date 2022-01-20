import java.util.Scanner;

public class Servey {
    public static void main(String[] args) {

        int counter = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome. Thank you for taking the survey.");

        System.out.println("\nWhat is your name?");
        String name = scanner.nextLine();

        counter++;

        System.out.println("\nHow much money do you spend on coffe?");
        double coffePrice = scanner.nextDouble();

        counter++;

        System.out.println("\nHow much money do you spend on fast food?");
        double foodPrice = scanner.nextDouble();

        counter++;

        System.out.println("\nHow many times a week do you bye a coffe?");
        int coffeAmount = scanner.nextInt();

        counter++;

        System.out.println("\nHow many time do you bye fast food?");
        int foodAmount = scanner.nextInt();

        counter++;

        scanner.close();

        System.out.println("\nthank you " + name + " for answering all " + counter + " questions\n");
        System.out.println("************  Servey Result ************");
        System.out.println(
                "\nYour fast food expenses are " + (foodPrice / coffePrice) + " times more than your coffe expenses.");
        System.out.println("\nWeekly you spend $" + (coffeAmount * coffePrice) + " on coffe.");
        System.out.println("\nWeekly you spend $" + (foodAmount * foodPrice) + " on fast food.");
        System.out.println("\n************  End of Result ************\n" +
                "***************  Bye ***************\n");

    }
}
