package calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDivision {

    @Test
    public void testDiv(){
        Calculator calculator = new Calculator();
        assertEquals(3.0, calculator.div(6.0, 2.0),0);
    }

}
