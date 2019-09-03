package com.belhard.valera.test.entities.less4.homework;

public class zadacha1 {
    public static void main(String[] args) {


        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i == 0 && j == 0) {
                    System.out.print("   ");
                    continue;
                }
                System.out.printf("%3d", (i + 1) * (j + 1));
            }
            System.out.println();

        }
    }

}
