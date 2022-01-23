import java.util.Arrays;

public class TDArrays {
    public static void main(String[] args) {
        int[][] grade = new int[3][4];
        int[][] grade2 = {
                { 72, 47, 80, 76 },
                { 82, 84, 80, 86 },
                { 92, 94, 100, 96 }
        };

        grade[0][0] = 72;
        grade[0][1] = 74;
        grade[0][2] = 80;
        grade[0][3] = 76;

        grade[1][0] = 82;
        grade[1][1] = 84;
        grade[1][2] = 80;
        grade[1][3] = 86;

        grade[2][0] = 92;
        grade[2][1] = 94;
        grade[2][2] = 100;
        grade[2][3] = 96;

        // for (int r =0; r<grade.length; r++){
        // for (int c=0; c < grade[r].length; c++){
        // grade[r][c]=r+c;
        // }
        // }
        System.out.println("\tFirst student: " + Arrays.toString(grade[0]));
        System.out.println("\tSecond student: " + Arrays.toString(grade[1]));
        System.out.println("\tThird student: " + Arrays.toString(grade[2]));

        System.out.println("\n\n\tFirst student g2: " + Arrays.toString(grade2[0]));
        System.out.println("\tSecond student g2: " + Arrays.toString(grade2[1]));
        System.out.println("\tThird student g2: " + Arrays.toString(grade2[2]));

        String[][] table = new String[3][2];

        System.out.println(table.length);
        System.out.println(table[0].length);
        System.out.println(table[1].length);

        String[][] table1 = new String[3][2];
        System.out.println(Arrays.toString(table1[3]));
    }
}
