import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MyFirstTestClass {

    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        assertEquals(5.0, calculator.add(3.0, 2.0),0);
    }

    @Test
    public void testAdd2(){
        Calculator calculator = new Calculator();
        assertEquals(5.0, calculator.add(3.0, 2.0),0);
    }



}
