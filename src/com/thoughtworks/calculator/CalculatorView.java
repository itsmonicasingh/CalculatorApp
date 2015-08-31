package com.thoughtworks.calculator;

import java.util.Scanner;

/**
 * Created by jhalaac on 31/08/15.
 */
public class CalculatorView {
    
    String inputString;
    Parser parser;


    public void acceptAnInput() {
        Scanner s=new Scanner(System.in);
        inputString=s.nextLine();
    }
}
