package cn.xp.fizzbuzz;

public class Gamer {
    int index;

    public Gamer(int i) {
        index = i;
    }

    public String print() {
        if(index == 3)
        {
            return "Fizz";
        }
        if(index == 5)
        {
            return "Buzz";
        }
        return Integer.toString(index);
    }
}
