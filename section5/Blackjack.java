import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        // Task 3 – Wait for the user to press enter.
        scan.nextLine();
        // Task 4 – Get two random cards.
        int userCardNumber1 = getRandomNumber();
        int userCardNumber2 = getRandomNumber();
        int userHandValue = userCardNumber1 + userCardNumber2;
        String userCard1 = randomCard(userCardNumber1);
        String userCard2 = randomCard(userCardNumber2);
        System.out.println("\n You get a \n" + userCard1 + "\n and a \n" + userCard2 + "\n");
        // – Print them: \n You get a \n" + <randomCard> + "\n and a \n" + <randomCard>

        // Task 5 – Print the sum of your hand value.
        // – print: your total is: <hand value>
        System.out.println("your total is: " + userHandValue + "\n");

        // Task 6 – Get two random cards for the dealer.
        // – Print: The dealer shows \n" + <first card> + "\nand has a card facing down
        // \n" + <facedown card>
        // – Print: \nThe dealer's total is hidden

        int dealerCardNumber1 = getRandomNumber();
        int dealerCardNumber2 = getRandomNumber();
        int dealerHand = dealerCardNumber1 + dealerCardNumber2;
        String dealerCard1 = randomCard(dealerCardNumber1);
        String dealerCard2 = randomCard(dealerCardNumber2);

        System.out.println("The dealer shows \n" +
                dealerCard1 +
                "\nand has a card facing down\n" +
                faceDown());
        System.out.println("\nThe dealer's total is hidden\n");

        // Task 8 – Keep asking the player to hit or stay (while loop).
        // 1. Every time the player hits
        // – draw a new card.
        // – calculate their new total.
        // – print: (new line) You get a (new line) <show new card>.
        // - print: your new total is <total>

        while (true) {
            System.out.println("hit or stay");

            String option = hitOrStay();

            if (option.equals("hit")) {
                int newHitNumber = getRandomNumber();
                String newHitCard = randomCard(newHitNumber);
                userHandValue += newHitNumber;

                System.out.println("\nYou get a\n" +
                        newHitCard + "\n" +
                        "your new total is: "
                        + userHandValue + "\n");

                if (userHandValue > 21) {
                    System.out.println("Bust! Player loses");
                    break;
                }

            } else if (option.equals("stay")) {
                System.out.println("Dealers Turn \n");
                System.out.println("The dealer's cards are " +
                        "\n" + dealerCard1 +
                        "\nand a " + "\n" +
                        dealerCard2 + "\n" +
                        "Dealers Total is :" + dealerHand);
                while (dealerHand < 17) {
                    int newDealerHit = getRandomNumber();
                    String newDealerHitCard = randomCard(newDealerHit);
                    dealerHand += newDealerHit;
                    System.out.println("\ndealer get a\n" +
                            newDealerHitCard + "\n" +
                            "dealer new total is: "
                            + dealerHand + "\n");
                }
                if (dealerHand > 21) {
                    System.out.println("Bust! Dealer loses");
                    System.exit(0);
                } else
                    break;
            }
        }

        printWinner(userHandValue, dealerHand);
        // 2. Once the player stays, break the loop.

        // For tasks 9 to 13, see the article: Blackjack Part II.
        scan.close();

    }

    public static void printWinner(int userHandValue, int dealerHand) {
        if (userHandValue > dealerHand) {
            System.out.println("Player wins!");
            System.exit(0);
        } else if (userHandValue < dealerHand) {
            System.out.println("Dealer wins!");
            System.exit(0);
        } else {
            System.out.println("Drow");
            System.exit(0);
        }
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
     * Task 7 – make a function that asks the user to hit or stay.
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
        String option = " ";
        while (true) {
            option = scan.nextLine();
            if (option.equals("hit") || option.equals("stay"))
                return option;
            else {
                System.out.println("Please write 'hit' or 'stay'");
                continue;
            }
        }
    }
}
