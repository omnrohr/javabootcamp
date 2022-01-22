public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0)
                continue;
            else if (i == 10) {
                System.out.println("you reached 10 breake");
                break;
            } else
                System.out.println(i);
        }
    }
}
