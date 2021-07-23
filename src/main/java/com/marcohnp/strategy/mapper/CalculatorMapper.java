package com.marcohnp.strategy.mapper;

import com.marcohnp.strategy.model.CalculatorModel;
import com.marcohnp.strategy.model.response.CalculatorResponse;
import lombok.NoArgsConstructor;
import org.springframework.util.ObjectUtils;

@NoArgsConstructor
public class CalculatorMapper {

    public static CalculatorResponse mapToResponse(CalculatorModel model) {
        if (ObjectUtils.isEmpty(model)) return null;
        return CalculatorResponse.builder()
                .number1(model.getNumber1())
                .number2(model.getNumber2())
                .operation(model.getOperation())
                .result(model.getResult())
                .build();
    }
}
