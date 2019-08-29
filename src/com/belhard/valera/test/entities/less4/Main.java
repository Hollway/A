package com.belhard.valera.test.entities.less4;

public class Main {
    public static void main(String[] args) {

        Country country1 = new Country();
        country1.title = "Belarus";
        country1.zipCode = 220000;

        Person person1 = new Person();

        person1.name = "Vasya";
        person1.age = 30;
        person1.country = country1;

        person1.walk();
        person1.eat("meat");
        System.out.println("Current age: " + person1.growOld());

        Person person2 = new Person();

        person2.name = "Olga";
        person2.age = 21;
        person2.country = country1;

        person2.walk();
        person2.eat("bread");
        System.out.println("Current age: " + person2.growOld());
    }
}
