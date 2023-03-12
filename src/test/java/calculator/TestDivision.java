package calculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestDivision {

    @Test
    public void testDiv(){
        try {
            assertEquals(3.0, Calculator.div(6.0, 2.0),0);
        } catch (DivisionByZeroException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testDivByZero(){
        try {
           Calculator.div(6.0, 0.0);
        } catch (DivisionByZeroException e) {
            e.printStackTrace();
            assertEquals("Math Error", e.getMessage());
        }
    }

}
