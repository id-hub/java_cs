package com.ab.work41;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 10;
        int b = 100;
        int c = 500;

        int maxValue = a;
        if (maxValue < b) {
            maxValue = b;
        }
        if (maxValue < c) {
            maxValue = c;
        }
        System.out.println("Max -> " + maxValue);
    }
}
