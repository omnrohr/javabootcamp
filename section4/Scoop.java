public class Scoop {
    int dog = 5; // live in all the class you can call it from anywhere in one condition is not
                 // static method.
                 // or you can call it by instantiating an instance of the class.
    static int dogge = 5; // you can call it inside the class itself from any static method.
                          // or you can call it by calling the class itself from any static method.

    public static void main(String[] args) {
        System.out.println(dogge); // you can access it from anywhere inside the calss while its static method.
        System.out.println(dog); // you cannot access it here unless the variable is static.
        System.out.println(dogi); // the variable only lives inside the method or the function.

    }

    public static void internalScoop() {
        int dogi = 5;
        Scoop dodo = new Scoop();
        dodo.dogge = 6;
    }
}
