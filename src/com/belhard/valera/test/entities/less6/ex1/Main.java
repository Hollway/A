package com.belhard.valera.test.entities.less6.ex1;

import com.belhard.valera.test.entities.less6.ex1.entities.Manager;
import com.belhard.valera.test.entities.less6.ex1.entities.Workable;
import com.belhard.valera.test.entities.less6.ex1.entities.Worker;


public class Main {

    public static void main(String[] args) {

        /*Person person = new Person("Elizabeth", 15, 45, "base");
        person.doWork();*/

        Worker worker1 = new Worker("Vasily",
                50, 90, "middle-special", 1000);

        System.out.println(worker1);
        worker1.doWork();
        worker1.rest();

        Worker worker2 = new Worker(worker1, 200);
        System.out.println(worker2);

        Manager manager1 = new Manager("Oleg", 30, 75, "high", 2500);

        Workable mayBeWorker = new Worker(manager1, 200);
        mayBeWorker.doWork();


        ((Worker) mayBeWorker).rest();  // приведение переменной мейбиворкер к типу воркер, чтобы вызвать метод рест.


    }
}