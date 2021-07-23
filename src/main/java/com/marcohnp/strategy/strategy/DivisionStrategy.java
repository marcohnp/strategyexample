package com.marcohnp.strategy.strategy;

import com.marcohnp.strategy.enums.OperationTypeEnum;

public class DivisionStrategy implements CalculatorStrategy {

    @Override
    public Boolean isValid(OperationTypeEnum operation) {
        return OperationTypeEnum.DIVISION.equals(operation);
    }

    @Override
    public Double operation(Double number1, Double number2) {
        return number1 / number2;
    }
}
