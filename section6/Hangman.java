
import java.util.Scanner;

public class Hangman {
    static int misses;
    static int guesses;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //section 1: (first page and basics).
//        String word = getRandomWord();
        String word = "abc";
        System.out.println(word);
        int Max = word.length();
        char[] placeHolder = placeHolders(word);
        char[] convertedWord= convertWordToCharArray(word);



        while (true){
            System.out.println(gallows[6-Max+misses]);

            System.out.print("Word:\t");
            for (int i = 0; i < placeHolder.length; i++) {
                System.out.print(placeHolder[i] + " ");
            }
            System.out.print("\n");
            System.out.println("Misses: " + misses);
            System.out.println("Guess: " + guesses);
            if (misses==Max){
                System.out.println("you loos");
                System.out.println("The word is: "+ word);
                break;
            }
            else if (guesses==word.length()){
                System.out.println("you winn");
                break;
            }else {
                System.out.print("geus: ");
                char gues = scan.next().charAt(0);
                placeHolder = checkGuess(placeHolder, convertedWord, gues);
            }
        }


        scan.close();
    }
    public static String getRandomWord(){
        return words[(int)(Math.random()*63)];
    }
    public static char[] convertWordToCharArray(String word){
        char[] charArray= new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            charArray[i] = word.charAt(i);
        }
        return charArray;
    }

    public static char[] placeHolders (String word){
        char[] placeHolderchar = new char[word.length()];
        for (int i =0; i< word.length(); i++){
            placeHolderchar[i] = '_';
        }return placeHolderchar;
    }


    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
            "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
            "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
            "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
            "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon",
            "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
            "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
            "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
            "wombat", "zebra"};

    public static String[] gallows = {
                    "+---+\n" +
                    "|   |\n" +
                    "    |\n" +
                    "    |\n" +
                    "    |\n" +
                    "    |\n" +
                    "=========\n",

                    "+---+\n" +
                    "|   |\n" +
                    "O   |\n" +
                    "    |\n" +
                    "    |\n" +
                    "    |\n" +
                    "=========\n",

                    "+---+\n" +
                    "|   |\n" +
                    "O   |\n" +
                    "|   |\n" +
                    "    |\n" +
                    "    |\n" +
                    "=========\n",

                    " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|   |\n" +
                    "     |\n" +
                    "     |\n" +
                    " =========\n",

                    " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" + //if you were wondering, the only way to print '\' is with a trailing escape character, which also happens to be '\'
                    "     |\n" +
                    "     |\n" +
                    " =========\n",

                    " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" +
                    "/    |\n" +
                    "     |\n" +
                    " =========\n",

                    " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" +
                    "/ \\  |\n" +
                    "     |\n" +
                    " =========\n"
    };

    public static char[] checkGuess(char[] placeHolder, char[] charArray, char gess){
        for (int i =0; i<charArray.length; i++){
            if (charArray[i]==gess && charArray[i]!=placeHolder[i]){
                guesses++;
                placeHolder[i]=gess;
                return placeHolder;
            }
        }misses++;
        return placeHolder;
    }


}
