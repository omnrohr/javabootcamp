public class TipTheWaiter {
    public static void main(String[] args) {
        tipTheWaiter(100.25);
    }

    public static void tipTheWaiter(double bill) {
        /**
         * Function name: tipTheWaiter - calculates a tip and prints it. <-----
         * 
         * @param bill (double).
         *
         *             Inside the function:
         *             1. Calculates a tip that's 15 percent of the bill you paid.
         *             2. Prints: your service was wonderful! Please, accept this tip:
         *             $<tip>
         *
         */

        System.out.println("your service was wonderful! Please, accept this tip: $" + bill * 0.15);
    }
}
