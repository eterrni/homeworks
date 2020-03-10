package lesson5;

import static java.lang.Math.sqrt;

public class Romb implements Shape {
    private double a, h;

    protected Romb(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double getPerimeter() {
        return 4 * a;
    }

    @Override
    public double getSquare() {
        return a * h;
    }

    protected double getRadiusOfThInscribedCircle() {
        return getSquare() / (2 * a);
    }
}
