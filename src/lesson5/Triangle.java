package lesson5;

import static java.lang.Math.sqrt;

public class Triangle implements Shape {
    private double a, b, c;

    protected Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getSquare() {
        double p = getPerimeter() / 2;
        return sqrt(p * (p - a) * (p - b) * (p - c));
    }

    protected double getHeight() {
        return (2 * getSquare()) / a;
    }
}
