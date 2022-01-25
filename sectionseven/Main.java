import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] parts = { "wheel", "keys" };
        Car nissan = new Car("Nissan", 8000, 2019, "Black", parts);
        Car dodge = new Car("Dodge", 11000, 2019, "Red", parts);
        Car nissan2 = new Car(nissan);
        nissan2.setPrice(8000.00);
        nissan.setColor("Nissan");
        nissan.setPrice(5000);
        nissan.setYear(2010);
        nissan.setColor("blue");
        System.out.println("This " + nissan.getMake() + " is worth: $" + nissan.getPrice() + " it was built in: " +
                nissan.getYear() + " It is: " + nissan.getColor() + " color with parts " + nissan.getParts());
        System.out.println("This " + dodge.getMake() + " is worth: $" + dodge.getPrice() + " it was built in: " +
                dodge.getYear() + " It is: " + dodge.getColor() + " color with parts " + dodge.getParts());
        System.out.println(dodge);
        System.out.println(nissan2);
        nissan.drive();
        dodge.drive();
        nissan2.drive();
        nissan2.setParts(new String[] { "filter", "engine" });
        System.out.println(Arrays.toString(nissan2.getParts()));
    }
}
