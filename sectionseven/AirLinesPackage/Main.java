package AirLinesPackage;

import java.util.Arrays;

//
//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        String[] passport = {"Rayan Slim", "Canadian", "01/01/1111"};
//        Person rayan = new Person("Rayan Slim", "Canadian", "01/01/1111", passport,11 );
//        System.out.println("this person: "+ rayan.getName()+" is: "+ rayan.getNationality()+" Born at: "+
//                rayan.getDateOfBirth()+" holding passport: "+ Arrays.toString(rayan.getPassport()) + " reserved seat: "+ rayan.getSeatNumber());
//        Person anonymous = new Person();
//        anonymous.setName("Null");
//        anonymous.setNationality("Null");
//        anonymous.setDateOfBirth("Null");
//        anonymous.setPassport(passport);
//        anonymous.setSeatNumber(0);
//
//        Person person2 = new Person(rayan);
//        System.out.println(person2);
//    }
//}
public class Main {
    public static void main(String[] args) {
        String[] passport = { "Rayan Slim", "Canadian", "01/01/1111" };
        Person person = new Person("Rayan Slim", "Canadian", "01/01/1111", 1);
        if (person.applyPassport() == true) {
            System.out.println("Name: " + person.getName() + "\n" +
                    "Nationality: " + person.getNationality() + "\n" +
                    "Date of Birth: " + person.getDateOfBirth() + "\n" +
                    "Seat Number: " + person.getSeatNumber() + "\n" + "Passport: " +
                    Arrays.toString(person.getPassport()) + "\n");
        }

    }
}