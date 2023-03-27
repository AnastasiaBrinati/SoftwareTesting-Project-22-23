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
        assertEquals(12.0, calculator.mul(3.0, 4.0),0);
    }

}
