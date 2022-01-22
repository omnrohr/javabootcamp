import java.util.Scanner;

public class RockPaperScissor {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        boolean startGame = startGame();
        if (startGame) {
            setUpGame();
            String userChoice = getUserInput().toLowerCase();
            String computerChoice = computerChoice();
            String winner = checkWinner(userChoice, computerChoice);
            System.out.println("\nYour choice is '" + userChoice + "'");
            System.out.println("\nComputer choice is '" + computerChoice + "'");
            System.out.println(winner);
            System.out.println("\n======================== Game End ========================\n");
        } else {
            System.out.println("\nDarn, some other time...!\n");
            System.exit(0);
        }

    }

    /**
     * Function name: getUserInput <--------
     * 
     * @return a user input from terminal (String).
     *
     *         Inside the function:
     *         1. Save user input in variable and return it.
     * 
     */
    public static String getUserInput() {
        String userInput = scan.nextLine();
        return userInput;
    }

    /**
     * Function name: startGame <--------
     * 
     * @return a choice (boolean).
     *
     *         Inside the function:
     *         1. Picks a user input to continue or exit the game.
     *         2. if "yes": return true.
     *         if "no": return false.
     * 
     */

    public static boolean startGame() {
        System.out.println("\n================= Rock Paper Scissor Game =================\n"
                + "\nLet's play Rock Paper Scissors.\n" +
                "When I say 'shoot', Choose: rock, paper, or scissors.\n" +
                "\n\tAre you ready? Write 'yes' if you are");

        String answer = getUserInput().toLowerCase();

        if (answer.equals("yes"))
            return true;
        else
            return false;

    }

    /**
     * Function name: setUpGame <--------
     * 
     * 
     * Inside the function:
     * print the setup game information.
     */
    public static void setUpGame() {
        System.out.println("\tGreat!" +
                "\n\trock -- paper -- scissors, shoot!" +
                "\n\tyour turn!" +
                "\n\tPick up a choice.");
    }

    /**
     * Function name: computerChoice <--------
     * 
     * @return a choice (String).
     *
     *         Inside the function:
     *         1. Picks a random number between 0 and 2.
     *         2. if 1: return the choice 'rock'
     *         if 2: return the choice 'paper'
     *         if 3: return the choice 'scissors'
     */
    public static String computerChoice() {
        int choice = (int) (Math.random() * 3);
        String randomChoice = "scissors";
        switch (choice) {
            case 0:
                randomChoice = "rock";
            case 1:
                randomChoice = "paper";
        }
        return randomChoice;
    }

    /**
     * Function name: checkWinner <--------
     * 
     * @return a who is the winner of the game (String).
     *
     *         Inside the function:
     *         1. Make comparison between user and computer.
     *         2. if user win: return "Congrats, You Win!".
     *         if computer win: return "Sorry computer win!, some other time...".
     *         if Drow: return "Drow".
     */

    public static String checkWinner(String userChoice, String computerChoice) {
        String winner = "\nCongrats, You Win!";
        if (userChoice.equals(computerChoice))
            winner = "Drow";
        else if (userChoice.equals("rock") && computerChoice.equals("paper"))
            winner = "\nSorry computer win!, some other time...\n";
        else if (userChoice.equals("paper") && computerChoice.equals("scissors"))
            winner = "\nSorry computer won!, some other time...\n";
        else if (userChoice.equals("scissors") && computerChoice.equals("rock"))
            winner = "\nSorry computer won!, some other time...\n";
        return winner;
    }
}
