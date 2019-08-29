package com.belhard.valera.test.entities.less4;

public class Person {

    private static int counter = 0;
    private String name;
    private Integer age;
    private Country country;
    //sex sex;

    public Person(String name, int age, Country country){    //Конструктор класса. Как метод, но вызывается при создании объекта.
        this(name, age);  //Сократили код в пункте (1). 3 строки заменили на одну.
        this.country = country;
    }

    public Person(String name, Integer age) {     //Перегрузка конструктора. Нужен чтоб выбрать что-то одно. Например в этом не надо выбирать страну.
        counter++
        this.name = name;   // (1)
        this.age = age;
    }

    public Person() {      //Конструктор, который не принимает никаких значений. Нужен что б работало Country()  (дефолд). Что б выбрать другие конструкторы, нужно написать его значения.
    }

    public void walk() {
        System.out.println(name + " is walking");
    }

    public void eat(String dish) {
        System.out.println(name + " is eating " + dish + ". Om-nom-nom");
    }

  /*  public void eat() {
        System.out.println(name + " is eating nothing.");
    }

    public void eat(String dish, int count) {
        System.out.println("%s is eating %d ");
    }

    public void eat(int time, String dish) {
        System.out.println("%s is eating %d ");
    }
*/

    public int growOld() {
        return ++age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Country getCountry() {
        return country;
    }

    public static int getCounter() {
        return counter;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Person(name = '" + name + "', age = '" + age + "', country = '" + country + "')";
    }
}
