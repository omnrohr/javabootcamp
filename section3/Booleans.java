public class Booleans {
    public static void main(String[] args) {
        // compere tow Strings.
        String sentence = "i Love this word";
        String sentence2 = "I love this word";
        System.out.println(sentence.equals(sentence2));
        System.out.println(!sentence.equals(sentence));
        System.out.println(sentence.equalsIgnoreCase(sentence2));
        System.out.println(!sentence.equalsIgnoreCase(sentence2));

    }
}
