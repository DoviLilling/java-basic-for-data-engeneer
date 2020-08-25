package serialization;

import java.io.Serializable;

/**
 * @author Evgeny Borisov
 */
public class Human implements Serializable {
    private final String name;
    private final transient int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
