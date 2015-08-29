package com.thoughtworks.calculator;

public class Calculator {

    private static double result;
    private String[] inputArray;
    public double calculate(String s) {
        result=0;
        inputArray = s.split(" ");
        if (inputArray[0].equals("add"))
             result = result + Integer.parseInt(inputArray[1]);
        else if (inputArray[0].equals("subtract"))
            result = result - Integer.parseInt(inputArray[1]);
        else if (inputArray[0].equals("multiply"))
            result = result * Integer.parseInt(inputArray[1]);
        else if (inputArray[0].equals("divide"))
            result = result / Integer.parseInt(inputArray[1]);
        else if (inputArray[0].equals("cancel"))
            result=0;
        return result;

    }

}
