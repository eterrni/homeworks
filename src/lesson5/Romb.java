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

    @Override
    public boolean compareSquare(Shape shape) {
        return getSquare() == shape.getSquare();
    }

    protected double getRadiusOfThInscribedCircle() {
        return getSquare() / (2 * a);
    }

    @Override
    public String toString() {
        return "Ромб со стороной " + this.a + "\n Площадь ромба= " + getSquare() + "\nПериметр ромба=" + getPerimeter();
    }
}
