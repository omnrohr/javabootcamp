import java.util.Scanner;

public class Greeting {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String greet = greeting();
        System.out.println(greet);
    }

    public static String greeting() {
        String greeting = " ";
        while (!greeting.equals("Hi")) {
            greeting = scan.nextLine();
        }
        return greeting;
    }
}
