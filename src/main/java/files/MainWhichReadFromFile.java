package files;

import lab0.Person;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;

/**
 * @author Evgeny Borisov
 */
public class MainWhichReadFromFile {



    public void x() throws MyFileNotFoundException {
        try {
            this.printLines("c:\\tmp\\a.txt");
        } catch (FileNotFoundException e) {
            throw new MyFileNotFoundException(e);
        }
    }


    public void printLines(String pathToFile) throws FileNotFoundException {
        File file = new File(pathToFile);

        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(file);
            fileInputStream.read();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {

        }


        if (file.exists()) {

        }else {
            throw new FileNotFoundException(pathToFile+" not exists");

        }

    }
}
