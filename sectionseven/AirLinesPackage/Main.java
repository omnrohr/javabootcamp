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

        Person[] people = new Person[]{
                new Person("Cleopatra", "Egypt", "69 BC", 1),
                new Person("Alexander the Great", "Macedon", "356 BC", 1),
                new Person("Julius Caesar", "Rome", "100 BC", 1),
                new Person("Hannibal", "Carthage", "247 BC", 1),
                new Person("Confucius", "China", "551 BC", 1),
                new Person("Pericles", "Greece", "429 BC", 2),
                new Person("Spartacus", "Thrace", "111 BC", 2),
                new Person("Marcus Aurelius", "Rome", "121 AD", 2),
                new Person("Leonidas", "Greece", "540 BC", 2),
                new Person("Sun Tzu", "China", "544 BC", 2),
                new Person("Hammurabi", "Babylon", "1750 BC", 2)
        };

        AirLine airline = new AirLine();

        for (int i = 0; i < people.length; i++) {
            if (people[i].applyPassport() == true) {
                people[i].setPassport();
                airline.createReservation(people[i]);
            }
        }

        System.out.println("********************** RESERVATIONS COMPLETE! **********************\n");
        System.out.println(airline);

    }
}