package cn.xp.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void test_should_be_number_when_1() {
        //Given
        Gamer gamer;
        //When
        gamer = new Gamer(1);
        //Then
        assertEquals("1", gamer.print());
    }

    @Test
    public void test_should_be_number_when_2() {
        //Given
        Gamer gamer;
        //When
        gamer = new Gamer(2);
        //Then
        assertEquals("2", gamer.print());
    }

    @Test
    public void test_should_be_Fizz_when_3() {
        //Given
        Gamer gamer;
        //When
        gamer = new Gamer(3);
        //Then
        assertEquals("Fizz", gamer.print());
    }

}
