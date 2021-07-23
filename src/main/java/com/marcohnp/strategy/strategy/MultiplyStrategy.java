package com.marcohnp.strategy.strategy;

public class MultiplyStrategy implements CalculatorStrategy {

    @Override
    public Double operation(Double number1, Double number2) {
        return number1 * number2;
    }
}
