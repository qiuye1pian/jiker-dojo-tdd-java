package cn.xp.fizzbuzz;

class Gamer {
    private int index;

    Gamer(int i) {
        index = i;
    }

    String print() {
        if (shouldBeFizzBuzz(index)) {
            return "FizzBuzz";
        }
        if (shouldBeFizz(index)) {
            return "Fizz";
        }
        if (shouldBeBuzz(index)) {
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

    private boolean shouldBeFizz(int index) {
        return numberIsMultiplyBy(index, 3) || numberContainsTarget(index, 3);
    }

    private boolean shouldBeBuzz(int index) {
        return numberIsMultiplyBy(index, 5) || numberContainsTarget(index, 5);
    }

    private boolean shouldBeFizzBuzz(int index) {
        return shouldBeFizz(index) && shouldBeBuzz(index);
    }

}
