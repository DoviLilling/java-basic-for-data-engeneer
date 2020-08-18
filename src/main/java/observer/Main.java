package observer;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        Button button = new Button(100, 20);

        button.setTitle("my lovely button");


        button.addAction(() -> {
            System.out.println("Ha ha ha");
            System.out.println("wefhrlk");
            System.out.println("wefhrlk");
            System.out.println("wefhrlk");
        });
        button.addAction(new PopupHelloAction());
        button.addAction(new PrintTitleAction(button));

        button.click();


    }
}
