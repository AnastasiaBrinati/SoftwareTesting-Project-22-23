package calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMultiplication {
    Calculator calculator;

    @Before
    public void setup(){
        calculator = new Calculator();
    }

    @Test
    public void testMul(){
        assertEquals(6.0, calculator.mul(3.0, 2.0),0);
    }

}
