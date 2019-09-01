package com.belhard.valera.test.entities.less4;

public class Main {
    public static void main(String[] args) {

        System.out.println("Person counter = " + Person.getCounter());

        Country country1 = new Country();
        country1.setTitle("Belarus");
        country1.setZipCode(220000);

        Person person1 = new Person("Vasily", 30, country1);


        person1.walk();
        person1.eat("meat");
        System.out.println("Current age: " + person1.growOld());

        Person person2 = new Person("Olga", 21, country1);


        person2.walk();
        person2.eat("bread");
        person2.eat();
        person2.eat("donuts", 10);
        person2.eat(50, "borstch");
        System.out.println("Current age: " + person2.growOld());

        System.out.println("\nperson1:" + person1.toString());
        System.out.println("person2: " + person2.toString());
        System.out.println("country of person1: " + person1.getCountry().toString());
        System.out.println("country of person2: " + person2.getCountry().toString());
        System.out.println("person1:" + person1.toString());


        System.out.println("Person counter  = " + Person.getCounter());


        //dopisat' !!!!!!!!!!!!!!!!!!!
        // повторить переопределние. Класс и метод и объект и поле. Конструктор
    }
}
