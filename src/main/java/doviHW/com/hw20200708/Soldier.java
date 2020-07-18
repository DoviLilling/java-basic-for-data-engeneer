package doviHW.com.hw20200708;

public class Soldier {
    private String name;
    private int age;

    public Soldier(int p_age) {
        initAge(p_age);
    }

    public Soldier(int p_age, String p_name) {
        initAge(p_age);
        this.name = p_name;
    }

    private void initAge(int p_age){
        this.age = p_age;
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
