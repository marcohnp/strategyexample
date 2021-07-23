package com.marcohnp.strategy.service;

import com.marcohnp.strategy.enums.OperationTypeEnum;
import com.marcohnp.strategy.model.CalculatorModel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CalculatorService {
    public CalculatorModel calculate(OperationTypeEnum operation, Double n1, Double n2) {
    }
}
