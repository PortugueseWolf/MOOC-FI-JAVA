package readingfilesperline;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String file = scanner.nextLine();
        scanner.close();

        read(file);

    }

    public static List<String> read(String file) {
        List<String> list = new ArrayList<>();
        try {
            Files.lines(Paths.get(file))
                .forEach(row -> list.add(row));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
