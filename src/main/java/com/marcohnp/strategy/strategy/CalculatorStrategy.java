package com.marcohnp.strategy.strategy;

import com.marcohnp.strategy.enums.OperationTypeEnum;

public interface CalculatorStrategy {

    Boolean isValid(OperationTypeEnum operation);

    Double operation(Double number1, Double number2);

}
