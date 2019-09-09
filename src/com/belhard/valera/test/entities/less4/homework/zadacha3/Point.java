package com.belhard.valera.test.entities.less4.homework.zadacha3;


public class Point {

    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    double calcDistanceFromCurrent(double x, double y) {

        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    double calcDistanceFromCurrent(Point another) {

        return this.calcDistanceFromCurrent(another.x, another.y);
    }

    void update(double x, double y) {

        this.x = x;
        this.y = y;
    }
}

