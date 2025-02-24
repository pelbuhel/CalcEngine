package com.CalcEngine;

public class Main {

    public static void main(String[] args){

        double value1 = 100.0;
        double value2 = 50.0;
        double result;
        char opCode = 'd';

        if(opCode =='a')
            result = value1+ value2;
        else if(opCode == 's')
            result = value1 - value2;
        else if(opCode == 'm')
            result = value1 * value2;
        else if(opCode == 'd')
            result = value1 / value2;

        else
            result = 0.0d;

        System.out.println(result);

    }

}
