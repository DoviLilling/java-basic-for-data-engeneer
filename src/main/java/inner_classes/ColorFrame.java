package inner_classes;

import javax.swing.*;
import java.awt.*;

/**
 * @author Evgeny Borisov
 */
public class ColorFrame extends JFrame {


    public ColorFrame() throws HeadlessException {
        setSize(600,500);
        JButton button = new JButton("click");
        JLabel label = new JLabel("just a label");
        Container contentPane = this.getContentPane();
        contentPane.add(button,BorderLayout.SOUTH);
        contentPane.add(label,BorderLayout.NORTH);

        this.setVisible(true);
    }


    public static void main(String[] args) {
        new ColorFrame();
        System.out.println(123);
    }
}
