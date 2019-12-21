package cn.xp.fizzbuzz;

import javafx.util.Pair;

class Gamer {
    private int index;

    Gamer(int i) {
        index = i;
    }

    String print() {
        if (numberIsMultiplyBy(index, 15)) {
            return "FizzBuzz";
        }
        if (numberIsMultiplyBy(index, 3)) {
            return "Fizz";
        }
        if(Integer.toString(index).contains("3"))
        {
            return "Fizz";
        }
        if (numberIsMultiplyBy(index, 5)) {
            return "Buzz";
        }
        return Integer.toString(index);
    }

    private boolean numberIsMultiplyBy(int number, int by) {
        return number % by == 0;
    }
}
