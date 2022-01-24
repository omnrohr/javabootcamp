public class Car {
    String make;
    double price;
    int year;
    String color;
    public Car(String make, double price, int year,String color){
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
    }
    public Car(){
        this("toyota", 19000, 2002,"white");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
