package com.belhard.valera.test.entities.less6.entities;

public class Worker extends Person {

    private int salary;

    public Worker(String name, int age, double weight, String education, int salary) {
        super(name, age, weight, education);
        this.salary = salary;

    }

    public Worker(Person person, int salary) {
        super(person);
        this.salary = salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        System.out.println("working hard");
    }

    public void  rest(){
        System.out.println("I'm resting");
    }

    @Override
    public String toString() {
        return "Worker{" +
                super.toString() +
                " salary=" + salary +
                '}';
    }
}
