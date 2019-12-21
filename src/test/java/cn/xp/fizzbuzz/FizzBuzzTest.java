package cn.xp.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void test_should_be_number_when_1()
    {
        //Given
        Gamer gamer;
        //When
        gamer = new Gamer(1);
        //Then
        assertEquals("1", gamer.print());
    }
}
