import calculator.Calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestSubtraction {

    @Test
    public void testSub(){
        Calculator calculator = new Calculator();
        assertEquals(1.0, calculator.sub(3.0, 2.0),0);
    }


}
