package com.marcohnp.strategy.model.response;

import com.marcohnp.strategy.enums.OperationTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CalculatorResponse {

    private Double number1;
    private Double number2;
    private OperationTypeEnum operation;
    private Double result;
}
