package calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAddition {
    Calculator calculator;

    @Before
    public void setup(){
        calculator = new Calculator();
    }

    @Test
    public void testAdd(){
        assertEquals(8.0, calculator.add(6.0, 2.0),0);
    }

}
