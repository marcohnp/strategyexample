package com.marcohnp.strategy.strategy;

import com.marcohnp.strategy.enums.OperationTypeEnum;
import org.springframework.stereotype.Component;

@Component
public class AddStrategy implements CalculatorStrategy {

    @Override
    public Boolean isValid(OperationTypeEnum operation) {
        return OperationTypeEnum.ADDITION.equals(operation);
    }

    @Override
    public Double operation(Double number1, Double number2) {
        return number1 + number2;
    }
}
