import calcolatrice.CalculatorController;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MyFirstTestClass {

    @Test
    public void testAdd(){
        CalculatorController calculator = new CalculatorController();
        assertEquals(5.0, calculator.add(3.0, 2.0),0);
    }

    @Test
    public void testAdd2(){
        CalculatorController calculator = new CalculatorController();
        assertEquals(5.0, calculator.add(3.0, 2.0),0);
    }



}
