package liquidcontainers2;

import java.util.Scanner;

public class LiquidContainers2 {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer + "\n" +
            "Second: " + secondContainer);
            
            System.out.print("> ");
            
            String input = scanner.nextLine();
            if (input.equals("quit")) {
                scanner.close();
                break;
            }

            String[] splitter = input.split(" ");
            String command = splitter[0];
            int amount = Integer.valueOf(splitter[1]);

            if (amount < 0) {
                continue;
            }

            if (command.equals("add")) {
                firstContainer.add(amount);
            }

            if (command.equals("move")) {
                if (firstContainer.contains() >= amount) {
                    firstContainer.remove(amount);
                    secondContainer.add(amount);
                } else {
                    secondContainer.add(firstContainer.contains());
                    firstContainer.remove(amount);
                }
            }

            if (command.equals("remove")) {
                secondContainer.remove(amount);
            }
        }
    }
}