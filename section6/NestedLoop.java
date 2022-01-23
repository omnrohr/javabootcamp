public class NestedLoop {
    public static void main(String[] args) {
        int[][] table = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                System.out.print(table[j][j] + " ");
            }
        }
        // 1 5 9 1 5 9 1 5 9
        System.out.println(" ");

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                System.out.print(table[i][i] + " ");
            }
        }
        // 1 1 1 5 5 5 9 9 9
        System.out.println(" ");

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                System.out.print(table[j][i] + " ");
            }
        }
        // 1 4 7 2 5 8 3 6 9
        System.out.println(" ");

        for (int i = 0; i < table.length; i++) {
            System.out.print(table[i][1] + " ");
        }
        // 2 5 8
        System.out.println(" ");

        for (int i = 0; i < table.length; i++) {
            System.out.print(table[i][0] + " ");
        }
        // 1 4 7
    }
}
