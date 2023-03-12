package calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegrationTestDivision {
    Calculator calculator;

    @Before
    public void setup(){
        calculator = new Calculator();
    }
    @Test
    public void testDivSub() throws DivisionByZeroException {
        assertEquals(10.0, calculator.add(calculator.div(12.0,4.0), 7.0),0);
    }

    @Test
    public void testDivAdd() throws DivisionByZeroException{
        assertEquals(12.0, calculator.mul(calculator.div(6.0, 2.0),4.0), 0.0);
    }

    @Test
    public void testDivMul() throws DivisionByZeroException {
        assertEquals(6.0, calculator.mul(calculator.div(12.0,4.0),2.0), 0.0);
    }
}
