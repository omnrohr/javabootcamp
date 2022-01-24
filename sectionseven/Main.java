public class Main {
    public static void main(String[] args) {
        Car nissan = new Car();
        Car dodge = new Car("Dodge", 11000, 2019, "Red");
        Car nissan2 = new Car(nissan);
        nissan2.setPrice(8000.00);
        nissan.setColor("Nissan");
        nissan.setPrice(5000);
        nissan.setYear(2010);
        nissan.setColor("blue");
        System.out.println("This " + nissan.getMake() + " is worth: $" + nissan.getPrice() + " it was built in: " +
                nissan.getYear() + " It is: " + nissan.getColor() + " color.");
        System.out.println("This " + dodge.getMake() + " is worth: $" + dodge.getPrice() + " it was built in: " +
                dodge.getYear() + " It is: " + dodge.getColor() + " color.");
        System.out.println(dodge);
        System.out.println(nissan2);
    }
}