package com.marcohnp.strategy.factory;

import com.marcohnp.strategy.enums.OperationTypeEnum;
import com.marcohnp.strategy.model.CalculatorModel;

public class CalculatorFactory {

    public static CalculatorModel build(Double n1, Double n2, OperationTypeEnum operation, Double result){
        return CalculatorModel.builder()
                .number1(n1)
                .number2(n2)
                .operation(operation)
                .result(result)
                .build();
    }
}
