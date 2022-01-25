public class AirLine {
    // private Person[] seats;
    //
    // public AirLine(Person[] seats) {
    // this.seats = seats;
    // }
    //
    // public AirLine(AirLine source) {
    // this.seats = source.seats;
    // }
    //
    // boolean createReservation(String[] passport){
    // return true;
    // }
    //
    // public Person[] getSeats() {
    // return seats;
    // }
    //
    // public void setSeats(Person[] seats) {
    // this.seats = seats;
    // }
    Person[] seats;

    public AirLine() {
        this.seats = new Person[11];
    }

    public Person getPerson(int index) {
        return new Person(this.seats[index]);
    }

    public void setPerson(Person person) {
        this.seats[person.getSeatNumber() - 1] = new Person(person);
    }
}
