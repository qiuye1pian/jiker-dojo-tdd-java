package cn.xp.fizzbuzz;

class Gamer {
    private int index;

    Gamer(int i) {
        index = i;
    }

    String print() {
        if (index == 3 || index == 6) {
            return "Fizz";
        }
        if (index == 5|| index == 10) {
            return "Buzz";
        }
        return Integer.toString(index);
    }
}
