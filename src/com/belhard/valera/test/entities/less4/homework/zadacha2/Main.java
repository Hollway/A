package com.belhard.valera.test.entities.less4.homework.zadacha2;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Book1", 1,
                new ISBN("fn2", new Date()), Format.A4);

        System.out.println(book1);
        book1.throughOutPage();
        book1.throughOutPage();
        book1.throughOutPage();
        book1.throughOutPage();

        System.out.println(book1);

        String a3 = "A3";
        Format format = Format.valueOf(a3);// Возвращает объект, вместо строки

        for (Format value: Format.values()){ //Вывести всё
            System.out.println(value);
        }

        System.out.println(Format.A5.name()); // Возвращает строку вместо объекта

        System.out.println(Format.A5.ordinal()); // Выводит индекс
    }
}
