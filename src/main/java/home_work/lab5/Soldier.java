package home_work.lab5;

/**
 * @author Evgeny Borisov
 */
public class Soldier {
    private String name;
    private int age;


    public Soldier(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}