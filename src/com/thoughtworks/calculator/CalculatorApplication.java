package com.thoughtworks.calculator;

import java.util.Scanner;

//accept and pass a command to the interpreter
public class CalculatorApplication {

    public String getInput() {
        String input;
        Scanner s= new Scanner(System.in);
        input = s.next();
        return input;
    }
}
