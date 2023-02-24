import calculator.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAddition {

    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        assertEquals(5.0, calculator.add(3.0, 2.0),0);
    }

}
