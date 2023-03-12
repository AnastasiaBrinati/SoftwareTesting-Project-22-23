package calculator;

import eye.Eye;
import eye.Match;
import org.junit.Test;
import java.awt.image.BufferedImage;

import static org.junit.Assert.*;

public class TestAddition {

    @Test
    public void testAdd(){
        assertEquals(7.0, Calculator.add(5.0, 2.0),0);
    }

    @Test
    public void eyeTest(){
        Eye eye = new Eye();
        BufferedImage image = eye.loadImage("chromelogo.png");
        if(image != null){
            Match match = eye.findImage(image);
            assertNotEquals(null, match);
            eye.click(match.getCenterLocation());
        }else{
            System.out.println("Image is null.");
        }
    }

}
