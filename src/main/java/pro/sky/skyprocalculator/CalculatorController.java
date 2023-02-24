package pro.sky.skyprocalculator;

import org.springframework.web.bind.annotation.*;
import pro.sky.skyprocalculator.CalculatorService;

@RestController

public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello(){
        return calculatorService.hello();
    }
    @GetMapping(path = "/calculator")
    public String helloCalculator(){
        return calculatorService.answerHello();
    }
    @GetMapping(path = "/calculator/plus")
    public String getSum(@RequestParam("num1") int number1, @RequestParam("num2") int number2){
        return String.format("%d + %d = %d",number1,number2, calculatorService.getSum(number1, number2));
    }
}
