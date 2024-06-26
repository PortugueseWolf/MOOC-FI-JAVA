import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        scanner.close();
        int count = 0;

        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                int line = Integer.valueOf(reader.nextLine());
                if (line <= upperBound && line >= lowerBound) {
                    count ++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error reading " + file + "!");
        }
        System.out.println("Numbers: " + count);
    }
}