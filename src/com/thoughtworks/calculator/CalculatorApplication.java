package com.thoughtworks.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//accept and pass a command to the interpreter
public class CalculatorApplication {

    private double accumulator;

    public void getInput() {
        String input = " ";

        while(!input.equals("exit")) {
            Calculator calculator = new Calculator(accumulator);
            Interpreter interpreter = new Interpreter(calculator);

            Scanner s = new Scanner(System.in);
            input = s.nextLine();
            accumulator = interpreter.parseInput(input);
            System.out.println(accumulator);
        }
        System.exit(0);
    }


}
