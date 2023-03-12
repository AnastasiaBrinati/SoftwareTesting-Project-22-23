package calculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestSubtraction {

    @Test
    public void testSub(){
        assertEquals(1.0, Calculator.sub(3.0, 2.0),0);
    }

    // Integration Testing
    // Subtraction
    @Test
    public void testSubAdd(){
        assertEquals(11.0, Calculator.add(Calculator.sub(10.0,3.0), 4.0),0);
    }
    @Test
    public void testSubMul(){
        assertEquals(12.0, Calculator.mul(Calculator.sub(5.0, 2.0),4.0), 0.0);
    }
    @Test
    public void testSubDiv() throws DivisionByZeroException {
        assertEquals(2.0, Calculator.div(Calculator.sub(8.0,4.0),2.0), 0.0);
    }

}
