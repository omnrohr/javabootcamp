
import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        String[] staffLastYear = { "Mohemmed", "Ali", "Ibrahem" };
        String[] staffThisYear = new String[staffLastYear.length];
        String[] staffThisYear2 = Arrays.copyOf(staffLastYear, staffLastYear.length);
        for (int i = 0; i < staffLastYear.length; i++) {
            staffThisYear[i] = staffLastYear[i];
        }
        System.out.println(staffLastYear);
        System.out.println(staffThisYear);
        staffLastYear[1] = "Omar";
        System.out.println(Arrays.toString(staffThisYear));
        System.out.println(Arrays.toString(staffLastYear));

    }
}
