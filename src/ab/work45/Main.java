package com.ab.work45;

public class Main {
    public static void main(String[] args) {
//=============== topper ===================
        int topper = 1;
        System.out.print("* | ");
        while (topper <= 9) {
            System.out.print(topper + " ");
            if (topper == 9) {
                System.out.print("\n");
            }
            topper++;
        }
        System.out.print("------------------------------\n");

//=============== table =====================
        int line = 1;
        while (line <= 9) {
            System.out.print(line + " |");
            int column = 1;
            while (column <= 9) {
                System.out.print(" " + line * column);
                if (column == 9) {
                    System.out.print("\n");
                }
                column++;
            }
         line++;
        }

    }
}