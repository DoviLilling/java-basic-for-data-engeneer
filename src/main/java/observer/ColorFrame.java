package observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Evgeny Borisov
 */
public class ColorFrame extends JFrame {
    public ColorFrame() throws HeadlessException {


        setSize(600,600);


        JButton button = new JButton("click me");


        button.addActionListener(e -> System.out.println("Hello"));



//        PopupHelloButtonListener listener = new PopupHelloButtonListener();

//        button.addActionListener(listener);

        getContentPane().add(button);

        this.setVisible(true);
    }


    public static void main(String[] args) {
        new ColorFrame();
    }
}
