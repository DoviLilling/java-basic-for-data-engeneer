package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class Button {

    private int height,width;

    private String title;

    private List<Action> actions = new ArrayList<>();


    public void addAction(Action action) {
        actions.add(action);
    }

    public Button(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void click(){

        for (Action action : actions) {
            action.doOnClick();
        }
    }
}






