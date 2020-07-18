package inheritasnce;

/**
 * @author Evgeny Borisov
 */
public class Saba {

    private int age=120;



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Saba(int age) {
        this.age = age;
        System.out.println("Saba was created");
    }
}
