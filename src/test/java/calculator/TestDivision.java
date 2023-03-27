package calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDivision {
    Calculator calculator;

    @Before
    public void setup(){
        calculator = new Calculator();
    }

    @Test
    public void testDiv(){
        try {
            assertEquals(3.0, calculator.div(6.0, 2.0),0);
        } catch (DivisionByZeroException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testDivByZero(){
        try {
            calculator.div(6.0, 0.0);
        } catch (DivisionByZeroException e) {
            e.printStackTrace();
            assertEquals("Math Error", e.getMessage());
        }
    }


}
