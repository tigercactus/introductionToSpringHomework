package pro.sky.introductionToSpringHomework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterizedCalculatorServiceTest {
    private final CalculatorServiceImpl calculatorServiceImpl = new CalculatorServiceImpl();
    static Stream<Arguments> arguments(){
        return Stream.of(
                Arguments.of(1,-2),
                Arguments.of(8,0));
    }

    @ParameterizedTest
    @MethodSource("arguments")
    public void plus(Integer a, Integer b){
        Integer expected = a+b;
        assertEquals(expected,calculatorServiceImpl.plus(a,b));
    }
    @ParameterizedTest
    @MethodSource("arguments")
    public void minus(Integer a, Integer b){
        Integer expected = a-b;
        assertEquals(expected,calculatorServiceImpl.minus(a,b));
    }

    @ParameterizedTest
    @MethodSource("arguments")
    public void multiply(Integer a, Integer b){
        Integer expected = a*b;
        assertEquals(expected,calculatorServiceImpl.multiply(a,b));
    }

    @ParameterizedTest
    @MethodSource("arguments")
    public void divide(Integer a, Integer b){
        if (b==0){
            assertThatExceptionOfType(NullDivisionException.class).isThrownBy(()->calculatorServiceImpl.divide(a,b));
        }
        else{
        Double expected = (double)a/(double)b;
        assertEquals(expected,calculatorServiceImpl.divide(a,b));}
    }
}
