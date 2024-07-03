package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SaveableDictionary {
    private ArrayList<String> dictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new  ArrayList<>();
    }

    public SaveableDictionary(String file) {
        this.dictionary = new  ArrayList<>();
        this.file = file;
    }

    public void add(String words, String translation) {
        if (!(dictionary.contains(words) || dictionary.contains(translation))) {
            dictionary.add(words);
            dictionary.add(translation);
        }
    }

    public String translate(String word) {
        for(int i = 0; i < dictionary.size(); i++) {
            if (dictionary.get(i).equals(word) && i % 2 == 0) {
                return dictionary.get(i+1);
            } else if (dictionary.get(i).equals(word)) {
                return dictionary.get(i-1);
            }
        }
        return null;
    }

    public void delete(String word) {
        for(int i = 0; i < dictionary.size(); i++) {
            if (dictionary.get(i).equals(word) && i % 2 == 0) {
                dictionary.remove(i+1);
                dictionary.remove(i);
            } else if (dictionary.get(i).equals(word)) {
                dictionary.remove(i);
                dictionary.remove(i-1);
            }
        }
    }

    public boolean load() {

        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();

                String[] spliter = line.split(":");

                add(spliter[0],spliter[1]);
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean save() {
        try (PrintWriter writer = new PrintWriter(file)) {
            for(int i = 0; i < dictionary.size(); i+=2) {
                writer.println(dictionary.get(i) + ":" + dictionary.get(i+1));
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
