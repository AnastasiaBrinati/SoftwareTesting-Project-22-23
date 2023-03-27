package calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegrationTestSubtraction {
    Calculator calculator;

    @Before
    public void setup(){
        calculator = new Calculator();
    }

    @Test
    public void testSubAdd(){
        assertEquals(11.0, calculator.add(calculator.sub(10.0,3.0), 4.0),0);
    }

    @Test
    public void testSubMul(){
        assertEquals(12.0, calculator.mul(calculator.sub(5.0, 2.0),4.0), 0.0);
    }

    @Test
    public void testSubDiv() throws DivisionByZeroException {
        assertEquals(2.0, calculator.div(calculator.sub(8.0,4.0),2.0), 0.0);
    }

    @Test
    public void testSubPow() {
        assertEquals(49.0, calculator.pow(calculator.add(3.0,4.0),2.0), 0.0);
    }

}
