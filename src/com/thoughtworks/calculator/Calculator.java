package com.thoughtworks.calculator;

//should perform a valid operation given an input string.
public class Calculator {

    private double result;
    private String[] inputArray;

    Calculator(double num) {
        this.result = num;
    }

    public double calculate(String s) {
        inputArray = s.split(" ");
        if(inputArray.length<3) {
            if (inputArray[0].equals("add"))
                result = result + operator();
            else if (inputArray[0].equals("subtract"))
                result = result - operator();
            else if (inputArray[0].equals("multiply"))
                result = result * operator();
            else if (inputArray[0].equals("divide"))
                result = result / operator();
            else if (inputArray[0].equals("cancel"))
                result = 0;
            return result;
        }
        else
            return result;
    }

    private int operator() {
        return Integer.parseInt(inputArray[1]);
    }

}
