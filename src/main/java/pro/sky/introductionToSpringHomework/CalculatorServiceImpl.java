package pro.sky.introductionToSpringHomework;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public int plus( Integer num1 , Integer num2){
        int result = num1+num2;

            return result;}

    public int minus( Integer num1 , Integer num2){
        int result = num1-num2;
            return result;
    }

    public int multiply(Integer num1 , Integer num2){
        int result = num1*num2;
            return result;
    }

    public double divide(Integer num1 , Integer num2){
        if (num2 ==0){
            throw new NullDivisionException("На ноль делить нельзя");}
            else {

               double result = (double)num1/num2;
            return result;}
    }
}
