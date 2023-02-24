package pro.sky.skyprocalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements CalculatorServiceInterface{
    @Override
    public String hello(){
        return "Добро пожаловать в калькулятор";
    }
    @Override
    public String answerHello(){
        return "Добро пожаловать в калькулятор";
    }
    @Override
    public Integer getSum(Integer number1, Integer number2){
        return number1 + number2;
    }
    @Override
    public Integer getMinus(Integer number1, Integer number2){
        return number1 - number2;
    }
    @Override
    public Integer getMultiply(Integer number1, Integer number2){
        return number1*number2;
    }
    @Override
    public Integer getDivide (Integer number1, Integer number2){
        return number1 / number2;
    }
}
