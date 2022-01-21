import java.util.Scanner;

public class Trivia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Scanner scan = new Scanner(System.in);
        System.out.println("Hello, and Wlecome to trivia.");
        System.out.println("--------------------- Q1 ---------------------");
        System.out.println("\n1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n");
        String q1 = scan.nextLine();

        System.out.println("--------------------- Q2 ---------------------");
        System.out.println("\n1. Which planet is the hottest?");
        System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars\n");
        String q2 = scan.nextLine();

        System.out.println("--------------------- Q3 ---------------------");
        System.out.println("\n1. What is the rarest blood type?");
        System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-Negative\n");
        String q3 = scan.nextLine();

        System.out.println("--------------------- Q4 ---------------------");
        System.out.println("\n1. Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc) Draco Malfoy\n");
        String q4 = scan.nextLine();

        scan.close();
        int score = 0;
        if (q1.equals("b"))
            score += 5;
        if (q2.equals("c"))
            score += 5;
        if (q3.equals("d"))
            score += 5;
        if (q4.equals("c") || q4.equals("b"))
            score += 5;

        String printResult = score >= 15 ? "Wow, you know your stuff!"
                : score >= 5 ? "Not bad!" : "Better luck next time!";

        System.out.println("Your final score is: " + score + "/20\n" + printResult);
    }
}
