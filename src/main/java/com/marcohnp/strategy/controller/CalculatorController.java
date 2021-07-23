package com.marcohnp.strategy.controller;

import com.marcohnp.strategy.enums.OperationTypeEnum;
import com.marcohnp.strategy.facade.CalculatorFacade;
import com.marcohnp.strategy.model.response.CalculatorResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/calculator")
public class CalculatorController {

    private CalculatorFacade facade;

    @GetMapping
    public CalculatorResponse calculate(@RequestParam OperationTypeEnum operation,
                                        @RequestParam Double n1,
                                        @RequestParam Double n2) {
        return facade.calculate(operation, n1, n2);
    }
}
