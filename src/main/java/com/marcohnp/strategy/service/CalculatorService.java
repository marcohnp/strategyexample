package com.marcohnp.strategy.service;

import com.marcohnp.strategy.enums.OperationTypeEnum;
import com.marcohnp.strategy.model.CalculatorModel;
import com.marcohnp.strategy.strategy.CalculatorStrategy;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CalculatorService {

    private List<CalculatorStrategy> strategies;

    public CalculatorModel calculate(OperationTypeEnum operation, Double n1, Double n2) {
        return CalculatorModel.builder()
                .number1(n1)
                .number2(n2)
                .operation(operation)
                .result(getResult(operation, n1, n2))
                .build();
    }

    private Double getResult(OperationTypeEnum operation, Double n1, Double n2) {
        return resolveStrategy(operation)
                .operation(n1, n2);
    }

    private CalculatorStrategy resolveStrategy(OperationTypeEnum operation) {
        return strategies.stream()
                .filter(strategy -> strategy.isValid(operation))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Operação inválida."));
    }
}
