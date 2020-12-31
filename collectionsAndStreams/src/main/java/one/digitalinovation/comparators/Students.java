package one.digitalinovation.comparators;

public class Students implements Comparable<Students> {

    private final String name;
    private final Integer age;

    public Students(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " - " + age;
    }

    @Override
    public int compareTo(Students o) {
        return this.getAge() - o.getAge();
    }

}
