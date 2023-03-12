package calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMultiplication {

    @Test
    public void testMul(){
        assertEquals(6.0, Calculator.mul(3.0, 2.0),0);
    }

    // Integration Testing
    @Test
    public void testMulSub(){
        assertEquals(35.0, Calculator.sub(Calculator.mul(10.0,4.0), 5.0),0);
    }

    @Test
    public void testMulAdd(){
        assertEquals(14.0, Calculator.add(Calculator.mul(5.0, 2.0),4.0), 0.0);
    }

    @Test
    public void testMulDiv() throws DivisionByZeroException {
        assertEquals(16.0, Calculator.div(Calculator.mul(8.0,4.0),2.0), 0.0);
    }

}
