package com.belhard.valera.test.entities.less4.homework;

public class zadacha1 {
    public static void main(String[] args) {


        String[][] arrayYmn = new String[9][];
        for (int i = 0; i < arrayYmn.length; i++) {
            for (int j = 0; j < arrayYmn.length; j++) {

               System.out.printf("%3d", (i+1) * (j+1) );
            }
            System.out.println();

        }
    }

}
