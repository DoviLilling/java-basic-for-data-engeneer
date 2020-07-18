package wrapper_classes;

import javax.swing.*;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {


        String userInput = JOptionPane.showInputDialog("Are you adult? (true/false)");
        boolean b = Boolean.parseBoolean(userInput);

        if (b) {
            System.out.println("facebook is for you");
        }else {
            System.out.println("use snaphatch");
        }




//        String userInput = JOptionPane.showInputDialog("input your age please");
//
//        int age = Integer.parseInt(userInput);
//
//        System.out.println("you need to harry, it just "+(120-age)+" to live");

    }
}
