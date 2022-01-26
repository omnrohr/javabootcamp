package CarDealerShip;

import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
//        String[] parts= {"wheel", "keys"};
//        CarDealerShip.Car nissan = new CarDealerShip.Car("Nissan", 8000,2019,"Black", parts);
//        CarDealerShip.Car dodge = new CarDealerShip.Car("Dodge", 11000,2019,"Red", parts);
//        CarDealerShip.Car nissan2 = new CarDealerShip.Car(nissan);
//        nissan2.setPrice(8000.00);
//        nissan.setColor("Nissan");
//        nissan.setPrice(5000);
//        nissan.setYear(2010);
//        nissan.setColor("blue");
//        System.out.println("This "+nissan.getMake()+" is worth: $"+nissan.getPrice()+" it was built in: "+
//                nissan.getYear()+" It is: "+nissan.getColor()+" color with parts "+nissan.getParts());
//        System.out.println("This "+dodge.getMake()+" is worth: $"+dodge.getPrice()+" it was built in: "+
//                dodge.getYear()+" It is: "+dodge.getColor()+" color with parts "+dodge.getParts());
//        System.out.println(dodge);
//        System.out.println(nissan2);
//        nissan.drive();
//        dodge.drive();
//        nissan2.drive();
//        nissan2.setParts(new String[] {"filter", "engine"});
//        System.out.println(Arrays.toString(nissan2.getParts()));
//        CarDealerShip.DealerShip dealerShip = new CarDealerShip.DealerShip();

        Car[] carsArray = {
                new Car("Nissan", 8000,2019,"Black", new String[] {"keys", "wheels"}),
                new Car("Dodge", 11000,2019,"Red", new String[] {"tiers", "engine"}),
                new Car("Nissan", 8000,2019,"Black", new String[] {"tiers", "wheels"}),
                new Car("Honda", 9000,2015,"Yellow", new String[] {"tiers", "wheels"}),
                new Car("Burche", 100000,2019,"Red", new String[] {"tiers", "wheels"}),
        };

        DealerShip dealerShip = new DealerShip(carsArray);


        for (int i = 0; i < carsArray.length; i++) {
            dealerShip.setCar(carsArray[i],i);
        }
//        System.out.println(dealerShip);
        System.out.println("\n ****** JAVA DEALERSHIP! ****** \n");
        System.out.print("Welcome! Enter the type of car you're looking for: ");
    //pick up make
        String make = scan.nextLine();
        System.out.print("Enter your budget: ");
    //pick up budget
        int budget = scan.nextInt();
        scan.nextLine();
        int carIndex = dealerShip.search(make, budget);
        if (carIndex!=404){
            if (scan.nextLine().equalsIgnoreCase("yes")){
                dealerShip.sell(carIndex);
            }else {
                System.out.println("Thank you for reaching us. BYE");
            }
        }else {
            System.out.println("Feel free to brows though our collection of cars\n");
            System.out.println(dealerShip);
        }

    }
}
