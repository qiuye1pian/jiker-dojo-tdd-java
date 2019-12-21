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

    @Test
    public void test_should_be_Buzz_when_5() {
        //Given
        Gamer gamer;
        //When
        gamer = new Gamer(5);
        //Then
        assertEquals("Buzz", gamer.print());
    }

    @Test
    public void test_should_be_Fizz_when_6() {
        //Given
        Gamer gamer;
        //When
        gamer = new Gamer(6);
        //Then
        assertEquals("Fizz", gamer.print());
    }

    @Test
    public void test_should_be_Buzz_when_10() {
        //Given
        Gamer gamer;
        //When
        gamer = new Gamer(10);
        //Then
        assertEquals("Buzz", gamer.print());
    }

    @Test
    public void test_should_be_Fizz_when_12() {
        //Given
        Gamer gamer;
        //When
        gamer = new Gamer(12);
        //Then
        assertEquals("Fizz", gamer.print());
    }


    @Test
    public void test_should_be_FizzBuzz_when_15() {
        //Given
        Gamer gamer;
        //When
        gamer = new Gamer(15);
        //Then
        assertEquals("FizzBuzz", gamer.print());
    }

    @Test
    public void test_should_be_FizzBuzz_when_30() {
        //Given
        Gamer gamer;
        //When
        gamer = new Gamer(30);
        //Then
        assertEquals("FizzBuzz", gamer.print());
    }

    @Test
    public void test_should_be_Fizz_when_31() {
        //Given
        Gamer gamer;
        //When
        gamer = new Gamer(31);
        //Then
        assertEquals("Fizz", gamer.print());
    }

    @Test
    public void test_should_be_Buzz_when_59() {
        //Given
        Gamer gamer;
        //When
        gamer = new Gamer(59);
        //Then
        assertEquals("Buzz", gamer.print());
    }

    @Test
    public void test_should_be_FizzBuzz_when_53() {
        //Given
        Gamer gamer;
        //When
        gamer = new Gamer(53);
        //Then
        assertEquals("FizzBuzz", gamer.print());
    }

    @Test
    public void test_should_be_FizzBuzz_when_35() {
        //Given
        Gamer gamer;
        //When
        gamer = new Gamer(35);
        //Then
        assertEquals("FizzBuzz", gamer.print());
    }

    @Test
    public void test_should_be_FizzBuzz_when_51() {
        //Given
        Gamer gamer;
        //When
        gamer = new Gamer(51);
        //Then
        assertEquals("FizzBuzz", gamer.print());
    }

    @Test
    public void test_should_be_FizzBuzz_when_54() {
        //Given
        Gamer gamer;
        //When
        gamer = new Gamer(54);
        //Then
        assertEquals("FizzBuzz", gamer.print());
    }

    @Test
    public void test_should_be_FizzBuzz_when_57() {
        //Given
        Gamer gamer;
        //When
        gamer = new Gamer(57);
        //Then
        assertEquals("FizzBuzz", gamer.print());
    }

}
