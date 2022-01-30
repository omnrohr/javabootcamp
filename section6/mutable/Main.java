package mutable;

import mutable.Car;

public class Main {
    public static void main(String[] args) {
        int number = 1;
        int othernumber = number;
        othernumber = 1;
        System.out.println(othernumber + " " + number);

        Car car1 = new Car("Nissan", 10000);
        car1.setPrice(8000);
    }
}
