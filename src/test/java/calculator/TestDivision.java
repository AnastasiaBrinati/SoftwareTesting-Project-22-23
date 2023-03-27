package calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDivision {
    Calculator calculator;

    @Before
    public void setup(){
        calculator = new Calculator();
    }

    @Test
    public void testDiv(){
        assertEquals(4.0, calculator.div(8.0, 2.0),0);
    }

}
