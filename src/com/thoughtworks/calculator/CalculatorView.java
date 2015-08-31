package com.thoughtworks.calculator;

import java.util.Scanner;

/**
 * Created by jhalaac on 31/08/15.
 */
public class CalculatorView {
    
    String inputString;

    public void acceptAnInput() {
        Scanner s=new Scanner(System.in);
        inputString=s.nextLine();
    }

    public void dispatchInputToParser() {
        Parser parser =new Parser(inputString);
        if(parser.validate()) {
            parser.parse();
        }
    }
}
