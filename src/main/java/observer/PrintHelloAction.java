package observer;

/**
 * @author Evgeny Borisov
 */
public class PrintHelloAction implements Action{
    @Override
    public void doOnClick(){
        System.out.println("Hello");
    }
}
