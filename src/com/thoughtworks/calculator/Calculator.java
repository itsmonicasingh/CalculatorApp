package com.thoughtworks.calculator;

public class Calculator {

    private static double result;
    private String[] inputArray;
    public double calculate(String s) {
        inputArray = s.split(" ");
        if (inputArray[0].equals("add"))
             result = result + Integer.parseInt(inputArray[1]);
        else if (inputArray[0].equals("subtract"))
            result = result-Integer.parseInt(inputArray[1]);
        return result;

    }

}
