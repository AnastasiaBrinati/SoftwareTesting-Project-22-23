package calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegrationTestPower {
    Calculator calculator;

    @Before
    public void setup(){
        calculator = new Calculator();
    }

    // Four integration tests, to verify that the newly introduced operation works
    // with the already e
    @Test
    public void testPowSub(){
        assertEquals(5.0, calculator.sub(calculator.pow(3.0,2.0), 4.0),0.0);
    }

    @Test
    public void testPowAdd(){
        assertEquals(26.0, calculator.add(calculator.pow(5.0, 2.0),1.0), 0.0);
    }

    @Test
    public void testPowDiv() throws DivisionByZeroException {
        assertEquals(5.0, calculator.div(calculator.pow(5.0,3.0),25.0), 0.0);
    }

    @Test
    public void testPowMul() {
        assertEquals(16.0, calculator.mul(calculator.pow(2.0,2.0),4.0), 0.0);
    }

}
