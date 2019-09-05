package com.belhard.valera.test.entities.less6.entities;

public class Person {

    private String name;
    private int age;
    protected double weight;
    private String education;

    public Person(String name, int age, double weight, String education) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.education = education;
    }

    public Person(Person another){
        this(another.getName(),another.getAge(),another.getWeight(),another.getEducation());
    }

    public void doWork(){
        System.out.println("do nothing");
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getEducation() {
        return education;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", education='" + education + '\'' +
                '}';
    }
}

