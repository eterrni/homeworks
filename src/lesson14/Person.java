package lesson14;

import java.util.*;

/*5.Дан класс Person с полями firstName, lastName, age.
Вывести полное имя самого старшего человека, у которого длина этого имени не превышает 15 символов. */

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private static ArrayList<Person> list_persons = new ArrayList<>();

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        list_persons.add(this);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public static Optional<Person> getOldestPersonName() {
        return list_persons.stream()
                .filter(Objects::nonNull)
                .filter(person -> person.getLastName().length() + person.getFirstName().length() <= 15)
                .max(Comparator.comparingInt(Person::getAge));
    }
}
