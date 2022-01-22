import java.util.Scanner;

public class Pokerito {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        /*
         * Task 2: Explain the rules
         * 
         * >>Let's play Pokerito. Type anything when you're ready.
         * |
         * >>It's like Poker, but a lot simpler.
         * >> (new line)
         * >> • There are two players, you and the computer.
         * >> • The dealer will give each player one card.
         * >> • Then, the dealer will draw five cards (the river)
         * >> • The player with the most river matches wins!
         * >> • If the matches are equal, everyone's a winner!
         * >> (new line)
         * >> • Ready? Type anything if you are.
         * |
         */

        explain();
        String userCard = randomCard();
        String computerCard = randomCard();
        System.out.println("Here's your card:\n");
        System.out.println(userCard);
        scan.nextLine();
        System.out.println("\nHere's the computer's card:\n");
        System.out.println(computerCard + "\n");
        scan.nextLine();

        /*
         * Task 3: Present the user with a card
         * println 'Here's your card:'
         * <show card>
         * <new line>
         * println 'Here's the computer's card:'
         * <show computer's card>
         */

        int yourMatches = 0;
        int computerMatches = 0;

        System.out.println(
                ">> Now, the dealer will draw five cards. Press enter to continue." +
                        "\n>> The dealer will draw a card every time the user presses enter." +
                        "\n>> Before you draw a card, print the order it was drawn in:");
        String drowCard;
        for (int i = 0; i < 5; i++) {
            scan.nextLine();
            drowCard = randomCard();
            System.out.println("Card " + (i + 1) + "-\n" + drowCard);
            if (userCard == drowCard)
                yourMatches++;
            if (computerCard == drowCard)
                computerMatches++;
        }
        System.out.println("Your score is: " + yourMatches +
                "\n\nComputer score is: " + computerMatches + "\n");

        if (yourMatches > computerMatches)
            System.out.println("Congrats, you win!\n");
        else if (yourMatches < computerMatches)
            System.out.println("The computer wins!\n");
        else
            System.out.println("Drow!\n");
        /**
         * Task 4 - Draw five cards
         * 
         * • print: Now, the dealer will draw five cards. Press enter to continue.
         * • The dealer will draw a card every time the user presses enter.
         * • Before you draw a card, print the order it was drawn in:
         * Card 1
         * <2 new lines>
         * <print card>
         * Card 2
         * <2 new lines>
         * <print card>
         * ...
         */
        /**
         * Task 5 - Get the winner
         * 
         * • Count your number of matches.
         * • Count the computer's number of matches.
         * • print: Your number of matches: <yourMatches>
         * • print: Computer number of matches: <computerMatches>
         * 
         * • If you have more matches, print: You win!.
         * • If the computer has more matches, print: The computer wins!
         * • If the matches are equal, print: everyone wins!.
         */

        scan.close();
    }

    /**
     * 
     * Function name – explain ------> explain the rules
     * 
     * Inside the function:
     * it is explain how to play the game.
     */

    public static void explain() {
        System.out.println("\n\n====================== Pokerito ======================\n");
        System.out.println("Let's play Pokerito. Type anything when you're ready.");
        scan.nextLine();
        System.out.println(">>It's like Poker, but a lot simpler.\n" +
                "\n" +
                ">>\tThere are two players, you and the computer." +
                ">>\n\tThe dealer will give each player one card." +
                ">>\n\tThen, the dealer will draw five cards (the river)" +
                ">>\n\tThe player with the most river matches wins!" +
                ">>\n\tIf the matches are equal, everyone's a winner!" +
                ">>\n" +
                ">>\n\tReady? Type anything if you are.");
        scan.nextLine();
    }

    /**
     * Task 1
     * 
     * Function name – randomCard
     * 
     * @return (String)
     * 
     *         Inside the function:
     *         1. Gets a random number between 1 and 13.
     *         2. Returns a card that matches the random number (get the String
     *         values from cards.text).
     */
    public static String randomCard() {
        int randomCard = (int) (Math.random() * 13) + 1;
        String card = "";
        switch (randomCard) {
            case 1:
                card = "   _____\n" +
                        "  |A _  |\n" +
                        "  | ( ) |\n" +
                        "  |(_'_)|\n" +
                        "  |  |  |\n" +
                        "  |____V|\n";
                break;

            case 2:
                card = "   _____\n" +
                        "  |2    |\n" +
                        "  |  o  |\n" +
                        "  |     |\n" +
                        "  |  o  |\n" +
                        "  |____Z|\n";
                break;

            case 3:
                card = "   _____\n" +
                        "  |3    |\n" +
                        "  | o o |\n" +
                        "  |     |\n" +
                        "  |  o  |\n" +
                        "  |____E|\n";
                break;

            case 4:
                card = "   _____\n" +
                        "  |4    |\n" +
                        "  | o o |\n" +
                        "  |     |\n" +
                        "  | o o |\n" +
                        "  |____h|\n";
                break;

            case 5:
                card = "   _____ \n" +
                        "  |5    |\n" +
                        "  | o o |\n" +
                        "  |  o  |\n" +
                        "  | o o |\n" +
                        "  |____S|\n";
                break;

            case 6:
                card = "   _____ \n" +
                        "  |6    |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  |____6|\n";
                break;

            case 7:
                card = "   _____ \n" +
                        "  |7    |\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |____7|\n";
                break;

            case 8:
                card = "   _____ \n" +
                        "  |8    |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  |____8|\n";
                break;

            case 9:
                card = "   _____ \n" +
                        "  |9    |\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |____9|\n";
                break;

            case 10:
                card = "   _____ \n" +
                        "  |10  o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |___10|\n";
                break;

            case 11:
                card = "   _____\n" +
                        "  |J  ww|\n" +
                        "  | o {)|\n" +
                        "  |o o% |\n" +
                        "  | | % |\n" +
                        "  |__%%[|\n";
                break;
            case 12:
                card = "   _____\n" +
                        "  |Q  ww|\n" +
                        "  | o {(|\n" +
                        "  |o o%%|\n" +
                        "  | |%%%|\n" +
                        "  |_%%%O|\n";
                break;

            case 13:
                card = "   _____\n" +
                        "  |K  WW|\n" +
                        "  | o {)|\n" +
                        "  |o o%%|\n" +
                        "  | |%%%|\n" +
                        "  |_%%%>|\n";
                break;

            default:
                card = "invalid choice";

        }
        return card;
    }
}
