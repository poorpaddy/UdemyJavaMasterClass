package com.daveb;

public class Main {

    public static void main(String[] args) {

//        // int has a width of 32
//        int myMinValue = -2_147_483_648;
//        int myMaxValue = 2_147_483_647;
//        int myTotal = (myMinValue / 2);
//        System.out.printf("myTotal = " + myTotal);
//
//        // byte has a width of 8
//        byte myByteValue = -128;
//        byte myNewByteValue = (byte) (myByteValue / 2);
//        System.out.printf("myNewByteValue = " + myNewByteValue);
//
//        // short has a width of 16
//        short myShortValue = 32767;
//        short myNewShortValue = (short) (myShortValue / 2);
//
//        // short has a width of 64
//        long myLongValue = 100L;

        byte myByteValue = 33;
        short myShortValue = -2000;
        int myNumberValue = 7654;
        long myLongValue = (50000L + myShortValue + myNumberValue) + (10L * myByteValue);
        short shortTotal = (short) (1000 + myShortValue + myNumberValue + 10 * myByteValue);
        System.out.println(myLongValue);
        System.out.println(shortTotal);

    }
}
