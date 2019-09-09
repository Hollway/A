package com.belhard.valera.test.entities.less6.ex2;

import com.belhard.valera.test.entities.less6.ex1.entities.Worker;

public class Main {
    public static void main(String[] args) {

        /*int a = 5;
        int b = 6;
        System.out.println(a == b);
        String str1 = "aaa";
        String str2 = "aaa";
        System.out.println(str1 == str2);
        String str3 = new String("aaa");
        System.out.println(str1 == str3);*/

        Worker person1 = new Worker("Vasily", 50, 90, "base", 500);
        Worker person2 = new Worker("Vasily", 50, 90, "base", 500);

        System.out.println(person1.equals(person2));
        System.out.println(person1 == person2);


    }
}
