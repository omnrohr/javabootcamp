import java.util.Scanner;

public class Trick {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // case one:
        System.out.println("would you like to hit or stay");

        String option = scan.nextLine();
        // option 1 is one of hit and stay
        // one of the conditions will be True
        // if any choice is slected it will returen False that means it will get the
        // else statment.
        // else if none of the comparison words enterd it will be true and will exute
        // the statment
        // so this will result the qustion.
        if (!option.equals("hit") && !option.equals("stay")) {
            System.out.println("invalid option");
        } else {
            System.out.println("End turn");
        }

        // this will never been false.
        System.out.println("would you like to hit or stay");

        String option1 = scan.nextLine();

        if (!option1.equals("hit") || !option1.equals("stay")) {
            System.out.println("invalid option");
        } else {
            System.out.println("End turn");
        }

        // this will do the opisite of the first conditions so this also will work.
        System.out.println("would you like to hit or stay");

        String option2 = scan.nextLine();

        if (!(option2.equals("hit") && option2.equals("stay"))) {
            System.out.println("invalid option");
        } else {
            System.out.println("End turn");
        }

        scan.close();

    }
}
