package calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestAddition {

    @Test
    public void testAdd(){
        assertEquals(7.0, Calculator.add(5.0, 2.0),0);
    }

    // Integration Testing
    @Test
    public void testAddSub(){
        assertEquals(7.0, Calculator.sub(Calculator.add(10.0,4.0), 7.0),0);
    }

    @Test
    public void testAddMul(){
        assertEquals(28.0, Calculator.mul(Calculator.add(5.0, 2.0),4.0), 0.0);
    }

    @Test
    public void testAddDiv() throws DivisionByZeroException {
        assertEquals(6.0, Calculator.div(Calculator.add(8.0,4.0),2.0), 0.0);
    }
}
