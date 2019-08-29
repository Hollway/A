package com.belhard.valera.test.entities.less4;

public class Person {
    String name;
    Integer age;
    Country country;
    //sex sex;

    public void walk() {
        System.out.println(name +" is walking");
    }

    public void eat(String dish){
        System.out.println(name + " is eating " + dish + ". Om-nom-nom");
    }
     public int growOld(){
        return ++age;
     }
}
