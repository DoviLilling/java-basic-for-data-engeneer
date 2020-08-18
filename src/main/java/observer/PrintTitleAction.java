package observer;

/**
 * @author Evgeny Borisov
 */
public class PrintTitleAction implements Action {

    private Button button;

    public PrintTitleAction(Button button) {
        this.button = button;
    }

    @Override
    public void doOnClick() {
        System.out.println(button.getTitle());
    }
}
