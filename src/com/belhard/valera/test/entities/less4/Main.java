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
    }
}
