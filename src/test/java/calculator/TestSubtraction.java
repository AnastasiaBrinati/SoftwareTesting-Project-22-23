package calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSubtraction {
    Calculator calculator;

    @Before
    public void setup(){
        calculator = new Calculator();
    }

    @Test
    public void testSub(){
        assertEquals(1.0, calculator.sub(3.0, 2.0),0);
    }

}
