package lesson5;

import static java.lang.Math.sqrt;

public class Square implements Shape {
    private double a;

    protected Square(double a) {
        this.a = a;
    }

    @Override
    public double getPerimeter() {
        return 4 * a;
    }

    @Override
    public double getSquare() {
        return a * a;
    }

    protected double getDiagonal() {
        return sqrt(2) * a;
    }
}
