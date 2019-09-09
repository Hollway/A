package com.belhard.valera.test.entities.less4.homework.zadacha3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("car1", 100, 1);

        System.out.println(car1.getDistance());
        System.out.println(car1);

        car1.move(0,1);

        System.out.println(car1.getDistance());
        System.out.println(car1);

        car1.move(0,-2);

        System.out.println(car1.getDistance());
        System.out.println(car1);

        car1.move(50,50);

        System.out.println(car1.getDistance());
        System.out.println(car1);

        car1.move(1150,50);

        System.out.println(car1.getDistance());
        System.out.println(car1);

        System.out.println(Double.parseDouble("3")+5);
        System.out.println(System.nanoTime());
        System.out.println("\n\n\n\n\n");


        double randDouble = Math.random();
        System.out.println(randDouble);

        Random random = new Random();

        random.nextInt(10);

        int[] array = new int[10];
        for (int q = 0; q < array.length; q++){
            array[q] = random.nextInt(1000);
        }

        for (int i : array){
            System.out.println(i);
        }
    }
}