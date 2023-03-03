package calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAddition {

    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        assertEquals(7.0, calculator.add(5.0, 2.0),0);
    }

}
