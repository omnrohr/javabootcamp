import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        scan.nextLine();

        int userCard1 = getRandomNumber();
        int userCard2 = getRandomNumber();

        int userHand = Math.min(userCard1, 10) + Math.min(userCard2, 10);

        System.out.println("\n You get a \n" + randomCard(userCard1) +
                "\n and a \n" + randomCard(userCard2) + "\n");

        System.out.println("your total is: " + userHand + "\n");

        int dealerCard1 = getRandomNumber();
        int dealerCard2 = getRandomNumber();
        int dealerHand = Math.min(dealerCard1, 10) + Math.min(dealerCard2, 10);

        System.out.println("The dealer shows \n" +
                randomCard(dealerCard1) + "\nand has a card facing down\n" + faceDown());
        System.out.println("\nThe dealer's total is hidden\n");

        while (true) {
            String option = hitOrStay();

            if (option.equals("stay")) {
                break;
            }
            int newHit = getRandomNumber();
            userHand += Math.min(newHit, 10);

            System.out.println("\nYou get a\n" + randomCard(newHit) + "\n" +
                    "your new total is: " + userHand + "\n");

            if (userHand > 21) {
                System.out.println("Bust! Player loses");
                System.exit(0);
            }
        }

        System.out.println("Dealers Turn \n");
        System.out.println("The dealer's cards are " + "\n" + randomCard(dealerCard1) +
                "\nand a " + "\n" + randomCard(dealerCard2) + "\n" + "Dealers Total is :" + dealerHand);

        while (dealerHand < 17) {
            int newDealerHit = getRandomNumber();
            dealerHand += newDealerHit;
            System.out.println("\ndealer get a\n" + randomCard(newDealerHit) + "\n" +
                    "dealer new total is: " + dealerHand + "\n");
        }

        if (dealerHand > 21) {
            System.out.println("Bust! Dealer loses");
            System.exit(0);
        }

        if (userHand > dealerHand) {
            System.out.println("Player wins!");
        } else {
            System.out.println("Dealer wins!");
        }
        scan.close();

    }

    /**
     * Task 1 – make a function that returns a random number between 1 and 13
     * Function name – drawRandomCard
     * 
     * @return (int)
     *
     *         Inside the function:
     *         1. Gets a random number between 1 and 13.
     *         2. Returns a card.
     */

    public static int getRandomNumber() {
        return (int) (Math.random() * 13 + 1);
    }

    /**
     * Task 2 – make a function that returns a String drawing of the card.
     * Function name – cardString
     * 
     * @param cardNumber (int)
     * @return (String)
     *
     *         Inside the function:
     *         1. Returns a String drawing of the card.
     */

    public static String randomCard(int cardNumber) {
        switch (cardNumber) {
            case 1:
                return "   _____\n" +
                        "  |A _  |\n" +
                        "  | ( ) |\n" +
                        "  |(_'_)|\n" +
                        "  |  |  |\n" +
                        "  |____V|\n";
            case 2:
                return "   _____\n" +
                        "  |2    |\n" +
                        "  |  o  |\n" +
                        "  |     |\n" +
                        "  |  o  |\n" +
                        "  |____Z|\n";

            case 3:
                return "   _____\n" +
                        "  |3    |\n" +
                        "  | o o |\n" +
                        "  |     |\n" +
                        "  |  o  |\n" +
                        "  |____E|\n";

            case 4:
                return "   _____\n" +
                        "  |4    |\n" +
                        "  | o o |\n" +
                        "  |     |\n" +
                        "  | o o |\n" +
                        "  |____h|\n";

            case 5:
                return "   _____ \n" +
                        "  |5    |\n" +
                        "  | o o |\n" +
                        "  |  o  |\n" +
                        "  | o o |\n" +
                        "  |____S|\n";

            case 6:
                return "   _____ \n" +
                        "  |6    |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  |____6|\n";

            case 7:
                return "   _____ \n" +
                        "  |7    |\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |____7|\n";

            case 8:
                return "   _____ \n" +
                        "  |8    |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  |____8|\n";
            case 9:
                return "   _____ \n" +
                        "  |9    |\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |____9|\n";

            case 10:
                return "   _____ \n" +
                        "  |10  o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |___10|\n";
            case 11:
                return "   _____\n" +
                        "  |J  ww|\n" +
                        "  | o {)|\n" +
                        "  |o o% |\n" +
                        "  | | % |\n" +
                        "  |__%%[|\n";
            case 12:
                return "   _____\n" +
                        "  |Q  ww|\n" +
                        "  | o {(|\n" +
                        "  |o o%%|\n" +
                        "  | |%%%|\n" +
                        "  |_%%%O|\n";
            case 13:
                return "   _____\n" +
                        "  |K  WW|\n" +
                        "  | o {)|\n" +
                        "  |o o%%|\n" +
                        "  | |%%%|\n" +
                        "  |_%%%>|\n";
            default:
                return "This shouldn't get called.";
        }

    }

    public static String faceDown() {
        return "   _____\n" +
                "  |     |\n" +
                "  |  J  |\n" +
                "  | JJJ |\n" +
                "  |  J  |\n" +
                "  |_____|\n";
    }

    /**
     * Function name – hitOrStay
     * 
     * @return (String)
     *
     *         Inside the function:
     *         1. Asks the user to hit or stay.
     *         2. If the user doesn't enter "hit" or "stay", keep asking them to try
     *         again by printing:
     *         Please write 'hit' or 'stay'
     *         3. Returns the user's option
     */
    public static String hitOrStay() {
        System.out.println("Would you like to hit or stay?");
        String response = scan.nextLine();

        while (!(response.equals("hit") || response.equals("stay"))) {
            System.out.println("Please write hit or stay");
            response = scan.nextLine();
        }
        return response;
    }

}
