package com.belhard.valera.test.entities.less6;

import com.belhard.valera.test.entities.less6.entities.Person;
import com.belhard.valera.test.entities.less6.entities.Worker;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Elizabeth", 15, 45, "base");
        person.doWork();

        Worker worker1 = new Worker("Vasiliy", 50, 90, "middlr-special", 1000);

        System.out.println(worker1);
        worker1.doWork();
        worker1.rest();

        Worker worker2 = new Worker(person, 200);
        System.out.println(worker2);

        Person mayBeWorker = new Worker(person, 200);
        mayBeWorker.doWork();
        ((Worker) mayBeWorker).rest(); // приведение переменной мейбиворкер к типу воркер, чтобы вызвать метод рест.
    }


}
