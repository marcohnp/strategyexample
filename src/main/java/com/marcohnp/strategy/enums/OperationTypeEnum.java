package com.marcohnp.strategy.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;

@AllArgsConstructor
@Getter
public enum OperationTypeEnum {

    ADDITION(1, "Addition"),
    SUBTRACTION(2, "Subtraction"),
    MULTIPLICATION(3, "Multiplication"),
    DIVISION(4, "Division"),
    INVALID_OPERATION(5, "Invalid Operation");

    private final Integer code;
    private final String description;

    public static OperationTypeEnum fromValue(Integer value) {
        return EnumSet.allOf(OperationTypeEnum.class)
                .stream()
                .filter(operationTypeEnum -> operationTypeEnum.getCode().equals(value))
                .findFirst()
                .orElse(null);
    }
}
