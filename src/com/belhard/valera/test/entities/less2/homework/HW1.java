package com.belhard.valera.test.entities.less2.homework;

public class HW1 {
    public static void main(String[] args) {

        int a = 3;
        int b = 7;
        System.out.println("Задание 1");
        System.out.println("a = " + a + ", " + "b = " + b);
        System.out.println("Сумма a+b = " + (a + b));
        System.out.println("Разность a-b = " + (a - b));
        System.out.println("Произведение a*b = " + (a * b));
        System.out.println("Частное a/b = " + (a / b));
        System.out.println("Частное++ a/b = " + ((double) a / (double) b));
        System.out.println("\n");
///////////////////////////////////////////////////////////////////////////////

        System.out.println("Задание 2");
        double temperature = 24.9;
        int temp;
        System.out.println("Температура сегодня " + temperature + "C");
        if (temperature < 10) {
            System.out.println("Надень тёплёю куртку");
        }
        if (temperature >= 10 && temperature < 18) {
            System.out.println("Надень кофту");
        }
        if (temperature >= 18 && temperature < 25) {
            System.out.println("Надень майку");
        } else {
            System.out.println("Надень трусы");
        }
        System.out.println("\n");
/////////////////////////////////////////////////////////////////////////////////

        System.out.println("Задание 3");
        int salary1 = 1000, salary2 = 500, salary3 = 1200;
        int max, min;
        max = salary1; // нахождение максимальной зп
        if (salary2 > max) {
            max = salary2;
        }
        if (salary3 > max) {
            max = salary3;
        }
        min = salary1; // нахождение минимальной зп
        if (salary2 < min) {
            min = salary2;
        }
        if (salary3 < min) {
            min = salary3;
        }
        System.out.println("зп " + salary1 + ", " + "зп " + salary2 + ", " + "зп " + salary3 + ", ");
        System.out.println("Максимальная зп: " + max + ", " + "минимальная зп: " + min);
        System.out.println("максимальная зп больше минимальной на: " + (max - min));
        System.out.println("\n");
///////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Задание 4");
        int chislo = 2;
        int stepen = 4;
        int rezult = chislo;
        int i = 1;
        while (i < stepen) {
            rezult = rezult * chislo;
            i++;
        }
        System.out.println(chislo + " в степени " + stepen + " = " + rezult);
        System.out.println("\n");
///////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Задание 5");
        double sum = 1000;
        double proc = 10;
        int years = 3;
        double summaPodProc = 0;
        summaPodProc = sum + (sum / 100 * proc * years);
        System.out.println("Вклад размером " + sum + " под процентом " + proc + "% " + " через " + years + " будет равен " + summaPodProc);
        System.out.println("\n");
///////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Задание 6");

        for (int d = 1; d <= 100; d++) {

            if ((d % 3 == 0) && (d % 7 == 0)) {
                System.out.print(d + " ");
            }
        }
        System.out.println();
        for (int d = 1; d <= 100; d++) {
            if ((d % 3 == 0) || (d % 5 == 0)) { //ДОП 1
                System.out.print(d + " ");
            }
        }
        System.out.println();

        for (int d = 1; d <= 100; d++) {
            if ((d >= 10 && d <= 19) || (d >= 30 && d <= 39) || (d >= 50 && d <= 59) || (d >= 70 && d <= 79) || (d >= 90 && d <= 99)) {
                if ((d % 3 == 0) || (d % 5 == 0)) { //ДОП 2
                    System.out.print(d + " ");
                }

            }

        }
    }
    }
