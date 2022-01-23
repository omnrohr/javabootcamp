public class RandomNumbers {
    public static void main(String[] args) {
        // Task 3 – Create a 2D array with 100 rows and 10 columns.
        int[][] array = new int[100][10];

        /**
         * Task 4
         *
         * 1. Using a nested loop, populate the array with random numbers.
         * 2. Then, pass the updated array into print2DArray.
         *
         */
        for (int r = 0; r < array.length; r++) {
            for (int c = 0; c < array[r].length; c++) {
                array[r][c] = randomNumber();
            }
        }
        print2DArray(array);

    }

    /**
     * Task 1
     * Function name: randomNumber.
     *
     * @return randomNumber (int)
     *
     *         Inside the function:
     *         1. return a random number between 1 and 100.
     */
    public static int randomNumber() {
        return (int) (Math.random() * 100);
    }

    /**
     * Task 2
     * Function name: print2DArray
     * 
     * @param array ( int[][] )
     *
     *              Inside the function:
     *
     *              1. prints the array such that:
     *              • Each row takes up one line.
     *              • There's a space between each value.
     */
    public static void print2DArray(int[][] array) {
        for (int r = 0; r < array.length; r++) {
            for (int c = 0; c < array[r].length; c++) {
                System.out.print(array[r][c] + " ");
            }
            System.out.print("\n");
        }
    }
}
