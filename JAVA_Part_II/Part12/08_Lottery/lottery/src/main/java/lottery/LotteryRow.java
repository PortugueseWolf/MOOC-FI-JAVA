package lottery;

import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {

        this.numbers = new ArrayList<>();

        Random numbersGenerator = new Random();

        for(int i = 0; i < 7; i++) {
            int newNumber = numbersGenerator.nextInt(40) + 1;
            if (containsNumber(newNumber)) {
                i--;
                continue;
            }
            numbers.add(newNumber);
        }

    }

    public boolean containsNumber(int number) {
        if (numbers.contains(number)) {
            return true;
        }
        return false;
    }
}

