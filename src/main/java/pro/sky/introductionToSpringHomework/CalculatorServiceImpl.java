package pro.sky.introductionToSpringHomework;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String hello()  {
        return "Добро пожаловать в калькулятор! Для проведения математических операций передайте целые числа.";
    }
    public String plus( Integer num1 , Integer num2){
        if (num1== null || num2 ==null )return "Параметры не должны быть пустыми: пожалуйста, укажите оба числа";
        else{int result = num1+num2;
            String toBeReturned = String.format("%d + %d = %d",num1,num2,result);
            return toBeReturned;}
    }

    public String minus( Integer num1 , Integer num2){
        if (num1== null || num2 ==null )return "Параметры не должны быть пустыми: пожалуйста, укажите оба числа";
        else{int result = num1-num2;
            String toBeReturned = String.format("%d - %d = %d",num1,num2,result);
            return toBeReturned;}
    }

    public String multiply(Integer num1 , Integer num2){
        if (num1== null || num2 ==null )return "Параметры не должны быть пустыми: пожалуйста, укажите оба числа";
        else{int result = num1*num2;
            String toBeReturned = String.format("%d * %d = %d",num1,num2,result);
            return toBeReturned;}
    }

    public String divide(Integer num1 , Integer num2){
        if (num1== null || num2 ==null )return "Параметры не должны быть пустыми: пожалуйста, укажите оба числа";
        else if(num2 ==0) return "На ноль делить нельзя, введите другое значение у второго параметра";
        else{double result = (double)num1/num2;
            String toBeReturned = String.format("%d / %d = %f",num1,num2,result);
            return toBeReturned;}
    }
}
