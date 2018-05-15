import com.darkside.fb.FizzBuzzTwo;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTwoTest {

    private FizzBuzzTwo fb;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        fb = new FizzBuzzTwo();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        fb = null;
    }

    @org.junit.jupiter.api.Test
    void fizzBuzzness() {
        assertEquals("1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz", fb.fizzBuzzness(1,20));
        // Test special case zero
        assertEquals("buzz -19 fizz -17 -16 fizzbuzz -14 lucky fizz -11 buzz fizz -8 -7 fizz buzz -4 lucky -2 -1 0 1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz", fb.fizzBuzzness(-20,20));
    }
}