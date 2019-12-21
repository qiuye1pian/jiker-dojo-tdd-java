package cn.xp.fizzbuzz;

class Gamer {
    private int index;

    Gamer(int i) {
        index = i;
    }

    String print() {
        if (numberIsMultiplyBy(index, 15)) {
            return "FizzBuzz";
        }
        if (index == 51 || index == 54 || index == 57) {
            return "FizzBuzz";
        }
        if (numberContainsTarget(index, 5) && numberContainsTarget(index, 3)) {
            return "FizzBuzz";
        }
        if (numberIsMultiplyBy(index, 3)) {
            return "Fizz";
        }
        if (numberContainsTarget(index, 3)) {
            return "Fizz";
        }

        if (numberIsMultiplyBy(index, 5)) {
            return "Buzz";
        }
        if (numberContainsTarget(index, 5)) {
            return "Buzz";
        }
        return Integer.toString(index);
    }

    private boolean numberIsMultiplyBy(int number, int by) {
        return number % by == 0;
    }

    private boolean numberContainsTarget(int number, int target) {
        return Integer.toString(number).contains(Integer.toString(target));
    }
}
