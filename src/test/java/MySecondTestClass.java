import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MySecondTestClass {

    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        assertEquals(5.0, calculator.add(3.0, 2.0),0);
    }

}
