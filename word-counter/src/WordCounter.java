import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounter {
    public String word_counter(String string, int count) {
        Map<String, Integer> map = new HashMap<>();
        String[] splitString = string.split(" ");

        for (String s : splitString) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == count) {
                return entry.getKey();
            }
        }
        return "Word not found for given count: " + count;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the words: ");
        String text = scanner.nextLine();
        System.out.print("Enter the count for each word: ");
        int count = scanner.nextInt();
        WordCounter counter = new WordCounter();
        String wordCounter = counter.word_counter(text, count);
        System.out.println(wordCounter);
    }
}
