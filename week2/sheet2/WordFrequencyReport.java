import java.util.Scanner;
import java.util.HashMap;

public class WordFrequencyReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter feedback paragraph: ");
        String feedback = sc.nextLine();

        String cleaned = feedback.toLowerCase().replace(".", "").replace(",", "");
        String[] words = cleaned.split("\\s+");

        String[] stopWords = {"the", "was", "and", "a", "is", "of", "in"};

        HashMap<String, Integer> freq = new HashMap<>();

        for (String word : words) {
            boolean isStopWord = false;
            for (String stop : stopWords) {
                if (word.equals(stop)) {
                    isStopWord = true;
                }
            }
            if (word.isEmpty() || isStopWord) {
                continue;
            }
            if (freq.containsKey(word)) {
                freq.put(word, freq.get(word) + 1);
            } else {
                freq.put(word, 1);
            }
        }

        // Simple descending sort by count
        String[] keys = freq.keySet().toArray(new String[0]);
        for (int i = 0; i < keys.length; i++) {
            for (int j = i + 1; j < keys.length; j++) {
                if (freq.get(keys[j]) > freq.get(keys[i])) {
                    String temp = keys[i];
                    keys[i] = keys[j];
                    keys[j] = temp;
                }
            }
        }

        for (String key : keys) {
            System.out.println(key + ": " + freq.get(key));
        }
    }
}