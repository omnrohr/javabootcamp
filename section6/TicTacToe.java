import java.util.Scanner;

public class TicTacToe {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("\nLet's play tic tac toe");

        // Task 1: Create an array with three rows of '_' characters.
        char[][] ticTac = {
                { '_', '_', '_' },
                { '_', '_', '_' },
                { '_', '_', '_' }
        };
        // Task 2: Call the function printBoard();
        printBoard(ticTac);

        boolean x = true;
        while (true) {
            if (x) {
                int[] value = askUser(ticTac);
                ticTac[value[0]][value[1]] = 'X';
                x = false;
            } else {
                int[] value = askUser(ticTac);
                ticTac[value[0]][value[1]] = 'O';
                x = true;
            }
            printBoard(ticTac);
            int count = checkWin(ticTac);
            if (count == 3) {
                System.out.println("X wins");
                break;
            }
            if (count == -3) {
                System.out.println("O wins");
                break;
            }
        }
        /*
         * Task 3: Loop through turns.
         * 
         * if (X) turn
         * Task 4: call askUser().
         * Task 5: populate the board using askUser's return value.
         * else
         * Task 4: call askUser().
         * Task 5: populate the board using askUser's return value. Then, print it.
         * 
         * 
         * 
         * Task 6 - Call the function.
         * if return value == 3
         * print: X wins and break the loop
         * else if return value == -3
         * print: O wins and break the loop
         * 
         * 
         * 
         */

        // scan.close();
    }

    /**
     * Task 2 - Write a function that prints the board.
     * Function name - printBoard()
     * 
     * @param \board (char[][])
     *
     *               Inside the function:
     *               1. print a new line.
     *               2. print the board.
     *               • separate each row by two lines.
     *               • each row precedes a tab of space
     *               • each character in the grid has one space from the other
     *               character
     */

    public static void printBoard(char[][] array) {
        System.out.print("\n");
        for (int r = 0; r < array.length; r++) {
            System.out.print("\t\t");
            for (int c = 0; c < array[r].length; c++) {
                System.out.print(array[r][c] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    /**
     * Task 4 - Write a function that lets the user choose a spot
     * Function name – askUser
     * 
     * @param \board (char[][] board)
     * @return spot (int[])
     *
     *         Inside the function
     *         1. Asks the user: - pick a row and column number:
     *         2. Check if the spot is taken. If so, let the user choose again.
     *         3. Return the row and column in an int[] array.
     *
     */

    public static int[] askUser(char[][] board) {
        System.out.print("\tpick a row and column number: ");
        int row = scan.nextInt();
        int col = scan.nextInt();
        int[] userChoice = { row, col };
        return userChoice;
    }

    /**
     * Task 6 - Write a function that determines the winner
     * Function name - checkWin
     * 
     * @param board (char[][])
     * @return count (int)
     *
     *         Inside the function:
     *         1. Make a count variable that starts at 0.
     *         2. Check every row for a straight X or straight O (Task 7).
     *         3. Check every column for a straight X or straight O (Task 8).
     *         4. Check the left diagonal for a straight X or straight O (Task 9).
     *         5. Check the right diagonal for a straight X or straight O (Task 10).
     */
    public static int checkWin(char[][] board) {
        int count = 0;
        for (int r = 0; r < board.length; r++) {
            count = 0;
            for (int c = 0; c < board[r].length; c++) {
                if (board[r][c] == 'X')
                    count++;
                else if (board[r][c] == 'O')
                    count--;
            }
            if (count == 3 || count == -3) {
                return count;
            } else
                count = 0;
        }
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < 3; c++) {
                if (board[c][r] == 'X')
                    count++;
                else if (board[c][r] == 'O')
                    count--;
            }
            if (count == 3 || count == -3)
                return count;
            else
                count = 0;
        }
        for (int r = 0; r < 3; r++) {
            if (board[r][r] == 'X')
                count++;
            else if (board[r][r] == 'O')
                count--;
        }
        if (count == 3 || count == -3)
            return count;
        else
            count = 0;

        for (int r = 0; r < 3; r++) {
            if (board[r][2 - r] == 'X')
                count++;
            if (board[r][2 - r] == 'O')
                count--;
        }
        return count;
    }

}
