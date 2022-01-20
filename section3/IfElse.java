public class IfElse {
    public static void main(String[] args) {
        short grade = 65;
        if (grade > 90) {
            System.out.println("You got an A.");
        } else if (grade >= 80) {
            System.out.println("You got an B.");
        } else if (grade >= 70) {
            System.out.println("You got an C.");
        } else if (grade >= 60) {
            System.out.println("You got an D.");
        } else if (grade >= 50) {
            System.out.println("You got an F.");
        } else
            System.out.println("You Fail");
    }
}
