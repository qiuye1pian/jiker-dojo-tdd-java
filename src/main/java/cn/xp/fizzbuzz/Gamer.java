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
        return Integer.toString(index);
    }
}
