package com.marcohnp.strategy.model;

import com.marcohnp.strategy.enums.OperationTypeEnum;
import com.marcohnp.strategy.strategy.CalculatorStrategy;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CalculatorModel {

    private Double number1;
    private Double number2;
    private OperationTypeEnum operation;
    private Double result;
}
