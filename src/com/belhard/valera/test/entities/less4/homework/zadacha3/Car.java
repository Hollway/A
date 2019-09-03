package com.belhard.valera.test.entities.less4.homework.zadacha3;

public class Car {

    private String title;
    private double x, y;
    private double distance;
    private double fuellLevel;
    private final double consumation;

    public Car(String title, double fuellLevel, double consumation) {
        this.title = title;
        this.x = 0;
        this.y = 0;
        this.distance = 0;
        this.fuellLevel = fuellLevel;
        this.consumation = consumation;
    }

    public double getDistance() {
        return distance;
    }

    public void move(double x, double y) {

        double distance = calcDistanceFromCurrent(x, y);

        if (isFuelEnough(distance)) {
            changePos(x, y);
        } else {
            System.out.println("Not enough fuel");
        }


    }

    private void changePos(double x, double y) {
        this.fuellLevel -= calcDistanceFromCurrent(x, y) * consumation

        this.x = x;
        this.y = y;
        System.out.println(this.title + "Moved to [" + x + ":" + y + "]");
    }


    private boolean isFuelEnough(double distance) {

        return fuellLevel - distance * consumation >= 0;
    }

    private double calcDistanceFromCurrent(double x, double y) {

        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    @Override
    public String toString() {
        return String.format("%s(%3.2f:%3.2f), fuel");
    }
}
