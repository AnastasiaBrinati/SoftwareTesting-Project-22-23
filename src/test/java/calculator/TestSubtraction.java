package calculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestSubtraction {

    @Test
    public void testSub(){
        assertEquals(1.0, Calculator.sub(3.0, 2.0),0);
    }


}
