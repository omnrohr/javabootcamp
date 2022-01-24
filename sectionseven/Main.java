public class Main {
    public static void main(String[] args) {
        Car nissan = new Car();
        Car dodge = new Car("Dodge", 11000,2019,"Red");
        nissan.make= "Nissan";
        nissan.price=5000;
        nissan.year=2010;
        nissan.color="blue";
        System.out.println("This "+nissan.make+" is worth: $"+nissan.price+" it was built in: "+
                nissan.year+" It is: "+nissan.color+" color.");
        System.out.println("This "+dodge.make+" is worth: $"+dodge.price+" it was built in: "+
                dodge.year+" It is: "+dodge.color+" color.");
        System.out.println(dodge);
    }
}
