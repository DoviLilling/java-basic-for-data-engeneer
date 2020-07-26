package enums;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        Teacher john = new Teacher("John", 47, MaritalStatus.SINGLE);


        System.out.println(john.getMaritalStatus().getHebrewDescription());

    }
}
