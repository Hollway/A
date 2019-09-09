package com.belhard.valera.test.entities.less6.homework.ex2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();

        al.add("Мама");
        al.add("мыла");
        al.add("раму");
        al.add("!");
        System.out.println(al.size());


        for (int i = 0; i < al.size(); i++){
            System.out.print(al.get(i) + " ");
        }
        System.out.println();

        for (int i = 0; i < al.size(); i++){
            System.out.print(al.get(i).toUpperCase() + " ");
        }
    }


}

