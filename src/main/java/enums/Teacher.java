package enums;

import java.util.Objects;

/**
 * @author Evgeny Borisov
 */
public class Teacher {
    private String name;
    private int age;
    private MaritalStatus maritalStatus;

    public Teacher(String name, int age, MaritalStatus maritalStatus) {
        this.name = name;
        this.age = age;
        this.maritalStatus = maritalStatus;
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

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return age == teacher.age &&
                Objects.equals(name, teacher.name) &&
                maritalStatus == teacher.maritalStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, maritalStatus);
    }
}
