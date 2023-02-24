package pro.sky.skyprocalculator;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;


@RestController

public class CalculatorController {
    private final CalculatorServiceInterface calculatorService;

    public CalculatorController(CalculatorServiceInterface calculatorService) {
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
    public String getSum(@RequestParam(value = "num1") Integer number1, @RequestParam("num2") Integer number2){
        return String.format("%d + %d = %d",number1,number2, calculatorService.getSum(number1, number2));
    }
    @GetMapping(path = "/calculator/minus")
    public String getMinus(@RequestParam("num1") Integer number1, @RequestParam("num2") Integer number2){
        return String.format("%d - %d = %d",number1,number2, calculatorService.getMinus(number1, number2));
    }
    @GetMapping(path = "/calculator/multiply")
    public String getMultiply(@RequestParam("num1") Integer number1, @RequestParam("num2") Integer number2){
        return String.format("%d * %d = %d",number1,number2, calculatorService.getMultiply(number1, number2));
    }
    @GetMapping(path = "/calculator/divide")
    public String getDivide(@RequestParam("num1") Integer number1, @RequestParam("num2") Integer number2){
        if(number2 == 0){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "На 0 делить нельзя");
        }
        return String.format("%d / %d = %d",number1,number2, calculatorService.getDivide(number1, number2));
    }

}
