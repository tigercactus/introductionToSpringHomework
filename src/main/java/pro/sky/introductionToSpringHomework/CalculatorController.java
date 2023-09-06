package pro.sky.introductionToSpringHomework;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;
    public CalculatorController(CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }
@GetMapping
    public String hello()  {
    return "Добро пожаловать в калькулятор! Для проведения математических операций передайте целые числа.";
    }
    @GetMapping (path = "/plus")
    public String plus(@RequestParam(value = "num1", required = false) Integer num1 , @RequestParam(value = "num2",required = false) Integer num2){
        if (num1== null || num2 ==null )return "Параметры не должны быть пустыми: пожалуйста, укажите оба числа";
        else {
            String toBeReturned = String.format("%d + %d = %d",num1,num2,calculatorService.plus(num1, num2));
            return toBeReturned;
        }
    }
    @GetMapping (path = "/minus")
    public String minus(@RequestParam(value = "num1", required = false) Integer num1 , @RequestParam(value = "num2",required = false) Integer num2){
        if (num1== null || num2 ==null )return "Параметры не должны быть пустыми: пожалуйста, укажите оба числа";
        else {String toBeReturned = String.format("%d - %d = %d",num1,num2,calculatorService.minus(num1,num2));
        return toBeReturned;}
    }

    @GetMapping (path = "/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) Integer num1 , @RequestParam(value = "num2",required = false) Integer num2) {
        if (num1 == null || num2 == null) return "Параметры не должны быть пустыми: пожалуйста, укажите оба числа";
        else {
            String toBeReturned = String.format("%d * %d = %d", num1, num2, calculatorService.multiply(num1, num2));
            return toBeReturned;
        }
    }

        @GetMapping(path = "/divide")
        public String divide (@RequestParam(value = "num1", required = false) Integer
        num1, @RequestParam(value = "num2", required = false) Integer num2){
            if (num1 == null || num2 == null) return "Параметры не должны быть пустыми: пожалуйста, укажите оба числа";
            else if (num2 == 0) return "На ноль делить нельзя, введите другое значение у второго параметра";
            else {
                String toBeReturned = String.format("%d / %d = %f", num1, num2, calculatorService.divide(num1, num2));
                return toBeReturned;
            }
        }


    }