package doviHW.com.hw20200712;

import java.util.Objects;

public class Soldier {
    private int militaryID;
    private String name;
    private int age;

    public Soldier(int pMilitaryID, String pName, int pAge) {
        this.militaryID = pMilitaryID;
        this.name = pName;
        this.age = pAge;
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

    public int getMilitaryID() { return militaryID; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Soldier soldier = (Soldier) o;
        return militaryID == soldier.militaryID;
    }
}
