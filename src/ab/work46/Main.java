package com.ab.work46;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter number -> ");
        Scanner scan = new Scanner(System.in);
        long number = scan.nextLong();

//========= Calculate sum ===================
        int sum = 0;
        while (number > 0) {
            sum += (int)(number % 10)*(number % 10);
        number /= 10;
        }
        System.out.println("sum = " + sum);
    }
}
