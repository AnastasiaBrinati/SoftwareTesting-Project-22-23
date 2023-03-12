package calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestExpression {

    // Integration Testing

    // Subtraction
    @Test
    public void testSubAdd(){
        assertEquals(11.0, Calculator.add(Calculator.sub(10.0,3.0), 4.0),0);
    }
    @Test
    public void testSubMul(){
        assertEquals(12.0, Calculator.mul(Calculator.sub(5.0, 2.0),4.0), 0.0);
    }
    @Test
    public void testSubDiv() throws DivisionByZeroException {
        assertEquals(2.0, Calculator.div(Calculator.sub(8.0,4.0),2.0), 0.0);
    }

    // Addition
    @Test
    public void testAddSub(){
        assertEquals(7.0, Calculator.sub(Calculator.add(10.0,4.0), 7.0),0);
    }
    @Test
    public void testAddMul(){
        assertEquals(28.0, Calculator.mul(Calculator.add(5.0, 2.0),4.0), 0.0);
    }
    @Test
    public void testAddDiv() throws DivisionByZeroException {
        assertEquals(6.0, Calculator.div(Calculator.add(8.0,4.0),2.0), 0.0);
    }

    // Multiplication
    @Test
    public void testMulSub(){
        assertEquals(35.0, Calculator.sub(Calculator.mul(10.0,4.0), 5.0),0);
    }
    @Test
    public void testMulAdd(){
        assertEquals(14.0, Calculator.add(Calculator.mul(5.0, 2.0),4.0), 0.0);
    }
    @Test
    public void testMulDiv() throws DivisionByZeroException {
        assertEquals(16.0, Calculator.div(Calculator.mul(8.0,4.0),2.0), 0.0);
    }

    // Division
    @Test
    public void testDivSub() throws DivisionByZeroException {
        assertEquals(10.0, Calculator.add(Calculator.div(12.0,4.0), 7.0),0);
    }
    @Test
    public void testDivAdd() throws DivisionByZeroException{
        assertEquals(12.0, Calculator.mul(Calculator.div(6.0, 2.0),4.0), 0.0);
    }
    @Test
    public void testDivMul() throws DivisionByZeroException {
        assertEquals(6.0, Calculator.mul(Calculator.div(12.0,4.0),2.0), 0.0);
    }

}
