package dictionary;

public class Main {
    public static void main(String[] args) {
        SaveableDictionary dictionary = new SaveableDictionary("words.txt");
        boolean wasSuccessful = dictionary.load();

        if (wasSuccessful) {
            System.out.println("Successfully loaded the dictionary from file");
        }

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("ohjelmointi"));
        System.out.println(dictionary.translate("alla oleva"));
        dictionary.add("hello", "ola");

        boolean saved = dictionary.save();

        if (saved) {
            System.out.println("Dictionary was saved");
        }

        SaveableDictionary second = new SaveableDictionary("words.txt");
        boolean secondSuccess = second.load();

        if (secondSuccess) {
            System.out.println("Successfully loaded the dictionary from file");
        }
        System.out.println(second.translate("ola"));


    }
}
