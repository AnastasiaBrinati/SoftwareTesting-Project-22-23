package calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegrationTestAddition {
    Calculator calculator;

    @Before
    public void setup(){
        calculator = new Calculator();
    }

    @Test
    public void testAddSub(){
        assertEquals(7.0, calculator.sub(calculator.add(10.0,4.0), 7.0),0);
    }

    @Test
    public void testAddMul(){
        assertEquals(28.0, calculator.mul(calculator.add(5.0, 2.0),4.0), 0.0);
    }

    @Test
    public void testAddDiv() throws DivisionByZeroException {
        assertEquals(6.0, calculator.div(calculator.add(8.0,4.0),2.0), 0.0);
    }

    @Test
    public void testAddPow(){
        assertEquals(100.0, calculator.pow(calculator.add(6.0,4.0),2.0), 0.0);
    }
}
