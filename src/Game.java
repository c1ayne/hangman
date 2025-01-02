import java.util.LinkedList;
import java.util.Scanner;

public class Game {
    private static int maxErrors = 6; // max errors
    private static String word = Words.choice(); // random word

    private static boolean showWord(LinkedList<Character> chars, int errors) { // example: к_х__
        Field.paint(errors);
        String hideWord = "";
        for (char i : word.toCharArray()){
            if (chars.contains(i)) hideWord += i;
            else hideWord += "_";
        }
        System.out.println(hideWord);
        return  !hideWord.contains("_");
    }

    public static void start() {
        int errors = 0; // errors in this game
        boolean flag = true;
        LinkedList<Character> chars = new LinkedList<Character>(); // chars from user
        System.out.println(word);

        while (flag){
            boolean win = showWord(chars, errors);
            if (win) {
                flag = false;
                if (win) System.out.println("Вы выиграли");
                break;
            }

            System.out.println(errors); // test
            Scanner scanner = new Scanner(System.in);
            char newChar = scanner.next().charAt(0);
            if (!word.contains(String.valueOf(newChar))){
                errors++;
            }
            chars.add(newChar);

            if (errors == maxErrors) {
                flag = false;
                System.out.println("Вы проиграли");
                break;
            }
        }
    }
}