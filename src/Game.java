import java.util.*;
import java.util.Scanner;

public class Game {
    private static int maxErrors = 6; // max errors
    private static String word = Words.choice(); // random word

    private static boolean showWord(Set<Character> chars) { // example: к_х__
        StringBuilder hideWord = new StringBuilder();
        boolean isComplete = true;

        for (char i : word.toCharArray()) {
            if (chars.contains(i)) {
                hideWord.append(i);
            } else {
                hideWord.append("_");
                isComplete = false; // check on win
            }
        }

        System.out.print(hideWord + " ");
        return isComplete;
    }

    private static boolean validation(char c) {
        return Character.UnicodeBlock.of(c) == Character.UnicodeBlock.CYRILLIC;
    }

    public static void start() {
        int errors = 0; // errors in this game
        boolean flag = true;
        Set<Character> chars = new HashSet<>(); // chars from user
//        System.out.println(word); // debug print

        while (flag){
            System.out.println("\n\n\n\n\n\n\n\n\n");
            Field.paint(errors);
            boolean win = showWord(chars); // flag on win
            if (win) {
                flag = false;
                System.out.println("Вы выиграли");
                break;
            }

            System.out.println(errors + "/" + maxErrors + " ошибок");
            Scanner scanner = new Scanner(System.in);
            char newChar = scanner.next().toLowerCase().charAt(0);
            while (!validation(newChar)) newChar = scanner.next().toLowerCase().charAt(0);
            if (!word.contains(String.valueOf(newChar)) && !chars.contains(newChar)){
                errors++;
            }
            chars.add(newChar);

            if (errors == maxErrors) {
                Field.paint(errors);
                flag = false;
                System.out.println("\nВы проиграли");
                break;
            }
        }
    }
}
