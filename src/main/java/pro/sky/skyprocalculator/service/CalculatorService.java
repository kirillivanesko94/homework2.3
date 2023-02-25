package pro.sky.skyprocalculator.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class CalculatorService implements CalculatorServiceInterface {

    @Override
    public String answerHello(){
        return "Добро пожаловать в калькулятор";
    }
    @Override
    public Integer getSum(Integer number1, Integer number2){
        if(number1 == null || number2 == null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Введенный параметр не должен быть null");
        }
        return number1 + number2;
    }
    @Override
    public Integer getMinus(Integer number1, Integer number2){
        if(number1 == null || number2 == null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Введенный параметр не должен быть null");
        }
        return number1 - number2;
    }
    @Override
    public Integer getMultiply(Integer number1, Integer number2){
        if(number1 == null || number2 == null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Введенный параметр не должен быть null");
        }
        return number1*number2;
    }
    @Override
    public Integer getDivide (Integer number1, Integer number2){
        if(number1 == null || number2 == null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Введенный параметр не должен быть null");
        }
        return number1 / number2;
    }
}
