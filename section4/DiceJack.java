import java.util.Scanner;

public class DiceJack {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please Pic a three numbers between 1 and 6.");
        int sumPick;
        sumPick = pickNumberFromUser();
        sumPick += pickNumberFromUser();
        sumPick += pickNumberFromUser();

        int sumDice;
        sumDice = doRandomNumber();
        sumDice += doRandomNumber();
        sumDice += doRandomNumber();

        if (sumPick > sumDice && sumPick - sumDice == 2) {
            System.out.println("Congrats!, you WIN!");
        } else {
            System.out.println("Hard Luck, you loose!");
        }
    }

    /**
     * 
     * Function name: doRandom - Create a random number between 0 and 6.
     * 
     * @return a random number between 0 and 10;
     * 
     */
    public static int doRandomNumber() {
        int num = (int) (Math.random() * 6) + 1;
        System.out.println("The diced number is: " + num);
        return num;
    }

    /**
     * Function name: pickNumberFromUser - read an integer number from terminal.
     * 
     * @return a scan method to read the entered number.
     * 
     */
    public static int pickNumberFromUser() {
        int picknumber = scan.nextInt();
        if (picknumber > 6 || picknumber < 1) {
            System.out.println("Invalid input.");
            return -1;
        }
        return picknumber;
    }

}