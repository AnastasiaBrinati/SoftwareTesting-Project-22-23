package calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestExpression {

    // Integration Testing
    @Test
    public void testSubAdd() throws DivisionByZeroException {
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

    @Test
    public void testAddSub() throws DivisionByZeroException {
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

    @Test
    public void testMulSub() throws DivisionByZeroException {
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

    @Test
    public void testDivSub() throws DivisionByZeroException {
        assertEquals(7.0, Calculator.sub(Calculator.add(10.0,4.0), 7.0),0);
    }

    @Test
    public void testDivAdd(){
        assertEquals(28.0, Calculator.mul(Calculator.add(5.0, 2.0),4.0), 0.0);
    }

    @Test
    public void testDiv() throws DivisionByZeroException {
        assertEquals(6.0, Calculator.div(Calculator.add(8.0,4.0),2.0), 0.0);
    }

}
