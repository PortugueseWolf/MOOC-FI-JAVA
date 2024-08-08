package vocabulary;

import java.util.HashMap;
import java.util.Random;

public class Dictionary {
    private HashMap<String, String> dictionary;
    private String lastRandom;

    public Dictionary() {
        this.dictionary = new HashMap<>();
        this.lastRandom = "";
    }

    public void add(String word, String translation) {
        if (!(dictionary.containsKey(word))) {
            dictionary.put(word, translation);
        }
    }

    public String getTranslation(String word) {
        return dictionary.get(word);
    }

    public String getRandomWord() {
        Random random = new Random();
        int index = random.nextInt(dictionary.size());
        int i = 0;
         for(String word : dictionary.keySet()) {
            if (i == index) {
                lastRandom = word;
                return dictionary.get(word);
            }
            i++;
         }
        return null;
    }

    public String getLastRandom() {
        return lastRandom;
    }

    public boolean isEmpty() {
        if (dictionary.isEmpty()) {
            return true;
        }
        return false;
    }


}
