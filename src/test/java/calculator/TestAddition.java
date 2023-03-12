package calculator;

import javafx.scene.robot.Robot;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAddition {

    @Test
    public void testAdd(){
        assertEquals(7.0, Calculator.add(5.0, 2.0),0);
    }

}
