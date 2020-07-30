package lab0;

import java.util.List;
import java.util.Objects;

/**
 * @author Evgeny Borisov
 */
public class Person {




    public final static int MAX_AGE = 120;

    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';





    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        var x = 4.0;
        x = 4.5;

        return this.age;
    }

    public void setAge(int age) {
        if (age < 0 || age > MAX_AGE) {
            throw new IllegalStateException("age is not in valid range. age =  " + age);

        } else {
            this.age = age;
        }
    }

    public void printMyAge() {
        System.out.println("age = " + age);
    }
}
