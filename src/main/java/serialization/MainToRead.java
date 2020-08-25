package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author Evgeny Borisov
 */
public class MainToRead {
    public static void main(String[] args) throws Exception {
        Human avigal = new Human("Avigal", 18);
        File file = new File("c:\\tmp\\data.obj");


        FileInputStream fos = new FileInputStream(file);

        ObjectInputStream oos = new ObjectInputStream(fos);
        Human person = (Human) oos.readObject();

        System.out.println(person);
        oos.close();
        fos.close();



    }
}
