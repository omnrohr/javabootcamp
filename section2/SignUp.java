import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to JavaGram! Let's sign you up.");

        // Job 1 - Using Scanner, ask the user questions

        // Ask for their first name.
        System.out.println("\nWhat is your First name?");
        String firstName = scan.nextLine();

        // Ask for their last name.
        System.out.println("\nWhat is your Last name?");
        String lastName = scan.nextLine();

        // Ask: how old are you?
        System.out.println("\nHow old are you?");
        int age = Integer.parseInt(scan.nextLine());

        // Ask them to make a username.
        System.out.println("\nWhat is your username name?");
        String username = scan.nextLine();

        // Ask what city they live in.
        System.out.println("\nWhere Do you live?");
        String city = scan.nextLine();

        // Ask what country that's from.
        System.out.println("\nWhat is your nationality?");
        String nationality = scan.nextLine();

        // Task 2 - Print their information.

        System.out.println("Thank you for joining JavaGram!\n");

        // Print their information like so:
        System.out.println("\nyour information are:");
        System.out.println("    First Name: " + firstName);
        System.out.println("    Last Name:  " + lastName);
        System.out.println("    age:        " + age);
        System.out.println("    User Name:  " + username);
        System.out.println("    City:       " + city);
        System.out.println("    Nationality:" + nationality + "\n");
        System.out.println("            Bye");

        // Your information:
        // First Name: Rayan
        // Last Name: Slim
        // Age: 27
        // Username: monotonic_relu
        // City: Ottawa
        // Country: Canada
        //

        scan.close();
        // close scanner. It's good practice :D !
    }
}