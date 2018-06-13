import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTest {

    @Test
    public void factorialZeroIsOne(){
        assertEquals(1, Factorial.factorial(0));
    }

    @Test
    public void factorialOneIsOne(){
        assertEquals(1, Factorial.factorial(1));
    }

    @Test
    public void factorialTwoIsTwo(){
        assertEquals(2, Factorial.factorial(2));
    }

    @Test
    public void factorialThreeIsSix(){
        assertEquals(6, Factorial.factorial(3));
    }

    @Test
    public void factorialTenIsBig(){
        assertEquals(3628800, Factorial.factorial(10));
    }

    @Test(expected=IllegalArgumentException.class)
    public void factorialNegativeNumberIsIllegal(){
        Factorial.factorial(-1);
    }

    @Test(expected=IllegalArgumentException.class)
    public void factorialThirteenIsIllegalAsItWouldOverflowAnInt(){
        Factorial.factorial(13);
    }



}
