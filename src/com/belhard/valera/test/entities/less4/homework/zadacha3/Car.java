package com.belhard.valera.test.entities.less4.homework.zadacha3;


public class Car {

    private String title;

    private Point pos;

    private double distance;

    private double fuelLevel;

    // amount of fuel by 1 distance unit
    private final double consumation;

    public Car(String title, double fuelLevel, double consumation) {
        this.title = title;
        this.pos = new Point(0, 0);
        this.distance = 0;
        this.fuelLevel = fuelLevel;
        this.consumation = consumation;
    }

    public double getDistance() {
        return distance;
    }

    public void move(double x, double y) {

        double distance = this.pos.calcDistanceFromCurrent(x, y);

        if (isFuelEnough(distance)) {
            changePos(x, y);
        } else {
            System.out.println("Not enough fuel");
        }
    }

    private void changePos(double x, double y) {

        double v = this.pos.calcDistanceFromCurrent(x, y);

        this.fuelLevel -= v * consumation;
        this.distance += v;

        this.pos.update(x, y);
        System.out.println(this.title + " moved to [" + x + ":" + y + "]");
    }

    private boolean isFuelEnough(double distance) {

        return fuelLevel - distance * consumation >= 0;
    }

    @Override
    public String toString() {
        return String.format("%s{%3.2f:%3.2f}, fuel: %3.2f",
                title, pos.getX(), pos.getY(), fuelLevel);
    }
}
