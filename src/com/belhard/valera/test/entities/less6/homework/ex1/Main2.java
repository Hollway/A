package com.belhard.valera.test.entities.less6.homework.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main2 {

    public static final int MIN_BOUND = -50;
    public static final int MAX_BOUND = 50;
    public static final int RANGE = MAX_BOUND-MIN_BOUND+1;

    private static Random random = new Random();

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            list.add(getRandomInteger());
            sum += list.get(i);

        }


        System.out.println(list);
        System.out.println((double) sum / list.size());


    }

    private static int getRandomInteger(){

        return random.nextInt(RANGE)+MIN_BOUND;
    }
}
