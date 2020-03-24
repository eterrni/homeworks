package lesson9;

public class Math<T extends Number> {
    private T number_1;
    private T number_2;

    Math(T number_1, T number_2) {
        this.number_1 = number_1;
        this.number_2 = number_2;
    }

    Math() {

    }

    public T getNumber_1() {
        return number_1;
    }

    public T getNumber_2() {
        return number_2;
    }
}
