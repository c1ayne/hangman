import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class Words {
    private static LinkedList<String> words = new LinkedList<String>(Arrays.asList(
            "кухня", "сердце", "кружка", "бутылка", "железо"
    ));

    public static String choice() {
        Random random = new Random();
        int randomChoice = random.nextInt(words.size());
        return words.get(randomChoice);
    }
}
