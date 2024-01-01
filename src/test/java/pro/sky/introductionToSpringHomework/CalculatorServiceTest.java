package pro.sky.introductionToSpringHomework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;


public class CalculatorServiceTest {
    private final CalculatorServiceImpl calculatorServiceImpl = new CalculatorServiceImpl();
    @Test
    public void plus(){
        int actual = calculatorServiceImpl.plus(2,3);
        int expected = 5;
        assertEquals(expected,actual);
        actual = calculatorServiceImpl.plus(8,0);
        expected =8;
        assertEquals(actual,expected);
    }
    @Test
    public void minus(){
        int actual = calculatorServiceImpl.minus(2,3);
        int expected = -1;
        assertEquals(expected,actual);
        actual = calculatorServiceImpl.minus(8,0);
        expected =8;
        assertEquals(actual,expected);
    }
    @Test
    public void multiply()
    {
        int actual = calculatorServiceImpl.multiply(2,3);
        int expected = 6;
        assertEquals(expected,actual);
        actual = calculatorServiceImpl.multiply(8,0);
        expected =0;
        assertEquals(actual,expected);
    }
    @Test
    public void dividePositiveCase(){
        double actual = calculatorServiceImpl.divide(2, 3);
        double expected = 6.0;
        assertEquals(expected,actual);
        actual = calculatorServiceImpl.divide(8,2);
        expected =4;
        assertEquals(actual,expected);
    }
    @Test
    public void divideNegativeCase(){
        assertThatExceptionOfType(NullDivisionException.class).isThrownBy(()->calculatorServiceImpl.divide(8,0));

    }


}
