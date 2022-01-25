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
        Person[] people = new Person[] {
                new Person("Cleopatra", "Egypt", "69 BC", 1),
                new Person("Alexander the Great", "Macedon", "356 BC", 2),
                new Person("Julius Caesar", "Rome", "100 BC", 3),
                new Person("Hannibal", "Carthage", "247 BC", 4),
                new Person("Confucius", "China", "551 BC", 5),
                new Person("Pericles", "Greece", "429 BC", 6),
                new Person("Spartacus", "Thrace", "111 BC", 7),
                new Person("Marcus Aurelius", "Rome", "121 AD", 8),
                new Person("Leonidas", "Greece", "540 BC", 9),
                new Person("Sun Tzu", "China", "544 BC", 10),
                new Person("Hammurabi", "Babylon", "1750 BC", 11),
        };

        AirLine airline = new AirLine();

        for (int i = 0; i < people.length; i++) {
            airline.setPerson(people[i]);
        }

        System.out.println(airline.getPerson(1));
        System.out.println(airline.getPerson(5));
        System.out.println(airline.getPerson(10));

        String[] passport = { "Rayan Slim", "Canadian", "01/01/1111" };
        Person person = new Person("Rayan Slim", "Canadian", "01/01/1111", 1);
        if (person.applyPassport() == true) {
            System.out.println("Name: " + person.getName() + "\n" +
                    "Nationality: " + person.getNationality() + "\n" +
                    "Date of Birth: " + person.getDateOfBirth() + "\n" +
                    "Seat Number: " + person.getSeatNumber() + "\n" + "Passport: " +
                    Arrays.toString(person.getPassport()) + "\n");
        }
        System.out.println(person.toString());

    }
}