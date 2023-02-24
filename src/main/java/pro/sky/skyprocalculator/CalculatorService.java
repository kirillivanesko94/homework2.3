package pro.sky.skyprocalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String hello(){
        return "Добро пожаловать в калькулятор";
    }
    public String answerHello(){
        return "Добро пожаловать в калькулятор";
    }
    public int getSum(int number1, int number2){
        return number1 + number2;
    }
}
