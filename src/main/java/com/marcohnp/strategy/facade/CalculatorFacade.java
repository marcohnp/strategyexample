package com.marcohnp.strategy.facade;

import com.marcohnp.strategy.enums.OperationTypeEnum;
import com.marcohnp.strategy.mapper.CalculatorMapper;
import com.marcohnp.strategy.model.response.CalculatorResponse;
import com.marcohnp.strategy.service.CalculatorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class CalculatorFacade {

    private CalculatorService service;


    public CalculatorResponse calculate(OperationTypeEnum operation, Double n1, Double n2) {
        return CalculatorMapper.mapToResponse(service.calculate(operation, n1, n2));
    }
}
