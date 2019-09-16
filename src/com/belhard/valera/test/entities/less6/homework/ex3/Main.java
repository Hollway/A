package com.belhard.valera.test.entities.less6.homework.ex3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        int border = (random.nextInt(101) - 50);
        HashSet<Integer> hash = new HashSet<Integer>();

        for (int i = 1; i <= 10; i++) {
            int b;
            b = (random.nextInt(101) - 50);
            hash.add(b);
        }
        System.out.println(hash);
        System.out.println(border);

        for (int i : hash)
            if (i > border) {
                //  hash.remove(i);  //удалить не получилось, получилось только вывести, скрыв эти элементы
                System.out.print(i + " ");
            }
        System.out.println();

      /*  for (int i : hash) {
            if (i < border){
            hash.remove(i);
            return;
            }
        }
        System.out.println(hash);*/

        Iterator<Integer> i = hash.iterator();
        while (i.hasNext()){
            int next = i.next();
            if (next < border) {
                i.remove();
                         }}
        System.out.println(hash);

    }


}
