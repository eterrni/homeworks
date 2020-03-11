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

    @Override
    public boolean compareSquare(Shape shape) {
        return getSquare() == shape.getSquare();
    }

    protected double getDiagonal() {
        return sqrt(2) * a;
    }

    @Override
    public String toString() {
        return "Квадрат со стороной " + this.a + "\n Площадь квадрата= " + getSquare() + "\nПериметр квадрата=" + getPerimeter();
    }
}
