package calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegrationTestMultiplication {
    Calculator calculator;

    @Before
    public void setup(){
        calculator = new Calculator();
    }

    @Test
    public void testMulSub(){
        assertEquals(35.0, calculator.sub(calculator.mul(10.0,4.0), 5.0),0);
    }

    @Test
    public void testMulAdd(){
        assertEquals(14.0, calculator.add(calculator.mul(5.0, 2.0),4.0), 0.0);
    }

    @Test
    public void testMulDiv() throws DivisionByZeroException {
        assertEquals(16.0, calculator.div(calculator.mul(8.0,4.0),2.0), 0.0);
    }

    @Test
    public void testMulPow(){
        assertEquals(144.0, calculator.pow(calculator.mul(3.0,4.0),2.0), 0.0);
    }
}
