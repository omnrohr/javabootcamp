import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
        // Task 1 – Ask the user: how many historical figures will you register?
        // – Store the value.
        int historicalFigures = scan.nextInt();
        scan.nextLine();
        // Task 2 – Create a 2D array with a variable number of rows, and 3 values per
        // row.
        String[][] array = new String[historicalFigures][3];
        // Watch out for the nextLine() pitfall.
        /* Task 3 */
        for (int i = 0; i < array.length; i++) {

            System.out.println("\n\tFigure " + (i + 1));

            System.out.print("\t - Name: ");
            array[i][0] = scan.nextLine();
            // pick up and store figure's name.

            System.out.print("\t - Date of birth: ");
            array[i][1] = scan.nextLine();
            // pick up and store figure's birthday.

            System.out.print("\t - Occupation: ");
            array[i][2] = scan.nextLine();
            // pick up and store figure's occupation.

            System.out.print("\n");

        }

        System.out.println("These are the values you stored:");
        // Task 4: call print2DArray.
        print2DArray(array);
        System.out.print("\nWho do you want information on? ");
        String lookup = scan.nextLine();
        searchIn2DArray(array, lookup);
        /*
         * Task 5: Let the user search the database by name.
         * If there's a match:
         * print( tab of space Name: <name>)
         * print( tab of space Date of birth: <date of birth>)
         * print( tab of space Occupation: <occupation>)
         * 
         */

        scan.close();
    }

    /**
     * Function name: print2DArray
     * 
     * @param array (String[][])
     *
     *              Inside the function
     *              1. print the database
     *              • a tab of space precedes each row.
     *              • each value in database has one space from the other value.
     *              • print a new line.
     */
    public static void print2DArray(String[][] array) {
        for (int r = 0; r < array.length; r++) {
            for (int c = 0; c < array[r].length; c++) {
                System.out.print(array[r][c] + " ");
            }
            System.out.print("\n");
        }
    }

    /**
     * Function Name: Search in 2D array.
     *
     * @param array  (string[][]).
     * @param lookup (string).
     *
     *               Inside the function:
     *               1- Lookup for the search keyword.
     *               2- if match found it will print the match row.
     *               3- each data in separate line.
     */
    public static void searchIn2DArray(String[][] array, String lookup) {
        for (int r = 0; r < array.length; r++) {
            for (int c = 0; c < array[r].length; c++) {
                if (array[r][c].equals(lookup)) {
                    System.out.println("Search result is:");
                    System.out.println("\tname :" + array[r][0]);
                    System.out.println("\tDate of birth: " + array[r][1]);
                    System.out.println("\tOccupation: " + array[r][2]);
                    break;
                }
            }
        }
    }
}
