
import java.util.Scanner;

public class FirstWords {
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                scanner.close();
                break;
            }

            String[] splitter = input.split(" ");

            System.out.println(splitter[0]);
        }
    }
}
