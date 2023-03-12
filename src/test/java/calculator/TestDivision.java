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

    // Integration Testing
    @Test
    public void testDivSub() throws DivisionByZeroException {
        assertEquals(10.0, Calculator.add(Calculator.div(12.0,4.0), 7.0),0);
    }

    @Test
    public void testDivAdd() throws DivisionByZeroException{
        assertEquals(12.0, Calculator.mul(Calculator.div(6.0, 2.0),4.0), 0.0);
    }

    @Test
    public void testDivMul() throws DivisionByZeroException {
        assertEquals(6.0, Calculator.mul(Calculator.div(12.0,4.0),2.0), 0.0);
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
