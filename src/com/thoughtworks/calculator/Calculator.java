package com.thoughtworks.calculator;

public class Calculator {

    private double result;
    private String[] inputArray;
    Calculator() {
        result =0;
    }
    public double calculate(String s) {
        inputArray = s.split(" ");
        result=result + Integer.parseInt(inputArray[1]);
        return result;
    }

}
