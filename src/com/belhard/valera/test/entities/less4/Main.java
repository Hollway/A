package com.belhard.valera.test.entities.less4;

public class Main {
    public static void main(String[] args) {

        Country country1 = new Country(String name, int age, Country country);  //   //dopisat'!!!!!!!!!!!!!!!!!!!!
        country1.setTitle("Belarus");
        country1.setZipCode(220000);

        Person person1 = new Person();

        person1.setName("Vasya");
        person1.setAge30;                                                          //dopisat'!!!!!!!!!!!!!!!!!!!!
        person1.setCountry(country1);

        person1.walk();
        person1.eat("meat");
        System.out.println("Current age: " + person1.growOld());

        Person person2 = new Person();

        person2.setName("Olga");
        person2.setAge(21);                                                          //dopisat'!!!!!!!!!!!!!!!!!!!!
        person2.setCountry(country1);

        person2.walk();
        person2.eat("bread");

        System.out.println("Current age: " + person2.growOld());

        System.out.println("\nperson1:" + person1.toString());
        System.out.println("person1:" + person1.toString());
        System.out.println("Country of person1: ='" + person1.setCountry().toString;);                                //dopisat'!!!!!!!!!!!!!!!!!!!!

        System.out.println("Person couter = " + Person.getCounter());


        //dopisat' !!!!!!!!!!!!!!!!!!!
        // повторить переопределние. Класс и метод и объект и поле. Конструктор
    }
}
