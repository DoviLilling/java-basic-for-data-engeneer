package class_internals;

/**
 * @author Evgeny Borisov
 */
public class MyService {


    public final static double PI = 3.1415926;

    private int age;


    static {
        System.out.println("I'm static");

    }

    {
        System.out.println("I'm initializer");
    }


    public void printStrings(int x, String... strings){
        for (String string : strings) {
            System.out.println(string);
        }
    }
























    public MyService() {
        System.out.println("I'm constructor");
    }

    public void printHelloWorld() {





        System.out.println("hello world");
        int x =12;
        this.printHelloWorld();
    }
}

