package Suppliers;

import java.util.function.Supplier;

public class Example {
    public static void main(String[] args) {
//        Supplier<Person> personInstance = Person::new;
        Supplier<Person> personInstance = () -> new Person();
        System.out.println(personInstance.get());

    }
}

class Person {
    private String name;
    private Integer age;

    public Person() {
        name = "Guilherme";
        age = 30;
    }

    @Override
    public String toString() {
        return String.format("name : %s, age: %d", name, age);
    }
}
