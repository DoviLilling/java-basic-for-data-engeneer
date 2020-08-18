package observer;

import javax.swing.*;

/**
 * @author Evgeny Borisov
 */
public class PopupHelloAction implements Action {
    @Override
    public void doOnClick() {
        JOptionPane.showMessageDialog(null,"Hello");
    }
}
