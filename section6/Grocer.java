import java.util.Scanner;

public class Grocer {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter the item you are looking for:");
        String lookup = scan.nextLine();
        String[] items = { "apples", "bananas", "candy", "chocolate", "coffee", "tea" };
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(lookup)) {
                System.out.println("\nWe have that in aisle " + i);
                break;
            }
        }
        scan.close();
        /*
         * Task 1: Create an array that stores each aisle:
         * apples – bananas – candy – chocolate – coffee – tea
         * 
         * Then, use a for loop to print each element in the array.
         */

        /*
         * Task 2:
         * 1. System.out.println("\nDo you sell coffee?");
         * 
         * 2. Using the for loop from task 1:
         * • check if Java Grocer sells coffee.
         * • if so, break the loop and print: \nWe have that in aisle: <index>
         * 
         */

    }
}
