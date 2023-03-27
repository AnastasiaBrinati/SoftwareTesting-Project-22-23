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
        assertEquals(1.0, calculator.sub(calculator.div(12.0,4.0), 2.0),0);
    }

    @Test
    public void testDivAdd() throws DivisionByZeroException{
        assertEquals(7.0, calculator.add(calculator.div(6.0, 2.0),4.0), 0.0);
    }

    @Test
    public void testDivMul() throws DivisionByZeroException {
        assertEquals(8.0, calculator.mul(calculator.div(12.0,3.0),2.0), 0.0);
    }

    @Test
    public void testDivPow() throws DivisionByZeroException {
        assertEquals(25.0, calculator.pow(calculator.div(15.0,3.0),2.0), 0.0);
    }
}
