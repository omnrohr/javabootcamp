package AirLinesPackage;

import java.util.Arrays;

public class Person {
    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    private int seatNumber;

    public Person(String name, String nationality, String dateOfBirth, int seatNumber) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.passport = new String[3];
        this.seatNumber = seatNumber;
    }

    public Person() {
        this(null, null, null, 0);
    }

    public Person(Person source) {
        this.name = source.name;
        this.nationality = source.nationality;
        this.dateOfBirth = source.dateOfBirth;
        this.passport = Arrays.copyOf(source.passport, source.passport.length);
        this.seatNumber = source.seatNumber;
    }

    boolean applyPassport() {
        return true;
    }

    boolean chooseSeat(int seatNumber) {
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String[] getPassport() {
        return Arrays.copyOf(passport, passport.length);
    }

    public void setPassport(String[] passport) {
        this.passport = Arrays.copyOf(this.passport, this.passport.length);
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", passport=" + Arrays.toString(passport) +
                ", seatNumber=" + seatNumber +
                '}';
    }
}
