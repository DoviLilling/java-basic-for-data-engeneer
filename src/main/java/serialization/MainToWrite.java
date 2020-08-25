package serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.TreeSet;

/**
 * @author Evgeny Borisov
 */
public class MainToWrite {
    public static void main(String[] args) throws IOException {
        Human avigal = new Human("Avigal", 18);
        File file = new File("c:\\tmp\\data.obj");
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();

        FileOutputStream fos = new FileOutputStream(file);



        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(avigal);

        oos.close();
        fos.close();



    }
}
