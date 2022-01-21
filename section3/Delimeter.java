import java.util.Scanner;

public class Delimeter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter tow integers (on the same line)");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("Enter two very big integers (on the same line)");
        long lnum1 = scan.nextLong();
        long lnum2 = scan.nextLong();

        System.out.println("Enter two decimals (on the same line)");
        double dnum1 = scan.nextDouble();
        double dnum2 = scan.nextDouble();

        System.out.println("Enter two text valus (on the same line)");
        String val1 = scan.next();
        String val2 = scan.next();

        scan.close();

        System.out.println("\tIntegers: " + num1 + " " + num2 + "\n");
        System.out.println("\tLong number: " + lnum1 + " " + lnum2 + "\n");
        System.out.println("\tDecimal numbers: " + dnum1 + " " + lnum2 + "\n");
        System.out.println("\tText values: " + val1 + " " + val2 + "\n");

    }
}
