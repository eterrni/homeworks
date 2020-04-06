package lesson5;

import java.math.BigDecimal;

public class Calculator {
    public static void main(String[] args) {
        Calculator testInt = new Calculator(50, 23);
        System.out.println("Сложение типа int : " + testInt.addAsBigInteger());
        System.out.println("Вычитание типа int : " + testInt.subtractionAsBigInteger());
        System.out.println("Умножение типа int : " + testInt.multiplyAsBigInteger());
        System.out.println("Деление типа int : " + testInt.devideAsBigInteger());
        System.out.println("BigDecimal типа int : " + testInt.addAsBigDecimal());
        Calculator testDouble = new Calculator(25, 13.79);
        System.out.println("Сложение типа double : " + testDouble.addAsBigDouble());
        System.out.println("Вычитание типа double : " + testDouble.subtractionAsBigDouble());
        System.out.println("Умножение типа double : " + testDouble.multiplyAsBigDouble());
        System.out.println("Деление типа double : " + testDouble.devideAsBigDouble());
        System.out.println("BigDecimal типа  : " + testDouble.addAsBigDecimal());
    }
    int int1;
    int int2;
    double double1;
    double double2;
    BigDecimal arg1;
    BigDecimal arg2;

    public Calculator(int arg1, int arg2) {
        this.arg1 = new BigDecimal(arg1);
        this.arg2 = new BigDecimal(arg2);
        this.int1 = arg1;
        this.int2 = arg2;
    }

    public Calculator(int arg1, double arg2) {
        this.int1 = arg1;
        this.int2 = (int) arg2;
        this.double1 = arg1;
        this.double2 = arg2;
        this.arg1 = new BigDecimal(arg1);
        this.arg2 = new BigDecimal(arg2);
    }

    public Calculator(double arg2, int arg1) {
        this(arg1, arg2);
    }

    BigDecimal addAsBigDecimal() {
        return arg1.multiply(arg2);
    }

    int addAsBigInteger() {
        return int1 + int2;
    }

    int subtractionAsBigInteger() {
        return int1 - int2;
    }

    int multiplyAsBigInteger() {
        return int1 * int2;
    }

    int devideAsBigInteger() {
        return int1 / int2;
    }

    double addAsBigDouble() {
        return double1 + double2;
    }

    double subtractionAsBigDouble() {
        return double1 - double2;
    }

    double multiplyAsBigDouble() {
        return double1 * double2;
    }

    double devideAsBigDouble() {
        return double1 / double2;
    }
}
