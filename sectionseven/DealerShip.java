package CarDealerShip;

public class DealerShip {
    private Car[] cars;

    public DealerShip(Car[] cars){
        this.cars = new Car[cars.length];
//        this.cars = Arrays.copyOf(cars, cars.length); this will create a copy of the reference
//        of the array not a new object. this is valid for arrays of objects.
        for (int i = 0; i < cars.length; i++) {
//            this.cars[i] = cars[i];  this will copy a refrence to the array it will not create an object.
            cars[i]=new Car(cars[i]);
        }
    }

    public void setCar(Car car, int index){
        this.cars[index] = new Car(car);
    }

    public Car getCar(int index){
        return new Car(cars[index]);
    }

    public void sell (int index){
        this.cars[index].drive();
        this.cars[index]=null;
    }
    /**
     * Function name: search
     *
     * @param make (String)
     * @param budget (int)
     * @return (int) <-------
     *
     * Inside the function:
     *   1. Loops through every element in the cars field.
     *   2. Skips the run if the element is null.
     *   3. If it finds a car the user wants and can afford:
     *     - println: \nWe found a car in spot <i> \n\n <toString>
     *     - print: If you're interested, type 'yes':
     *     - returns the index
     *   4. If the loop runs and it didn't find a car
     *     - println: \nYour search didn't match any results.\n
     *     - returns 404
     */
    public int search(String make, int budget){
        for (int i = 0; i < cars.length; i++) {
            if (this.cars[i]==null) continue;
            else if (cars[i].getMake().equalsIgnoreCase(make)&&cars[i].getPrice()<=budget) {
                System.out.println("\\nWe found a car in spot "+i+"\n\n"+ cars[i].toString());
                System.out.println("If you're interested, type 'yes':");
                return i;
            }
        }
        System.out.println("\nYour search didn't match any results.\n");
        return 404;
    }

    @Override
    public String toString() {
        String temp="";
        for (int i = 0; i <this.cars.length; i++) {
            temp += "Parking Spot: "+ (i+1) + "\n";
            if (this.cars[i]==null) {
                temp += "Empty Spot.";
            }else {
                temp += "\t" + this.cars[i].toString() + "\n";
            }
        }return temp;
    }
}
