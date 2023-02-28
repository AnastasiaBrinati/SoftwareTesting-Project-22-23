import calculator.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMultiplication {

    @Test
    public void testMul(){
        Calculator calculator = new Calculator();
        assertEquals(6.0, calculator.mul(3.0, 2.0),0);
    }

}
