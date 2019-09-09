package com.belhard.valera.test.entities.less6.homework.ex1;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 1; i <= 5; i++) {
            int b;
            Random random = new Random();
            b = (random.nextInt(101) - 50);
            al.add(b);

        }

//Другой рандом
/*         for (int i = 1; i <= 5; i++){
            int b;
            b =(int) (Math.random() * 101) - 50;
           al.add(b);

        }
        */


        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }

        // Среднее арифметическое.
        double summa = 0;
        double rezult = 0;
        for (int i = 0; i < al.size(); i++) {
            summa = summa + al.get(i);
        }
        rezult = summa / al.size();

        System.out.println("\n Среднее значение: " + rezult);

    }

}
