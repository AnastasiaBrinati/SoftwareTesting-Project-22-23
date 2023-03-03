package calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMultiplication {

    @Test
    public void testMul(){
        assertEquals(6.0, Calculator.mul(3.0, 2.0),0);
    }

}
