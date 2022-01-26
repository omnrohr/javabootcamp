import java.util.Arrays;

public class DealerShip {
    private Car[] cars;

    public DealerShip(){
        this.cars = new Car[3];
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

    public String search(String make, int budget){
        for (int i = 0; i < cars.length; i++) {
            if (this.cars[i]==null) continue;
            else if (cars[i].getMake().equals(make)&&cars[i].getPrice()<=budget)
                return "This is the car match"+cars[i].getMake();
        }
        return "Sorry we can not find any cars!";
    }

    @Override
    public String toString() {
        String temp="";
        for (int i = 0; i <this.cars.length; i++) {
            temp += "Parking Spot: "+ i + "\n";
            temp += "\t"+this.cars[i].toString()+"\n";
        }return temp;
    }
}
