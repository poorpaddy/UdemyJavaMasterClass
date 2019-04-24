package com.daveb;

public class Main {

    public static void main(String[] args) {

        // width of int = 32 (4 bytes).
        int myIntValue = 5 /2;
        // width of float = 32 (4 bytes).
        float myFloatValue = 5f / 3f;
        // width of double = 64 (8 bytes).
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDouble Value = " + myDoubleValue);

        double poundsValue = 200d;
        double kilogramsValue = poundsValue * 0.45359237d;
        System.out.println("Kilgrams = " +kilogramsValue);
        //90.7185

        double pi = 3.1415927d;

    }
}
